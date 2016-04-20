package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.easyPlayButton) Button mEasyPlayButton;
    private static final String[] consonants = new String[] {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Z"};
    private static final String[] vowels = new String[] {"A", "E", "I", "O", "U", "Y"};

    private String consonant1 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant2 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant3 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant4 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant5 = consonants[ (int)Math.floor(Math.random() * 20)];
    private String consonant6 = consonants[ (int)Math.floor(Math.random() * 20)];

    private String vowel1 = vowels[ (int)Math.floor(Math.random() * 6)];
    private String vowel2 = vowels[ (int)Math.floor(Math.random() * 6)];
    private String vowel3 = vowels[ (int)Math.floor(Math.random() * 6)];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mEasyPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EasyPlayActivity.class);
                intent.putExtra("consonant1", consonant1);
                intent.putExtra("consonant2", consonant2);
                intent.putExtra("consonant3", consonant3);
                intent.putExtra("consonant4", consonant4);
                intent.putExtra("consonant5", consonant5);
                intent.putExtra("consonant6", consonant6);
                intent.putExtra("vowel1", vowel1);
                intent.putExtra("vowel2", vowel2);
                intent.putExtra("vowel3", vowel3);
                startActivity(intent);
            }
        });
    }
}
