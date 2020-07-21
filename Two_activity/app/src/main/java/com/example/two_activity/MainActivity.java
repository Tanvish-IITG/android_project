package com.example.two_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemClickListener{
    ArrayAdapter<String> Adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView = (ListView)findViewById(R.id.listView);
        Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        Adapter.add("Amazon");
        Adapter.add("Google");
        Adapter.add("Flipcart");
        Adapter.add("Microsoft");
        listView.setAdapter(Adapter);


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = Adapter.getItem(position);
        Toast.makeText(this,item,Toast.LENGTH_LONG).show();
        Intent INTENT = new Intent(MainActivity.this,second.class);
        startActivity(INTENT);
        
    }


}
