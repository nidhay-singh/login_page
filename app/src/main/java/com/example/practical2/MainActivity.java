package com.example.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        EditText txtuser, txtpass;
        txtuser = (EditText) findViewById(R.id.editText1);
        txtpass = (EditText) findViewById(R.id.editText2);
        String user = txtuser.getText().toString();
        String pass = txtpass.getText().toString();
        if(user.equals("admin") && pass.equals("1234"))
        {
            Toast.makeText(getApplicationContext(), "successful", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "unsuccessful", Toast.LENGTH_SHORT).show();
        }
    }

}