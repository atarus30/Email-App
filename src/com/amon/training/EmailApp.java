package com.amon.training;

public class EmailApp {

    public static void main(String[] args) {

       Email em = new Email ("Bob", "Tessy");
       System.out.print(em.showInfo());

        /* The Code below was designed to test different areas of the code.

        em1.setAlternateEmail("Your alternate email address is: js@gmail.com");
        System.out.println(em1.getAlternateEmail());

        em1.setMailboxCapacity(220);*/

    }
}
