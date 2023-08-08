package com.example.viewmodelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView textView;
    MainActivityViewModel mainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        textView =findViewById(R.id.textView);
        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
        textView.setText("You clicked me: "+mainActivityViewModel.getInitialCounter() + " times");


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("You clicked : "+mainActivityViewModel.getCounter()+ " times");
            }
        });
    }
}