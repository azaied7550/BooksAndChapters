package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Books> booksArrayList = new ArrayList<>();
        Books newBook = new Books();
        Chapters newChapter;
        Pages newPage;
        String answer;


        System.out.println("Enter book title: ");
        newBook.setBookTitle(keyboard.nextLine());
        booksArrayList.add(newBook);
        do {
            newChapter = new Chapters();
            System.out.println("Enter chapter name:");
            newChapter.setChapterTitle(keyboard.nextLine());

            do {
                newPage = new Pages();
                System.out.println("Enter page name: ");
                newPage.setPageTitle(keyboard.nextLine());
                newChapter.getPagesArrayList().add(newPage);
                System.out.println("Add a new page? (Y/N) ");
                answer = keyboard.nextLine();

            } while (answer.equalsIgnoreCase("y"));

            newBook.getChaptersArrayList().add(newChapter);

            System.out.println("Add a new chapter? (Y/N) ");
            answer = keyboard.nextLine();
        } while (answer.equalsIgnoreCase("y"));


        for (Books eachBook : booksArrayList) {
            System.out.println("Book Title: " + eachBook.getBookTitle());
            System.out.println();
            System.out.println("Chapters: ");
            int count=1;
            for (Chapters eachChapter : eachBook.getChaptersArrayList()) {
                System.out.println("Chapter "+count+" : " + eachChapter.getChapterTitle());
                count++;
                System.out.println("Pages: ");
                int count1=1;
                for (Pages eachPage : eachChapter.getPagesArrayList()) {
                    System.out.println("Page "+count1+" :" + eachPage.getPageTitle());
                    count1++;
                }
                System.out.println();
            }
        }

    }
}

