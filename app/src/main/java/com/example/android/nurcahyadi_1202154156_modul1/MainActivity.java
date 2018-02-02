package com.example.android.nurcahyadi_1202154156_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    EditText mNamaMenu,mBanyakPesanan;
    Button mButtonEatbus, mButtonAbnormal;
    private TextView tmptmakan;

    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaMenu = findViewById(R.id.ketikmenu);
        mBanyakPesanan = findViewById(R.id.ketikjumlah);
        mButtonEatbus = findViewById(R.id.buttoneatbus);
        mButtonAbnormal = findViewById(R.id.buttonabnormal);

        mButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent pindah = new Intent(MainActivity.this, secondActivity.class);
                    pindah.putExtra("tempat","Eatbus");
                    pindah.putExtra("namamenu", mNamaMenu.getText().toString());
                    pindah.putExtra("jumlahmakanan", mBanyakPesanan.getText().toString());
                    pindah.putExtra("harga", "50000");
                    startActivity(pindah);

            }
        });

        mButtonAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                  Intent pindah = new Intent(MainActivity.this,secondActivity.class);
                  pindah.putExtra("tempat","Abnormal");
                  pindah.putExtra("namamenu",mNamaMenu.getText().toString());
                  pindah.putExtra("jumlahmakanan",mBanyakPesanan.getText().toString());
                  pindah.putExtra("harga", "30000");

                  startActivity(pindah);




            }
        });
    }




}
