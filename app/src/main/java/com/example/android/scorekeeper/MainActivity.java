package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0, redCardA = 0, redCardB = 0, yellowCardA = 0, yellowCardB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScore();
    }

    private void displayScore(){
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(String.valueOf(scoreA) + " x " + String.valueOf(scoreB));
    }

    private void displayYellowCardA(){
        TextView yellowA = (TextView) findViewById(R.id.yellow_card_a);
        yellowA.setText(String.valueOf(yellowCardA));
    }

    private void displayYellowCardB(){
        TextView yellowB = (TextView) findViewById(R.id.yellow_card_b);
        yellowB.setText(String.valueOf(yellowCardB));
    }

    private void displayRedCardA(){
        TextView redA = (TextView) findViewById(R.id.red_card_a);
        redA.setText(String.valueOf(redCardA));
    }

    private void displayRedCardB(){
        TextView redB = (TextView) findViewById(R.id.red_card_b);
        redB.setText(String.valueOf(redCardB));
    }

    public void golTeamA(View v){
        scoreA++;
        displayScore();
    }

    public void golTeamB(View v){
        scoreB++;
        displayScore();
    }

    public void yellowTeamA(View v){
        yellowCardA++;
        displayYellowCardA();
    }

    public void redTeamA(View v){
        redCardA++;
        displayRedCardA();
    }

    public void yellowTeamB(View v){
        yellowCardB++;
        displayYellowCardB();
    }

    public void redTeamB(View v){
        redCardB++;
        displayRedCardB();
    }

    public void resetScore(View v){
        scoreA = 0;
        scoreB = 0;
        yellowCardA = 0;
        redCardA = 0;
        yellowCardB = 0;
        redCardB = 0;
        displayScore();
        displayYellowCardA();
        displayRedCardA();
        displayYellowCardB();
        displayRedCardB();
    }
}