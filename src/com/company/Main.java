package com.company;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.IntStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class Main {

    public static void main(String[] args) throws IOException {

        //Todo lägga till en bild etc i panelen.

        //String inputforWebsite = JOptionPane.showInputDialog(null, "Copy the URL for the website you want to scan");
        String inputforWebsite = JOptionPane.showInputDialog(null, "Enter your website, copy the URL from your webbrowser", "SiteCrawler2000", JOptionPane.QUESTION_MESSAGE);

        String searchword = JOptionPane.showInputDialog(null, "Please enter your searchword: ").toUpperCase();

        //ToDo fånga exeption antingen med catch try - låta personen knappa in en sida på nytt eller bara throw exception. Hemsida.

        // ToDo spotta ut (Inget sökord hittat) vid 0 sökord.

        Element doc = Jsoup.connect(inputforWebsite).get();

        String title = doc.text().toUpperCase();
        String[] title2 = title.split("([-,.:)(])|(?=[-,+.^:_]\",\"\")|\\s+"); // Todo ta bort " ... Återkommer för att trimma splitten mer. Dvs väck med - osv intill ord.
        List<String> indexering;
        indexering = Arrays.asList(title2);

        //Todo remove children.

        for (int i = 0, indexeringSize = indexering.size(); i < indexeringSize; i++) {


            //Todo Kolla upp empty for loop body...

           /* if (inputforWebsite == null){
                JOptionPane.showMessageDialog(null,"Please enter a correct website");
            }else{
                JOptionPane.showMessageDialog(null, "errrooorrr");
            }
*/
            String x = indexering.get(i); // Alla index skrivs ut
            System.out.println(x);
        }

        if (indexering.contains(searchword)) {
            {
                int count = (int) IntStream.range(0, title2.length).filter(i -> (title2[i].contains(searchword))).count();
                JOptionPane.showMessageDialog(null, "Your searchword was found: " + count + " time/s on the website."); //ToDo OVERKILL? Lägg till det ord som förekommer mest inom parantes.

                //Todo - loopa så man får trycka JA eller Nej för att fortsätta ( Typ Press OK to continue with a new searchword - Cancel for exiting the program).
            }
        }
    }
    //Todo - scanner close?
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
}


       // File file = new File("testData/Ost.txt");

       try{
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
         */
