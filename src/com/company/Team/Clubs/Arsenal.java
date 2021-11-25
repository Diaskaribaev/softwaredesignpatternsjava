package com.company.Team.Clubs;

import com.company.Player.Player;
import com.company.Team.Team;

public class Arsenal extends Team {
     public Arsenal(Player player){
        super(player);
    }

    public Arsenal()
    {
        name = "Arsenal FC";
    }
    Barcelona barcelona = new Barcelona();

    @Override
    public void PlayerTeam() {
        System.out.println("For season 21/22 scoring...");
        player.scoreGoal();
    }

    public void SalaryGive() {
        System.out.println("Shareholders give the money:");
        player.getsalary();
    }

    @Override
    public void getNumber() {
        System.out.println("Player get number like:");
        player.getNumber();
    }

    @Override
    public int getTransferCostOfTheTeam() {
        return 563500000;
    }


    public void transfer(){
        barcelona.exchange ();
    }
}
