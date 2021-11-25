package com.company.Player.ofBarcelona;

import com.company.Player.Player;

public class Depay implements Player {
    private boolean contract = false;
    public boolean hasContract(){
        return contract;
    }
    void signed(){
        contract = true;
    }
    void unsigned(){
        contract = false;
    }
    @Override
    public void scoreGoal() {
        System.out.println("top scorer is Depay: 12 goal...");
    }



    @Override
    public void getInjured() {
        System.out.println("Player of Barcelona get injured...");
    }

    @Override
    public void getNumber() {
        int number = 9;
        System.out.println("Number of player is " + number);
    }

    @Override
    public void getsalary() {
        System.out.println("Depay get: 40000$");

    }
}
