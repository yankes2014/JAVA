package com.example.domin.scuharnadzis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.ContentHandler;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void LosujSuchara(View view)
    {
        TextView suchar= (TextView)findViewById(R.id.textView);
        TextView odp = (TextView)findViewById(R.id.textView2);
        Button pokaz = (Button)findViewById(R.id.button3);
        pokaz.setVisibility(View.VISIBLE);
        suchar.setText("hejka");

        Random liczba = new Random();
        int liczba2 = liczba.nextInt(21);//dla 6 <0-5>
        switch (liczba2) {
            case 0:
                suchar.setText("Co robi skejter w toalecie?");
                odp.setText("Szaleje na desce");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 1:
                suchar.setText("Jak nazywa się czarodziej, który odkrył zaklęcie otyłości?");
                odp.setText("Mag Donald.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 2:
                suchar.setText("Dlaczego Jasiu tańczy z ciastkiem?");
                odp.setText("Bo to był jego ulubiony kawałek.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 3:
                suchar.setText("Jak się nazywa murzyn w księgarni?");
                odp.setText("Czarnoksiężnik.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 4:
                suchar.setText("Co mówi ksiądz na ślubie informatyka?");
                odp.setText("Pobieranie zakończone.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 5:
                suchar.setText("Co mówi informatyk, gdy dostanie pendrive'a na urodziny?");
                odp.setText("Dzięki za pamięć.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 6:
                suchar.setText("Jakie drewno ma głupie pomysły?");
                odp.setText("Porąbane. ");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 7:
                suchar.setText("Dlaczego deszcz siedzi w więzieniu?");
                odp.setText("Bo napadał.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 8:
                suchar.setText("Co robi sprzątaczka na scenie? ");
                odp.setText("WYMIATA.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 9:
                suchar.setText("Czym się różnią święta w USA od świąt w Polsce?");
                odp.setText("W USA daje się prezenty w skarpetach, a w Polsce skarpety w prezencie.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 10:
                suchar.setText("Co mówi kabel do kabla?");
                odp.setText("Bądźmy w kontakcie.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 11:
                suchar.setText("Co mówi drwal, gdy za dużo wypije?");
                odp.setText("Ale się narąbałem.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 12:
                suchar.setText("Co mówi ksiądz, kiedy dostaje mandat?");
                odp.setText("\"Bóg zapłać\"");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 13:
                suchar.setText("Jaki jest magik, jeśli straci magię?");
                odp.setText("Rozczarowany.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 14:
                suchar.setText("Dlaczego ściany nie toczą ze sobą wojny?");
                odp.setText("Bo między nimi jest pokój.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 15:
                suchar.setText("Co robi blondynka w lesie z grzebieniem w ręku?");
                odp.setText("Przeczesuje teren.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 16:
                suchar.setText("Jak nazywa się nieoczekiwana ciąża?");
                odp.setText("KinderNiespodzianka.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 17:
                suchar.setText("Czemu podłoga może kłamać?");
                odp.setText("Bo dywan ją kryje.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 18:
                suchar.setText("Po co blondynce linijka w łóżku?");
                odp.setText("Żeby mogła zmierzyć jak długo spała.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 19:
                suchar.setText("Jak się witają ludzie bez rąk?");
                odp.setText("Czołem.");
                odp.setVisibility(View.INVISIBLE);
                break;
            case 20:
                suchar.setText("Jaki jest ulubiony lek terrorysty?");
                odp.setText("Ibum");
                odp.setVisibility(View.INVISIBLE);
                break;

            default:

        }



    }
    public void PokazOdpowiedz(View view)
    {
        TextView odpowiedz= (TextView)findViewById(R.id.textView2);
        odpowiedz.setVisibility(View.VISIBLE);
        Button pokaz = (Button)findViewById(R.id.button3);
        pokaz.setVisibility(View.INVISIBLE);
    }

    public void Wyjscie(View view)
    {
        finish();

    }

}
