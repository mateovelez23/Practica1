package com.mateo_velez.practica1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView tbase,  taltura,  tlado1, tlado2, tarea, earea, tperimetro, eperimetro;
    private TextView tvolumen, evolumen;
    private EditText ebase, ealtura, elado1, elado2;
    private int id;
    private float perimetro=0f, area=0f, volumen=0f, l1=0f, l2=0f, l3=0f, l4=0f;
    private float pi = 3.14f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbase = (TextView) findViewById(R.id.tbase);
        ebase = (EditText) findViewById(R.id.ebase);
        taltura = (TextView) findViewById(R.id.taltura);
        ealtura = (EditText) findViewById(R.id.ealtura);
        tlado1 = (TextView) findViewById(R.id.tlado1);
        elado1 = (EditText) findViewById(R.id.elado1);
        tlado2 = (TextView) findViewById(R.id.tlado2);
        elado2 = (EditText) findViewById(R.id.elado2);
        tperimetro = (TextView) findViewById(R.id.tperimetro);
        eperimetro = (TextView) findViewById(R.id.eperimetro);
        tarea = (TextView) findViewById(R.id.tarea);
        earea = (TextView) findViewById(R.id.earea);
        tvolumen = (TextView) findViewById(R.id.tvolumen);
        evolumen = (TextView) findViewById(R.id.evolumen);
    }

    public void onRadioButtonClicked(View view) {
        id = view.getId();

        if (id == R.id.rCuadro){
            tbase.setText(R.string.Lado);
            tbase.setTextSize(15);
            ebase.setHint(R.string.medidalado);
            ebase.setTextSize(12);
            tbase.setVisibility(View.VISIBLE);
            ebase.setVisibility(View.VISIBLE);
            taltura.setVisibility(View.GONE);
            ealtura.setVisibility(View.GONE);
            tlado1.setVisibility(View.GONE);
            elado1.setVisibility(View.GONE);
            tlado2.setVisibility(View.GONE);
            elado2.setVisibility(View.GONE);
        }

        if (id == R.id.rCirculo){
            tbase.setText(R.string.Radio);
            tbase.setTextSize(15);
            ebase.setHint(R.string.medidaradio);
            ebase.setTextSize(12);
            tbase.setVisibility(View.VISIBLE);
            ebase.setVisibility(View.VISIBLE);
            taltura.setVisibility(View.GONE);
            ealtura.setVisibility(View.GONE);
            tlado1.setVisibility(View.GONE);
            elado1.setVisibility(View.GONE);
            tlado2.setVisibility(View.GONE);
            elado2.setVisibility(View.GONE);
        }

        if (id == R.id.rTriangulo){
            tbase.setText(R.string.Base);
            tbase.setTextSize(15);
            ebase.setHint(R.string.medidabase);
            ebase.setTextSize(12);
            tbase.setVisibility(View.VISIBLE);
            ebase.setVisibility(View.VISIBLE);
            taltura.setText(R.string.Altura);
            taltura.setTextSize(15);
            ealtura.setHint(R.string.medidaaltura);
            ealtura.setTextSize(12);
            taltura.setVisibility(View.VISIBLE);
            ealtura.setVisibility(View.VISIBLE);
            tlado1.setText(R.string.Lado2);
            tlado1.setTextSize(15);
            elado1.setHint(R.string.medidalado2);
            elado1.setTextSize(12);
            tlado1.setVisibility(View.VISIBLE);
            elado1.setVisibility(View.VISIBLE);
            tlado2.setText(R.string.Lado3);
            tlado2.setTextSize(15);
            elado2.setHint(R.string.medidalado3);
            elado2.setTextSize(12);
            tlado2.setVisibility(View.VISIBLE);
            elado2.setVisibility(View.VISIBLE);
        }

        if (id == R.id.rCubo){
            tbase.setText(R.string.Lado);
            tbase.setTextSize(15);
            ebase.setHint(R.string.medidalado);
            ebase.setTextSize(12);
            tbase.setVisibility(View.VISIBLE);
            ebase.setVisibility(View.VISIBLE);
            taltura.setVisibility(View.GONE);
            ealtura.setVisibility(View.GONE);
            tlado1.setVisibility(View.GONE);
            elado1.setVisibility(View.GONE);
            tlado2.setVisibility(View.GONE);
            elado2.setVisibility(View.GONE);
        }
    }

    public void HacerCalculo(View view) {

     if (TextUtils.isEmpty(ebase.getText().toString()) && (id==R.id.rCuadro || id==R.id.rCirculo
             || id==R.id.rCubo || (id==R.id.rTriangulo))){
         ebase.setError("Ingrese un valor");

     }

     else if ((TextUtils.isEmpty(ealtura.getText().toString())) && (id==R.id.rTriangulo)){
         ealtura.setError("Ingrese un valor");

        }

     else if(TextUtils.isEmpty(elado1.getText().toString()) && (id==R.id.rTriangulo)){
         elado1.setError("Ingrese un valor");

        }

     else if (TextUtils.isEmpty(elado2.getText().toString()) && (id==R.id.rTriangulo)){
            elado2.setError("Ingrese un valor");

        }

     else {
         if (id == R.id.rCuadro) {
             l1 = Float.parseFloat(ebase.getText().toString());
             perimetro = 4 * l1;
             area = l1 * l1;

             tperimetro.setVisibility(View.VISIBLE);
             eperimetro.setVisibility(View.VISIBLE);
             eperimetro.setText(String.valueOf(perimetro));
             tarea.setVisibility(View.VISIBLE);
             earea.setVisibility(View.VISIBLE);
             earea.setText(String.valueOf(area));
             earea.setText(String.valueOf(area));
             tvolumen.setVisibility(View.GONE);
             evolumen.setVisibility(View.GONE);
         }

         if (id == R.id.rCirculo) {
             l1 = Float.parseFloat(ebase.getText().toString());
             perimetro = 2 * pi * l1;
             area = pi * l1 * l1;

             tperimetro.setVisibility(View.VISIBLE);
             eperimetro.setVisibility(View.VISIBLE);
             eperimetro.setText(String.valueOf(perimetro));
             tarea.setVisibility(View.VISIBLE);
             earea.setVisibility(View.VISIBLE);
             earea.setText(String.valueOf(area));
             earea.setText(String.valueOf(area));
             tvolumen.setVisibility(View.GONE);
             evolumen.setVisibility(View.GONE);
         }

         if (id == R.id.rTriangulo) {
             l1 = Float.parseFloat(ebase.getText().toString());
             l2 = Float.parseFloat(ealtura.getText().toString());
             l3 = Float.parseFloat(elado1.getText().toString());
             l4 = Float.parseFloat(elado2.getText().toString());
             perimetro = l1 + l3 + l4;
             area = l1 * l2 / 2;

             tperimetro.setVisibility(View.VISIBLE);
             eperimetro.setVisibility(View.VISIBLE);
             eperimetro.setText(String.valueOf(perimetro));
             tarea.setVisibility(View.VISIBLE);
             earea.setVisibility(View.VISIBLE);
             earea.setText(String.valueOf(area));
             earea.setText(String.valueOf(area));
             tvolumen.setVisibility(View.GONE);
             evolumen.setVisibility(View.GONE);
         }

         if (id == R.id.rCubo) {
             l1 = Float.parseFloat(ebase.getText().toString());
             perimetro = 12 * l1;
             area = l1 * l1 * 6;
             volumen = l1 * l1 * l1;

             tperimetro.setVisibility(View.VISIBLE);
             eperimetro.setVisibility(View.VISIBLE);
             eperimetro.setText(String.valueOf(perimetro));
             tarea.setVisibility(View.VISIBLE);
             earea.setVisibility(View.VISIBLE);
             earea.setText(String.valueOf(area));
             earea.setText(String.valueOf(area));
             tvolumen.setVisibility(View.VISIBLE);
             evolumen.setVisibility(View.VISIBLE);
             evolumen.setText(String.valueOf(volumen));
         }
     }
    }
}
