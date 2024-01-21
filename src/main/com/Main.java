package main.com;

import generator.Generator;

public class Main {

    /**
     * This is the main method. It can be run by hitting the green arrow in the gutter.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account accountA = new Account("Ada Lovelace");
        Account accountB = new Account("Grace Hopper");

        System.out.println("accountA = " + accountA);
        System.out.println("accountB = " + accountB);

        accountA.setName("Augusta Ada King");
        System.out.println("accountA = " + accountA);

        Generator.generateAssessmentKey();
    }


}
