package com.Driver;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entities.*;
import co.operations.*;

public class Main {
    static public EntityManagerFactory emf = Persistence.createEntityManagerFactory("Piu");
    static public EntityManager em = emf.createEntityManager();
    static public EntityTransaction et = em.getTransaction();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("..-.-.-.-Welcome to library Management'-'-'-'-'-'-'-");
        
        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Exit");
            
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter book name:");
                    String title = sc.next();
                    
                    System.out.println("Enter year:");
                    int year = sc.nextInt();
                    
                    System.out.println("Enter total copies:");
                    int totalcopies = sc.nextInt();
                    
                    System.out.println("Enter publisher name:");
                    String name = sc.next();
                    
                    System.out.println("Enter publisher phone number:");
                    long phno = sc.nextLong();
                    
                    System.out.println("Enter publisher email:");
                    String email = sc.next();
                    
                    System.out.println("Enter publisher address:");
                    String address = sc.next();
                    
                    
                    Publisher publisher = BookHelper.findOrCreatePublisher(name, phno, email, address);
                    
                   
                    BookHelper.addBook(title, year, totalcopies, publisher);
                    
                } break;
                
                case 2: {
                   
                } break;
                
                case 3: {
                    System.out.println("Thank You");
                    System.exit(0);
                } break;
                
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
}
