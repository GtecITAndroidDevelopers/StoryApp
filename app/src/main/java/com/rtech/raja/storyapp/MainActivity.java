package com.rtech.raja.storyapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
    private EditText mNameField; //creating member variable for class Edittext to access that edittext
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNameField = (EditText)findViewById(R.id.editText);
        mButton = (Button)findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mName = mNameField.getText().toString();
                Toast.makeText(MainActivity.this,mName,Toast.LENGTH_LONG).show();
            }
        });
    }



}
