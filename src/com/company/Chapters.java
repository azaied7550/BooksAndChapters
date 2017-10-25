package com.company;

import java.util.ArrayList;

public class Chapters {
    private String chapterTitle;
    ArrayList<Pages> pagesArrayList;

    public Chapters() {
        pagesArrayList=new ArrayList<>();
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public ArrayList<Pages> getPagesArrayList() {
        return pagesArrayList;
    }

    public void setPagesArrayList(ArrayList<Pages> pagesArrayList) {
        this.pagesArrayList = pagesArrayList;
    }
}
