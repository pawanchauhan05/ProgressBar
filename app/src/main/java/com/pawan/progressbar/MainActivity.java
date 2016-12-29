package com.pawan.progressbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void usingXML(View view) {
        intent = new Intent(this, XMLActivity.class);
        startActivity(intent);
    }

    public void usingJAVA(View view) {
        intent = new Intent(this, JavaActivity.class);
        startActivity(intent);
    }

    public void usingCustom(View view) {
        intent = new Intent(this, CustomActivity.class);
        startActivity(intent);
    }
}
