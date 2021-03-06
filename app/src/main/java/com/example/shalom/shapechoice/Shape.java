package com.example.shalom.shapechoice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.EditText;
import android.view.*;

/**
 * Created by Shalom on 05/09/2015.
 */
public class Shape extends View {
    float fRecX;
    float fRecY;
    float fRecH;
    float fRecW;
    Paint pRecPaint=new Paint();

    float fCirX;
    float fCirY;
    float fCirR;
    Paint pCirPaint=new Paint();

    Paint paint ;


    public Shape(Context context){
        super(context);
    }

    public float getfRecX() {

        return fRecX;
    }

    public void setfRecX(float fRecX) {
        this.fRecX = fRecX;
    }

    public float getfRecY() {

        return fRecY;
    }

    public void setfRecY(float fRecY) {
        this.fRecY = fRecY;
    }

    public float getfRecH() {

        return fRecH;
    }

    public void setfRecH(float fRecH) {
        this.fRecH = fRecH;
    }

    public float getfRecW() {

        return fRecW;
    }

    public void setfRecW(float fRecW) {
        this.fRecW = fRecW;
    }

    public Paint getpRecPaint() {

        return pRecPaint;
    }

    public void setpRecPaint(Paint pRecPaint) {
        this.pRecPaint = pRecPaint;
    }

    public float getfCirx() {

        return fCirX;
    }

    public void setfCirx(float fCirx) {
        this.fCirX = fCirx;
    }

    public float getfCirY() {

        return fCirY;
    }

    public void setfCirY(float fCirY) {
        this.fCirY = fCirY;
    }

    public float getfCirR() {

        return fCirR;
    }

    public void setfCirR(float fCirR) {
        this.fCirR = fCirR;
    }

    public Paint getpCirPaint() {

        return pCirPaint;
    }

    public void setpCirPaint(Paint pCirPaint) {
        this.pCirPaint = pCirPaint;
    }

public void setDafulteColor(){
    pCirPaint.setColor(Color.MAGENTA);
    pRecPaint.setColor(Color.MAGENTA);
}

    public void Shape(float xrec,float yrec,float wrec,float hrec,Paint paint){
        this.fRecX=xrec;
        this.fRecY=yrec;
        this.fRecW=wrec;
        this.fRecH=hrec;
        this.paint=paint;


    }

    @Override

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);


        canvas.drawRect(fRecX,fRecY,fRecW,fRecH,pRecPaint);
        canvas.drawCircle(fCirX,fCirY,fCirR,pCirPaint);

    }

}




