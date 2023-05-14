package com.example.dzz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText idEdext;
    private EditText mestoEdext;
    private EditText time1Edext;
    private EditText time2Edext;
    private EditText biletEdext;

    private Button button;

    private String id;
    private String mesto;
    private String time1;
    private String time2;
    private String bilet;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEdext = findViewById(R.id.id);
        mestoEdext = findViewById(R.id.mesto);
        time1Edext = findViewById(R.id.time1);
        time2Edext = findViewById(R.id.time2);
        biletEdext = findViewById(R.id.bilet);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                id = idEdext.getText().toString();
                mesto = mestoEdext.getText().toString();
                time1 = time1Edext.getText().toString();
                time2 = time2Edext.getText().toString();
                bilet = biletEdext.getText().toString();

                User user = new User(id, mesto, time1, time2, bilet);

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("user1", user);
                startActivity(intent);
            }
        });
    }
}