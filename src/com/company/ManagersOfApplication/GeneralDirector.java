package com.company.ManagersOfApplication;

import com.company.Player.ofArsenal.Aubameyang;
import com.company.Transfer.Transfer;

public class GeneralDirector extends Managers {
    Transfer transfer = new Transfer();
    Aubameyang aubameyang = new Aubameyang();
    public void transferFunction(){
        aubameyang.signed();
        transfer.copyPlayerFromClub(aubameyang);
    }


    public GeneralDirector(){
        setName("Grant Harris");
        setAge(39);
    }
}
