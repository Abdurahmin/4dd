package com.example.a4dd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnOpenFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOpenFragment = findViewById(R.id.btn_open_fragment);
        btnOpenFragment.setOnClickListener(new View.OnClickListener() {  @Override
        public void onClick(View v) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.container_fragment, FirstFragment.newInstance("TEXT 1", "TEXT 2"));
            transaction.commit();
        }
        });
    }
}

