package com.company.Academies.NameOfAcademies;

import com.company.Academies.Academies;
import com.company.Academies.Age.ForAdultChildren;
import com.company.Observer.IObserver;
import com.company.Academies.Education.WithSchool;
import com.company.Academies.Education.WithoutSchool;

public class BarçaAcademy extends Academies {
    private String BranchesTheAcademy;
    private String contact;

    public BarçaAcademy(){

        ForAdultChildren forAdultChildren = new ForAdultChildren();
        forAdultChildren.Adult();
        WithoutSchool withoutSchool = new WithoutSchool();
        withoutSchool.School();
    }


    @Override
    public void display(String BranchesOfTheAcademy, String Contacts) {
        this.BranchesTheAcademy = BranchesOfTheAcademy;
        this.contact = Contacts;
        System.out.println("Branches of the Academy " + BranchesTheAcademy);
        System.out.println("Contacts - " + contact);
    }

    @Override
    protected ForAdultChildren adult() {
        return null;
    }




    @Override
    protected WithSchool School() {
        return null;
    }


    @Override
    public void addObserver(IObserver o) {

    }

    @Override
    public void removeObserver(IObserver o) {

    }

    @Override
    public void notifyObservers() {

    }
}
