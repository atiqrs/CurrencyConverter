package com.atiqrs.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String wantConvert,converted;
    Double AmountInDoller,AmountInTaka;

    EditText wantToConvert;
    Button convertBtn;
    TextView convertedAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wantToConvert = findViewById(R.id.wantToConvert);
        convertedAmount = findViewById(R.id.convertedAmount);
        convertBtn = findViewById(R.id.convertBtn);

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CurrencyConvert();
            }
        });
    }

    private void CurrencyConvert() {
        wantConvert = wantToConvert.getText().toString();

        AmountInDoller = Double.parseDouble(wantConvert);
        AmountInTaka = AmountInDoller * 84;

        String AmountInTakaString = String.format("%.2f",AmountInTaka);

        convertedAmount.setText(AmountInTakaString+" BDT");
        Toast.makeText(this, "Converted !", Toast.LENGTH_SHORT).show();
    }
}
