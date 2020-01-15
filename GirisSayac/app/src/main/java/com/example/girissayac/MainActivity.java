package com.example.girissayac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewSayac;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewSayac = (TextView) findViewById(R.id.textviewSayac);

        sp = getSharedPreferences("GirisSayac",MODE_PRIVATE);
        editor = sp.edit();

        int sayac = sp.getInt("sayac",0);

        editor.putInt("sayac",++sayac);
        editor.commit();

        textViewSayac.setText("Sayaç :"+String.valueOf(sayac));
    }
}
