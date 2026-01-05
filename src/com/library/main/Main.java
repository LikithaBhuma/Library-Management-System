package com.library.main;

import com.library.dao.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO bookDAO = new BookDAO();
        MemberDAO memberDAO = new MemberDAO();
        IssueDAO issueDAO = new IssueDAO();

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Register Member");
            System.out.println("4. Issue Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    bookDAO.addBook(title, author, qty);
                    break;

                case 2:
                    bookDAO.viewBooks();
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    memberDAO.addMember(name, email);
                    break;

                case 4:
                    System.out.print("Book ID: ");
                    int bookId = sc.nextInt();
                    System.out.print("Member ID: ");
                    int memberId = sc.nextInt();
                    issueDAO.issueBook(bookId, memberId);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}
