package com.company.Academies.NameOfAcademies;

import com.company.Academies.Academies;
import com.company.Academies.Age.ForAdultChildren;
import com.company.Academies.Age.ForSmallChildren;
import com.company.Observer.IObserver;
import com.company.Academies.Education.WithSchool;

import java.util.ArrayList;
import java.util.List;

public class Barys extends Academies {
    private String BranchesTheAcademy;
    private String contact;
    private List<IObserver> parishioners;
    private String newsAcademy;


    public Barys(){
        ForSmallChildren forSmallChildren = new ForSmallChildren();
        forSmallChildren.Adult();
        WithSchool withSchool = new WithSchool();
        withSchool.School();
        parishioners = new ArrayList<>();
    }

    @Override
    public void display(String BranchesOfTheAcademy, String Contacts) {
        this.BranchesTheAcademy = BranchesOfTheAcademy;
        this.contact = Contacts;
        System.out.println("Branches of the Academy " + BranchesTheAcademy);
        System.out.println("Contacts - " + contact);
    }

    @Override
    public void addObserver(IObserver o) {
        parishioners.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        parishioners.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o: parishioners) {
            o.update(newsAcademy);
        }
    }
    public void setNewsChurch(String news) {
        this.newsAcademy = news;
        notifyObservers();
    }
    @Override
    public ForAdultChildren adult() {
        return null;
    }



    @Override
    protected WithSchool School() {
        return null;
    }

}
