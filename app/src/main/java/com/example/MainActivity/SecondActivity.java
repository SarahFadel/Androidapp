package com.example.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> arrayList= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView=(ListView)findViewById(R.id.listview);

        arrayList.add("android");
        arrayList.add("is");
        arrayList.add("great");
        arrayList.add("and");
        arrayList.add("I");
        arrayList.add("love");
        arrayList.add("it");
        arrayList.add("thanks");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(SecondActivity.this, "clicked item: " + position + " " + arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SecondActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });
       // Intent intent=new Intent(SecondActivity.this, EmptyActivity.class);
       // startActivity(intent);

    }
}
