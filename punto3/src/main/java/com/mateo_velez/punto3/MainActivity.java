package com.mateo_velez.punto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tResultado;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    private boolean btmas, btmenos, btpor, btdividido, change;
    private String acumulador="", acumulador1="", numero="0", Resultado="";
    private float num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tResultado = (TextView) findViewById(R.id.tResultado);
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

    }

    public void mas(View view) {
        if(!acumulador.equals("")){
            btmas=true; btmenos=false; btpor=false; btdividido=false; change=true;
        }
        else{
            btmas=false; btmenos=false; btpor=false; btdividido=false; change=false;
        }
    }

    public void menos(View view) {
        if(!acumulador.equals("")){
        btmas=false; btmenos=true; btpor=false; btdividido=false; change=true;
        }
        else{
            btmas=false; btmenos=false; btpor=false; btdividido=false; change=false;
        }
    }

    public void por(View view) {
        if(!acumulador.equals("")){
        btmas=false; btmenos=false; btpor=true; btdividido=false; change=true;
        }
        else{
            btmas=false; btmenos=false; btpor=false; btdividido=false; change=false;
        }
    }

    public void div(View view) {
        if(!acumulador.equals("")){
        btmas=false; btmenos=false; btpor=false; btdividido=true; change=true;
        }
        else{
            btmas=false; btmenos=false; btpor=false; btdividido=false; change=false;
        }
    }

    public void igual(View view) {
        if (acumulador.equals("")){
            tResultado.setText("0");
        }
        else if (!acumulador.equals("") && acumulador1.equals("")){
            tResultado.setText(acumulador);
        }
        else {
            num1 = Float.valueOf(acumulador);
            num2 = Float.valueOf(acumulador1);

            if (btmas) {
                result = num1 + num2;
                tResultado.setText(String.valueOf(result));
                //tResultado.setText(String.format(java.util.Locale.US,"%.10f",result));
            } else if (btmenos) {
                result = num1 - num2;
                tResultado.setText(String.valueOf(result));
                //tResultado.setText(String.format(java.util.Locale.US,"%.10f",result));
            } else if (btpor) {
                result = num1 * num2;
                tResultado.setText(String.valueOf(result));
                //tResultado.setText(String.format(java.util.Locale.US,"%.10f",result));
            } else if (btdividido) {
                if(num2==0){
                    tResultado.setText(R.string.error);
                    tResultado.setTextSize(40);
                    }
                else{
                    result = num1 / num2;
                    tResultado.setText(String.valueOf(result));
                    //tResultado.setText(String.format(java.util.Locale.US,"%.10f",result));
                }
            } else {
                result = 0;
            }
            btmas = false; btmenos = false; btpor = false; btdividido = false; change = false;
            acumulador = ""; acumulador1 = ""; result=0; num1=0; num2=0;
        }
    }

    public void punto(View view) {
        numero=".";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void nueve(View view) {
        numero="9";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void ocho(View view) {
        numero="8";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void siete(View view) {
        numero="7";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void seis(View view) {
        numero="6";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void cinco(View view) {
        numero="5";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void cuatro(View view) {
        numero="4";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void tres(View view) {
        numero="3";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void dos(View view) {
        numero="2";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void uno(View view) {
        numero="1";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }

    public void cero(View view) {
        numero="0";
        if (!change){
            acumulador=acumulador+numero;
            tResultado.setText(acumulador);
        }
        else {
            acumulador1 = acumulador1 + numero;
            tResultado.setText(acumulador1);
        }
    }
}
