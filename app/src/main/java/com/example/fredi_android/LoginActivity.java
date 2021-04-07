package com.example.fredi_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.MalformedURLException;

public class LoginActivity extends AppCompatActivity {

    EditText myViewUser;
    EditText myViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myViewUser = (EditText) findViewById(R.id.tv_email);
        myViewPassword = (EditText) findViewById(R.id.tv_password);

    }

    public void Connexion(View view) throws MalformedURLException {
        EditText username = (EditText)findViewById(R.id.tv_email);
        EditText password = (EditText)findViewById(R.id.mdpLogin);
        // Création de l'intent pour Login
        Intent myIntent = new Intent(this, ListBordereauxActivity.class);
        // Ajoute le login et le password dans l'intent
        String myData[]={username.getText().toString(),password.getText().toString()};
        myIntent.putExtra(MyAsyncTask.EXTRA_MESSAGE, myData);
        // Lancement de l'activité
        startActivity(myIntent);

    }

}