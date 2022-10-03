package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
            finish();
            }
        });
        btncrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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