package com.example.multibrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BING extends AppCompatActivity {
    Button b1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing);
        b1 = findViewById(R.id.button5);
        et2 = findViewById(R.id.editTextTextPersonName2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String b = et2.getText().toString();
                Intent i1 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.bing.com/search?q="+b));
                startActivity(i1);
            }
        });


    }


}