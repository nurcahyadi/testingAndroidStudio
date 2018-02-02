package com.example.android.nurcahyadi_1202154156_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    TextView mNamaMenu1;
    TextView mbanyakjumlah1;
    TextView mhargaAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mNamaMenu1 = findViewById(R.id.namamenuabnormal);
        mbanyakjumlah1 = findViewById(R.id.jumlahpesananabnormal);
        mhargaAbnormal = findViewById(R.id.hargatotal);

        Intent a = getIntent();

            mNamaMenu1.setText(a.getStringExtra("menuabnormal"));
            mbanyakjumlah1.setText(a.getStringExtra("menuabnormal2"));
            mhargaAbnormal.setText(a.getStringExtra("hargaabnormal"));

            Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG).show();

    }
}
