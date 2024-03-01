package com.example.unitconvetot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private TextView textView3;
    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        textView3 = findViewById(R.id.textView3);
        editText1 = findViewById(R.id.editText1);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int kg= Integer.parseInt(s);
                double pound=2.205 *kg;
                textView3.setText("the corresponding value in pound" +pound);
                Toast.makeText(MainActivity.this, "thank gor using this app", Toast.LENGTH_SHORT).show();
            }
        });


    }
}