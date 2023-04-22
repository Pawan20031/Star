package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.Math;
public class MainActivity5 extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4;
    Button button1,button2;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        editText1=findViewById(R.id.editTextNumberDecimal5);
        editText2=findViewById(R.id.editTextNumberDecimal6);
        editText3=findViewById(R.id.editTextNumberDecimal7);
        editText4=findViewById(R.id.editTextNumberDecimal8);
        textView1=findViewById(R.id.textView13);
        textView2=findViewById(R.id.textView14);
        button1=findViewById(R.id.button3);
        button2=findViewById(R.id.button4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=editText1.getText().toString();
                String b=editText4.getText().toString();
                String c=editText3.getText().toString();
                Double i=Double.parseDouble(a);
                Double j=Double.parseDouble(b);
                Double k=Double.parseDouble(c);
                if(k>0){
                    Double si=(i*j*k)/100;
                    textView2.setText("SIMPLE INTREST :"+si);
                }
                else{
                    Toast.makeText(MainActivity5.this, "Time should positive and not be null", Toast.LENGTH_SHORT).show();
                }



            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=editText1.getText().toString();
                String b=editText4.getText().toString();
                String c=editText3.getText().toString();
                String d=editText2.getText().toString();
                Double i=Double.parseDouble(a);
                Double j=Double.parseDouble(b);
                int k=Integer.parseInt(c);
                int l=Integer.parseInt(d);
                if(k>0 && l!=0){
                    Double ci=(i*(Math.pow((1+(j/l)),(k*l))));
                    textView1.setText("COMPOUND INTREST :"+ci);
                }
                else if(l==0){
                    Toast.makeText(MainActivity5.this, "Enter frequency(number of times compounded in per time period(t))", Toast.LENGTH_SHORT).show();
                }
                else if(k<=0){
                    Toast.makeText(MainActivity5.this, "Time should positive and not be null", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}