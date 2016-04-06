package com.example.lotrik.sugarorm.Models;

import com.orm.SugarRecord;

/**
 * Created by lotrik on 24.02.16.
 */
public class Chapter extends SugarRecord {

    String name;
    int number;
    private Book book;

    public Chapter() {
    }

    public Chapter(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
