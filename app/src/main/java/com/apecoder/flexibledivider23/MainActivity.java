package com.apecoder.flexibledivider23;

import android.os.Bundle;

import com.apecoder.flexibledivider.VerticalDividerItemDecoration;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new VerticalDividerItemDecoration.Builder(this);
    }
}