package com.rb.yard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void doSomething_outputExpectedValue() {
        assertEquals("Hello Ritchie", Main.doSomething("ritchie"));
    }
}
