package com.Springboot.StudentApplication.HelloFetcherTests;

import com.Springboot.StudentApplication.HelloFetcher.HelloFetcher;
import org.junit.jupiter.api.Test;


public class HelloFetcherTest {
    @Test
    public void helloTest() {
        HelloFetcher helloFetcher = new HelloFetcher();
        String hello = helloFetcher.hello();
        System.out.println(hello.equals("Hello Intern!"));
    }
}
