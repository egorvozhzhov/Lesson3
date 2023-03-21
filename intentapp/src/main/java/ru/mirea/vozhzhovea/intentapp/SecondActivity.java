package ru.mirea.vozhzhovea.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = (String) getIntent().getSerializableExtra("time");
        String string = String.format("Квадрат значения моего номера по списку составляет 64, а текущее время: %s", text);
        TextView textView = findViewById(R.id.textView);
        textView.setText(string);
    }
}