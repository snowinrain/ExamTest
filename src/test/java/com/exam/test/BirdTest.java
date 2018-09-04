package com.exam.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdTest {

    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void redirectSystemOutStream() {
        originalSystemOut = System.out;
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @Test
    void testSing() {
        Bird bird = new Bird();
        bird.sing();
        assertTrue("I am singing\r\n".equals(systemOutContent.toString()));
    }
    
    @AfterEach
    void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

}
