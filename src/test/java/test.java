package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProgramTest {

    @Test
    void testMain() {
        String output = Program.getMessage();
        assertEquals("Hello World", output, "The output message should be 'Hello World'");
    }
}
