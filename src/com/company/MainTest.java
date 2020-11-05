package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.security.InvalidParameterException;
import java.util.IllegalFormatException;

import static com.company.JOP.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {







            @Test
    void checksIfInputIsNull() {

        Main main = new Main();
        JOP jop = new JOP();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        assertEquals(null, outContent.toString());
    }


}

    /*@Test
    void ensureLineIsPrintedToSystemOut(){
        Main main = new Main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        main.notFoundWordsArgument();

        assertEquals("s", outContent.toString().trim());
    }



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

