package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


public class EasyPlayActivity extends AppCompatActivity {
    @Bind(R.id.textView1) TextView mTextView1;
    @Bind(R.id.textView2) TextView mTextView2;
    @Bind(R.id.textView3) TextView mTextView3;
    @Bind(R.id.textView4) TextView mTextView4;
    @Bind(R.id.textView5) TextView mTextView5;
    @Bind(R.id.textView6) TextView mTextView6;
    @Bind(R.id.textView7) TextView mTextView7;
    @Bind(R.id.textView8) TextView mTextView8;
    @Bind(R.id.textView9) TextView mTextView9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String consonant1 = intent.getStringExtra("consonant1");
        String consonant2 = intent.getStringExtra("consonant2");
        String consonant3 = intent.getStringExtra("consonant3");
        String consonant4 = intent.getStringExtra("consonant4");
        String consonant5 = intent.getStringExtra("consonant5");
        String consonant6 = intent.getStringExtra("consonant6");
        String vowel1 = intent.getStringExtra("vowel1");
        String vowel2 = intent.getStringExtra("vowel2");
        String vowel3 = intent.getStringExtra("vowel3");

        mTextView1.setText(consonant1);
        mTextView2.setText(vowel1);
        mTextView3.setText(consonant2);
        mTextView4.setText(consonant3);
        mTextView5.setText(vowel2);
        mTextView6.setText(consonant4);
        mTextView7.setText(vowel3);
        mTextView8.setText(consonant5);
        mTextView9.setText(consonant6);

    }
}
