package com.example.android.scorekeeperabnd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHome = 0;
    int scoreAway = 0;
    int foulsHome = 0;
    int sogHome = 0;
    int penaltiesHome = 0;
    int foulsAway = 0;
    int sogAway = 0;
    int penaltiesAway = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for the home team.
     */
    public void displayHomeTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the away team.
     */
    public void displayAwayTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls committed by the Home team.
     */
    public void displayFoulsHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_fouls_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shots taken on goal by the Home team.
     */
    public void displaySogHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_shots_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the amount of penalties taken by Home team.
     */
    public void displayPenaltiesHomeTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_penalties_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls committed by the Away team.
     */
    public void displayFoulsAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_fouls_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shots taken on goal by the Away team.
     */
    public void displaySogAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_shots_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the amount of penalties taken by Away team.
     */
    public void displayPenaltiesAwayTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.away_penalties_stat);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Below are all the onClick calls
     */

    public void addGoalHome(View v) {
        scoreHome = scoreHome + 1;
        displayHomeTeamScore(scoreHome);
    }

    public void addGoalAway(View v) {
        scoreAway = scoreAway + 1;
        displayAwayTeamScore(scoreAway);
    }

    public void addFoulHome(View v) {
        foulsHome = foulsHome + 1;
        displayFoulsHomeTeam(foulsHome);
    }

    public void addSogHome(View v) {
        sogHome = sogHome + 1;
        displaySogHomeTeam(sogHome);
    }

    public void addPenaltyHome(View v) {
        penaltiesHome = penaltiesHome + 1;
        displayPenaltiesHomeTeam(penaltiesHome);
    }

    public void addFoulAway(View v) {
        foulsAway = foulsAway + 1;
        displayFoulsAwayTeam(foulsAway);
    }

    public void addSogAway(View v) {
        sogAway = sogAway + 1;
        displaySogAwayTeam(sogAway);
    }

    public void addPenaltyAway(View v) {
        penaltiesAway = penaltiesAway + 1;
        displayPenaltiesAwayTeam(penaltiesAway);
    }

    public void resetMatch(View v) {
        scoreHome = 0;
        scoreAway = 0;
        foulsHome = 0;
        sogHome = 0;
        penaltiesHome = 0;
        foulsAway = 0;
        sogAway = 0;
        penaltiesAway = 0;
        displayHomeTeamScore(scoreHome);
        displayAwayTeamScore(scoreAway);
        displayFoulsHomeTeam(foulsHome);
        displaySogHomeTeam(sogHome);
        displayPenaltiesHomeTeam(penaltiesHome);
        displayFoulsAwayTeam(foulsAway);
        displaySogAwayTeam(sogAway);
        displayPenaltiesAwayTeam(penaltiesAway);
    }
}
