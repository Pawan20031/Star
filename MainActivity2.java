package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    EditText editText1;
    TextView textView;
    Button button;
   // EditText editText2;
    String e[]={"B","KB","MB","GB","TB","PB"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spinner1=findViewById(R.id.spinner1);
        spinner2=findViewById(R.id.spinner2);
        editText1=findViewById(R.id.edittext1);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView4);
        //editText2=findViewById(R.id.edittext2);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,e);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double tot;
                Double amount=Double.parseDouble(editText1.getText().toString());

                if (spinner1.getSelectedItem().toString()==e[0] && spinner2.getSelectedItem().toString()==e[1]){
                    tot=amount*0.000976525;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[1] && spinner2.getSelectedItem().toString()==e[0]){
                    tot=amount*1024;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[0] && spinner2.getSelectedItem().toString()==e[2]){
                    tot=amount/1048576;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[2] && spinner2.getSelectedItem().toString()==e[0]){
                    tot=amount*1048576;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[0] && spinner2.getSelectedItem().toString()==e[3]){
                    tot=amount/1.07374182e9;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[3] && spinner2.getSelectedItem().toString()==e[0]){
                    tot=amount*1.07374182e9;
                    textView.setText("the corresponding value is : "+tot);

                }
                else if (spinner1.getSelectedItem().toString()==e[0] && spinner2.getSelectedItem().toString()==e[4]){
                    tot=amount*9.09494702e-13;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[4] && spinner2.getSelectedItem().toString()==e[0]){
                    tot=amount/9.09494702e-13;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[0] && spinner2.getSelectedItem().toString()==e[5]){
                    tot=amount*8.8817842e-16;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[5] && spinner2.getSelectedItem().toString()==e[0]){
                    tot=amount/8.8817842e-16;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[1] && spinner2.getSelectedItem().toString()==e[2]){
                    tot=amount*0.000976525;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[2] && spinner2.getSelectedItem().toString()==e[1]){
                    tot=amount*1024;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[1] && spinner2.getSelectedItem().toString()==e[3]){
                    tot=amount*9.53674316e-7;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[3] && spinner2.getSelectedItem().toString()==e[1]){
                    tot=amount/9.53674316e-7;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[1] && spinner2.getSelectedItem().toString()==e[4]){
                    tot=amount*9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[4] && spinner2.getSelectedItem().toString()==e[1]){
                    tot=amount/9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[1] && spinner2.getSelectedItem().toString()==e[5]){
                    tot=amount*9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[5] && spinner2.getSelectedItem().toString()==e[1]){
                    tot=amount/9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[2] && spinner2.getSelectedItem().toString()==e[3]){
                    tot=amount*0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[3] && spinner2.getSelectedItem().toString()==e[2]){
                    tot=amount/0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[2] && spinner2.getSelectedItem().toString()==e[4]){
                    tot=amount*9.53674316e-7;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[4] && spinner2.getSelectedItem().toString()==e[2]){
                    tot=amount/9.53674316e-7;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[2] && spinner2.getSelectedItem().toString()==e[5]){
                    tot=amount*9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[5] && spinner2.getSelectedItem().toString()==e[2]){
                    tot=amount/9.3122575e-10;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[3] && spinner2.getSelectedItem().toString()==e[4]){
                    tot=amount*0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[4] && spinner2.getSelectedItem().toString()==e[3]){
                    tot=amount/0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[3] && spinner2.getSelectedItem().toString()==e[5]){
                    tot=amount*9.53674316e-7;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[4] && spinner2.getSelectedItem().toString()==e[5]){
                    tot=amount*0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else if (spinner1.getSelectedItem().toString()==e[5] && spinner2.getSelectedItem().toString()==e[4]){
                    tot=amount/0.0009765625;
                    textView.setText("the corresponding value is : "+tot);
                }
                else {
                    Toast.makeText(MainActivity2.this, "no results", Toast.LENGTH_SHORT).show();
                }



            }
        });






    }
}