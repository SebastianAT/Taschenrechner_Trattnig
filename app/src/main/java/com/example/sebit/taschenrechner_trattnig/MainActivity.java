package com.example.sebit.taschenrechner_trattnig;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Berechnung(View v){

        EditText Objekt01=(EditText)findViewById(R.id.zahl01);   // Obejkt Variable erstellen mit R.Id auf layout zugreifen und zahl01 holen also verweiß
        EditText Objekt02=(EditText)findViewById(R.id.zahl02);
        EditText Objekt03=(EditText)findViewById(R.id.zahl03);

        Integer nummer01=Integer.parseInt(Objekt01.getText().toString());
        Integer nummer02=Integer.parseInt(Objekt02.getText().toString());

        try {

            Objekt03.setText(String.valueOf(nummer01 / nummer02));

        } catch(Exception e) {
            Objekt03.setText("Div / 0 nicht möglich");


        }


    }
}
