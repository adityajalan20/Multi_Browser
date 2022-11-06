package com.example.multibrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OPERA extends AppCompatActivity {

    Button b3;
    EditText et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opera);

        b3 = findViewById(R.id.button6);
        et3 = findViewById(R.id.editTextTextPersonName3);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = et3.getText().toString();
                Intent i2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://duckduckgo.com/?q="+c));
                startActivity(i2);
            }
        });
    }
}