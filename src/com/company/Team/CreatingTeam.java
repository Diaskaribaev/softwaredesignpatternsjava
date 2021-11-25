package com.company.Team;

import com.company.Team.Leagues.LaLiga;
import com.company.Team.Leagues.PremierLeague;
import com.company.Team.Clubs.Arsenal;
import com.company.Team.Clubs.Barcelona;

public class CreatingTeam {
    public void start(){
        Team teamOne = new Arsenal();
        System.out.println(teamOne.getInfo());
        System.out.println(teamOne.getTransferCostOfTheTeam());

        teamOne = new PremierLeague(teamOne);
        System.out.println(teamOne.getInfo());
        System.out.println(teamOne.getTransferCostOfTheTeam());

        Team teamTwo = new LaLiga(new PremierLeague(new Barcelona()));
        System.out.println(teamTwo.getInfo());
        System.out.println(teamTwo.getTransferCostOfTheTeam());

    }
}
