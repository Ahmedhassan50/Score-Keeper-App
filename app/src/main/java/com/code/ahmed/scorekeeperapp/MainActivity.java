package com.code.ahmed.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int score2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void t1(View view){
        score+=3;
        displayforteamA(score);
    }
    public void t2(View view){
        score+=2;
        displayforteamA(score);
    }
    public void t3(View view){
        score+=1;
        displayforteamA(score);
    }

    public void t21(View view){
        score2+=3;
        displayforteamB(score2);
    }
    public void t22(View view){
        score2+=2;
        displayforteamB(score2);
    }
    public void t23(View view){
        score2+=1;
        displayforteamB(score2);
    }
    public void re(View view){
        score=0;
        score2=0;
        displayforteamA(score);
        displayforteamB(score2);
    }



    private void displayforteamA(int score){
        TextView scoreteam=(TextView) findViewById(R.id.teamscore);
        scoreteam.setText(String.valueOf(score));
    }
    private void displayforteamB(int score){
        TextView scoreteam2=(TextView) findViewById(R.id.teamscore2);
        scoreteam2.setText(String.valueOf(score));
    }


}
