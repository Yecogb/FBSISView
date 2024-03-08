package com.example.fbsisview;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class PresentationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentation);
    }
    public void goToRegistrationActivity(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}
