package com.example.book;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private static List<Book> books;
    private  RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        DB db=new DB(this);
        books=db.getBooks();

        recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setHasFixedSize(true);

        layoutManager=new LinearLayoutManager(BookList.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new AdapterBook(BookList.this,books);
        recyclerView.setAdapter(adapter);

    }
}