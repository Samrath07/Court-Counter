package com.example.courtcounter;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    int scoreCounter = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void threePointer(View view){

        scoreCounter = scoreCounter + 3;
        displayscore(scoreCounter);


    }

    public void twoPointer(View view){

        scoreCounter = scoreCounter + 2;
        displayscore(scoreCounter);


    }

    public void freeThrow(View view){

        scoreCounter = scoreCounter + 1;
        displayscore(scoreCounter);


    }


    public void addthreePoints(View view){

        score_b = score_b + 3;
        displayscores(score_b);


    }

    public void addtwoPoints(View view){

        score_b = score_b + 2;
        displayscores(score_b);


    }

    public void addOnePoint(View view){

        score_b = score_b + 1;
        displayscores(score_b);


    }

    public void reset(View view){


        scoreCounter = 0;
        displayscore(scoreCounter);
        score_b = 0;
        displayscores(score_b);
    }


    private void displayscore(int score){

        TextView scoreDisplay = (TextView) findViewById(R.id.scoreA);
        scoreDisplay.setText(""+ score);


    }

    private void displayscores(int scores){

        TextView scoreDisplay = (TextView) findViewById(R.id.scoreB);
        scoreDisplay.setText(""+ scores);


    }




}
