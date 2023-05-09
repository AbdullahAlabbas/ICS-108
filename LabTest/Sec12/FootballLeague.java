package LabTest.Sec12;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class FootballLeague  {
    public static void main(String[] args) throws IOException {
        // define a TreeMap to store the teams' data (sorted by key)
        Map<String, Map<String, Integer>> teams = new TreeMap<>();
        // read the file and populate the TreeMap
        Scanner scanner = new Scanner(new File("src/matches.txt"));
        while (scanner.hasNextLine()) {
            // parse the line
            String[] line = scanner.nextLine().split("\\s");
            String team1 = line[0];
            String team2 = line[1];
            int goals1 = Integer.parseInt(line[2]);
            int goals2 = Integer.parseInt(line[3]);
            // add the teams to the TreeMap if they don't exist yet
            if (!teams.containsKey(team1)) {
                Map<String, Integer> teamData = new HashMap<>();
                teamData.put("points", 0);
                teamData.put("goals_for", 0);
                teamData.put("goals_against", 0);
                teams.put(team1, teamData);
            }
            if (!teams.containsKey(team2)) {
                Map<String, Integer> teamData = new HashMap<>();
                teamData.put("points", 0);
                teamData.put("goals_for", 0);
                teamData.put("goals_against", 0);
                teams.put(team2, teamData);
            }
            // update the teams' data with the match results
            teams.get(team1).put("goals_for", teams.get(team1).get("goals_for") + goals1);
            teams.get(team1).put("goals_against", teams.get(team1).get("goals_against") + goals2);
            teams.get(team2).put("goals_for", teams.get(team2).get("goals_for") + goals2);
            teams.get(team2).put("goals_against", teams.get(team2).get("goals_against") + goals1);
            teams.get(team1).put("points", teams.get(team1).get("points") + getPointsForMatch(team1, goals1, goals2));
            teams.get(team2).put("points", teams.get(team2).get("points") + getPointsForMatch(team2, goals2, goals1));
        }
        scanner.close();
        // define a Comparator to sort the teams by points, then by goal difference
        Comparator<String> sortTeams = new Comparator<String>() {
            public int compare(String team1, String team2) {
                int pointsCompare = teams.get(team2).get("points") - teams.get(team1).get("points");
                if (pointsCompare != 0) {
                    return pointsCompare;
                }
                int goalDiffCompare = (teams.get(team2).get("goals_for") - teams.get(team2).get("goals_against")) - (teams.get(team1).get("goals_for") - teams.get(team1).get("goals_against"));
                if (goalDiffCompare != 0) {
                    return goalDiffCompare;
                }
                return team1.compareTo(team2);
            }
        };
        // sort the teams and print the results
        List<String> sortedTeams = new ArrayList<>(teams.keySet());
        Collections.sort(sortedTeams, sortTeams);
        for (String team : sortedTeams) {
            System.out.println(team + " " + teams.get(team).get("points") + " " + teams.get(team).get("goals_for") + " " + teams.get(team).get("goals_against") + " " + (teams.get(team).get("goals_for") - teams.get(team).get("goals_against")));
        }
    }

    // define a function to calculate the points for a team in a match
    public static int getPointsForMatch(String team, int goalsFor, int goalsAgainst) {
        if (goalsFor > goalsAgainst) {
            return 3;
        } else if (goalsFor == goalsAgainst) {
            return 1;
        } else {
            return 0;
        }
    }
}