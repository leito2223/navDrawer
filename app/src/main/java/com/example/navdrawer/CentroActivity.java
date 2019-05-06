package com.example.navdrawer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CentroActivity extends AppCompatActivity {

    private Button staAna;
    private TextView staAnaTextView;
    private TextView herediaTextView;
    private Button heredia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_centro);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ViewPager viewPager = findViewById(R.id.viewPagerHeredia);
        ImageAdapterHeredia adapter = new ImageAdapterHeredia(this);
        viewPager.setAdapter(adapter);
        ViewPager viewPager2 = findViewById(R.id.viewPagerStaAna);
        ImageAdapterStaAna adapter2 = new ImageAdapterStaAna(this);
        viewPager2.setAdapter(adapter2);

        staAna = findViewById(R.id.buttonSantAna);
        staAnaTextView = findViewById(R.id.textViewStaAna);
        heredia = findViewById(R.id.buttonHeredia);
        herediaTextView = findViewById(R.id.textViewHeredia);

        staAnaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CentroActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        staAna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CentroActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        heredia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CentroActivity.this,HerediaActivity.class);
                startActivity(intent);
            }
        });

        herediaTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CentroActivity.this,HerediaActivity.class);
                startActivity(intent);
            }
        });
    }

}
