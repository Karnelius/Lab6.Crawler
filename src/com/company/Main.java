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
    /**
     * indexing
     * Skapar en index av alla ord på den angivna hemsidan.
     * En lista av indexerade ord.
     */
    public List<String> indexing;


    /**
     * searchMethod
     * kopplar på en klass som tar in input-argument i form av text för hemsida-input & sökord-på-hemsida.
     * Variabeln gör det möjligt att ange input som sedan körs på hemsidan.
     *
     * @author David & Hamid
     */
    void searchMethod() {
        searchWebsite = JOP.inputWebsite;
        searchWord = JOP.inputSearch;
    }

    /**
     * notFoundWordsArgument
     * skapar en ny JOptionPane för användaren.
     *
     * @Return Variabeln hänvisar resultatet till användaren att sådant sökord dessvärre inte finns på den angivna hemsidan.
     * @author David & Hamid
     */


    void notFoundWordsArgument() {
        JOptionPane.showMessageDialog(null, "Unfortunately, no such word was found on the website",
                "Plain Text Website Scraper 3000", JOptionPane.ERROR_MESSAGE);
    }


    public static void main(String[] args) throws Exception {
        Main x = new Main();


        try {
            x.searchMethod();
            Document doc = Jsoup.connect(x.searchWebsite).get();
            String[] title2 = x.indexingMethod(doc.body().text().toUpperCase());
            x.indexing = Arrays.asList(title2);


            int i = 0, indexingSize = x.indexing.size();
            while (i < indexingSize) {
                i++;
            }

            if (x.searchWord.isBlank()) {
                x.notFoundWordsArgument();
            } else if (x.indexing.contains(x.searchWord)) {
                {
                    int count = x.methodCount(title2);

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


    int methodCount(String[] title2) {
        return (int) IntStream.range(0, title2.length)
                .filter(j -> (title2[j].contains(searchWord))).count();
    }


    public String[] indexingMethod(String title) {
        return title.split("([-,.:;)/(?!@=\",\"\"])|(?=[-,+.^:_])|\\s+");
    }

}
