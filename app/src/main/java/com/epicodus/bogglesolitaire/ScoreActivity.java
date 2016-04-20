package com.epicodus.bogglesolitaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ScoreActivity extends AppCompatActivity {
    @Bind(R.id.invalidListView) ListView mInvalidListView;
    @Bind(R.id.scoringListView) ListView mScoringListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String userWordsString = intent.getStringExtra("wordArray");
        String[] userWordsArray = userWordsString.split(", ");
        List<String> invalidWordsArray = new ArrayList<String>();
        List<String> scoringWordsArray = new ArrayList<String>();


        for (String word: userWordsArray) {
            if (word.length() < 3) {
                invalidWordsArray.add(word);
            } else {
                scoringWordsArray.add(word);
            }
        }


        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, invalidWordsArray);
        mInvalidListView.setAdapter(adapter1);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, scoringWordsArray);
        mScoringListView.setAdapter(adapter2);
    }
}
