package com.android.esgi.tp_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button submitBtn = (Button) findViewById(R.id.submit);
        final EditText formName = (EditText) findViewById(R.id.name);
        final EditText formFirstname = (EditText) findViewById(R.id.firstname);
        final EditText formEmail = (EditText) findViewById(R.id.email);

        submitBtn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        Log.v("formName value=", formName.getText().toString());
                        Log.v("formFirstname value=", formFirstname.getText().toString());
                        Log.v("formEmail value=", formEmail.getText().toString());
                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                        startActivity(intent);
                    }
                });
    }
}
