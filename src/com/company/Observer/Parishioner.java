package com.company.Observer;

import com.company.Observer.IObservable;
import com.company.Observer.IObserver;

public class Parishioner implements IObserver {
    private String name;
    public Parishioner (String name, IObservable o){
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " " + news) ;
    }
}
