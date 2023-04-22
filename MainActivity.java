package com.example.star;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String a[]={"Data converter","Volume converter","Discount","Intrest","BMI","Temperature"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> ad=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,a);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);
                }
                else if (i==1){
                    Intent intent=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }
                else if (i==2){
                    Intent intent=new Intent(MainActivity.this,MainActivity4.class);
                    startActivity(intent);
                }
                else if(i==3) {
                    Intent intent=new Intent(MainActivity.this,MainActivity5.class);
                    startActivity(intent);
                }
                else if(i==4) {
                    Intent intent=new Intent(MainActivity.this,MainActivity6.class);
                    startActivity(intent);
                }
                else if(i==5) {
                    Intent intent=new Intent(MainActivity.this,MainActivity7.class);
                    startActivity(intent);
                }


            }
        });
    }
}