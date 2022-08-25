package com.example.rkbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button bt;
    TextView username;
    EditText password;
    String User,Pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.button);
        username=findViewById(R.id.editUsername);
        password=findViewById(R.id.editPassword);
        getSupportActionBar().hide();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User = username.getText().toString();
                Pass = password.getText().toString();
                if(Objects.equals(User, "") || Pass.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                }
                else if(Objects.equals(User, "RKBWORLD") && Pass.equals("Raj@1234")) {
                    Intent intent = new Intent(MainActivity.this, secondActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Wrong Username Or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}