package com.example.demo;

public class Stats {
    private MatchStats teamAStats;
    private MatchStats teamBStats;

    public MatchStats getTeamAStats() {
        return teamAStats;
    }

    public Stats(MatchStats teamAStats, MatchStats teamBStats) {
        super();
        this.teamAStats = teamAStats;
        this.teamBStats = teamBStats;
    }

    public void setTeamAStats(MatchStats teamAStats) {
        this.teamAStats = teamAStats;
    }

    public MatchStats getTeamBStats() {
        return teamBStats;
    }

    public void setTeamBStats(MatchStats teamBStats) {
        this.teamBStats = teamBStats;
    }
}