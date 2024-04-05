package com.example.demo;

public class MatchStats {
    private int goals;
    private String possession;
    private int passes;
    private int shots;
    private int shotsOnTarget;
    private int corners;

    // Constructors, getters, and setters

    public MatchStats() {
    }

    public MatchStats(int goals, String possession, int passes, int shots, int shotsOnTarget, int corners) {
        this.goals = goals;
        this.possession = possession;
        this.passes = passes;
        this.shots = shots;
        this.shotsOnTarget = shotsOnTarget;
        this.corners = corners;
    }

    // Getters and setters

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getShotsOnTarget() {
        return shotsOnTarget;
    }

    public void setShotsOnTarget(int shotsOnTarget) {
        this.shotsOnTarget = shotsOnTarget;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }
}
