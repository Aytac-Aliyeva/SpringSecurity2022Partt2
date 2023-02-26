package com.example.springsecurity2022pt2.schedule;

import org.jsoup.Jsoup;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import sun.net.ftp.FtpClient;
import javax.swing.text.Document;

import java.io.IOException;

@EnableAsync
@EnableScheduling
@Component
public class Schedule {

    @Scheduled(fixedRateString = "500")
    @Async
    public void getTelegramUpdates() {
        System.out.println("Salam------------");


    }


    public void useJsoup() throws IOException {
        Document doc = (Document) Jsoup.connect("http://www.javatpoint.com").get();
        String title = doc.title();
        System.out.println("title is: " + title);
    }
}
