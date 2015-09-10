package com.example.shalom.shapechoice;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Switch;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText mRecX, mRecY, mRecH, mRecW, mCirX, mCirY, mCirR;
    Paint mRecPaint, mCirPaint;
    Button drawButton;
    Shape mShape;
    RelativeLayout drawBoard;
    Spinner spinner;
    String[] colors;


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

        String colors[] = {getString(R.string.RED), getString(R.string.BLUE), getString(R.string.YELLOW), getString(R.string.GREEN), getString(R.string.GRAY),getString(R.string.CYAN)};
        spinner = (Spinner) findViewById(R.id.ColorSpinner);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, colors);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);


        mRecX = (EditText) findViewById(R.id.editTextRecX);
        mRecY = (EditText) findViewById(R.id.editTextRecY);
        mRecH = (EditText) findViewById(R.id.editTextRecH);
        mRecW = (EditText) findViewById(R.id.editTextRecW);
        mCirX = (EditText) findViewById(R.id.editTextXcircle);
        mCirY = (EditText) findViewById(R.id.editTextYcircle);
        mCirR = (EditText) findViewById(R.id.editTextRcircle);

        mRecPaint=new Paint();
        mCirPaint=new Paint();

        mShape = new Shape(this);
        mShape.setDafulteColor();

    }


    @Override
    public void onClick(View v) {
        mShape = new Shape(this);
        mShape.setfCirx(Float.parseFloat(mCirX.getText().toString()));
        mShape.setfCirY(Float.parseFloat(mCirY.getText().toString()));
        mShape.setfCirR(Float.parseFloat(mCirR.getText().toString()));

        mShape.setfRecX(Float.parseFloat(mRecX.getText().toString()));
        mShape.setfRecY(Float.parseFloat(mRecY.getText().toString()));
        mShape.setfRecH(Float.parseFloat(mRecH.getText().toString()));
        mShape.setfRecW(Float.parseFloat(mRecW.getText().toString()));

        String text = spinner.getSelectedItem().toString();
        //Log.d(text,"Spinner color");

        //mCirPaint.setColor(Color.parseColor(spinner.getSelectedItem().toString()));
        //mRecPaint.setColor(Color.parseColor(spinner.getSelectedItem().toString()));

        switch (text) {
            case ("RED"):
                mCirPaint.setColor(Color.RED);
                mRecPaint.setColor(Color.RED);
                break;
            case ("BLUE"):
                mCirPaint.setColor(Color.BLUE);
                mRecPaint.setColor(Color.BLUE);
                break;
            case("WHITE"):
                mCirPaint.setColor(Color.WHITE);
                mRecPaint.setColor(Color.WHITE);
                break;
            case("YELLOW"):
                mCirPaint.setColor(Color.YELLOW);
                mRecPaint.setColor(Color.YELLOW);
                break;
            case ("BLACK"):
                mCirPaint.setColor(Color.BLACK);
                mRecPaint.setColor(Color.BLACK);
                break;
            case ("GREEN"):
                mCirPaint.setColor(Color.GREEN);
                mRecPaint.setColor(Color.GREEN);
                break;
            case ("CYAN"):
                mCirPaint.setColor(Color.CYAN);
                mRecPaint.setColor(Color.CYAN);
                break;
                default:
                    mCirPaint.setColor(Color.MAGENTA);
                    mRecPaint.setColor(Color.MAGENTA);

                    break;
        }

        mShape.setpCirPaint(mCirPaint);
        mShape.setpRecPaint(mRecPaint);
        drawBoard.addView(mShape);
    }
}


