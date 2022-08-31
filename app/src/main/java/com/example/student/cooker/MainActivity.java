package com.example.student.cooker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView cooker,a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cooker = (ImageView) findViewById(R.id.cooker);
        a = (ImageView) findViewById(R.id.a);
        cooker.setOnClickListener(this);
        a.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cooker){
            cooker.setVisibility(View.GONE);
            a.setVisibility(View.VISIBLE);
        }

    }
}
