package com.example.domin.zgadnijcoto;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pytanie2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pytanie2);
    }

    public void Cofnij(View view)
    {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void ShowDalej(View view)
    {
        Button button= (Button)findViewById(R.id.dalej);
        button.setVisibility(View.VISIBLE);
        Button prawdziwy = (Button)findViewById(R.id.button13);
        button.setBackgroundColor(Color.BLUE);
        prawdziwy.setBackgroundColor(Color.GREEN);
        Button raz = (Button)findViewById(R.id.button12);
        Button dwa = (Button)findViewById(R.id.button13);
        Button trzy = (Button)findViewById(R.id.button14);
        Button cztery=(Button)findViewById(R.id.button15);
        Button cofnij = (Button)findViewById(R.id.cofnij);
        raz.setClickable(false);
        dwa.setClickable(false);
        trzy.setClickable(false);
        cztery.setClickable(false);
        cofnij.setClickable(false);
    }
    public void Dalej(View view)
    {
        Intent intent = new Intent(this,pytanie3.class);
        startActivity(intent);
        finish();
    }

    public void ZlaRaz(View view)//6
    {
        Button raz = (Button)findViewById(R.id.button12);
        raz.setBackgroundColor(Color.RED);
        Przegrana();
    }
    public void ZlaDwa(View view)//7
    {
        Button dwa = (Button)findViewById(R.id.button14);
        dwa.setBackgroundColor(Color.RED);
        Przegrana();
    }
    public void ZlaTrzy(View view)//10
    {
        Button trzy = (Button)findViewById(R.id.button15);
        trzy.setBackgroundColor(Color.RED);
        Przegrana();
    }

    public void Przegrana()
    {
        Button koniec = (Button) findViewById(R.id.koniec);
        koniec.setText("Niepoprawna odpowiedz Koniec Gry");
        koniec.setBackgroundColor(Color.RED);
        koniec.setVisibility(View.VISIBLE);
        Button raz = (Button)findViewById(R.id.button12);
        Button dwa = (Button)findViewById(R.id.button13);
        Button trzy = (Button)findViewById(R.id.button14);
        Button cztery=(Button)findViewById(R.id.button15);
        Button cofnij = (Button)findViewById(R.id.cofnij);
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
