package com.example.fbsisview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener datos del formulario y pasarlos a la siguiente actividad
                Intent intent = new Intent(RegistrationActivity.this, DisplayDataActivity.class);
                intent.putExtra("name", ((EditText)findViewById(R.id.nameEditText)).getText().toString());
                intent.putExtra("email", ((EditText)findViewById(R.id.emailEditText)).getText().toString());
                intent.putExtra("phone", ((EditText)findViewById(R.id.phoneEditText)).getText().toString());
                startActivity(intent);
            }
        });
    }
}
