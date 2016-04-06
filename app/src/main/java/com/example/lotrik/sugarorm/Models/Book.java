package com.example.lotrik.sugarorm.Models;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by lotrik on 24.02.16.
 */
public class Book extends SugarRecord {

    String title;
    String edition;

    public Book(){
    }

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public List<Chapter> getChapters() {

        return Chapter.find(Chapter.class, "book = ?", getId()+"");
    }
}
