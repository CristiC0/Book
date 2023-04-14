package com.example.book;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class BookHolder extends RecyclerView.ViewHolder  {
    public TextView titlu;
    public TextView autor;
    public TextView comentariu;

    public TextView rating;

    public Button sterge;
    public LinearLayout lay;
    public BookHolder(View itemView) {
        super(itemView);

        titlu=(TextView) itemView.findViewById(R.id.titlu);
        autor=(TextView) itemView.findViewById(R.id.autor);
        comentariu=(TextView) itemView.findViewById(R.id.comentariu);
        rating=(TextView) itemView.findViewById(R.id.rating);
        sterge=(Button) itemView.findViewById(R.id.sterge);
        lay=(LinearLayout) itemView.findViewById(R.id.lay);
    }
}
