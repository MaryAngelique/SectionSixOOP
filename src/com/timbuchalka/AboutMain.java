package com.timbuchalka;

public class AboutMain {

    public static void main(String[] args) {

        Account bobsAccount = new Account();
        // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());


    }
}
