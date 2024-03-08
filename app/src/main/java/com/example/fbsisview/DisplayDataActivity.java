package com.example.fbsisview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayDataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        // Mostrar los datos recibidos del formulario de registro
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView phoneTextView = findViewById(R.id.phoneTextView);
        nameTextView.setText("Nombre: " + name);
        emailTextView.setText("Email: " + email);
        phoneTextView.setText("Telefono: " + phone);
        }
    public void closeApplication(View view) {
        finishAffinity(); // Cierra la actividad actual
    }

    public void goToRegistrationActivity(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }


}
