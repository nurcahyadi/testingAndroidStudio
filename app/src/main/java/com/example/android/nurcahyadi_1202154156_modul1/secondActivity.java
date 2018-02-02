package com.example.android.nurcahyadi_1202154156_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {

    TextView mNamaMenu;
    TextView mbanyakjumlah;
    TextView mhasilHarga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        mNamaMenu = findViewById(R.id.namamenu);
        mbanyakjumlah = findViewById(R.id.jumlahpesanan);
        mhasilHarga = findViewById(R.id.hargatotal1);


        Intent a = getIntent();


            mNamaMenu.setText(a.getStringExtra("menueatbus"));
            mbanyakjumlah.setText(a.getStringExtra("menueatbus2"));
            mhasilHarga.setText(a.getStringExtra("hargaeatbus"));
        Toast.makeText(this, "jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG).show();





    }

    }

