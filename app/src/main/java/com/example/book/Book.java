package com.example.book;

public class Book {
    private int id;
    private String titlu;
    private String autor;
    private String comentariu;
    private String rating;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getComentariu() {
        return comentariu;
    }

    public void setComentariu(String comentariu) {
        this.comentariu = comentariu;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Book(String titlu, String autor, String comentariu, String rating) {
        this.titlu = titlu;
        this.autor = autor;
        this.comentariu = comentariu;
        this.rating = rating;
    }

    public Book(int id, String titlu, String autor, String comentariu, String rating) {
        this.id = id;
        this.titlu = titlu;
        this.autor = autor;
        this.comentariu = comentariu;
        this.rating = rating;
    }
}
