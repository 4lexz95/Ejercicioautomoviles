package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Moto extends AppCompatActivity {

    private Button btncrearmo;
    private Button btncancelarmo;
    private EditText etmoMarca;
    private EditText etmoModelo;
    private EditText etmoCC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);
        inicializarvariables();
        inicializarlaunchers();

        btncancelarmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private void inicializarlaunchers() {

    }

    private void inicializarvariables() {
        btncrearmo = findViewById(R.id.btnCrearMotoMain);
        btncancelarmo = findViewById(R.id.btnCancelarMotoMain);
        etmoMarca = findViewById(R.id.editxtMarcaMotoMain);
        etmoModelo = findViewById(R.id.etModeloMotoMain);
        etmoCC = findViewById(R.id.etCCMotoMain);
    }
}