package com.Springboot.StudentApplication.HelloFetcherTests;

import com.Springboot.StudentApplication.HelloFetcher.HelloFetcher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HelloFetcherTest {
    @Test
    public void helloTest() {
        HelloFetcher helloFetcher = new HelloFetcher();
        String hello = helloFetcher.hello();
        assertEquals("Hello Intern!", hello);
    }
    @Test
    public void helloNotNullTest() {
        HelloFetcher helloFetcher = new HelloFetcher();
        String hello = helloFetcher.hello();
        assertNotNull(hello);
    }
    @Test
    public void helloFailTest() {
        HelloFetcher helloFetcher = new HelloFetcher();
        String hello = helloFetcher.hello();
        assertNotEquals("Hello Intern", hello);
    }
}
