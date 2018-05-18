package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addWordOnClick(View v){
        EditText edit = (EditText)findViewById(R.id.editText); // edit text field

        TextView textv = (TextView)findViewById(R.id.textView); // the view text field

        String result = edit.getText().toString(); // getting the text in edit text field

        textv.setText(result); // setting the word to the view text
    }
}
