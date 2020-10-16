package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Main {

    public static void main(String[] args) throws IOException {

        //Todo lägga till en bild etc i panelen.
        try {

            //String inputforWebsite = JOptionPane.showInputDialog(null, "Copy the URL for the website you want to scan");
            String inputforWebsite = JOptionPane.showInputDialog(null, "Enter your website, copy the URL from your webrowser",
                    "Plain Text Website Scraper 2000", JOptionPane.QUESTION_MESSAGE);

            String searchword = JOptionPane.showInputDialog(null, "Please enter your searchword: ", "Plain Text Website Scraper 2000",
                    JOptionPane.QUESTION_MESSAGE).toUpperCase();

            Document doc = Jsoup.connect(inputforWebsite).get(); // trimma här.
            String title = doc.body().text().toUpperCase(); //Filtrera bort ord som börjar med < > (<HTML>).
            String[] title2 = title.split("([-,.:;)/(?!@=\",\"\"])|(?=[-,+.^:_])|\\s+");
            List<String> indexering;
            indexering = Arrays.asList(title2);

            for (int i = 0, indexeringSize = indexering.size(); i < indexeringSize; i++) {

                //Todo Kolla upp empty for loop body...


            }

            if (indexering.contains(searchword)) {
                {
                    int count = (int) IntStream.range(0, title2.length)
                            .filter(i -> (title2[i].contains(searchword))).count();

                    JOptionPane.showMessageDialog(null, "Your searchword " + "'" + searchword + "'" + " was found: " + count + " time/s on the website.",
                            "Plain Text Website Scraper 2000", JOptionPane.INFORMATION_MESSAGE);

                    //Todo - loopa så man får trycka JA eller Nej för att fortsätta ( Typ Press OK to continue with a new searchword
                    // - Cancel for exiting the program).
                }
            } else if (!indexering.contains(searchword)) {
                JOptionPane.showMessageDialog(null, "No such words was found on the webiste", "Plain Text Website Scraper 2000", JOptionPane.ERROR_MESSAGE);
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Skriv in en rätt hemsida!", "Plain Text Website Scraper 2000", JOptionPane.ERROR_MESSAGE);
            // catch ClassNotFoundException. //TODO ---->
        }
    }
}

        /*
        Document doc = Jsoup.connect("https://www.imdb.com/chart/top/?ref_=nv_mv_250").get();
        Elements body = doc.select("tbody.lister-list");
        //System.out.println(body.select("tr"));
        Elements select = body.select("tr");
        for (int i = 0, selectSize = select.size(); i < selectSize; i++) {
            Element e = select.get(i);
            String title = e.select("td.posterColumn img").attr("alt");
            System.out.println("Film:  " + title);
            String year = e.select("td.titleColumn span.secondaryInfo").text();
            System.out.println("Årtal: " + year.replaceAll("[^\\d]", " "));
            String imdbBetyg = e.select("td.ratingColumn.imdbRating").text().trim();
            System.out.println("Betyg: " + " " + imdbBetyg);
            System.out.println("-------------------");
        }
    }
}

   String x = indexering.get(i); // Alla index skrivs ut
                System.out.println(x);

        Document doc = Jsoup.connect("https://www.wikipedia.org").get();
        Elements titles = doc.getElementsByClass("other-project");
        for (Element title : titles) {
            System.out.println(title.text());
        }
    }
}

        System.out.println(searchWord);

        URL dweb = new URL("https://www.wikipedia.com/");
        URLConnection dw = dweb.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(hc.getInpuStream()));
        System.out.println("Connecting to Wikipedia");
        String inputLine;

        PrintStream out = new PrintStream(new FileOutputStream("OutFile.txt"));
        try {
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            out.close();

            System.out.println("Printing text to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Scanner scan = new Scanner("testData/Ost.txt.txt");
            String search = txtSearch.getText();
            while (scan.hasNextLine()) {
                searchWord = sc.nextToken();
                if (searchWord == search) {

                } else {
                }
            }
            scan.close();
        searchWin.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
