package com.waytoodanny.simplewebapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, world! Let me share a current date and time with you: " + ZonedDateTime.now();
  }
}

