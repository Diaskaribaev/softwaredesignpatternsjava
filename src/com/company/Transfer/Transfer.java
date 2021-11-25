package com.company.Transfer;

import com.company.Player.ofArsenal.Aubameyang;

public class Transfer {
    public void copyPlayerFromClub(Aubameyang aubameyang){
        if (aubameyang.hasContract()){
            System.out.println("The transfer was successfully made");
        }
        else {
            System.out.println("failed the transfer");
        }

    }
}
