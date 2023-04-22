package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Spinner spinner1,spinner2;
    EditText editText;
    Button button;
    TextView textView;
    String rr[]={"Cubic meter m^3","Cubic decimeter dm^3","Cubic centimeter cm^3","Cubic millimeter mm^3","Liter l","Deciliter dl","Centiliter dl"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        spinner1=findViewById(R.id.spinner);
        spinner2=findViewById(R.id.spinner3);
        button=findViewById(R.id.button2);
        editText=findViewById(R.id.editTextNumberDecimal);
        textView=findViewById(R.id.textView);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,rr);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;
                String s=editText.getText().toString();
                Double amount=Double.parseDouble(s);
                if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[1]) {
                    tot=amount*1000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);

                }
                else if (spinner1.getSelectedItem().toString() == rr[1] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/1000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount*1000000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[2] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/1000000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount*1000000000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[3] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/1000000000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount*1000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[4] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/1000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount*10000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[5] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/10000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[0] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount*100000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[0]){
                    tot=amount/100000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[1] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount*1000;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[2] && spinner2.getSelectedItem().toString()==rr[1]){
                    tot=amount/1000;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[1] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount*1000000;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[3] && spinner2.getSelectedItem().toString()==rr[1]){
                    tot=amount/1000000;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[1] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount*1;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[4] && spinner2.getSelectedItem().toString()==rr[1]){
                    tot=amount/1;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[1] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount*10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[5] && spinner2.getSelectedItem().toString()==rr[1]){
                    tot=amount/10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[1] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount*100;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[1]){
                    tot=amount/100;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[2] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount*1000;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[3] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount/1000;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[2] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount*0.001;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[4] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount/0.001;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[2] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount*0.01;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[5] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount/0.01;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[2] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount*1;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[2]){
                    tot=amount/1;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[3] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount*1e-6;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[4] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount/1e-6;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[3] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount*1e-5;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==rr[5] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount/1e-5;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[3] && spinner2.getSelectedItem().toString()==rr[3]){
                    tot=amount*0.0001;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount/0.0001;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[4] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount*10;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[5] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount/10;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[4] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount*100;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[4]){
                    tot=amount/100;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }

                else if (spinner1.getSelectedItem().toString()==rr[5] && spinner2.getSelectedItem().toString()==rr[6]){
                    tot=amount*10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString() == rr[6] && spinner2.getSelectedItem().toString()==rr[5]){
                    tot=amount/10;
                    textView.setText("THE CORRESPONDING VALUE : "+tot);
                }
                else {
                    Toast.makeText(MainActivity3.this, "no results", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }
}