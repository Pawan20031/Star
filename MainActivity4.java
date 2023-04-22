package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivilegedAction;

public class MainActivity4 extends AppCompatActivity {
    private EditText editText1,editText2;
    private TextView textView1,textView2,textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        editText1=findViewById(R.id.editTextNumberDecimal2);
        editText2=findViewById(R.id.editTextNumberDecimal3);
        textView1=findViewById(R.id.textView10);
        textView2=findViewById(R.id.textView11);
        textView3=findViewById(R.id.textView12);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                String p=editText2.getText().toString();
                Double amt=Double.parseDouble(s);
                Double ant=Double.parseDouble(p);
                Double i=amt-((amt*ant)/100);
                textView2.setText(" "+i);
                Double j=amt-i;
                textView3.setText("You save "+j);

            }
        });
    }
}