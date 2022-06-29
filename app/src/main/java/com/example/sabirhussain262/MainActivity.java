package com.example.sabirhussain262;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Adapter adapter;
    RecyclerView recyclerView;
    String name[]={"Sabir","Babar"};
    String rollno[]={"BCSM-F19-262","BCSM-F19-260"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView=findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter= new Adapter(name,rollno,this);
        recyclerView.setAdapter(adapter);

        Button btn= (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}