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

public class MainActivity6 extends AppCompatActivity {
    Spinner s1,s2;
    EditText e1,e2;
    Button bu;
    TextView t;
    String a[]={"Kilograms","Pounds"};
    String b[]={"Centemeters","meter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        s1=findViewById(R.id.spinner4);
        s2=findViewById(R.id.spinner5);
        e1=findViewById(R.id.editTextNumberDecimal4);
        e2=findViewById(R.id.editTextNumberDecimal9);
        t=findViewById(R.id.textView16);
        bu=findViewById(R.id.button5);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,a);
        s1.setAdapter(arrayAdapter);
        ArrayAdapter<String> arr=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,b);
        s2.setAdapter(arr);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=e1.getText().toString();
                String g=e2.getText().toString();
                Double x=Double.parseDouble(s);
                Double y=Double.parseDouble(g);
                Double tot;
                if(s1.getSelectedItem().toString()==a[0] && s2.getSelectedItem().toString()==b[0]){
                    tot=x/((y*100)*(y*100));
                    t.setText("BMI : "+tot);
                    if(tot<=18.5){
                        Toast.makeText(MainActivity6.this, "UNDERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<18.5 && tot>=24.9){
                        Toast.makeText(MainActivity6.this, "NORMAL", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<24.9 && tot>=29.9){
                        Toast.makeText(MainActivity6.this, "OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot>=30){
                        Toast.makeText(MainActivity6.this, " very OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }




                }
                else if (s1.getSelectedItem().toString()==a[0] && s2.getSelectedItem().toString()==b[1]){
                    tot=x/(y*y);
                    t.setText("BMI"+tot);
                    if(tot<=18.5){
                        Toast.makeText(MainActivity6.this, "UNDERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<18.5 && tot>=24.9){
                        Toast.makeText(MainActivity6.this, "NORMAL", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<24.9 && tot>=29.9){
                        Toast.makeText(MainActivity6.this, "OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot>=30){
                        Toast.makeText(MainActivity6.this, " very OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (s1.getSelectedItem().toString()==a[1] && s2.getSelectedItem().toString()==b[0]){
                    tot=(x*2.20462)/(y*y*10000);
                    t.setText("BMI"+tot);
                    if(tot<=18.5){
                        Toast.makeText(MainActivity6.this, "UNDERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<18.5 && tot>=24.9){
                        Toast.makeText(MainActivity6.this, "NORMAL", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<24.9 && tot>=29.9){
                        Toast.makeText(MainActivity6.this, "OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot>=30){
                        Toast.makeText(MainActivity6.this, " very OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                }
                else if (s1.getSelectedItem().toString()==a[1] && s2.getSelectedItem().toString()==b[1]){
                    tot=(x*2.20462)/(y*y);
                    t.setText("BMI"+tot);
                    if(tot<=18.5){
                        Toast.makeText(MainActivity6.this, "UNDERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<18.5 && tot>=24.9){
                        Toast.makeText(MainActivity6.this, "NORMAL", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot<24.9 && tot>=29.9){
                        Toast.makeText(MainActivity6.this, "OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                    else if(tot>=30){
                        Toast.makeText(MainActivity6.this, " very OVERWEIGHT", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity6.this, "NO RESULTS", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}