package com.example.random_number;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.random_number.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int secretNumber;

    TextView tvInfo;
    EditText etNumber;
    Button btnGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvInfo = findViewById(R.id.tvInfo);
        etNumber = findViewById(R.id.etNumber);
        btnGuess = findViewById(R.id.btnGuess);

        Random random = new Random();
        secretNumber = random.nextInt(101);

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etNumber.getText().toString();

                if (text.isEmpty()) {
                    tvInfo.setText(R.string.error);
                    return;
                }

                int userNumber = Integer.parseInt(text);

                if (userNumber < 0 || userNumber > 100) {
                    tvInfo.setText(R.string.error);
                    return;
                }

                if (userNumber < secretNumber) {
                    tvInfo.setText(R.string.ahead);
                } else if (userNumber > secretNumber) {
                    tvInfo.setText(R.string.behind);
                } else {
                    tvInfo.setText(R.string.hit);
                }

                etNumber.setText("");
            }
        });
    }
}