package alex.example.ejercicioautomoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
                finish();
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