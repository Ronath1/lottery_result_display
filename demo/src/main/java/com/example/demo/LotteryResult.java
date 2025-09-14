package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "lottery_result_ronath")  // your DB table name
public class LotteryResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String letter;
    private String numbers;
    private String date;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLetter() { return letter; }
    public void setLetter(String letter) { this.letter = letter; }

    public String getNumbers() { return numbers; }
    public void setNumbers(String numbers) { this.numbers = numbers; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
