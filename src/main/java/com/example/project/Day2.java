
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] santaList = new String[names.length][names.length];
        int niceRow = 0;
        int naughtyRow = 0;
        String[] niceList = santaList[0];
        String[] naughtyList = santaList[1];
        for (int i = 0; i < names.length; i++) {
            Random rand = new Random();
            boolean bool = rand.nextBoolean();
            if (bool) {
                niceList[niceRow] = names[i];
                niceRow++;
            }
            else {
                naughtyList[naughtyRow] = names[i];
                naughtyRow++;
            }
        }
        return santaList; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
    }
}