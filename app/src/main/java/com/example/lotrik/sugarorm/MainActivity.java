package com.example.lotrik.sugarorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.lotrik.sugarorm.Models.Book;
import com.example.lotrik.sugarorm.Models.Chapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Book book = new Book("Title", "1st edition");
        book.save();

        Book book2 = new Book("Title", "2nd edition");
        book2.save();

        Book book3 = new Book("Title", "3rd edition");
        book3.save();

        Book books2 = Book.findById(Book.class, 3);

//        Log.d("tag11", books.getEdition());



        Chapter chap = new Chapter("pervaya", 1);
        chap.setBook(books2);
        chap.save();

        List<Book> books;
        books = Book.listAll(Book.class);

        for(Book bookFor:books){

            Log.d("tag11", "book.getTitle() - "+bookFor.getEdition());
            List<Chapter> chapters = bookFor.getChapters();
            Log.d("tag11", "chapters.size() - "+chapters.size());

            for(Chapter chapter: chapters){

                Log.d("tag11", "chapter.getName() - "+chapter.getName());
            }
        }

    }
}
