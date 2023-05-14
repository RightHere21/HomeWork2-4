package com.example.dzz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private User user;
    private TextView id;
    private TextView mesto;
    private TextView time1;
    private TextView time2;
    private TextView bilet;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        id = findViewById(R.id.id);
        mesto = findViewById(R.id.mesto);
        time1 = findViewById(R.id.time1);
        time2 = findViewById(R.id.time2);
        bilet = findViewById(R.id.bilet);
        button = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            user = (User) bundle.getSerializable("user1");

            id.setText("ID Пользователя " + user.getId());
            mesto.setText("Место " + user.getMesto());
            time1.setText("Время отправления " + user.getTime1());
            time2.setText("Время прибытия " + user.getTime2());
            bilet.setText("Стоимость билета " + user.getBilet());

        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}