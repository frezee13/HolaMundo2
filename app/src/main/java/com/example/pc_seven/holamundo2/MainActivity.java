package com.example.pc_seven.holamundo2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd, btnDos; //declarando variables se pueden ir en linea por que son el mismo objeto
    //private Button btnDos; //Decalarando Variables
    private TextView tvNumber; //Decalarando variables
    private int numero; //Declarando variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd =(Button) findViewById(R.id.btn_add);
        tvNumber = (TextView) findViewById(R.id.tv_number);
        btnDos= (Button) findViewById(R.id.btn_dos);

        //Entra por Default al Inciar la Aplicacion;
        //tvNumber.setText("BNB Hola Mundo!");
        tvNumber.setText( "Oprime el Boton!" );
        //igualo la variable a cero para que no este en null
        numero=0;

        //creo los eventos para los botones
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //codigo ocurre cuando ocurre el evento click
                //numero = numero + 1;
                numero++;
                tvNumber.setText( numero + "" ); //se concatena la variable por que es numero entero y para mostrarla la pide en string
            }
        });


        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    numero =0;
                    tvNumber.setText(numero + "");
            }
        });

    }
}
