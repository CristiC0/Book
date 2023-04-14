package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText titlu;
    private EditText autor;
    private EditText comentariu;
    private RadioGroup rating;

    private Button adauga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlu=(EditText)findViewById(R.id.titlu);
        autor=(EditText)findViewById(R.id.autor);
        comentariu=(EditText)findViewById(R.id.comentariu);
        rating=(RadioGroup) findViewById(R.id.rating);

        adauga=(Button) findViewById(R.id.adauga);

        adauga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DB db=new DB(MainActivity.this);
                int id=rating.getCheckedRadioButtonId();
                RadioButton but=(RadioButton)findViewById(id);
                db.addBook(new Book(titlu.getText().toString(),autor.getText().toString(),comentariu.getText().toString(),but.getText().toString()));
                Intent intent=new Intent(MainActivity.this,BookList.class);
                startActivity(intent);
            }
        });
    }
}