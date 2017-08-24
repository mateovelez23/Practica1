package com.mateo_velez.punto2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText eNombre, eClave, eConfirmar, eCorreo;
    private TextView tInformacion, eres;
    private Button bRegistro;
    private Button bFecha;
    private CheckBox cCine, cComer, cDeporte, cDormir;
    private Spinner sCiudad;
    private String nombre, clave, correo, ciudad, sexo="", hobbies="";
    private static int D=0, M=1, Y=1952;
    private int id=0;

    static final int DATE_DIALOG_ID = 0;
    private int mYear,mMonth,mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre = (EditText) findViewById(R.id.eNombre);
        eClave = (EditText) findViewById(R.id.eClave);
        eConfirmar = (EditText) findViewById(R.id.eConfirmar);
        eCorreo = (EditText) findViewById(R.id.eCorreo);
        sCiudad = (Spinner) findViewById(R.id.sCiudad);
        tInformacion = (TextView) findViewById(R.id.tInformacion);
        bRegistro = (Button) findViewById(R.id.bRegistro);
        bFecha = (Button) findViewById(R.id.bFecha);
        cCine = (CheckBox) findViewById(R.id.cCine);
        cComer = (CheckBox) findViewById(R.id.cComer);
        cDeporte = (CheckBox) findViewById(R.id.cDeporte);
        cDormir = (CheckBox) findViewById(R.id.cDormir);
        bFecha = (Button) findViewById(R.id.bFecha);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudad_array, android.R.layout.simple_spinner_item);
            // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            // Apply the adapter to the spinner
        sCiudad.setAdapter(adapter);
        sCiudad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ciudad = adapterView.getItemAtPosition(i).toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });



        bFecha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                showDialog(DATE_DIALOG_ID);
            }
        });
        mYear=Y; mMonth=M; mDay=D;
    }

    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            int year=Y, month=M, day=D;
            /*final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);*/

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user

        }
    }




    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_DIALOG_ID:
                return new DatePickerDialog(this, mDateSetListener, mYear, mMonth, mDay);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =new DatePickerDialog.OnDateSetListener() {
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            mYear = year; mMonth = monthOfYear; mDay = dayOfMonth;
            D=mDay; M=mMonth; Y=mYear;
            bFecha.setText(new StringBuilder().append(mDay).append("/").append(mMonth+1).append("/").append(mYear));
        }
    };




    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void onRadioButtonClicked(View view) {
        id = view.getId();

        if (id == R.id.rMasculino) {
            sexo = "Masculino";
        }

        if (id == R.id.rFemenino) {
            sexo = "Femenino";
        }
    }

    public void onCheckboxClicked(View view) {
    }

    public void Registrar(View view) {
        hobbies = "";

        if(TextUtils.isEmpty(eNombre.getText().toString())){
            tInformacion.setText("Ingrese el nombre de usuario");
        }

        else if(TextUtils.isEmpty(eClave.getText().toString())){
            tInformacion.setText("Ingrese la contraseña");
        }

        else if(TextUtils.isEmpty(eConfirmar.getText().toString())){
            tInformacion.setText("Vuelva a escribir la contraseña");
        }

        else if(!(eClave.getText().toString()).equals(eConfirmar.getText().toString())){
            tInformacion.setText("La contraseña no concuerda");
        }

        else if(TextUtils.isEmpty(eCorreo.getText().toString())){
            tInformacion.setText("Escriba su correo electrónico");
        }

        else if(D==0){
            tInformacion.setText("Seleccione la fecha");
        }

        else if(id==0){
            tInformacion.setText("Seleccione su sexo");
        }
        else if(!cCine.isChecked() & !cComer.isChecked() & !cDeporte.isChecked() & !cDormir.isChecked()){
            tInformacion.setText("Seleccione al menos un hobbie");
        }

        else {

            if (cCine.isChecked()) {
                hobbies = hobbies + " " + "Cine";
            }
            if (cComer.isChecked()) {
                hobbies = hobbies + " " + "Comer";
            }
            if (cDeporte.isChecked()) {
                hobbies = hobbies + " " + "Deporte";
            }
            if (cDormir.isChecked()) {
                hobbies = hobbies + " " + "Dormir";
            }

            nombre = eNombre.getText().toString();
            clave = eClave.getText().toString();
            correo = eCorreo.getText().toString();
            tInformacion.setText("Login: " + nombre + " \nPassword: " + clave + " \nCorreo " + correo +
                    "\nCiudad: " + ciudad + " \nFecha: " + mDay + "/" + (mMonth+1) + "/" + mYear +
                    "\nSexo :" + sexo + "\nHobbies: " + hobbies);
        }
    }
}
