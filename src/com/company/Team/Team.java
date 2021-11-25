package com.company.Team;

import com.company.Player.Player;

public abstract class Team {
    protected Player player;
    protected Team(Player player){
        this.player = player;

    }

    public String name = "Unknown Team";

    protected Team() {
    }

    public String getInfo(){
        return name;

    }
    public abstract void PlayerTeam();
    public abstract void SalaryGive();
    public abstract void getNumber();

    public abstract int getTransferCostOfTheTeam();
}
