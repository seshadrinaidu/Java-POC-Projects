package com.poc.nestedif;

import java.util.Scanner;

public class NaukriProfile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Your Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile_Number = sc.nextLine();

        System.out.print("Enter Your Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Your Highest Qualification: ");
        String qualification = sc.nextLine();

        if (qualification.equals("B.Tech") ||
                qualification.equals("MCA") ||
                qualification.equals("Degree")) {

            System.out.println("Enter additional details");

            System.out.print("Enter your Stream or Specialization: ");
            String specialization = sc.nextLine();

            if (specialization.equals("Computer Application") ||
                    specialization.equals("Machine Learning") ||
                    specialization.equals("Artificial Intelligence") ||
                    specialization.equals("AI Engineer") ||
                    specialization.equals("Cyber Security")) {

                System.out.println("Enter Additional Details");

                System.out.print("Are there any backlogs (true/false): ");
                boolean backlogs = sc.nextBoolean();

                if (!backlogs) {

                    System.out.println("Enter additional details");

                    System.out.print("Enter your Year of Passout: ");
                    int passedOut = sc.nextInt();

                    if (passedOut == 2025 ||
                            passedOut == 2026 ||
                            passedOut == 2027) {

                        System.out.println("Please provide further details of your skills");

                        sc.nextLine(); // Consume newline

                        System.out.print("Do you know any programming language? (true/false): ");
                        boolean programmingLanguage = sc.nextBoolean();

                        if (programmingLanguage) {

                            System.out.print("Have you completed any projects? (true/false): ");
                            boolean projects = sc.nextBoolean();

                            if (projects) {
                                System.out.println("You are eligible");
                            } else {
                                System.out.println("You need projects");
                                System.out.println("Not eligible");
                            }

                        } else {
                            System.out.println("Not Eligible");
                        }

                    } else {
                        System.out.println("Not Eligible");
                    }

                } else {
                    System.out.println("You have backlogs");
                    System.out.println("Not Eligible");
                }

            } else {
                System.out.println("Invalid Specialization");
            }

        } else {
            System.out.println("Invalid Educational Qualification");
        }

        sc.close();
    }
}
