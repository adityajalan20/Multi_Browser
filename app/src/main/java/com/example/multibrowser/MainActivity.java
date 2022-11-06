package com.example.multibrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void google(View v)
    {
        Intent google = new Intent(this,GOOGLE.class);
        startActivity(google);
    }

    public void bing(View v)
    {
        Intent google = new Intent(this,BING.class);
        startActivity(google);
    }
    public void opera(View v)
    {
        Intent opera = new Intent(this,OPERA.class);
        startActivity(opera);
    }


}