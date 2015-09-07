package com.example.shalom.shapechoice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;


public class MainActivity extends AppCompatActivity {


    EditText mRecX, mRecY, mRecH, mRecW, mCirX, mCirY, mCirR;
    Paint mRecPaint, mCirPaint;
    Button drawButton;
    Shape mShape;
    RelativeLayout drawBoard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializationVariables();

        drawBoard = (RelativeLayout) findViewById(R.id.ShapeLayout);
        drawButton = (Button) findViewById(R.id.DrawButton);
        drawButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mShape.setfCirx(Float.valueOf(mCirX.getText().toString()));
                mShape.setfCirY(Float.valueOf(mCirY.getText().toString()));
                mShape.setfCirR(Float.valueOf(mCirR.getText().toString()));

                mShape.setfRecX(Float.valueOf(mRecX.getText().toString()));
                mShape.setfRecY(Float.valueOf(mRecY.getText().toString()));
                mShape.setfRecH(Float.valueOf(mRecH.getText().toString()));
                mShape.setfRecW(Float.valueOf(mRecW.getText().toString()));

                setContentView(mShape);

            }


        });


    }

    public void initializationVariables() {
        mRecX = (EditText) findViewById(R.id.editTextRecX);
        mRecY = (EditText) findViewById(R.id.editTextRecY);
        mRecH = (EditText) findViewById(R.id.editTextRecH);
        mRecW = (EditText) findViewById(R.id.editTextRecW);
        mCirX = (EditText) findViewById(R.id.editTextXcircle);
        mCirY = (EditText) findViewById(R.id.editTextYcircle);
        mCirR = (EditText) findViewById(R.id.editTextRcircle);





    }



    }


