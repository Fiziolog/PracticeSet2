package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    int numberOfScoreTeamA = 0;
    int numberOfScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String firstString = "watzup";
        String secondString = "how are you";
        String s = secondString + firstString;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void addOneForTeamA(View v) {
        numberOfScoreTeamA = numberOfScoreTeamA + 1;
        displayForTeamA(numberOfScoreTeamA);
    }
    public void addTwoForTeamA(View v) {
        numberOfScoreTeamA = numberOfScoreTeamA + 2;
        displayForTeamA(numberOfScoreTeamA);
    }
    public void addThreeForTeamA(View v) {
        numberOfScoreTeamA = numberOfScoreTeamA + 3;
        displayForTeamA(numberOfScoreTeamA);
    }
    public void addOneForTeamB(View v) {
        numberOfScoreTeamB = numberOfScoreTeamB + 1;
        displayForTeamB(numberOfScoreTeamB);
    }
    public void addTwoForTeamB(View v) {
        numberOfScoreTeamB = numberOfScoreTeamB + 2;
        displayForTeamB(numberOfScoreTeamB);
    }
    public void addThreeForTeamB(View v) {
        numberOfScoreTeamB = numberOfScoreTeamB + 3;
        displayForTeamB(numberOfScoreTeamB);
    }
    public void resetScore(View v) {
        numberOfScoreTeamA = 0;
        numberOfScoreTeamB = 0;
        displayForTeamA(numberOfScoreTeamA);
        displayForTeamB(numberOfScoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}