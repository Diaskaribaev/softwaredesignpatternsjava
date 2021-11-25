package com.company;

import com.company.ManagersOfApplication.Managers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ManagersOfDreamTeamFactory managersOfDreamTeamFactory = new ManagersOfDreamTeamFactory();
        Managers theManager = null;
        Scanner userInput = new Scanner(System.in);
          System.out.println("What type of manager? (Founder / Shareholders / GeneralCEO)");
              if(userInput.hasNextLine()){

            String typeOfManager = userInput.nextLine();
                  theManager = managersOfDreamTeamFactory.defineTheManagers(typeOfManager);

        }
              if(theManager != null){
                  doStuffenemy(theManager);
              }  else System.out.println("Enter a Founder, Shareholders or GeneralCEO next time");


//        System.out.println("\n");
//        Arlan arlan = new Arlan();
//        arlan.setNameOfAcademy("arlan");
//        arlan.setAllocatedMoney(18878790);
//        arlan.Details();
//        arlan.display("Region «Запад»", "+7 888 7777777");
//        arlan.adult();
//        arlan.School();
//        System.out.println("\n");
//        arlan.addObserver(new Parishioner("Ronaldo", arlan));
//        arlan.addObserver(new Parishioner("Messi", arlan));
//        arlan.setNewsChurch("The Academy player receives news that the construction of the Academy has ended");



//        BarçaAcademy barçaAcademy = new BarçaAcademy();
//        barçaAcademy.setNameOfAcademy("BarçaAcademy");
//        barçaAcademy.setAllocatedMoney(14000000);
//        barçaAcademy.Details();
//        barçaAcademy.display(" province «Барселона»","+7 707 1066053");
//        barçaAcademy.adult();
//        barçaAcademy.School();
    }

    private static void doStuffenemy(Managers anManagerType) {
        anManagerType.displayManager();
    }
}
