package com.danielcampu.calculosfiguras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText eParametro1, eParametro2;
    TextView tParametro1, tParametro2, tTextoValor1, tValorValor1, tTextoValor2, tValorValor2;
    RadioButton rCuadrado, rCirculo, rTriangulo, rCubo;
    float lado, base, altura, radio, perimetro, area, volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eParametro1 = findViewById(R.id.eParametro1);
        eParametro2 = findViewById(R.id.eParametro2);
        tParametro1 = findViewById(R.id.tParametro1);
        tParametro2 = findViewById(R.id.tParametro2);
        rCuadrado = findViewById(R.id.rCuadrado);
        rCirculo = findViewById(R.id.rCirculo);
        rTriangulo = findViewById(R.id.rTriangulo);
        rCubo = findViewById(R.id.rCubo);
        tTextoValor1 = findViewById(R.id.tTextoValor1);
        tValorValor1 = findViewById(R.id.tValorValor1);
        tTextoValor2 = findViewById(R.id.tTextoValor2);
        tValorValor2 = findViewById(R.id.tValorValor2);

    }



    public void onRadioButtonClicked(View view) {
        int id = view.getId();

        switch (id){
            case R.id.rCuadrado:
                //Limpio
                eParametro1.setText("");
                tValorValor1.setVisibility(View.INVISIBLE);
                tTextoValor1.setVisibility(View.INVISIBLE);
                tValorValor2.setVisibility(View.INVISIBLE);
                tTextoValor2.setVisibility(View.INVISIBLE);

                tParametro1.setText("Ingrese el lado");
                eParametro1.setVisibility(View.VISIBLE);
                eParametro2.setVisibility(View.INVISIBLE);
                tParametro2.setVisibility(View.INVISIBLE);
                break;

            case R.id.rCirculo:
                //Limpio
                eParametro1.setText("");
                tValorValor1.setVisibility(View.INVISIBLE);
                tTextoValor1.setVisibility(View.INVISIBLE);
                tValorValor2.setVisibility(View.INVISIBLE);
                tTextoValor2.setVisibility(View.INVISIBLE);

                tParametro1.setText("Ingrese el radio");
                eParametro1.setVisibility(View.VISIBLE);
                eParametro2.setVisibility(View.INVISIBLE);
                tParametro2.setVisibility(View.INVISIBLE);
                break;

            case R.id.rTriangulo:
                //Limpio
                eParametro1.setText("");
                eParametro2.setText("");
                tValorValor1.setVisibility(View.INVISIBLE);
                tTextoValor1.setVisibility(View.INVISIBLE);
                tValorValor2.setVisibility(View.INVISIBLE);
                tTextoValor2.setVisibility(View.INVISIBLE);

                tParametro1.setText("Ingrese la base");
                eParametro1.setVisibility(View.VISIBLE);

                tParametro2.setVisibility(View.VISIBLE);
                tParametro2.setText("Ingrese la altura");
                eParametro2.setVisibility(View.VISIBLE);
                break;

            case R.id.rCubo:
                eParametro1.setText("");
                //Limpio
                tValorValor1.setVisibility(View.INVISIBLE);
                tTextoValor1.setVisibility(View.INVISIBLE);
                tValorValor2.setVisibility(View.INVISIBLE);
                tTextoValor2.setVisibility(View.INVISIBLE);

                tParametro1.setText("Ingrese el lado");
                eParametro1.setVisibility(View.VISIBLE);    //Visibility
                eParametro2.setVisibility(View.INVISIBLE);
                tParametro2.setVisibility(View.INVISIBLE);
                break;

        }
    }

    public void onButtonClicked(View view) {
        if(rCuadrado.isChecked()){
            //Capturo los datos
            lado = Float.valueOf(eParametro1.getText().toString()); //Para capturar el texto ingresado como un float
            perimetro = 4*lado;
            area = lado*lado;

            tValorValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setText("Perimetro: ");
            tValorValor1.setText(Float.toString(perimetro)); //Displays a float into TextView
            tValorValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setText("Area: ");
            tValorValor2.setText(Float.toString(area));

        }else if (rCirculo.isChecked()){
            radio = Float.valueOf(eParametro1.getText().toString());
            perimetro = (float) (2*Math.PI*radio);
            area = (float) (Math.PI*radio*radio);

            tValorValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setText("Perimetro: ");
            tValorValor1.setText(Float.toString(perimetro)); //Displays a float into TextView

            tValorValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setText("Area: ");
            tValorValor2.setText(Float.toString(area));


        }else if(rTriangulo.isChecked()){
            base = Float.valueOf(eParametro1.getText().toString());
            altura = Float.valueOf(eParametro2.getText().toString());
            area = (base*altura)/2;

            tTextoValor2.setVisibility(View.INVISIBLE);
            tValorValor2.setVisibility(View.INVISIBLE);

            tValorValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setText("Area: ");
            tValorValor1.setText(Float.toString(area)); //Displays a float into TextView



        }else if(rCubo.isChecked()){
            //Capturo los datos
            lado = Float.valueOf(eParametro1.getText().toString()); //Para capturar el texto ingresado como un float
            area = 6*lado*lado;
            volumen = lado*lado*lado;


            tValorValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setVisibility(View.VISIBLE);
            tTextoValor1.setText("Area: ");
            tValorValor1.setText(Float.toString(area)); //Displays a float into TextView
            tValorValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setVisibility(View.VISIBLE);
            tTextoValor2.setText("Volumen: ");
            tValorValor2.setText(Float.toString(volumen));
        }


    }
}
