package com.example.mtg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class DraftPickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draft_pick);

        ImageView v1 = (ImageView) findViewById(R.id.card1);
        ImageView v2 = (ImageView) findViewById(R.id.card2);
        ImageView v3 = (ImageView) findViewById(R.id.card16);
        ImageView v4 = (ImageView) findViewById(R.id.card17);
        ImageView v5 = (ImageView) findViewById(R.id.card18);
        ImageView v6 = (ImageView) findViewById(R.id.card19);
        ImageView v7 = (ImageView) findViewById(R.id.card20);
        ImageView v8 = (ImageView) findViewById(R.id.card28);
        ImageView v9 = (ImageView) findViewById(R.id.card21);
        ImageView v10 = (ImageView) findViewById(R.id.card22);
        ImageView v11 = (ImageView) findViewById(R.id.card23);
        ImageView v12 = (ImageView) findViewById(R.id.card24);
        ImageView v13 = (ImageView) findViewById(R.id.card25);
        ImageView v14 = (ImageView) findViewById(R.id.card26);
        ImageView v15 = (ImageView) findViewById(R.id.card27);
        AssetManager as = getResources().getAssets();
        try {
            InputStream is = as.open("card/sampleCard.png");
            Bitmap bm = BitmapFactory.decodeStream(is);
            //decodeStream(InputStream,padding.options);
            v1.setImageBitmap(bm);
            v2.setImageBitmap(bm);
            v3.setImageBitmap(bm);
            v4.setImageBitmap(bm);
            v5.setImageBitmap(bm);
            v6.setImageBitmap(bm);
            v7.setImageBitmap(bm);
            v8.setImageBitmap(bm);
            v9.setImageBitmap(bm);
            v10.setImageBitmap(bm);
            v11.setImageBitmap(bm);
            v12.setImageBitmap(bm);
            v13.setImageBitmap(bm);
            v14.setImageBitmap(bm);
            v15.setImageBitmap(bm);
        } catch (IOException e) {
            Log.e("err", e.toString());
        }
    }
}
