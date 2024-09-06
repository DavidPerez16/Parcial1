package com.example.parcial1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edt_usuario, edt_contrasena;
    Button btn_iniciar;
    String usuarioPermitido = "uac123";
    String contrasenaPermitida = "12345678";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contrasena = findViewById(R.id.edt_contrasena);
        btn_iniciar = findViewById(R.id.btn_iniciar);

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioIngresado = edt_usuario.getText().toString();
                String contrasenaIngresada = edt_contrasena.getText().toString();

                if(usuarioIngresado.equals("")||contrasenaIngresada.equals("")) {
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_LONG).show();
                } else{
                    if ((usuarioIngresado.equals(usuarioPermitido)) && (contrasenaIngresada.equals(contrasenaPermitida))) {
                        Intent i = new Intent(MainActivity.this, Pantalla2.class);

                        startActivity(i);


                    } else {
                        Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}