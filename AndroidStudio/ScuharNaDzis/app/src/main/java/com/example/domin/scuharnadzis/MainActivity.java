package com.example.domin.scuharnadzis;

import android.media.AudioManager;
import android.media.MediaPlayer;
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
        int liczba2 = liczba.nextInt(41);//dla 6 <0-5>
        switch (liczba2) {
            case 0:
                suchar.setText("Co robi skejter w toalecie?");
                odp.setText("Szaleje na desce");
                break;
            case 1:
                suchar.setText("Jak nazywa się czarodziej, który odkrył zaklęcie otyłości?");
                odp.setText("Mag Donald.");
                break;
            case 2:
                suchar.setText("Dlaczego Jasiu tańczy z ciastkiem?");
                odp.setText("Bo to był jego ulubiony kawałek.");
                break;
            case 3:
                suchar.setText("Jak się nazywa murzyn w księgarni?");
                odp.setText("Czarnoksiężnik.");
                break;
            case 4:
                suchar.setText("Co mówi ksiądz na ślubie informatyka?");
                odp.setText("Pobieranie zakończone.");
                break;
            case 5:
                suchar.setText("Co mówi informatyk, gdy dostanie pendrive'a na urodziny?");
                odp.setText("Dzięki za pamięć.");
                break;
            case 6:
                suchar.setText("Jakie drewno ma głupie pomysły?");
                odp.setText("Porąbane. ");
                break;
            case 7:
                suchar.setText("Dlaczego deszcz siedzi w więzieniu?");
                odp.setText("Bo napadał.");
                break;
            case 8:
                suchar.setText("Co robi sprzątaczka na scenie? ");
                odp.setText("WYMIATA.");
                break;
            case 9:
                suchar.setText("Czym się różnią święta w USA od świąt w Polsce?");
                odp.setText("W USA daje się prezenty w skarpetach, a w Polsce skarpety w prezencie.");
                break;
            case 10:
                suchar.setText("Co mówi kabel do kabla?");
                odp.setText("Bądźmy w kontakcie.");
                break;
            case 11:
                suchar.setText("Co mówi drwal, gdy za dużo wypije?");
                odp.setText("Ale się narąbałem.");
                break;
            case 12:
                suchar.setText("Co mówi ksiądz, kiedy dostaje mandat?");
                odp.setText("\"Bóg zapłać\"");
                break;
            case 13:
                suchar.setText("Jaki jest magik, jeśli straci magię?");
                odp.setText("Rozczarowany.");
                break;
            case 14:
                suchar.setText("Dlaczego ściany nie toczą ze sobą wojny?");
                odp.setText("Bo między nimi jest pokój.");
                break;
            case 15:
                suchar.setText("Co robi blondynka w lesie z grzebieniem w ręku?");
                odp.setText("Przeczesuje teren.");
                break;
            case 16:
                suchar.setText("Jak nazywa się nieoczekiwana ciąża?");
                odp.setText("KinderNiespodzianka.");
                break;
            case 17:
                suchar.setText("Czemu podłoga może kłamać?");
                odp.setText("Bo dywan ją kryje.");
                break;
            case 18:
                suchar.setText("Po co blondynce linijka w łóżku?");
                odp.setText("Żeby mogła zmierzyć jak długo spała.");
                break;
            case 19:
                suchar.setText("Jak się witają ludzie bez rąk?");
                odp.setText("Czołem.");
                break;
            case 20:
                suchar.setText("Jaki jest ulubiony lek terrorysty?");
                odp.setText("Ibum");
                break;
            case 21:
                suchar.setText("Jakie są ulubione ciasta wnuków?");
                odp.setText("Babeczki.");
                break;
            case 22:
                suchar.setText("Jak nazywa się związek orangutana i żaby?");
                odp.setText("Oranżada.");
                break;
            case 23:
                suchar.setText("Co mówi ogórek, gdy jest zdziwiony?");
                odp.setText("Skisłem.");
                break;
            case 24:
                suchar.setText("Kto najbardziej lubi pić lemoniadę?");
                odp.setText("Helena.");
                break;
            case 25:
                suchar.setText("Jak nazywa się żona pszczelarza?");
                odp.setText("Ula");
                break;
            case 26:
                suchar.setText("Jaka jest ulubiona ryba rolnika?");
                odp.setText("Orka.");
                break;
            case 27:
                suchar.setText("Dlaczego długopisy nie chodzą do szkoły?");
                odp.setText("Bo się wypisały.");
                break;
            case 28:
                suchar.setText("Co robią dwie herbaty na ringu?");
                odp.setText("Naparzają się.");
                break;
            case 29:
                suchar.setText("Kto najbardziej lubi pić cole?");
                odp.setText("Kolarz.");
                break;
            case 30:
                suchar.setText("Jakie są ulubione ryby matematyka?");
                odp.setText("Sumy");
                break;
            case 31:
                suchar.setText("Jak obraca się prąd?");
                odp.setText("Napięcie.");
                break;
            case 32:
                suchar.setText("Jak się nazywa książka, która szpanuję?");
                odp.setText("Bukszpan.");
                break;
            case 33:
                suchar.setText("Co mówi ogrodnik do kumpla?");
                odp.setText("Przesadziłeś.");
                break;
            case 34:
                suchar.setText("Jak się nazywa lekarz, który leczy pandy?");
                odp.setText("Pandoktor.");
                break;
            case 35:
                suchar.setText("Dlaczego choinka nie jest głodna?");
                odp.setText("Bo jodła.");
                break;
            case 36:
                suchar.setText("Jak wabi się pies złomiarza? ");
                odp.setText("Puszek.");
                break;
            case 37:
                suchar.setText("Gdzie muchy kupują sobie buty?");
                odp.setText("W tse tse tse. (CCC)");
                break;
            case 38:
                suchar.setText("Jakie są objawy świńskiej grypy?");
                odp.setText("Leżysz i kwiczysz.");
                break;
            case 39:
                suchar.setText("Jak nazywa się ubikacja jednookiego potwora?");
                odp.setText("CyKlop.");
                break;
            case 40:
                suchar.setText("Co robi piłkarz na ulicy?");
                odp.setText("Stoi w korkach.");
                break;

            default:


        }

        odp.setVisibility(View.INVISIBLE);

    }
    public void PokazOdpowiedz(View view) throws InterruptedException {
        TextView odpowiedz= (TextView)findViewById(R.id.textView2);
        odpowiedz.setVisibility(View.VISIBLE);
        Button pokaz = (Button)findViewById(R.id.button3);
        pokaz.setVisibility(View.INVISIBLE);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        MediaPlayer mp;
        int soundId=R.raw.badum;
        mp = MediaPlayer.create(this, soundId);
        Thread.sleep(1000);
        mp.start();


    }

    public void Wyjscie(View view)
    {
        finish();

    }

}
