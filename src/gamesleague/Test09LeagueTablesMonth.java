package gamesleague;
/*package gamesleague;
import gamesleague.*;
import java.util.Random;

import java.time.LocalDate;


public class Test09LeagueTablesMonth {


    public static void main(String[] args) {
        Random random = new Random(10000);
        GamesLeague gl = new GamesLeague();
       
        LocalDate leagueStart = LocalDate.of(2025, 2, 1);
        DateProvider.setDate(leagueStart);
        System.out.println("Setting system date to: " + leagueStart + "\n");

        System.out.println("\n#### Running Test08LeagueTables...\n");
        
        int p1 = gl.createPlayer("wardlejj@wardle.com",  "Josh", "Josh Wardle", "123-456-7890");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p1));

        int p2 = gl.createPlayer("annakw@wardle.com", "Anna", "Anna Karl-Witham",  "");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p2));

        int p3 = gl.createPlayer("dot@vincentlewis.com",  "Dorothy", "Dorothy V-L", "000-00-0000");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p3));

        int p4 = gl.createPlayer("zeb@vincentlewis.com", "Zebedee", "Zebedee V-L",  "");
        System.out.println("Created Player: " + TestHelpers.getPlayerInfo(gl, p4));

        int league1ID = gl.createLeague(p1,"Wordmaster League", GameType.WORDMASTER);
        System.out.println("\nCreated League: " + gl.getLeagueName(league1ID));


        gl.invitePlayerToLeague(league1ID, gl.getPlayerEmail(p2));
        gl.acceptInviteToLeague(league1ID, p2);
        gl.invitePlayerToLeague(league1ID, gl.getPlayerEmail(p3));
        gl.acceptInviteToLeague(league1ID, p3);        
        gl.invitePlayerToLeague(league1ID, gl.getPlayerEmail(p4));
        gl.acceptInviteToLeague(league1ID, p4);

        gl.setLeagueStartDate(league1ID, (int)leagueStart.toEpochDay());
        gl.setLeagueEndDate(league1ID, (int)leagueStart.toEpochDay() + 40);

        int[] playerIds = gl.getLeaguePlayers(league1ID);
        int n = gl.getLeaguePlayers(league1ID).length;
        int scores[] = new int[n];
        

        LocalDate todayDate  = DateProvider.now();
        int today =(int)DateProvider.now().toEpochDay();

        System.out.println("Starting on " + todayDate + "\n");
        System.out.println("DAILY SCORES (with league points)");
        

        for (int i = 0; i < 33; i++) {
            todayDate  = DateProvider.now();
            today = (int)DateProvider.now().toEpochDay();
            
            for (int j = 0; j < playerIds.length; j++) {
                scores[j] = random.nextInt(12);
                gl.registerGameReport(today, league1ID, playerIds[j], gl.getPlayerDisplayName(playerIds[j])+" report: "+todayDate+" score: "+scores[j]);
            }
            gl.registerDayScores(today, league1ID, scores);

            int[] dayPoints = gl.getDayPoints(league1ID, today);
            char dayChar = todayDate.getDayOfWeek().toString().charAt(0);
            StringBuilder result = new StringBuilder();
            result.append(String.format("|   %c   |  %s  |",dayChar,todayDate.toString()));
            for (int j = 0; j < scores.length; j++) {
                result.append(String.format(" %3d (%3d) |", scores[j], dayPoints[j]));
                result.append(" ");
            }
            System.out.println(result.toString()); 
            if (todayDate.plusDays(1).getDayOfMonth()==1) {
                System.out.println("\nTOTAL POINTS (with rank)");
                int[] monthPoints = gl.getMonthPoints(league1ID, today);
                int[] monthRankings = gl.getMonthRanking(league1ID, today);
                StringBuilder monthResult = new StringBuilder();
                monthResult.append(String.format("| Month |   %8s   |",todayDate.getMonth().toString()));
                for (int j = 0; j < scores.length; j++) {
                    monthResult.append(String.format(" %3d (%3d) |", monthPoints[j], monthRankings[j]));
                    monthResult.append(" ");
                }
                System.out.println(monthResult.toString()); 
                System.out.println(); 
                break;
            }
            DateProvider.addDay();
        }
        System.out.println("\nChecking player stats: ");
        for (int playerId : playerIds) {
            int stat1 = gl.getPlayerRoundsPlayed(playerId);
            double stat2 = gl.getPlayerRoundsPercentage(playerId);
            System.out.println(gl.getPlayerDisplayName(playerId)+" Player rounds: " + stat1 + ", Participated in (i.e. has game report) " + stat2 + "%");
        }
    }
}*/
