package com.company.Academies;

import com.company.Academies.Age.ForAdultChildren;
import com.company.Academies.Age.IAgeFeaturesClass;
import com.company.Academies.Education.IEducationClass;
import com.company.Observer.IObservable;
import com.company.Academies.Education.WithSchool;

public abstract class Academies implements IObservable {

    private String newsAcademy;
    private IAgeFeaturesClass adult;
    private IEducationClass School;
     String NameOfAcademy;
     int AllocatedMoney;

    public Academies(){
         NameOfAcademy = "Arlan"; // default academy which will be built
        AllocatedMoney = 780000000; // initial capital
    };

    public void Details(){
        System.out.println("Name the Academy: " + NameOfAcademy + ", allocated money is "+ AllocatedMoney);
    }
    public abstract void display(String BranchesOfTheAcademy, String Contacts );

    public void BrawlHeroes() {}

    public Academies(String NameOfAcademy, int AllocatedMoney){
        this.NameOfAcademy = NameOfAcademy;
        this.AllocatedMoney = AllocatedMoney;
    }

    public String getNameOfAcademy() {
        return NameOfAcademy;
    }

    public void setNameOfAcademy(String nameOfAcademy) {
        NameOfAcademy = nameOfAcademy;
    }

    public int getAllocatedMoney() {
        return AllocatedMoney;
    }

    public void setAllocatedMoney(int allocatedMoney) {
        AllocatedMoney = allocatedMoney;
    }

    protected ForAdultChildren adult() {
        return null;
    }

    protected WithSchool School() {
        return null;
    }


}
