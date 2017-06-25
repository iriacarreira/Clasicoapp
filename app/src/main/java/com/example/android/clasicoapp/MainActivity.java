package com.example.android.clasicoapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int redTeamA = 0;
    int yellowTeamA = 0;
    int penaltyTeamA = 0;
    int shotTeamA = 0;
    int cornerTeamA = 0;
    int penaltyTeamB = 0;
    int shotTeamB = 0;
    int cornerTeamB = 0;
    int redTeamB = 0;
    int yellowTeamB= 0;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase goal Team A by 1 .
     */

    public void addGoalTeamA (View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the red card for Team A by 1 .
     */
    public void addOneRedTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayForTeamARed(redTeamA);
    }

    /**
     * Increase the yellow card for Team A by 1 .
     */
    public void addOneYellowTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayForTeamAYellow(yellowTeamA);
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayForTeamARed(int redTeamA) {
        TextView redAView = (TextView) findViewById(R.id.Team_a_red);
        redAView.setText(String.valueOf(redTeamA));
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayForTeamAYellow(int yellowTeamA) {
        TextView yellowAView = (TextView) findViewById(R.id.Team_a_yellow);
        yellowAView.setText(String.valueOf(yellowTeamA));
    }

    /**
     * Increase the penalty for Team A by 1 .
     */
    public void addPenaltyForTeamA(View v) {
        penaltyTeamA = penaltyTeamA + 1;
        displayForPenaltyTeamA(penaltyTeamA);
    }

    /**
     * Displays the penalty for Team A by 1 .
     */

    public void displayForPenaltyTeamA(int penaltyTeamA) {
        TextView penaltyAView = (TextView) findViewById(R.id.team_a_penalty);
        penaltyAView.setText(String.valueOf(penaltyTeamA));

    }

    /**
     * Increase the shots for Team A by 1 .
     */
    public void addShotForTeamA(View v) {
        shotTeamA = shotTeamA + 1;
        displayForShotTeamA(shotTeamA);
    }

    /**
     * Displays the shot for Team A by 1 .
     */

    public void displayForShotTeamA(int shotTeamA) {
        TextView shotAView = (TextView) findViewById(R.id.team_a_shot);
        shotAView.setText(String.valueOf(shotTeamA));

    }
    /**
     * Increase the corner for Team A by 1 .
     */
    public void addCornerForTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        displayForCornerTeamA(cornerTeamA);
    }

    /**
     * Displays the corner for Team A by 1 .
     */

    public void displayForCornerTeamA (int cornerTeamA) {
        TextView shotAView = (TextView) findViewById(R.id.team_a_corner);
        shotAView.setText(String.valueOf(cornerTeamA));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Increase goal Team B by 1 .
     */

    public void addGoalTeamB (View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase the penalty for Team B by 1 .
     */
    public void addPenaltyForTeamB(View v) {
        penaltyTeamB = penaltyTeamB + 1;
        displayForPenaltyTeamB(penaltyTeamB);
    }

    /**
     * Displays the penalty for Team B by 1 .
     */

    public void displayForPenaltyTeamB(int penaltyTeamB) {
        TextView penaltyBView = (TextView) findViewById(R.id.team_b_penalty);
        penaltyBView.setText(String.valueOf(penaltyTeamB));

    }
    /**
     * Increase the shot for Team B by 1 .
     */
    public void addShotForTeamB(View v) {
        shotTeamB = shotTeamB + 1;
        displayForShotTeamB(shotTeamB);
    }

    /**
     * Displays the shot for Team B by 1 .
     */

    public void displayForShotTeamB (int shotTeamB) {
        TextView shotAView = (TextView) findViewById(R.id.team_b_shot);
        shotAView.setText(String.valueOf(shotTeamB));

    }
    /**
     * Increase the corner for Team B by 1 .
     */
    public void addCornerForTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayForCornerTeamB(cornerTeamB);
    }

    /**
     * Displays the corner for Team B by 1 .
     */

    public void displayForCornerTeamB (int cornerTeamB) {
        TextView shotAView = (TextView) findViewById(R.id.team_b_corner);
        shotAView.setText(String.valueOf(cornerTeamB));

    }


    /**
     * Increase the red card for Team B by 1 .
     */
    public void addOneRedTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayForTeamBRed(redTeamB);
    }

    /**
     * Increase the yellow card for Team B by 1 .
     */
    public void addOneYellowTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayForTeamBYellow(yellowTeamB);
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayForTeamBRed(int redTeamB) {
        TextView redAView = (TextView) findViewById(R.id.team_b_red);
        redAView.setText(String.valueOf(redTeamB));
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayForTeamBYellow(int yellowTeamB) {
        TextView yellowAView = (TextView) findViewById(R.id.team_b_yellow);
        yellowAView.setText(String.valueOf(yellowTeamB));
    }

    /**
     * Reset button.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redTeamA = 0;
        yellowTeamA = 0;
        penaltyTeamA = 0;
        shotTeamA = 0;
        cornerTeamA = 0;
        penaltyTeamB = 0;
        shotTeamB = 0;
        cornerTeamB = 0;
        redTeamB= 0;
        yellowTeamB = 0;





        displayForTeamA(scoreTeamA);
        displayForTeamARed(redTeamA);
        displayForTeamAYellow(yellowTeamA);
        displayForPenaltyTeamA(penaltyTeamA);
        displayForShotTeamA(shotTeamA);
        displayForCornerTeamA(cornerTeamA);
        displayForTeamB(scoreTeamB);
        displayForPenaltyTeamB(penaltyTeamB);
        displayForShotTeamB(shotTeamB);
        displayForCornerTeamB(cornerTeamB);
        displayForTeamBRed (redTeamB);
        displayForTeamBYellow (yellowTeamB);









    }
}
