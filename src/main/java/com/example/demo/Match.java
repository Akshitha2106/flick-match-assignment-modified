package com.example.demo;

import jakarta.persistence.Id;

public class Match {

    private String matchId;
    private String date;
    private Stats stats;

    public Match(String matchId, String date, Stats stats) {
        super();
        this.matchId = matchId;
        this.date = date;
        this.stats = stats;
    }

    public Match() {}

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}

