package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gym.databinding.ActivitySignUpBinding;

public class SignUp extends AppCompatActivity {

    ActivitySignUpBinding binding;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_sign_up);

        databaseHelper = new DatabaseHelper(this);


    }
}