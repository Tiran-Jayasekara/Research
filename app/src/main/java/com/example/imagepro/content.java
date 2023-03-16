package com.example.imagepro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class content extends AppCompatActivity {

    private Button nexttofront;
    private Button nexttofront2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        nexttofront = (Button) findViewById(R.id.nexttofront);
        nexttofront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrontPage();
            }
        });

        nexttofront2 = (Button) findViewById(R.id.nexttofront2);
        nexttofront2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                summery();
            }
        });
    }
    public void FrontPage(){
        Intent intent = new Intent(this, FrontPage.class);
        startActivity(intent);
    }

    public void summery(){
        Intent intent = new Intent(this,summery.class);
        startActivity(intent);
    }
}