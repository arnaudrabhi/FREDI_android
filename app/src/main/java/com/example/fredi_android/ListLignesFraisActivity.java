package com.example.fredi_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ListLignesFraisActivity extends AppCompatActivity {

    Intent myIntent;
    TextView myViewAnnee;
    TextView myViewDate;
    TextView myViewMotif;
    TextView myViewTrajet;
    TextView myViewKm;
    TextView myViewKm_total;
    TextView myViewPeage;
    TextView myViewRepas;
    TextView myViewHebergement;
    TextView MyViewTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_lignes_frais);

        // Récupère les données à afficher
        myIntent = getIntent();
        String myData[] = myIntent.getStringArrayExtra(MyAsyncTask.EXTRA_MESSAGE);

        myViewAnnee = (TextView) findViewById(R.id.tv_annee);
        myViewAnnee.setText("ID : " + myData[0]);

        myViewDate = (TextView) findViewById(R.id.tv_date);
        myViewDate.setText("ID : " + myData[0]);

        myViewMotif = (TextView) findViewById(R.id.tv_motif);
        myViewMotif.setText("ID : " + myData[0]);

        myViewTrajet = (TextView) findViewById(R.id.tv_trajet);
        myViewTrajet.setText("ID : " + myData[0]);

        myViewKm = (TextView) findViewById(R.id.tv_km);
        myViewKm.setText("ID : " + myData[0]);

        myViewKm_total = (TextView) findViewById(R.id.tv_km_total);
        myViewKm_total.setText("ID : " + myData[0]);

        myViewPeage = (TextView) findViewById(R.id.tv_peage);
        myViewPeage.setText("ID : " + myData[0]);

        myViewRepas = (TextView) findViewById(R.id.tv_repas);
        myViewRepas.setText("ID : " + myData[0]);

        myViewHebergement = (TextView) findViewById(R.id.tv_hebergement);
        myViewHebergement.setText("ID : " + myData[0]);

        MyViewTotal = (TextView) findViewById(R.id.tv_total);
        MyViewTotal.setText("ID : " + myData[0]);


    }




}