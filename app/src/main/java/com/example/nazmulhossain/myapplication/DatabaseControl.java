package com.example.nazmulhossain.myapplication;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DatabaseControl extends AppCompatActivity {
    DatabaseHelper mydb;
    EditText name,description,disease;
    Button Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_control);
        mydb = new DatabaseHelper(this);
        name = (EditText) findViewById(R.id.editname);
        description = (EditText) findViewById(R.id.editdes);
        disease = (EditText) findViewById(R.id.editdis);
        Add = (Button) findViewById(R.id.addData);

        addData();
    }

    public void  addData(){
        Add.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        boolean isInserted = mydb.insertData(name.getText().toString(),description.getText().toString(),disease.getText().toString());
                        if (isInserted == true){
                            Toast.makeText(DatabaseControl.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        }
                        else{
                            Toast.makeText(DatabaseControl.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}