package alex.example.ejercicioautomoviles;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import alex.example.ejercicioautomoviles.Vehiculos.Bici;
import alex.example.ejercicioautomoviles.Vehiculos.Coche;
import alex.example.ejercicioautomoviles.Vehiculos.Moto;

public class MainActivity extends AppCompatActivity {

    //Atributos para la vista
    private Button btnco;
    private Button btnmo;
    private Button btnbi;
    private TextView txtcantcoches;
    private TextView txtcantmotos;
    private TextView txtcantbici;

    //atributos para logica

    private ArrayList<Coche> listacoches = new ArrayList<>();
    private ArrayList<Moto> listamoto = new ArrayList<>();
    private ArrayList<Bici> listabici = new ArrayList<>();

    //Atribus para launchers

    private ActivityResultLauncher<Intent> launcherscoche;
    private ActivityResultLauncher<Intent> launchersmotos;
    private ActivityResultLauncher<Intent> launchersbicis;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarvistas();


        //inicializarlauchers();

        launcherscoche = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Coche co = (Coche) result.getData().getExtras().getSerializable("COCHE");
                        if (co != null){
                            listacoches.add(co);
                            txtcantcoches.setText("Coches " + listacoches.size());

                        }else{
                            Toast.makeText(MainActivity.this, "No hay coche", Toast.LENGTH_SHORT).show();
                        }
                    }

                }else{

                    Toast.makeText(MainActivity.this, "Actividad cancelada",Toast.LENGTH_SHORT).show();
                }



            }
        });

        launchersmotos = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Moto motomod = (Moto) result.getData().getExtras().getSerializable("MOTO");
                        if (motomod != null){
                            listamoto.add(motomod);
                            txtcantmotos.setText("Motos " + listamoto.size());

                        }else{
                            Toast.makeText(MainActivity.this, "No hay motos", Toast.LENGTH_SHORT).show();
                        }
                    }

                }else{

                    Toast.makeText(MainActivity.this, "Actividad cancelada",Toast.LENGTH_SHORT).show();
                }


            }
        });

        launchersbicis = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == RESULT_OK){
                    if (result.getData() != null && result.getData().getExtras() != null){
                        Bici bimod = (Bici) result.getData().getExtras().getSerializable("BICI");
                        if (bimod != null){
                            listabici.add(bimod);
                           txtcantbici.setText("Bici " + listabici.size());

                        }else{
                            Toast.makeText(MainActivity.this, "No hay bicis", Toast.LENGTH_SHORT).show();
                        }
                    }

                }else{

                    Toast.makeText(MainActivity.this, "Actividad cancelada",Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Intent inteco = new Intent(MainActivity.this, Coches.class);
                startActivity(inteco);

                */

                launcherscoche.launch(new Intent(MainActivity.this, Coches.class));



            }
        });

        btnmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launcherscoche.launch(new Intent(MainActivity.this, Moto.class));

            }
        });
        btnbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launcherscoche.launch(new Intent(MainActivity.this, Bici.class));

            }
        });
    }

    //lauchers para establecer una relacion de datos entre actividad principal y secundaria


    private void inicializarvistas() {
        btnco = findViewById(R.id.btncoche);
        btnmo = findViewById(R.id.btnmoto);
        btnbi = findViewById(R.id.btnbici);
        txtcantcoches = findViewById(R.id.lblcantidecochesMain);
        txtcantmotos = findViewById(R.id.txtmoto);
        txtcantbici = findViewById(R.id.txtbici);
        listacoches = new ArrayList<>();
        listamoto = new ArrayList<>();
        listabici = new ArrayList<>();
    }
}