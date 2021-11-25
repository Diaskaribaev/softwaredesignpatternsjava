package com.company.Team;

import com.company.Player.Player;
import com.company.Team.Team;

public abstract class Decorator extends Team {
    protected Decorator(Player player) {
        super(player);
    }
    protected Decorator() {
    }
    public abstract String getInfo();
}
