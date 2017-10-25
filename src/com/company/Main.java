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
        String userInputChapter;
        String userInputPage;


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


        //Displaying list before adding new pages to a chapter
        displayBooks(booksArrayList);


        //Adding a page to an existing chapter
        do {
            System.out.println("Do you want to add a page to an existing chapter? (Y/N)");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Enter chapter name: ");
                userInputChapter = keyboard.nextLine();

                System.out.println("Enter page name to add: ");
                userInputPage = keyboard.nextLine();


                for (Books eachBook : booksArrayList) {

                    for (Chapters eachChapter : eachBook.getChaptersArrayList()) {
                        if (eachChapter.getChapterTitle().equalsIgnoreCase(userInputChapter)) {
                            newPage = new Pages();
                            newPage.setPageTitle(userInputPage);
                            newChapter.getPagesArrayList().add(newPage);
                        }
                    }
                }

            }
        }while (answer.equalsIgnoreCase("y")) ;

        //Displaying book list after addition
        System.out.println("List of books after page addition");
        displayBooks(booksArrayList);

    }


    //Method to display book list
    private static void displayBooks(ArrayList<Books> booksArrayList){
        for (Books eachBook : booksArrayList) {
            System.out.println("Book Title: " + eachBook.getBookTitle());
            System.out.println();
            System.out.println("Chapters: ");
            int count = 1;
            for (Chapters eachChapter : eachBook.getChaptersArrayList()) {
                System.out.println("Chapter " + count + " : " + eachChapter.getChapterTitle());
                count++;
                System.out.println("Pages: ");
                int count1 = 1;
                for (Pages eachPage : eachChapter.getPagesArrayList()) {
                    System.out.println("Page " + count1 + " :" + eachPage.getPageTitle());
                    count1++;
                }
                System.out.println();
            }
        }
    }
}