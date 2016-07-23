package com.example.ramesh7128.skillhunter;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;

public class specificSkillList extends AppCompatActivity {

    TextView skillText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_skill_list);
        Intent intent = getIntent();
        String texVal = intent.getStringExtra("category");
        int imageVal = intent.getIntExtra("imagetag", 0);
        Drawable imageDraw = getResources().getDrawable(imageVal);
        Log.d("imageVal",imageVal);

        skillText = (TextView) findViewById(R.id.count_skill_list);
        skillText.setText(texVal);

        ImageView skillImage = (ImageView) findViewById(R.id.thumbnail_skill_list);
//        skillImage.setImageDrawable(imageDraw);

    }





}
