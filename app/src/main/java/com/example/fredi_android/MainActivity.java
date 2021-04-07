
package com.example.fredi_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    static final String LOG_TAG = "bat21"; // Tag pour la log

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Quand on clique sur le bouton "suivant", on passe à l'activity "Login"
     * @param view
     */
    public void suivant(View view) {
        // Création de l'intent pour Login
        Intent myIntent = new Intent(this, LoginActivity.class);
        // Lancement de l'activité
        startActivity(myIntent);
    }

}