package com.example.wpmidspring2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private String name,id,number;
    private TextView phoneNumberTV,resultTV;
    private String semister = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        name = getIntent().getStringExtra(StartActivity.NAME);
        id = getIntent().getStringExtra(StartActivity.ID);
        number = getIntent().getStringExtra(StartActivity.NUMBER);

        phoneNumberTV = findViewById(R.id.phoneNumberTV);
        resultTV = findViewById(R.id.resultTV);

        if(!number.isEmpty()){
            phoneNumberTV.setText("My Phone Number is: "+number);
        }
        else {
            phoneNumberTV.setText("My Phone Number");
        }

    }

    public void ProcessInfo(View view) {

       int lastDigit = lastDigit(Integer.valueOf(number));

       if(lastDigit%2 == 0){
           String firstTwoDigit = firstTwoDigit(id);
           String thirdChar = String.valueOf(id.charAt(2));
           if(thirdChar.equals("1")){
               semister = "Spring";
               resultTV.setText(name+" has admitted in "+semister+" 20"+firstTwoDigit+".");
           }
           else if(thirdChar.equals("2")){
               semister = "Summer";
               resultTV.setText(name+" has admitted in "+semister+" 20"+firstTwoDigit+".");
           }
           else if(thirdChar.equals("3")){
               semister = "Fall";
               resultTV.setText(name+" has admitted in "+semister+" 20"+firstTwoDigit+".");
           }
           else {
               resultTV.setText("Invalid ID input");
           }


       }
       else {
           String departmentID = DepartmentID(id);
           if(departmentID.equals("15")){
               resultTV.setText(name+" has admitted in CSE Department.");
           }
           else if(departmentID.equals("14")){
               resultTV.setText(name+" has admitted in Software Engineering Department.");
           }
           else if(departmentID.equals("13")){
               resultTV.setText(name+" has admitted in BBA Department.");
           }
           else if(departmentID.equals("12")){
               resultTV.setText(name+" has admitted in English Department.");
           }
           else if(departmentID.equals("11")){
               resultTV.setText(name+" has admitted in Pharmacy Department.");
           }
           else {
               resultTV.setText("Invalid ID input");
           }

       }

    }

    public String DepartmentID(String id){
        return id.length() < 2 ? id : id.substring(4,6);
    }

    public  String firstTwoDigit(String id){
        return id.length() < 2 ? id : id.substring(0,2);
    }

    public int lastDigit(int number){
        return Math.abs(number) % 10;
    }
}