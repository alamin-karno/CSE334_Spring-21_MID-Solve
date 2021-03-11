package com.example.wpmidspring2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class StartActivity extends AppCompatActivity {

    private EditText nameET,idET,numberET;
    private String name,id,number;
    public static String NAME = "Name";
    public static String ID = "Id";
    public static String NUMBER = "Number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        nameET = findViewById(R.id.nameET);
        idET = findViewById(R.id.studentIDET);
        numberET = findViewById(R.id.numberET);
    }

    public void GoToNext(View view) {
        name = nameET.getText().toString();
        id = idET.getText().toString();
        number = numberET.getText().toString();

        Intent intent = new Intent(StartActivity.this,InfoActivity.class);
        intent.putExtra(NAME,name);
        intent.putExtra(ID,id);
        intent.putExtra(NUMBER,number);
        startActivity(intent);
    }
}