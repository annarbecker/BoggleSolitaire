package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class EasyPlayActivity extends AppCompatActivity {
    @Bind(R.id.button1) Button mButton1;
    @Bind(R.id.button2) Button mButton2;
    @Bind(R.id.button3) Button mButton3;
    @Bind(R.id.button4) Button mButton4;
    @Bind(R.id.button5) Button mButton5;
    @Bind(R.id.button6) Button mButton6;
    @Bind(R.id.button7) Button mButton7;
    @Bind(R.id.button8) Button mButton8;
    @Bind(R.id.button9) Button mButton9;
    @Bind(R.id.userEditText) EditText mUserEditText;
    @Bind(R.id.addWordButton) Button mAddWordButton;
    @Bind(R.id.getScoreButton) Button mGetScoreButton;

    private List<String> letterArray = new ArrayList<String>();
    private List<String> wordArray = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_play);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        final String consonant1 = intent.getStringExtra("consonant1");
        final String consonant2 = intent.getStringExtra("consonant2");
        final String consonant3 = intent.getStringExtra("consonant3");
        final String consonant4 = intent.getStringExtra("consonant4");
        final String consonant5 = intent.getStringExtra("consonant5");
        final String consonant6 = intent.getStringExtra("consonant6");
        final String vowel1 = intent.getStringExtra("vowel1");
        final String vowel2 = intent.getStringExtra("vowel2");
        final String vowel3 = intent.getStringExtra("vowel3");

        mButton1.setText(consonant1);
        mButton2.setText(vowel1);
        mButton3.setText(consonant2);
        mButton4.setText(consonant3);
        mButton5.setText(vowel2);
        mButton6.setText(consonant4);
        mButton7.setText(vowel3);
        mButton8.setText(consonant5);
        mButton9.setText(consonant6);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant1);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(vowel1);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant2);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant3);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(vowel2);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant4);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(vowel3);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant5);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letterArray.add(consonant6);
                mUserEditText.setText(TextUtils.join("", letterArray));

            }
        });


        mAddWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordArray.add(TextUtils.join("", letterArray));
                letterArray.clear();
                mUserEditText.setText("");
            }
        });

        mGetScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EasyPlayActivity.this, ScoreActivity.class);
                intent.putExtra("wordArray", TextUtils.join(", ", wordArray));
                startActivity(intent);
            }
        });


    }
}
