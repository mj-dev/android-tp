package com.android.esgi.tp_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.android.esgi.tp_android.models.User;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {
    private ListView myListView;
    private List<String> listTest = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);

        // Create User
        User user = new User("nameTest","firstnameTest","emailTest","01/01/2001");

        listTest.add("TEST1");
        listTest.add("TEST2");
        listTest.add("TEST3");
        listTest.add("TEST4");
        listTest.add("TEST5");
        listTest.add("TEST6");
        listTest.add("TEST7");
        listTest.add("TEST8");
        listTest.add("TEST9");
        listTest.add("TEST10");

        myListView = (ListView) findViewById(R.id.list_view);

        final ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_single_choice, listTest);
        final SimpleAdapter<String> listAdapter2 = new SimpleAdapter<>(this, android.R.layout.simple_list_item_single_choice, listTest);
        myListView.setAdapter(listAdapter);
        myListView.setAdapter(listAdapter2);

    }
}
