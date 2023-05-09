package LabTest.Sec12.Sec34;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class WorldCup {
    public static void main(String[] args) throws IOException {
        // define a TreeMap to store the teams' data (sorted by key)
        Map<String, Map<String, Object>> teams = new TreeMap<>();
        // read the file and populate the TreeMap
        Scanner scanner = new Scanner(new File("src/worldcup.txt"));
        while (scanner.hasNextLine()) {
            // parse the line
            String[] line = scanner.nextLine().split("\\s");
            String group = line[0];
            String team1 = line[1];
            String team2 = line[2];
            int goals1 = Integer.parseInt(line[3]);
            int goals2 = Integer.parseInt(line[4]);
            // add the teams to the TreeMap if they don't exist yet
            if (!teams.containsKey(team1)) {
                Map<String, Object> teamData = new HashMap<>();
                teamData.put("group", group);
                teamData.put("points", 0);
                teamData.put("goals_for", 0);
                teamData.put("goals_against", 0);
                teams.put(team1, teamData);
            }
            if (!teams.containsKey(team2)) {
                Map<String, Object> teamData = new HashMap<>();
                teamData.put("group", group);
                teamData.put("points", 0);
                teamData.put("goals_for", 0);
                teamData.put("goals_against", 0);
                teams.put(team2, teamData);
            }
            // update the teams' data with the match results
            teams.get(team1).put("goals_for", (int)teams.get(team1).get("goals_for") + goals1);
            teams.get(team1).put("goals_against", (int)teams.get(team1).get("goals_against") + goals2);
            teams.get(team2).put("goals_for", (int)teams.get(team2).get("goals_for") + goals2);
            teams.get(team2).put("goals_against", (int)teams.get(team2).get("goals_against") + goals1);
            teams.get(team1).put("points", (int)teams.get(team1).get("points") + getPointsForMatch(team1, goals1, goals2));
            teams.get(team2).put("points", (int)teams.get(team2).get("points") + getPointsForMatch(team2, goals2, goals1));
        }
        scanner.close();
        // define a Comparator to sort the teams by group, then by points, then by goal difference
        Comparator<String> sortTeams = new Comparator<String>() {
            public int compare(String team1, String team2) {
                int groupCompare = ((String)teams.get(team1).get("group")).compareTo((String)teams.get(team2).get("group"));
                if (groupCompare != 0) {
                    return groupCompare;
                }
                int pointsCompare = ((Integer)teams.get(team2).get("points")).compareTo((Integer)teams.get(team1).get("points"));
                if (pointsCompare != 0) {
                    return pointsCompare;
                }
                int goalDiffCompare = ((Integer)((int)teams.get(team2).get("goals_for") - (int)teams.get(team2).get("goals_against"))).compareTo((Integer)((int)teams.get(team1).get("goals_for") - (int)teams.get(team1).get("goals_against")));
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
            System.out.println(team + " " + teams.get(team).get("group") + " " + teams.get(team).get("points") + " " + teams.get(team).get("goals_for") + " " + teams.get(team).get("goals_against") + " " + ((int)teams.get(team).get("goals_for") - (int)teams.get(team).get("goals_against")));
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

