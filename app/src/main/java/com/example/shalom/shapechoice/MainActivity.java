package com.example.shalom.shapechoice;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    EditText mRecX, mRecY, mRecH, mRecW, mCirX, mCirY, mCirR;
    Paint mRecPaint, mCirPaint;
    Button drawButton;
    Shape mShape;
    RelativeLayout drawBoard;
    Spinner spinner;
    String[] colors ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializationVariables();

        drawBoard = (RelativeLayout) findViewById(R.id.ShapeLayout);
        drawButton = (Button) findViewById(R.id.DrawButton);
        drawButton.setOnClickListener(this);


    }

    public void initializationVariables() {

        String colors[] = {"Red","Blue","White","Yellow","Black", "Green","Purple","Orange","Grey"};
        Spinner spinner = (Spinner) findViewById(R.id.ColorSpinner);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, colors);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);



        mRecX = (EditText) findViewById(R.id.editTextRecX);
        mRecY = (EditText) findViewById(R.id.editTextRecY);
        mRecH = (EditText) findViewById(R.id.editTextRecH);
        mRecW = (EditText) findViewById(R.id.editTextRecW);
        mCirX = (EditText) findViewById(R.id.editTextXcircle);
        mCirY = (EditText) findViewById(R.id.editTextYcircle);
        mCirR = (EditText) findViewById(R.id.editTextRcircle);
        mShape=new Shape(this);

    }


    @Override
    public void onClick(View v) {
        mShape= new Shape(this);
        mShape.setfCirx(Float.parseFloat(mCirX.getText().toString()));
        mShape.setfCirY(Float.parseFloat(mCirY.getText().toString()));
        mShape.setfCirR(Float.parseFloat(mCirR.getText().toString()));

        mShape.setfRecX(Float.parseFloat(mRecX.getText().toString()));
        mShape.setfRecY(Float.parseFloat(mRecY.getText().toString()));
        mShape.setfRecH(Float.parseFloat(mRecH.getText().toString()));
        mShape.setfRecW(Float.parseFloat(mRecW.getText().toString()));

        drawBoard.addView(mShape);
    }
}


