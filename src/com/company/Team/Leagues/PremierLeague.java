package com.company.Team.Leagues;

import com.company.Team.Decorator;
import com.company.Team.Team;

public class PremierLeague extends Decorator {
    Team team;
    public PremierLeague(Team team){
        this.team = team;
    }
    @Override
    public String getInfo() {
        return team.getInfo() + " played in Premier League";
    }

    @Override
    public void PlayerTeam() {

    }

    @Override
    public void SalaryGive() {

    }

    @Override
    public void getNumber() {

    }

    @Override
    public int getTransferCostOfTheTeam() {
        return team.getTransferCostOfTheTeam() - 134700000;
    }
}
