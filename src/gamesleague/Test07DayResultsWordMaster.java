package gamesleague;
/*package gamesleague;
import gamesleague.*;
import java.util.Random;


import java.time.LocalDate;


public class Test07DayResultsWordMaster {
 
    public static void main(String[] args) {
        Random random = new Random(10000);
        GamesLeague gl = new GamesLeague();
        LocalDate leagueStart = LocalDate.now();

        System.out.println("\n#### Running Test07DayResultsWordMaster...\n");
        
        int p1 = gl.createPlayer("wardlejj@wardle.com",  "Josh", "Josh Wardle", "123-456-7890");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p1));

        int p2 = gl.createPlayer("annakw@wardle.com", "Anna", "Anna Karl-Witham",  "");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p2));

        int p3 = gl.createPlayer("dot@vincentlewis.com",  "Dorothy", "Dorothy V-L", "000-00-0000");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p3));

        int league1ID = gl.createLeague(p1,"wordMasterLeague", GameType.WORDMASTER);
        System.out.println("\nCreated League: " + gl.getLeagueName(league1ID));

        gl.invitePlayerToLeague(league1ID, gl.getPlayerEmail(p2));
        gl.acceptInviteToLeague(league1ID, p2);
        gl.invitePlayerToLeague(league1ID, gl.getPlayerEmail(p3));
        gl.acceptInviteToLeague(league1ID, p3);        

        gl.setLeagueStartDate(league1ID, (int)leagueStart.toEpochDay());

        int[] playerIds = gl.getLeaguePlayers(league1ID);
        int n = gl.getLeaguePlayers(league1ID).length;
        int scores[] = new int[n];

        System.out.println("Starting on " + leagueStart + "\n");
        System.out.println("DAILY SCORES (with league points)");
       
        LocalDate todayDate  = LocalDate.now();
        int today = (int)todayDate.toEpochDay();
        
        System.out.println("Day status: " + gl.getDayStatus(league1ID, today));
        for (int j = 0; j < playerIds.length; j++) {
            scores[j] = random.nextInt(15);
            System.out.println("Adding gameplay report for Player: " + gl.getPlayerDisplayName(playerIds[j]));
            gl.registerGameReport(today, league1ID, playerIds[j], gl.getPlayerDisplayName(playerIds[j])+" ("+todayDate+") score: "+scores[j]);
            System.out.println("Day status: " + gl.getDayStatus(league1ID, today));
        }

        System.out.println("Registering scores for all players: "); 
        gl.registerDayScores(today, league1ID, scores);
        System.out.println("Day status: " + gl.getDayStatus(league1ID, today));

        int[] dayScores = gl.getDayScores(league1ID, today);
        int[] dayPoints = gl.getDayPoints(league1ID, today);
        int[] dayRanking = gl.getDayRanking(league1ID, today);
        Status dayStatus = gl.getDayStatus(league1ID, today);

        
        StringBuilder result = new StringBuilder();
        
        result.append(String.format("Summary " + todayDate + " (status: "+dayStatus+")\n"));

        result.append(String.format("\n|   Scores  |"));
        for (int j = 0; j < scores.length; j++) {
            result.append(String.format(" %3d |",  dayScores[j]));
            result.append(" ");
        }
        
        result.append(String.format("\n|   Points  |"));
        for (int j = 0; j < scores.length; j++) {
            result.append(String.format(" %3d |",  dayPoints[j]));
            result.append(" ");
        }

        result.append(String.format("\n|   Ranks   |"));
        for (int j = 0; j < scores.length; j++) {
            result.append(String.format(" %3d |",  dayRanking[j]));
            result.append(" ");
        }

        System.out.println(result.toString());

        System.out.println("\nChecking stored game reports for 1st day of league: ");
        
        for (int playerId : playerIds) {
            System.out.println(gl.getGameReport((int)todayDate.toEpochDay(), league1ID, playerId));
        }

        System.out.println("\nChecking player stats: ");
        for (int playerId : playerIds) {
            int stat1 = gl.getPlayerRoundsPlayed(playerId);
            double stat2 = gl.getPlayerRoundsPercentage(playerId);
            System.out.println(gl.getPlayerDisplayName(playerId)+" Total games played in rounds (i.e. has game report): " + stat1 + ", Participation rate: " + stat2 + "%");
        }
    }
}*/
