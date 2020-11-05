package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidParameterException;
import java.util.IllegalFormatException;

import static com.company.JOP.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {



    @Test
    public void testShowConfirmButtonsWorks() {
        int dialogResult = JOptionPane.showConfirmDialog(null, "Test If Buttons works", "Plain Text Website Scraper 3000", JOptionPane.OK_CANCEL_OPTION);
        switch (dialogResult) {
            case JOptionPane.OK_OPTION -> System.out.println("OK pressed");
            case JOptionPane.CANCEL_OPTION -> System.out.println("Cancel pressed");
            case JOptionPane.CLOSED_OPTION -> System.out.println("X pressed");
        }
    }

    @Test
    public void testIfInputMatches(){ //Korrekt hemsida format.
        String inputDialog = JOptionPane.showInputDialog(null,"Test If Input works", JOptionPane.INPUT_VALUE_PROPERTY);
        if (JOptionPane.INPUT_VALUE_PROPERTY.equals(inputDialog)) {
            System.out.println("Good it's a match!");
        }else{
            System.out.println("No match!");
        }
    }


    @Test
    void ensureLineIsPrintedToSystemOut() {
        Main main = new Main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        main.printToTerminal("input");
        assertEquals("input", outContent.toString().trim());
    }

    @Test
    void ensureIOExceptionIsThrown() {
        Main main = new Main();
        assertThrows(IOException.class, () -> {
            main.canSometimesGoWrong();
        });
    }

    @Test
    void countInputWords(){     //from input file - test Uppercase?
        Main main = new Main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        main.printToTerminal("input");
        assertEquals("input", outContent.toString().trim());
    }


}


/*

    @Test
    void ensureExceptionIsCaught() {
        Main main = new Main();
            try {
                main.searchMethod();
                fail("expected exception was not occurred.");
            } catch(IllegalArgumentException e) {

            }
        }
*/

