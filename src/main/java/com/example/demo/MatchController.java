package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MatchController {

    private static List<Match> matchList = new ArrayList<>();

    @GetMapping("/hello-world")
    public void helloWorld() {
        System.out.println("Hello World");
    }

    @PostMapping("/send-message")
    public void sendMessage(@RequestBody String message) {
        System.out.println(message);
    }

    @GetMapping("/getMatchStats/{matchId}")
    public ResponseEntity<?> getMatchStats(@PathVariable String matchId) {
        Optional<Match> match = findMatchById(matchId);
        if (match.isPresent()) {
            return ResponseEntity.ok(match.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Match not found");
        }
    }

    @GetMapping("/getAllMatches")
    public ResponseEntity<List<Match>> getAllMatches() {
        return ResponseEntity.ok(matchList);
    }

    @PostMapping("/createMatch")
    public ResponseEntity<String> createMatch(@RequestBody MatchRequest matchRequest) {
        try {
            MatchStats teamA = new MatchStats(
                    Integer.parseInt(matchRequest.getStats().get("teamA").get("goals")),
                    matchRequest.getStats().get("teamA").get("possession"),
                    Integer.parseInt(matchRequest.getStats().get("teamA").get("passes")),
                    Integer.parseInt(matchRequest.getStats().get("teamA").get("shots")),
                    Integer.parseInt(matchRequest.getStats().get("teamA").get("shotsOnTarget")),
                    Integer.parseInt(matchRequest.getStats().get("teamA").get("corners"))
            );

            MatchStats teamB = new MatchStats(
                    Integer.parseInt(matchRequest.getStats().get("teamB").get("goals")),
                    matchRequest.getStats().get("teamB").get("possession"),
                    Integer.parseInt(matchRequest.getStats().get("teamB").get("passes")),
                    Integer.parseInt(matchRequest.getStats().get("teamB").get("shots")),
                    Integer.parseInt(matchRequest.getStats().get("teamB").get("shotsOnTarget")),
                    Integer.parseInt(matchRequest.getStats().get("teamB").get("corners"))
            );

            Stats stats = new Stats(teamA, teamB);

            Match newMatch = new Match();
            newMatch.setMatchId(matchRequest.getMatchId());
            newMatch.setDate(matchRequest.getDate());
            newMatch.setStats(stats);

            matchList.add(newMatch);
            return ResponseEntity.status(HttpStatus.CREATED).body("Match created successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
        }
    }

    private Optional<Match> findMatchById(String matchId) {
        return matchList.stream()
                .filter(match -> match.getMatchId().equals(matchId))
                .findFirst();
    }
}