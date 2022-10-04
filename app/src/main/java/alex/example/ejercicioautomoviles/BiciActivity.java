package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import alex.example.ejercicioautomoviles.Vehiculos.Bici;

public class BiciActivity extends AppCompatActivity {

    private Button btncrearbi;
    private Button btncancelarbi;
    private EditText etMarcabi;
    private EditText etPulbi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici);
        inicializarvariables();

        btncancelarbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setResult(RESULT_CANCELED);
                finish();
            }
        });

        btncrearbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( etMarcabi.getText().toString().trim().isEmpty() && etPulbi.getText().toString().trim().isEmpty() ){
                    Toast.makeText(BiciActivity.this, "Faltan datos", Toast.LENGTH_SHORT).show();

                }
                else{

                    Bici bimod = new Bici(etMarcabi.getText().toString().trim(),Integer.parseInt(etPulbi.getText().toString().trim()));
                    Intent intent = new Intent();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("BICI",bimod);
                    intent.putExtras(bundle);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });

    }

    private void inicializarvariables() {
        btncrearbi = findViewById(R.id.btnCrearBiciMain);
        btncancelarbi = findViewById(R.id.btnCancelarBiciMain);
        etMarcabi = findViewById(R.id.etMarcaBiciMain);
        etPulbi = findViewById(R.id.etPulmotoMain);
    }
}