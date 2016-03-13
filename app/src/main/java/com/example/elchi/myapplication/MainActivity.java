package com.example.elchi.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class   MainActivity extends AppCompatActivity {
    public EditText texto;
    public TextView textocambio;
    public RadioButton rR,rAz,rAm;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto=(EditText)findViewById(R.id.textoED);
        textocambio=(TextView)findViewById(R.id.textoCambiadoTV);
        rR=(RadioButton)findViewById(R.id.rB);
        rAz=(RadioButton)findViewById(R.id.rAz);
        rAm=(RadioButton)findViewById(R.id.rAm);

    }
    public void cambiarDeCampo(View View){
        String textoSeleccion;
        textoSeleccion=texto.getText().toString();
        textocambio.setText(textoSeleccion);
    }
    public void cambiarColor(View View){

        if (rR.isChecked()==true) {

            textocambio.setTextColor(Color.RED);
        }else if (rAm.isChecked()==true)
        {
            textocambio.setTextColor(Color.YELLOW);
        } else if (rAz.isChecked()){
            textocambio.setTextColor(Color.BLUE);
        }
    }
    public void alert(View v) {
        String textoSeleccion;
        textoSeleccion=texto.getText().toString();
        Toast notificacion = Toast.makeText(this, textoSeleccion, Toast.LENGTH_LONG);
        notificacion.show();

    }
}
