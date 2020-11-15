package com.example.mycustomtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = (Button)findViewById(R.id.loginButtonId);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View customView = inflater.inflate(R.layout.custom_layout, (ViewGroup) findViewById(R.id.customToastId));
                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setView(customView);
                toast.show();
            }
        });
    }
}