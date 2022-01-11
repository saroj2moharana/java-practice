package com.skm.algo.inter;

import java.util.*;

public class Solution {
    public static class PlayerStatisticsCollectorImpl implements PlayerStatisticsCollector {
        HashMap<String,List> hm = new HashMap<>();
        HashMap<String, Integer> scoreMap = new HashMap<>();
        @Override
        public void putNewInnings(String player, int runs){
            // YOUR CODE HERE
            List runlist = hm.get(player);
            if(runlist == null) runlist = new ArrayList();
            runlist.add(runs);
            hm.put(player, runlist);
            Integer scores = scoreMap.get(player);
            if(scores != null) runs += scores;
            scoreMap.put(player, runs);
        }

        @Override
        public double getAverageRuns(String player){
            // YOUR CODE HERE
            List runlist = hm.get(player);
            if(runlist == null) return 0d;
            Integer scores = scoreMap.get(player);
            Double dv = (double)scores/(double)runlist.size();
            return Double.parseDouble(String.format("%.4f",dv));
        }

        @Override
        public int getInningsCount(String player){
            // YOUR CODE HERE
            List runlist = hm.get(player);
            if(runlist == null) return 0;
            return runlist.size();
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface PlayerStatisticsCollector {
        // This is an input. Make note of this player inning.  Runs is a non negative integer.
        void putNewInnings(String player, int runs);

        // Get the runs average(mathematical average) for a player
        double getAverageRuns(String player);

        // Get the total number of innings for the player
        int getInningsCount(String player);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final PlayerStatisticsCollector stats = new PlayerStatisticsCollectorImpl();
            final Set<String> players = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String player = tokens[0];
                players.add(player);
                final int runs = Integer.parseInt(tokens[1]);

                stats.putNewInnings(player, runs);

            }

            for (String player : players) {
                System.out.println(
                        String.format("%s %.4f %d", player, stats.getAverageRuns(player), stats.getInningsCount(player)));
            }

        }
        scanner.close();

    }
}
