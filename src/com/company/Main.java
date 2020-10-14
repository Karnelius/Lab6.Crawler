package com.company;

import java.io.*;
import java.util.*;
import java.net.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Main {


   public static void main(String[] args) throws IOException {



        Scanner scan = new Scanner(System.in);

        Document doc = Jsoup.connect("https://en.wikipedia.org/wiki/Donald_Trump").get();
        String title = doc.text(); // INDEXERAgöra till en array av ord. -whitespaces.
        System.out.println("Please enter an searchWord");
        int amount = 0, i = 0;


        while(scan.hasNextLine()) {
            String searchword = scan.nextLine();

            if (title.equals(searchword)) {
                amount++;
            }
            System.out.println(amount);
        }
    }
}



/*public class WebSpider {
    private final Set<URL> links;
    private final long startTime;

    private WebSpider(final URL startURL) {
        this.links = new HashSet<>();
        this.startTime = System.currentTimeMillis();
        crawl(initURLS(startURL));
    }

    private void crawl(Set<URL> initURLS) {
        initURLS.removeAll(this.links);

        if(!initURLS.isEmpty()) {
            final Set<URL> newURLS = new HashSet<>();
            try {
                this.links.addAll(urls);
                for(final URL url : urls) {
                    System.out.println("Time = "
                            + System.currentTimeMillis() - this.startTime))+ " connected to : " + url);
                    final Document document = jsoup.connect(url.toString()).get();
                    final Elements linksOnPage = document.select("a[href]");
                    for(final Element element : linksOnPage) {
                        final String urlText = element.attr("abs:href");
                        final URL discoveredURL = new URL(urlText);
                        newURLS.add(discoveredURL);
                    }
                }
            }catch(final Exception | Error ignored) {

            }
            crawl(newURLS);
        }
    }

    private Set<URL> initURLS(final URL startURL) {
        return Collections.singleton(startURL);

        
    }

    public static void main(String[] args) throws MalformedURLException {

    final Webspider spider = Webspider(new URL("http://www.gutenberg.org/"));
}

}
*/












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


        /*
        Document doc = Jsoup.connect("https://www.wikipedia.org").get();
        Elements titles = doc.getElementsByClass("other-project");
        for (Element title : titles) {
            System.out.println(title.text());
        }
    }
}









        /*
        Document doc = Jsoup.connect("https://www.flashback.org/").get();
        Elements body = doc.select("tbody.collapseobj_forumbit");
        Elements select = body.select("tr");
        for (int i=0, selectSize = select.size(); i< selectSize; i++){
            Element e = select.get(i);
            String title = e.select("td_forum").text().trim();
            System.out.println(title);
        }
    }}


        /*



    /*    String url = "https://www.sydsvenskan.se/";
        Document page = Jsoup.connect(url).userAgent("").get();
            String itemSelector = "item-card-container";
        Elements authorElements = page.select(itemSelector);
        ArrayList<String> itemTitles = new ArrayList<>();

        for (Element e : authorElements) itemTitles.add(e.text());
        for (String s : itemTitles) System.out.println(s);
    }*/


       /* String searchWord;
        searchWord = JOptionPane.showInputDialog(null, "Please Enter Your SearchWord");
        JOptionPane.showMessageDialog(null, "Your searchword is: " + searchWord);


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
}


       // File file = new File("testData/Ost.txt");

       /* try{
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String line = input.nextLine();
                JOptionPane.showMessageDialog(null,line);
                return;
            }
            input.close();
        }
        catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"File Not Found");
        }


    }

    // Metod för att läsa igenom en hemsida / fil
    // Metod för att räkna ut antal ord / eller most common ord (flest ord) exkl if / else / and / so / blablla.


 */



/*
Private static void startMetod() {
        startMetod();

        Scanner scan = new Scanner(new File(inputFile));
        searchWord = JOptionPane.showInputDialog(null, "Please enter your searchword: ");
        JOptionPane.showMessageDialog(null, "Your searchword is: " + searchWord);

        String searchWord = scan.nextLine();

        new crawler("testData/Ost.txt");
    }

 */
