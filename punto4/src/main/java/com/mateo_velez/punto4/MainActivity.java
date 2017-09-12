package com.mateo_velez.punto4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int tolcont=0, b3cont=0, b2cont=0, b1cont=0;
    private float mult=1, tol=0.01f, valor=0, valortol=0;
    private Button btol, bb3, bb2, bb1;
    private TextView numb1, numb2, numb3, numbtol, tValR, tValT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btol = (Button) findViewById(R.id.btol);
        bb3 = (Button) findViewById(R.id.bb3);
        bb2 = (Button) findViewById(R.id.bb2);
        bb1 = (Button) findViewById(R.id.bb1);
        numb1 = (TextView) findViewById(R.id.numb1);
        numb2 = (TextView) findViewById(R.id.numb2);
        numb3 = (TextView) findViewById(R.id.numb3);
        numbtol = (TextView) findViewById(R.id.numbtol);
        tValR = (TextView) findViewById(R.id.tValR);
        tValT = (TextView) findViewById(R.id.tValT);

        numb1.setText(String.valueOf(b1cont));
        numb2.setText(String.valueOf(b2cont));
        numb3.setText(String.valueOf(mult));
        numbtol.setText(String.valueOf((tol*100)+"%"));

        valor = ((b1cont*10)+b2cont)*mult;
        valortol = valor*tol;

        //tValR.setText(String.valueOf(valor));
        //tValT.setText(String.valueOf(valortol));
        tValR.setText(String.format(java.util.Locale.US,"%.4f",valor));
        tValT.setText(String.format(java.util.Locale.US,"%.4f",valortol));

    }

    public void presstol(View view) {
        if (tolcont<3){
            tolcont+=1;
        }
        else{
            tolcont=0;
        }

        if (tolcont==0){
            btol.setBackgroundColor(Color.rgb(0x8b,0x45,0x13)); //cafe
            tol=0.01f;
        }
        else if (tolcont==1){
            btol.setBackgroundColor(Color.rgb(0xff,0x00,0x00));//rojo
            tol=0.02f;
        }
        else if (tolcont==2){
            btol.setBackgroundColor(Color.rgb(0xff,0xd7,0x00)); //dorado
            tol=0.05f;
        }
        else{
            btol.setBackgroundColor(Color.rgb(0xc0,0xc0,0xc0)); //plateado
            tol=0.1f;
        }

        numbtol.setText(String.valueOf((tol*100)+"%"));
        valor = ((b1cont*10)+b2cont)*mult;
        valortol = valor*tol;

        //tValR.setText(String.valueOf(valor));
        //tValT.setText(String.valueOf(valortol));
        tValR.setText(String.format(java.util.Locale.US,"%.4f",valor));
        tValT.setText(String.format(java.util.Locale.US,"%.4f",valortol));
    }

    public void pressb3(View view) {
        if (b3cont<8){
            b3cont+=1;
        }
        else{
            b3cont=0;
        }

        if (b3cont==0){
            bb3.setBackgroundColor(Color.rgb(0x00,0x00,0x00)); //negro
            mult=1;
        }
        else if (b3cont==1){
            bb3.setBackgroundColor(Color.rgb(0x8b,0x45,0x13)); //cafe
            mult=10;
        }
        else if (b3cont==2){
            bb3.setBackgroundColor(Color.rgb(0xff,0x00,0x00)); //rojo
            mult=100;
        }
        else if (b3cont==3){
            bb3.setBackgroundColor(Color.rgb(0xff,0x45,0x00)); //naranja
            mult=1000;
        }
        else if (b3cont==4){
            bb3.setBackgroundColor(Color.rgb(0xff,0xff,0x00)); //amarillo
            mult=10000;
        }
        else if (b3cont==5){
            bb3.setBackgroundColor(Color.rgb(0x00,0x80,0x00)); //verde
            mult=100000;
        }
        else if (b3cont==6){
            bb3.setBackgroundColor(Color.rgb(0x00,0x00,0xff)); //azul
            mult=1000000;
        }
        else if (b3cont==7){
            bb3.setBackgroundColor(Color.rgb(0xff,0xd7,0x00)); //dorado
            mult=0.1f;
        }
        else {
            bb3.setBackgroundColor(Color.rgb(0xc0,0xc0,0xc0)); //plateado
            mult=0.01f;
        }

        numb3.setText(String.valueOf(mult));
        valor = ((b1cont*10)+b2cont)*mult;
        valortol = valor*tol;

        //tValR.setText(String.valueOf(valor));
        //tValT.setText(String.valueOf(valortol));
        tValR.setText(String.format(java.util.Locale.US,"%.4f",valor));
        tValT.setText(String.format(java.util.Locale.US,"%.4f",valortol));
    }

    public void pressb2(View view) {
        if (b2cont<9){
            b2cont+=1;
        }
        else{
            b2cont=0;
        }

        if (b2cont==0){
            bb2.setBackgroundColor(Color.rgb(0x00,0x00,0x00)); //negro
        }
        else if (b2cont==1){
            bb2.setBackgroundColor(Color.rgb(0x8b,0x45,0x13)); //cafe
        }
        else if (b2cont==2){
            bb2.setBackgroundColor(Color.rgb(0xff,0x00,0x00)); //rojo
        }
        else if (b2cont==3){
            bb2.setBackgroundColor(Color.rgb(0xff,0x45,0x00)); //naranja
        }
        else if (b2cont==4){
            bb2.setBackgroundColor(Color.rgb(0xff,0xff,0x00)); //amarillo
        }
        else if (b2cont==5){
            bb2.setBackgroundColor(Color.rgb(0x00,0x80,0x00)); //verde
        }
        else if (b2cont==6){
            bb2.setBackgroundColor(Color.rgb(0x00,0x00,0xff)); //azul
        }
        else if (b2cont==7){
            bb2.setBackgroundColor(Color.rgb(0x8a,0x2b,0xe2)); //violeta
        }
        else if (b2cont==8){
            bb2.setBackgroundColor(Color.rgb(0x80,0x80,0x80)); //gris
        }
        else {
            bb2.setBackgroundColor(Color.rgb(0xff,0xff,0xff)); //blanco
        }

        numb2.setText(String.valueOf(b2cont));
        valor = ((b1cont*10)+b2cont)*mult;
        valortol = valor*tol;

        //tValR.setText(String.valueOf(valor));
        //tValT.setText(String.valueOf(valortol));
        tValR.setText(String.format(java.util.Locale.US,"%.4f",valor));
        tValT.setText(String.format(java.util.Locale.US,"%.4f",valortol));
    }

    public void pressb1(View view) {
        if (b1cont<9){
            b1cont+=1;
        }
        else{
            b1cont=0;
        }

        if (b1cont==0){
            bb1.setBackgroundColor(Color.rgb(0x00,0x00,0x00)); //negro
        }
        else if (b1cont==1){
            bb1.setBackgroundColor(Color.rgb(0x8b,0x45,0x13)); //cafe
        }
        else if (b1cont==2){
            bb1.setBackgroundColor(Color.rgb(0xff,0x00,0x00)); //rojo
        }
        else if (b1cont==3){
            bb1.setBackgroundColor(Color.rgb(0xff,0x45,0x00)); //naranja
        }
        else if (b1cont==4){
            bb1.setBackgroundColor(Color.rgb(0xff,0xff,0x00)); //amarillo
        }
        else if (b1cont==5){
            bb1.setBackgroundColor(Color.rgb(0x00,0x80,0x00)); //verde
        }
        else if (b1cont==6){
            bb1.setBackgroundColor(Color.rgb(0x00,0x00,0xff)); //azul
        }
        else if (b1cont==7){
            bb1.setBackgroundColor(Color.rgb(0x8a,0x2b,0xe2)); //violeta
        }
        else if (b1cont==8){
            bb1.setBackgroundColor(Color.rgb(0x80,0x80,0x80)); //gris
        }
        else {
            bb1.setBackgroundColor(Color.rgb(0xff,0xff,0xff)); //blanco
        }

        numb1.setText(String.valueOf(b1cont));
        valor = ((b1cont*10)+b2cont)*mult;
        valortol = valor*tol;

        //tValR.setText(String.valueOf(valor));
        //tValT.setText(String.valueOf(valortol));
        tValR.setText(String.format(java.util.Locale.US,"%.4f",valor));
        tValT.setText(String.format(java.util.Locale.US,"%.4f",valortol));
    }
}
