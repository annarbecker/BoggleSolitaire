package com.epicodus.bogglesolitaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class EasyPlayActivity extends AppCompatActivity {
    private static final String[] consonants = new String[] {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
    private static final String[] vowels = new String[] {"a", "e", "i", "o", "u", "y"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);
    }


    private String consonant1 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant2 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant3 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant4 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant5 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant6 = consonants[ (int)Math.floor(Math.random() * 20)];

    private String vowel1 = vowels[ (int)Math.floor(Math.random() * 6)];
    private String vowel2 = vowels[ (int)Math.floor(Math.random() * 6)];
    private String vowel3 = vowels[ (int)Math.floor(Math.random() * 6)];

}
