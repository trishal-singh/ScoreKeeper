package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int score_a=0;
    public int  score_b=0;
    TextView teamAScore;
    TextView teamBScore;
    public int wicket_a=0;
    public int wicket_b=0;
    TextView teamAWicket;
    TextView teamBWicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore= (TextView) findViewById(R.id.scoreTeamA);
        teamAScore.setText(String.valueOf(score_a));
        teamBScore= (TextView) findViewById(R.id.scoreTeamB);
        teamBScore.setText(String.valueOf(score_b));
        teamAWicket = (TextView) findViewById(R.id.wicketTeamA);
        teamAWicket.setText(String.valueOf(wicket_a));
        teamBWicket = (TextView) findViewById(R.id.wicketTeamB);
        teamBWicket.setText(String.valueOf(wicket_b));
    }
    public void one_a(View view) {
        score_a = score_a +1;
        teamAScore.setText(String.valueOf(score_a));
    }
    public void four_a(View view) {
        score_a = score_a +4;
        teamAScore.setText(String.valueOf(score_a));
    }
    public void six_a(View view) {
        score_a = score_a +6;
        teamAScore.setText(String.valueOf(score_a));
    }
    public void one_b(View view) {
        score_b = score_b +1;
        teamBScore.setText(String.valueOf(score_b));
    }
    public void six_b(View view) {
        score_b = score_b +6;
        teamBScore.setText(String.valueOf(score_b));
    }
    public void four_b(View view) {
        score_b = score_b +4;
        teamBScore.setText(String.valueOf(score_b));
    }
    public void reset(View view) {
        score_a = 0;
        score_b = 0;
        wicket_a = 0;
        wicket_b = 0;
        teamAScore.setText(String.valueOf(score_a));
        teamBScore.setText(String.valueOf(score_b));
        teamAWicket.setText(String.valueOf(wicket_a));
        teamBWicket.setText(String.valueOf(wicket_b));
    }
    public void out_a(View view) {
        wicket_a = wicket_a + 1;
        teamAWicket.setText(String.valueOf(wicket_a));
    }
    public void out_b(View view) {
        wicket_b = wicket_b + 1;
        teamBWicket.setText(String.valueOf(wicket_b));
    }
}