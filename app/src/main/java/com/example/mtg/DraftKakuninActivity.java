package com.example.mtg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DraftKakuninActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draft_kakunin);

        findViewById(R.id.buttonStart).setOnClickListener(this);
    }

    //ボタンが押された時の処理
    public void onClick(View view){
        Intent intent = new Intent(this, DraftPickActivity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
}
