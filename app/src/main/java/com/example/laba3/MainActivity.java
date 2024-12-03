package com.example.laba3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private DatabaseHelper DatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHelper = new DatabaseHelper(this);

        Button buttonShowData = findViewById(R.id.button_view);
        Button buttonAddStudent = findViewById(R.id.button_add);
        Button buttonUpdateStudent = findViewById(R.id.button_update);

        buttonShowData.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShowDataActivity.class);
            startActivity(intent);
        });

        buttonAddStudent.setOnClickListener(v -> {
            DatabaseHelper.addStudent("Новый студент");
        });

        buttonUpdateStudent.setOnClickListener(v -> {
            DatabaseHelper.updateLastStudent("Иванов Иван Иванович");
        });
    }
}
