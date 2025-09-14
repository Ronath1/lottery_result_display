package com.example.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private LotteryResultRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        String url = "https://results.govdoc.lk/results/jayoda-2160";
        Document doc = Jsoup.connect(url).get();

        Element title = doc.selectFirst("div.title-wrp h1");
        String letter = (title != null) ? title.text() : "Unknown Lottery";

        Elements results = doc.select("div.wrp.single-result.name div.result-block");
        String numbers = results.isEmpty() ? "N/A" : results.text();

        String drawDate = LocalDate.now().toString();

        System.out.println("Lottery: " + letter);
        System.out.println("Winning Numbers: " + numbers);
        System.out.println("Date: " + drawDate);


        LotteryResult result = new LotteryResult();
        result.setLetter(letter);
        result.setNumbers(numbers);
        result.setDate(drawDate);

        repo.save(result);

        System.out.println("✅ Result saved to database!");
    }
}
