package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Track Team A score
    int scoreTeamA = 0;

    //Track Team B score
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        displayForTeamA(8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void onePointForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void twoPointsForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void threePointsForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void onePointForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void twoPointsForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void threePointsForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
