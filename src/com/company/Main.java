package com.company;

import javax.swing.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {

    public String searchWord;
    public String searchWebsite;
    public List<String> indexing;

    private void searchMethod() {
        searchWebsite = JOP.inputWebsite;
        searchWord = JOP.inputSearch;
    }

    private void notFoundWordsArgument() {
        JOptionPane.showMessageDialog(null, "Unfortunately, no such word was found on the website",
                "Plain Text Website Scraper 3000", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) throws Exception {
        Main x = new Main();
        JOP a = new JOP();


        try {
            x.searchMethod();

            Document doc = Jsoup.connect(x.searchWebsite).get();
            String title = doc.body().text().toUpperCase();
            String[] title2 = title.split("([-,.:;)/(?!@=\",\"\"])|(?=[-,+.^:_])|\\s+");
            x.indexing = Arrays.asList(title2);
            {

                int i = 0, indexingSize = x.indexing.size();
                while (i < indexingSize) {
                    i++;
                }
            }
            if (x.searchWord.isBlank()) {
                x.notFoundWordsArgument();
            } else if (x.indexing.contains(x.searchWord)) {
                {
                    int count = (int) IntStream.range(0, title2.length)
                            .filter(i -> (title2[i].contains(x.searchWord))).count();

                    JOptionPane.showMessageDialog(null, "Your search word " + "'" + x.searchWord + "'" + " was found: " + count + " time/s on the website.",
                            "Plain Text Website Scraper 3000", JOptionPane.PLAIN_MESSAGE);

                }
            } else if (!x.indexing.contains(x.searchWord)) {
                x.notFoundWordsArgument();
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Enter a correct website!",
                    "Plain Text Website Scraper 3000", JOptionPane.ERROR_MESSAGE);

        } finally {
            JOptionPane.showMessageDialog(null, "Thank you for using Website Scraper 3000",
                    "Plain Text Website Scraper 3000", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

