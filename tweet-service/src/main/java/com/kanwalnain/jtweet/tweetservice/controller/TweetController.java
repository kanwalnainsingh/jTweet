package com.kanwalnain.jtweet.tweetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jtweet")
public class TweetController {

    @GetMapping("/tweets")
    public List tweets(){
        List<String> sampleTweet = new ArrayList<>();
        sampleTweet.add("Hello Tweet!!");
        sampleTweet.add("Bye Tweet!!");
        return sampleTweet;
    }
}
