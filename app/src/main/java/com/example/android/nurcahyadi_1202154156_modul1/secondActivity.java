package com.example.android.nurcahyadi_1202154156_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {
    TextView mNamaTempat;
    TextView mNamaMenu;
    TextView mbanyakjumlah;
    TextView mhasilHarga;
    private final int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mNamaTempat = findViewById(R.id.namatempat);
        mNamaMenu = findViewById(R.id.namamenu);
        mbanyakjumlah = findViewById(R.id.jumlahpesanan);
        mhasilHarga = findViewById(R.id.hargatotal1);


        Intent a = getIntent();

            String namaTempat=a.getStringExtra("tempat");
            String namaMenu=a.getStringExtra("namamenu");
            String jumlahMakanan=a.getStringExtra("jumlahmakanan");
            String Harga=a.getStringExtra("harga");

            int hasilharga = Integer.valueOf(Harga) * Integer.valueOf(jumlahMakanan);

            mNamaTempat.setText(namaTempat);
            mNamaMenu.setText(namaMenu);
            mbanyakjumlah.setText(jumlahMakanan);
            mhasilHarga.setText(String.valueOf(hasilharga));

        if (hasilharga <= uang) {
            Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }




    }

    }

