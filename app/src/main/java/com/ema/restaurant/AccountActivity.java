package com.ema.restaurant;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
    }

    public void updateProfile(View view) {
        Toast.makeText(getApplicationContext(), "Profile updated!", Toast.LENGTH_LONG).show();
    }
}
