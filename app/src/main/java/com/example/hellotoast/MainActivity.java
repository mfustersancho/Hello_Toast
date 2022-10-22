package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnCount;
    private Button btnToast;
    private TextView txtCount;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.button_count);
        btnToast = findViewById(R.id.button_toast);
        txtCount = findViewById(R.id.show_count);

        btnCount.setOnClickListener(e -> { upCount(); });

        btnToast.setOnClickListener(e -> { showToast(); });
    }

    private void upCount() {
        if(++count > 9) {
            count = 0;
        }
        txtCount.setText(String.valueOf(count));
    }

    private void showToast() {
        Toast
            .makeText(this, "Contador: " + String.valueOf(count), Toast.LENGTH_SHORT)
            .show();
    }

}