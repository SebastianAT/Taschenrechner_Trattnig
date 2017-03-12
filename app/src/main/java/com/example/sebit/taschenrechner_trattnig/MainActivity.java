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
    protected void onCreate(Bundle savedInstanceState) {   // Hier brauchen wir nur die onCreate methode
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Berechnung(View v){                              // Methode erstellen auf die button zugreift

        EditText Objekt01=(EditText)findViewById(R.id.zahl01);   // Obejekt Variable erstellen mit
        EditText Objekt02=(EditText)findViewById(R.id.zahl02);   // R.Id auf layout zugreifen und zahl01 holen
        EditText Objekt03=(EditText)findViewById(R.id.zahl03);   // also verweiß

        Integer nummer01=Integer.parseInt(Objekt01.getText().toString());  // hier mit .getText.toString wird String geholt,
        Integer nummer02=Integer.parseInt(Objekt02.getText().toString());  // da wir aber Int brauchen müssen wir explizit ansprechen

        try {                                    // damit das app nicht abgebrochen wird bei Fehlern wie zb
                                                 // divison durch Null muss dieser Fehler abgefangen werden dies passiert im catch block
            Objekt03.setText(String.valueOf(nummer01 / nummer02));   // mit setText wird objekt angesprochen was reinzuschreiben ,
                                                                     // da ein string gegeben muss umgewandelt werden
        } catch(Exception e) {
            Objekt03.setText("Div / 0 nicht möglich");          // Meldung die bei Exception ausgegeben werden soll


        }


    }
}
