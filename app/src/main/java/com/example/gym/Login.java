package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void SingUP(View view){
        Intent Sign = new Intent(this, SignUp.class);
        startActivity(Sign);
    }
    public void Home(View view){
        Intent Homee = new Intent(this, NavBotDialog.class);
        startActivity(Homee);
    }

}