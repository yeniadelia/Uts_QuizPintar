package com.example.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout mtk = findViewById(R.id.mtkLayout);
        final LinearLayout ipa = findViewById(R.id.ipaLayout);
        final LinearLayout ips = findViewById(R.id.ipsLayout);
        final LinearLayout bahasa = findViewById(R.id.bahasaLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);


        mtk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName ="MTK";

                mtk.setBackgroundResource(R.drawable.round_back_white_stroke);

                ipa.setBackgroundResource(R.drawable.round_back_white10);
                ips.setBackgroundResource(R.drawable.round_back_white10);
                bahasa.setBackgroundResource(R.drawable.round_back_white10);


            }
        });

        ipa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName ="IPA";

                ipa.setBackgroundResource(R.drawable.round_back_white_stroke);

                mtk.setBackgroundResource(R.drawable.round_back_white10);
                ips.setBackgroundResource(R.drawable.round_back_white10);
                bahasa.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        ips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName ="IPS";

                ips.setBackgroundResource(R.drawable.round_back_white_stroke);

                ipa.setBackgroundResource(R.drawable.round_back_white10);
                mtk.setBackgroundResource(R.drawable.round_back_white10);
                bahasa.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        bahasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                selectedTopicName ="Bahasa";

                bahasa.setBackgroundResource(R.drawable.round_back_white_stroke);

                ipa.setBackgroundResource(R.drawable.round_back_white10);
                ips.setBackgroundResource(R.drawable.round_back_white10);
                mtk.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Select the topic", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, QuizActivity.class );
                    intent.putExtra("Select Topic", selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}