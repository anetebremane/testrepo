package com.example.consumingrest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static Logger logger = LogManager.getLogger(HelloWorldController.class);

    @GetMapping("/")
    public String hello(@RequestParam String name){
        logger.info("Saying hello to "+name);
        return "Hello "+name+"!";

        // go to http://localhost:8080/?name=anete and boom, you have a website
        //in terminal we see date, which class is running, logger info
    }
}
