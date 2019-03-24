package com.example.fransizcasozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numbers(View view) {
        Intent i=new Intent(this,NumbersActivity.class);
        startActivity(i);
    }

    public void family(View view) {
        Intent i=new Intent(this,FamilyActivity.class);
        startActivity(i);
    }

    public void colors(View view) {
        Intent i=new Intent(this,ColorsActivity.class);
        startActivity(i);
    }

    public void phrases(View view) {
        Intent i=new Intent(this,PhrasesActivity.class);
        startActivity(i);
    }
}
