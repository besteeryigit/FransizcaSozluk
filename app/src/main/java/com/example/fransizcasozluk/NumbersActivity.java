package com.example.fransizcasozluk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {
    List<Word> words=new ArrayList<>();
    ListView liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        words.add(new Word("un","bir",R.drawable.sayi1,R.raw.daft_punk));
        words.add(new Word("deux","iki",R.drawable.sayi2,R.raw.daft_punk));
        words.add(new Word("trois","üç",R.drawable.sayi3,R.raw.daft_punk));
        words.add(new Word("quarte","dört",R.drawable.sayi4,R.raw.daft_punk));
        words.add(new Word("cinq","beş",R.drawable.sayi5,R.raw.daft_punk));
        words.add(new Word("six","altı",R.drawable.sayi6,R.raw.daft_punk));
        words.add(new Word("sept","yedi",R.drawable.sayi7,R.raw.daft_punk));
        words.add(new Word("huit","sekiz",R.drawable.sayi8,R.raw.daft_punk));
        words.add(new Word("neuf","dokuz",R.drawable.sayi9,R.raw.daft_punk));
        words.add(new Word("dix","on",R.drawable.sayi10,R.raw.daft_punk));
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_numbers);
        liste=(ListView)findViewById(R.id.list);
        liste.setAdapter(adapter);

    }
}
