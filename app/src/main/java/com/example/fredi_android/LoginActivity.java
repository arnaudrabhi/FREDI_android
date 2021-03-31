package com.example.fredi_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonReader;
import android.widget.EditText;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Connexion() throws MalformedURLException {
        EditText username = (EditText)findViewById(R.id.userLogin);
        EditText password = (EditText)findViewById(R.id.mdpLogin);

        JSONObject json = new JSONObject();

        String url_string = "http://localhost/projets/fredi/note_json.php?" + "email=" + username + "&password=" + password;



        try {
            URL url = new URL(url_string);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestProperty("User-Agent", "");
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.connect();

            InputStream inputStream = connection.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }




        URL url = new URL("http://localhost/projets/fredi/note_json.php");










    }

}