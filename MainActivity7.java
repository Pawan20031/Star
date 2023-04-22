package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    EditText editText;
    Spinner s1,s2;
    TextView t;
    Button but;
    String st[]={"Celcius C","Kelvin K","Fahrenheit F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        editText=findViewById(R.id.editTextNumberDecimal10);
        s1=findViewById(R.id.spinner6);
        s2=findViewById(R.id.spinner7);
        t=findViewById(R.id.textView19);
        but=findViewById(R.id.button6);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,st);
        s1.setAdapter(arrayAdapter);
        s2.setAdapter(arrayAdapter);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;
                String s=editText.getText().toString();
                Double a=Double.parseDouble(s);
                if (s1.getSelectedItem().toString()==st[0] && s2.getSelectedItem().toString()==st[1]){
                    tot=a+273.15;
                    t.setText("The Value in Kelvin is : "+tot);
                }
                else if (s1.getSelectedItem().toString()==st[1] && s2.getSelectedItem().toString()==st[0]){
                    tot=a-273.15;
                    t.setText("The Value in Celcius is : "+tot);
                }
                else if (s1.getSelectedItem().toString()==st[0] && s2.getSelectedItem().toString()==st[2]){
                    tot=(a*(9/5))+32;
                    t.setText("The Value in Fahrenheit is : "+tot);
                }
                else if (s1.getSelectedItem().toString()==st[2] && s2.getSelectedItem().toString()==st[0]){
                    tot=(a-32)*(5/9);
                    t.setText("The Value in Celcius is : "+tot);
                }
                else if (s1.getSelectedItem().toString()==st[1] && s2.getSelectedItem().toString()==st[2]){
                    tot=((a-273.15)*9/5)+32;
                    t.setText("The Value in Fahrenheit is : "+tot);
                }
                else if (s1.getSelectedItem().toString()==st[2] && s2.getSelectedItem().toString()==st[1]){
                    tot=((a-32)*(5/9))+273.15;
                    t.setText("The Value in Kelvin is : "+tot);
                }
                else{
                    Toast.makeText(MainActivity7.this, "NO RESULTS", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}