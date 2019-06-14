package com.example.dell.cynosurefinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell.cynosurefinal.test.MainActivityTodolist;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpeedreader();
            }
        });
    }
    public void openSpeedreader() {
        Intent intent = new Intent(this, com.example.dell.cynosure.speedreader.DisplayTemplateTextActivity.class);
        startActivity(intent);
    }
}

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSpeedreader();
            }
        });
    }
    public void openSpeedreader() {
        Intent intent = new Intent(this, MainActivityTodolist.class);
        startActivity(intent);
    }
}
