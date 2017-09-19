package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays The Score Of TeamA
     * @param score
     */

    public void displayForTeamA(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.team_A_Score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the Score Of TeamA by 3
     * @param view
     */

    public void ThreePointerA(View view)
    {   scoreTeamA=scoreTeamA+3;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the Score Of TeamA by 2
     * @param view
     */

    public void TwoPointerA(View view)
    {
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the Score Of TeamA by 1
     * @param view
     */

    public void FreeHitA(View view)
    {
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the Score Of TeamB
     * @param score
     */

    public void displayForTeamB(int score)
    {
        TextView scoreView= (TextView) findViewById(R.id.team_B_Score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Increase the Score Of TeamB by 3
     * @param view
     */

     public void ThreePointerB(View view)
     {   scoreTeamB=scoreTeamB+3;

     displayForTeamB(scoreTeamB);
     }

    /**
     * Increase the Score Of TeamB by 2
     * @param view
     */

     public void TwoPointerB(View view)
     {
     scoreTeamB=scoreTeamB+2;
     displayForTeamB(scoreTeamB);
     }

    /**
     * Increase Score Of TeamB by 1
     * @param view
     */

     public void FreeHitB(View view)
     {
     scoreTeamB=scoreTeamB+1;
     displayForTeamB(scoreTeamB);
     }

    /**
     * To Reset The Score
     * @param view
     */

    public void Reset(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
