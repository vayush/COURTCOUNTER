package com.example.ayush.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA,scoreB;
    public void displayForTeamA(int scoreA) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }
    public void plus3A(View view){
        scoreA=scoreA+3;
    displayForTeamA(scoreA);
    }
    public void plus2A(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void plus1A(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void plus3B(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void plus2B(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void plus1B(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
}
