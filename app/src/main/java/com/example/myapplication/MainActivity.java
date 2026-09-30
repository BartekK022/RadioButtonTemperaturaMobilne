package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editTextTemperatura;
    RadioButton radioButtonPrzeliczZCelsjusza, radioButtonPrzeliczZKalvina, radioButtonPrzeliczZFarenheita;
    RadioButton radioButtonPrzeliczNaCelsjusza, radioButtonPrzeliczNaKalvina, radioButtonPrzeliczNaFarenheita;
    Button buttonPrzelicz;
    TextView textViewWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextTemperatura = findViewById(R.id.editTextNumber);
        radioButtonPrzeliczZCelsjusza = findViewById(R.id.radioButton);
        radioButtonPrzeliczZKalvina = findViewById(R.id.radioButton2);
        radioButtonPrzeliczZFarenheita = findViewById(R.id.radioButton3);

        radioButtonPrzeliczNaCelsjusza = findViewById(R.id.radioButton4);
        radioButtonPrzeliczNaKalvina = findViewById(R.id.radioButton5);
        radioButtonPrzeliczNaFarenheita = findViewById(R.id.radioButton6);
        buttonPrzelicz = findViewById(R.id.button);
        textViewWynik = findViewById(R.id.textView3);

        buttonPrzelicz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(radioButtonPrzeliczZCelsjusza.isChecked() && radioButtonPrzeliczNaCelsjusza.isChecked()) {
                            textViewWynik.setText();
                        }
                    }
                }
        );

    }
}