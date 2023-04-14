package com.example.book;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBook extends RecyclerView.Adapter<BookHolder> {
    private Context context;
    private List<Book> books;

    public AdapterBook(Context context, List<Book> books){
        this.books=books;
        this.context=context;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView= LayoutInflater.from(parent.getContext()).inflate(R.layout.book,null,false);
        RecyclerView.LayoutParams params=new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(params);

        BookHolder book=new BookHolder((layoutView));
        return book;
    }

    @Override
    public void onBindViewHolder(BookHolder holder, @SuppressLint("RecyclerView") int position) {
        DB db=new DB(holder.itemView.getContext());

        holder.titlu.setText(books.get(position).getTitlu());
        holder.autor.setText(books.get(position).getAutor());
        holder.comentariu.setText(books.get(position).getComentariu());
        holder.rating.setText("Rating: "+books.get(position).getRating());

        holder.sterge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.removeBook(books.get(position).getId());
                ViewGroup.LayoutParams layoutParams=holder.lay.getLayoutParams();
                layoutParams.height=0;
                holder.lay.setLayoutParams(layoutParams);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
