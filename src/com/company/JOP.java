package com.company;

import javax.swing.*;

public class JOP {

    static String inputWebsite = javax.swing.JOptionPane.showInputDialog(null,
            "Enter your website, copy the URL from your web-browser",
            "Plain Text Website Scraper 2000",
            javax.swing.JOptionPane.QUESTION_MESSAGE);

    static String inputSearch = JOptionPane.showInputDialog(null, "Please enter your searchword: ",
            "Plain Text Website Scraper 2000", JOptionPane.QUESTION_MESSAGE).toUpperCase();


}
