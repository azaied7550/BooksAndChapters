package com.company;

import java.util.ArrayList;

public class Books {
    private String bookTitle;
    ArrayList <Chapters> chaptersArrayList;

    public Books(){
        chaptersArrayList = new ArrayList<Chapters>();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public ArrayList<Chapters> getChaptersArrayList() {
        return chaptersArrayList;
    }

    public void setChaptersArrayList(ArrayList<Chapters> chaptersArrayList) {
        this.chaptersArrayList = chaptersArrayList;
    }
}
