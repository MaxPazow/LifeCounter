package com.example.android.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int lifeQuantityA = 30;
    int lifeQuantityB = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForLifeA(int score) {
        TextView quantityView = (TextView) findViewById(R.id.life_a_quantity);
        quantityView.setText(String.valueOf(score));

    }

    public void addOneForQuantityA(View v) {
        lifeQuantityA = lifeQuantityA + 1;
        displayForLifeA(lifeQuantityA);
    }

    public void minusOneForQuantityA(View v) {
        lifeQuantityA = lifeQuantityA - 1;
        displayForLifeA(lifeQuantityA);

    }


    public void displayForLifeB(int score) {
        TextView quantityView = (TextView) findViewById(R.id.life_b_quantity);
        quantityView.setText(String.valueOf(score));

    }

    public void addOneForQuantityB(View v) {
        lifeQuantityB = lifeQuantityB + 1;
        displayForLifeB(lifeQuantityB);
    }

    public void minusOneForQuantityB(View v) {
        lifeQuantityB = lifeQuantityB - 1;
        displayForLifeB(lifeQuantityB);
    }


    public void resetScore(View V) {
        lifeQuantityA = 30;
        lifeQuantityB = 30;
        displayForLifeA(lifeQuantityA);
        displayForLifeB(lifeQuantityB);
    }
}