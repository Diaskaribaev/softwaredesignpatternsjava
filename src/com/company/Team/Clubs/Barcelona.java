package com.company.Team.Clubs;

import com.company.Player.Player;
import com.company.Team.Team;

public class Barcelona extends Team {
    public Barcelona(Player player){
        super(player);
    }

    public Barcelona(){
        name = "FC Barcelona";
    }

    @Override
    public void PlayerTeam() {
        System.out.println("For season 21/22 scoring...");
        player.scoreGoal();
    }

    @Override
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
        return 658000000;
    }

    void exchange(){
        System.out.println("Трансфер успешно произведен!");
    }
}
