package com.example.multibrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GOOGLE extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);
        et1 = findViewById(R.id.editTextTextPersonName);
    }
    public void launchgoogle(View v)
    {
        String a = et1.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q="+a));
        startActivity(i);

    }
}