package com.example.domin.zgadnijcoto;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pytanie1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytanie1);
    }
    public void Cofnij(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void ShowDalej(View view)
    {
        Button dalej = (Button)findViewById(R.id.dalej);
        dalej.setVisibility(View.VISIBLE);
        Button odpowiedz = (Button)findViewById(R.id.button8);
        odpowiedz.setBackgroundColor(Color.GREEN);
        dalej.setBackgroundColor(Color.BLUE);
        Button raz = (Button)findViewById(R.id.button6);
        Button dwa = (Button)findViewById(R.id.button7);
        Button trzy = (Button)findViewById(R.id.button10);
        Button cztery=(Button)findViewById(R.id.button8);
        Button cofnij = (Button)findViewById(R.id.button11);
        raz.setClickable(false);
        dwa.setClickable(false);
        trzy.setClickable(false);
        cztery.setClickable(false);
        cofnij.setClickable(false);
    }

    public void Dalej(View view)
    {
        Intent intent = new Intent(this,pytanie2.class);
        startActivity(intent);
        finish();
    }

    public void ZlaRaz(View view)//6
    {
        Button raz = (Button)findViewById(R.id.button6);
        raz.setBackgroundColor(Color.RED);
        Przegrana();
    }
    public void ZlaDwa(View view)//7
    {
        Button dwa = (Button)findViewById(R.id.button7);
        dwa.setBackgroundColor(Color.RED);
        Przegrana();

    }
    public void ZlaTrzy(View view)//10
    {
        Button trzy = (Button)findViewById(R.id.button10);
        trzy.setBackgroundColor(Color.RED);
        Przegrana();
    }
    public void Przegrana()
    {
        Button koniec = (Button) findViewById(R.id.koniec);
        koniec.setText("Niepoprawna odpowiedz Koniec Gry");
        koniec.setBackgroundColor(Color.RED);
        koniec.setVisibility(View.VISIBLE);
        Button raz = (Button)findViewById(R.id.button6);
        Button dwa = (Button)findViewById(R.id.button7);
        Button trzy = (Button)findViewById(R.id.button10);
        Button cztery=(Button)findViewById(R.id.button8);
        Button cofnij = (Button)findViewById(R.id.button11);
        raz.setClickable(false);
        dwa.setClickable(false);
        trzy.setClickable(false);
        cztery.setClickable(false);
        cofnij.setClickable(false);
    }
    public void Koniec(View view)
    {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
