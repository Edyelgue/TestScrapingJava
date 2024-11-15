package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrapingExample {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("https://example.com").get();
            
            String title = document.title();
            System.out.println("Título da página: " + title);
            
            Elements links = document.select("a");
            for (Element link : links) {
                System.out.println("Texto do link: " + link.text());
                System.out.println("URL do link: " + link.attr("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
