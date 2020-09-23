package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button save;
    EditText name, email, password, confirmpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = (Button)findViewById(R.id.save);
        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        confirmpassword=(EditText) findViewById(R.id.confirmpassword);

        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //this will check if any of the edit texts are empty
                if (name.getText().toString().isEmpty() || email.getText().toString().isEmpty() || password.getText().toString().isEmpty() || confirmpassword.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter all of the information.", Toast.LENGTH_SHORT).show();
                }
                //checks if the passwords match
                if(password.getText().toString().equals(confirmpassword.getText().toString())){
                    //if everything is ok then it will display the user's name
                    Toast.makeText(MainActivity.this, name.getText().toString(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Passwords do not match.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}