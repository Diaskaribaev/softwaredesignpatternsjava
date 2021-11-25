package com.company.Player.ofArsenal;

import com.company.Player.Player;

public class Aubameyang implements Player {
    public boolean contract = false;
    public boolean hasContract(){
        return contract;
    }
    public void signed(){
        contract = true;
    }
    public void unsigned(){
        contract = false;
    }
    @Override
    public void scoreGoal() {
        System.out.println("top scorer is Aubameyang: scored 20 goal.");
    }

    @Override
    public void getInjured() {
        System.out.println("Player of Arsenal get injured...");
    }

    @Override
    public void getNumber() {
        int number = 11;
        System.out.println("Number of player is " + number);
    }


    @Override
    public void getsalary() {
        System.out.println("Aubameyang get: 200000$ ");
    }
}
