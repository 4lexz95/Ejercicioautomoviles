package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import alex.example.ejercicioautomoviles.Vehiculos.Coche;

public class Coches extends AppCompatActivity {

    private Button btncrear;
    private Button btncancelar;
    private EditText etMarca;
    private EditText etModelo;
    private EditText etColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coches);
        inicializarvistas();
        inicializarlaunchers();

        btncancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            setResult(RESULT_CANCELED);
                finish();
            }
        });
        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String marca = etMarca.getText().toString().trim();
                String modelo = etModelo.getText().toString().trim();
                String color = etColor.getText().toString().trim();

                if (!marca.isEmpty() && !modelo.isEmpty() && !color.isEmpty()){
                    //Creo el coche
                    Coche co = new Coche(marca,modelo,color);
                    Bundle bun = new Bundle();
                    bun.getSerializable("COCHE", co);
                    Intent intent = new Intent();
                    intent.putExtras(bun);
                    setResult(RESULT_OK,intent);
                    finish();


                }else {
                    Toast.makeText(Coches.this,"Faltan datos", Toast.LENGTH_SHORT);

                }
            }
        });


    }

    private void inicializarlaunchers() {


    }

    private void inicializarvistas() {
        btncancelar = findViewById(R.id.btncanMain);
        btncrear = findViewById(R.id.btncrearMain);
        etMarca = findViewById(R.id.edittxtMarcaMain);
        etModelo = findViewById(R.id.editxtModeloMain);
        etColor = findViewById(R.id.editxtColorMain);
    }
}