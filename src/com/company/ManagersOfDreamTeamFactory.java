package com.company;

import com.company.Academies.NameOfAcademies.Arlan;
import com.company.Academies.NameOfAcademies.Barys;
import com.company.ManagersOfApplication.FounderOfDreamTeam;
import com.company.ManagersOfApplication.GeneralDirector;
import com.company.ManagersOfApplication.Managers;
import com.company.ManagersOfApplication.ShareholderOfDreamTeam;
import com.company.Observer.Parishioner;
import com.company.Player.ofArsenal.Aubameyang;
import com.company.Player.ofBarcelona.Depay;
import com.company.Team.Clubs.Arsenal;
import com.company.Team.Clubs.Barcelona;
import com.company.Team.CreatingTeam;
import com.company.Team.Team;

public class ManagersOfDreamTeamFactory {
    public Managers defineTheManagers(String newManagerType){
        Managers newManager = null;
        if (newManagerType.equals("Founder")) {
            Arlan arlan = new Arlan();
            arlan.display("Region «Запад»", "+7 888 7777777");
            arlan.setNameOfAcademy("arlan");
            arlan.Details();
            arlan.adult();
            arlan.School();
            System.out.println("-------------------------------------------------------------------------------------------------------");
            arlan.addObserver(new Parishioner("Ronaldo", arlan));
            arlan.addObserver(new Parishioner("Messi", arlan));
            arlan.addObserver(new Parishioner("Neymar", arlan));
            arlan.setNewsChurch("The Academy player receives news that the construction of the Academy has ended");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            Barys barys = new Barys();
            barys.display("Region «Север»", "+7 888 7666677");
            barys.setNameOfAcademy("Barys");
            barys.Details();
            barys.adult();
            System.out.println("-------------------------------------------------------------------------------------------------------");
            barys.addObserver(new Parishioner("Dias", barys));
            barys.setNewsChurch("The Academy player receives news that the construction of the Academy has ended");

            return new FounderOfDreamTeam();
        } else
        if (newManagerType.equals("Shareholders")){
            Arlan arlan = new Arlan();
            arlan.setAllocatedMoney(618878790);
            arlan.Details();
            System.out.println("-----------------------------------------------");
            Team[] teams = {
                    new Barcelona(new Depay()),
                    new Arsenal(new Aubameyang())
            };
            for (Team team: teams){
                team.SalaryGive();
            }
            System.out.println("-----------------------------------------------");
            return new ShareholderOfDreamTeam();
        } else
        if (newManagerType.equals("GeneralCEO")){
            System.out.println("He created the team");
            CreatingTeam creatingTeam = new CreatingTeam();
            creatingTeam.start();
            System.out.println("-----------------------------------------------");
            System.out.println("some statistics for season");
            Team [] teams = {
                    new Barcelona(new Depay()),
                    new Arsenal(new Aubameyang())
            };
            for (Team team: teams){
                team.PlayerTeam();
            }

            System.out.println("-----------------------------------------------");
            GeneralDirector generalDirector = new GeneralDirector();
            generalDirector.transferFunction();
            System.out.println("-----------------------------------------------");

//            Arsenal arsenal = new Arsenal();
//            arsenal.transfer();

            return new GeneralDirector();
        } else return null;
    }
}
