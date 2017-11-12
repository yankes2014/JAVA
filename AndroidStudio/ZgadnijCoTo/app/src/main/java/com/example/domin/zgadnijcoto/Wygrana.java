package com.example.domin.zgadnijcoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Wygrana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wygrana);
        OnStart();

    }
    public void OnStart()
    {
        TextView textView = (TextView)findViewById(R.id.textView13);
        textView.setText("Brawo, udało ci się ukończyć całą grę. Dominik jest z Ciebie dumny. Oto hasło, które należy przekazać twórcy w213");
    }
    public void Zwyciestwo(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
