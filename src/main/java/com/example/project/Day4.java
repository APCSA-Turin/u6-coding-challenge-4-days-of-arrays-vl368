package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        // instance variables
        private String name;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int timeElapsed;
        private int runTime;
        private boolean isRest;
        private int restCount;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            this.timeElapsed = 0;
            this.isRest = false;
        }

        public int getDistanceTraveled(){ // this method is required
            return speed * runTime;
        }
        
        public String getName() {
            return name;
        }
        
        public void simulateSecond(){ //this method is required but not tested
            if (timeElapsed != 0 && timeElapsed % runDuration == 0) {
                isRest = true;
                restCount = 0;
                timeElapsed = 0;
            }
            if (!isRest) {
                timeElapsed++;
                runTime++;
            }
            else {
                restCount++;
                if (restCount == restDuration) {

                }
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String fastest = "";
        int maxDistance = 0;
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 1; j <= time; j++) {
                reindeers[i].simulateSecond();
            }
            if (reindeers[i].getDistanceTraveled() > maxDistance) {
                maxDistance = reindeers[i].getDistanceTraveled();
                fastest = reindeer_names[i];
            }
        }
        return fastest;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}



