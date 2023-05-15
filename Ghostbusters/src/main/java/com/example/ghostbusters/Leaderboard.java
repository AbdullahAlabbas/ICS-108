package com.example.ghostbusters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Leaderboard {
    private ArrayList<Player> topPlayers;

    public Leaderboard() {
        topPlayers = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        topPlayers.add(player);
        Collections.sort(topPlayers, (p1, p2) -> p2.getScore() - p1.getScore());
        if (topPlayers.size() > 5) {
            topPlayers.remove(5);
        }
    }

    public ArrayList<Player> getTopPlayers() {
        return topPlayers;
    }
}

