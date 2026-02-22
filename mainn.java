package com.mycompany.main1;

import java.util.Scanner;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        Repo librarian = new Repo();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("[1] Add Student");
            System.out.println("[2] Show Master List");
            System.out.println("[3] Exit");
            System.out.print("Select: ");
            String choice = sc.nextLine();

            if (choice.equals("1")) {
                System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
                System.out.print("First Name: "); String fName = sc.nextLine();
                System.out.print("Last Name: "); String lName = sc.nextLine();
                System.out.print("Age: "); int age = Integer.parseInt(sc.nextLine());
                System.out.print("Gender: "); String gen = sc.nextLine();
                System.out.print("Year: "); int yr = Integer.parseInt(sc.nextLine());
                System.out.print("Course: "); String crs = sc.nextLine();
                System.out.print("Blood: "); String bld = sc.nextLine();
                System.out.print("Address: "); String addr = sc.nextLine();
                System.out.print("Contact: "); int con = Integer.parseInt(sc.nextLine());

                // Storing data using Student Object
                Student s = new Student(id, fName, lName, age, gen, yr, crs, bld, addr, con);
                librarian.addStudent(s);
                System.out.println("Student added successfully to database!");

            } else if (choice.equalsIgnoreCase("2") || choice.equalsIgnoreCase("SHOW")) {
                List<Student> students = librarian.getAllStudents();
                
                // Professional Table Header
                System.out.println("\n" + "=".repeat(115));
                System.out.printf("%-5s | %-25s | %-5s | %-8s | %-8s | %-30s%n", 
                                  "ID", "NAME", "AGE", "GEN", "COURSE", "ADDRESS");
                System.out.println("-".repeat(115));

                for (Student s : students) {
                    String fullName = s.getFirstName() + " " + s.getLastName();
                    
                    // Fixed-width formatting to keep columns clean
                    System.out.printf("%-5d | %-25s | %-5d | %-8s | %-8s | %-30s%n",
                        s.getID(), 
                        fullName, 
                        s.getAge(), 
                        s.getGender(), 
                        s.getCourse(), 
                        s.getAddress());
                }
                System.out.println("=".repeat(115));
                
            } else if (choice.equals("3")) {
                System.out.println("Exiting system...");
                break;
            }
        }
        sc.close();
    }
}