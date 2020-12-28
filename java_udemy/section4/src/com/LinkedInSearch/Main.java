package com.LinkedInSearch;

public class Main {
//void means nothing will be returned. If something is to be returned, you have to specify the data type
    public static void main(String[] args) {

        int highScore= calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int position1 = calculateHighScorePosition(1500);
        displayHIghScorePosition("azra", position1);
        int position2 = calculateHighScorePosition(900);
        displayHIghScorePosition("azra", position2);
        int position3 = calculateHighScorePosition(400);
        displayHIghScorePosition("azra", position3);
        int position4 = calculateHighScorePosition(50);
        displayHIghScorePosition("azra", position4);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){


        if (gameOver){
            int finalScore = score + (levelCompleted*bonus);
            finalScore += 1000;

            return finalScore;
        }

        return -1;


    }

    public static void displayHIghScorePosition(String name, int position){

        System.out.println(name + " Managed to get into position " + position + " on the high score table");

    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score > 1000) {
            position = 1;
        } else if (score >= 500){
            position = 2;
        }
        else if(score >=100){
            position = 3;
        }

        return position;
    }
}
