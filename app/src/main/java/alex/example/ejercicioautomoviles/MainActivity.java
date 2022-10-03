package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import alex.example.ejercicioautomoviles.Vehiculos.Bici;
import alex.example.ejercicioautomoviles.Vehiculos.Coche;
import alex.example.ejercicioautomoviles.Vehiculos.Moto;

public class MainActivity extends AppCompatActivity {

    private Button btnco;
    private Button btnmo;
    private Button btnbi;

    private ArrayList<Coches> listcoches = new ArrayList<>();
    private ArrayList<Moto> listmoto = new ArrayList<>();
    private ArrayList<Bici> listbici = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarvistas();

        btnco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inteco = new Intent(MainActivity.this, Coches.class);
                startActivity(inteco);
            }
        });

        btnmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intemo = new Intent(MainActivity.this, Coche.class);
                startActivity(intemo);
            }
        });
        btnbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intebi = new Intent(MainActivity.this, Coche.class);
                startActivity(intebi);
            }
        });
    }

    //lauchers para establecer una relacion de datos entre actividad principal y secundaria


    private void inicializarvistas() {
        btnco = findViewById(R.id.btncoche);
        btnmo = findViewById(R.id.btnmoto);
        btnbi = findViewById(R.id.btnbici);
    }
}