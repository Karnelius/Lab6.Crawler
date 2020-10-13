package com.company;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        String searchWord;
        searchWord = JOptionPane.showInputDialog(null,"Please Enter Your SearchWord");
        JOptionPane.showMessageDialog(null,"Your searchword is: " + searchWord);


        System.out.println(searchWord);

        File file = new File("testData/Ost.txt");
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


}


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