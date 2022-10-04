package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.IllegalFormatCodePointException;

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
        //inicializarlaunchers();

        btncancelarmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setResult(RESULT_CANCELED);
                finish();
            }
        });

        btncrearmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!etmoModelo.getText().toString().trim().isEmpty()
                && !etmoMarca.getText().toString().trim().isEmpty() && !etmoCC.getText().toString().trim().isEmpty()
                ){

                }

            }
        });
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putSerializable("MOTO", motomodel);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);

        finish();


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