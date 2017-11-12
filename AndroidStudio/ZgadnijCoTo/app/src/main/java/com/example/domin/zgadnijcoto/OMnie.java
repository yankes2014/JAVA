package com.example.domin.zgadnijcoto;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class OMnie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omnie);
    }

    public void Wracamy(View view)
    {
        Intent intencja= new Intent(this,MainActivity.class);
        startActivity(intencja);
        finish();

    }
}
