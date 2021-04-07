package com.example.fredi_android;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class Bordereaux {

    int id_ldf;

    String date_ldf;

    String lib_trajet_ldf;

    String cout_peage_ldf;

    String cout_repas_ldf;

    String cout_herbergement_ldf;

    float nb_km_ldf;

    float total_km_ldf;

    int id_mdf;

    int annee_per;

    String email_util;

    String motif_ldf;

    public Bordereaux(JSONObject jsonObject) {
        try {
            this.id_ldf = jsonObject.getInt("id");
            this.date_ldf = jsonObject.getString("date");
            this.lib_trajet_ldf = jsonObject.getString("libelle");
            this.cout_peage_ldf = jsonObject.getString("cout_peage");
            this.cout_repas_ldf = jsonObject.getString("cout_repas");
            this.cout_herbergement_ldf = jsonObject.getString("cout_hebergement");
            this.nb_km_ldf = (float) jsonObject.getDouble("nb_km");
            this.total_km_ldf = (float) jsonObject.getDouble("cout_km");
            this.id_mdf = jsonObject.getInt("total_ligne");
            this.annee_per = jsonObject.getInt("annee");
            this.email_util = jsonObject.getString("email");
            this.motif_ldf = jsonObject.getString("motif");

        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(MainActivity.LOG_TAG,"Erreur lors de la conversion de l'objet JSON en objet Club");
        }
    }

    public String[] toArray() {
        String data[] = {
                Integer.toString(annee_per),
                date_ldf,
                motif_ldf,
                lib_trajet_ldf,
                Float.toString(nb_km_ldf),
                Float.toString(total_km_ldf),
                cout_peage_ldf,
                cout_repas_ldf,
                cout_herbergement_ldf,
                Float.toString(total_km_ldf)
        };
        return data;
    }


}
