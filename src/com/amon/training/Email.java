package com.amon.training;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departments;
    private String email;
    private String companyDomain = "mailcompany.com";
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;

        // Constructor to receive first and last name
        public Email(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            //System.out.print("\nEmail created: " + this.firstName + " " + this.lastName +" \n");

        // Call a method asking for the department - return the department
        this.departments = setdepartments();
        //System.out.println("\nDepartment: " + this.departments);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password + " ");

        //Combine all elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departments.toLowerCase() + "." + companyDomain;
        //System.out.println("Your email is: " + email);
    }

    // Ask for the Departments
    private String setdepartments() {
        System.out.print("\n Enter Department Code: \n1. for Sales\n2. for Development\n3. for Accounting\n4. for None\n\nEnter Department Code:");
        Scanner in = new Scanner(System.in);
            int depChoice = in.nextInt();
                if (depChoice == 1){return "Sales"; }
                else if (depChoice == 2){return "Development"; }
                else if (depChoice == 3){return "Accounting"; }
                else if (depChoice == 4){return "None"; }
            return setdepartments();
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGIJKLMNOP;QRSTUVWXYZ!@#$%^&*()";
        char[] password = new char[length];
        for(int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password [i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
            this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail (String altEmail){
            this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
            this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    public String showInfo(){
            return "Display name: " + firstName + " " + lastName +
                    "\nCompany email: " + email +
                    "\nMailbox Capacity: " + mailboxCapacity + " mb.";
    }

}