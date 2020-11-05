package com.company;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testThatIndexingWorks() {
        Main x = new Main();

        String[] expectedOutput = x.indexingMethod("Trump David Mattias Hamid David");

        assertEquals("Trump", expectedOutput[0]);
        assertEquals("David", expectedOutput[1]);
        assertEquals("Mattias", expectedOutput[2]);
        assertEquals("Hamid", expectedOutput[3]);
        assertEquals("David", expectedOutput[4]);
    }


    @Test
    public void testThatCounterWorksAndIfWordExists() {
        Main x = new Main();
        String[] expectedOutput = {"Andreas", "David", "Mattias", "Hamid", "David"};
        x.searchWord = "David";
        x.methodCount(expectedOutput);
        assertEquals(x.methodCount(expectedOutput), 2);

    }
}

    //Bonuspoäng- för kräver egen manuell knapptryckning. Valde att inte ta med mockUp.
/*    @Test
    public void testShowConfirmButtonsWorks() {
        int dialogResult = JOptionPane.showConfirmDialog(null, "Test If Buttons works", "Plain Text Website Scraper 3000", JOptionPane.OK_CANCEL_OPTION);
        switch (dialogResult) {
            case JOptionPane.OK_OPTION -> System.out.println("OK pressed");
            case JOptionPane.CANCEL_OPTION -> System.out.println("Cancel pressed");
            case JOptionPane.CLOSED_OPTION -> System.out.println("X pressed");
        }
    }

    @Test
    public void testIfInputMatches() {
        String inputDialog = JOptionPane.showInputDialog(null, "Test If Input works", JOptionPane.INPUT_VALUE_PROPERTY);
        if (JOptionPane.INPUT_VALUE_PROPERTY.equals(inputDialog)) {
            System.out.println("Good it's a match!");
        } else {
            System.out.println("No match!");
        }
    }
*/


