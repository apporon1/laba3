package com.example.laba3;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ShowDataActivity extends AppCompatActivity {

    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);

        dbHelper = new DatabaseHelper(this);

        TextView textViewData = findViewById(R.id.textView_data);

        Cursor cursor = dbHelper.getAllStudents();
        StringBuilder data = new StringBuilder();

        if (cursor.moveToFirst()) {
            do {
                int id = cursor.getInt(cursor.getColumnIndex(DatabaseHelper.COLUMN_ID));
                String name = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME));
                String timestamp = cursor.getString(cursor.getColumnIndex(DatabaseHelper.COLUMN_TIMESTAMP));
                data.append("ID: ").append(id)
                        .append(", ФИО: ").append(name)
                        .append(", Время: ").append(timestamp)
                        .append("\n");
            } while (cursor.moveToNext());
        }
        cursor.close();

        textViewData.setText(data.toString());
    }
}
