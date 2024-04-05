package com.example.demo;



import java.util.HashMap;
import java.util.Map;

public class MatchRequest {

    private String matchId;
    private String date;
    private Map<String, Map<String, String>> stats;

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

    public Map<String, Map<String, String>> getStats() {
        return stats;
    }

    public void setStats(Map<String, Map<String, String>> stats) {
        this.stats = stats;
    }
}
