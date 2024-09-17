package dev.maxhogan;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @org.junit.Test
    public void testGetHello() {
        assertEquals("Hello, World!", HelloWorld.getHello());
    }
}