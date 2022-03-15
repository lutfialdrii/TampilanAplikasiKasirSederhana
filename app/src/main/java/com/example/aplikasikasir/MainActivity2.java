package com.example.aplikasikasir;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private TextView tvJumlahBayar, tvHarga,tvNamaBarang, tvTotal, tvDiskon;
    private EditText etKodeBarang, etJumlah, etKodeDiskon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        etKodeBarang = findViewById(R.id.etKodeBarang);
        etJumlah = findViewById(R.id.etJumlah);
        Button btnHitung = findViewById(R.id.btnHitung);
        tvJumlahBayar = findViewById(R.id.tvJumlahBayar);
        tvNamaBarang = findViewById(R.id.tvNamaBarang);
        tvTotal = findViewById(R.id.tvTotal);
        tvDiskon = findViewById(R.id.tvDiskon);
        tvHarga = findViewById(R.id.tvHarga);


        btnHitung.setOnClickListener(this);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnHitung) {
            //proses menghitung
            String Kode = etKodeBarang.getText().toString().trim();
            String Jumlah = etJumlah.getText().toString().trim();
            String KodeDiskon = etKodeDiskon.getText().toString().trim();

            //Cek
            boolean tidakdiinput = false;
            if (TextUtils.isEmpty(Kode)) {
                tidakdiinput = true;
                etKodeBarang.setError("Tidak boleh kosong!");
            }
            if (TextUtils.isEmpty(Jumlah)) {
                tidakdiinput = true;
                etJumlah.setError("Tidak boleh kosong!");
            }
            if (TextUtils.isEmpty(KodeDiskon)) {
                tidakdiinput = true;
                etKodeDiskon.setError("Tidak boleh kosong!");
            }
            if (!tidakdiinput) {
                if (etKodeBarang.getText().toString().equals("AND")) {
                    String nama1 = "Android";
                    int harga1 = 1000000;
                    tvNamaBarang.setText(nama1);
                    tvHarga.setText(String.valueOf(harga1));

//                    int totalHarga = 1000000 * Integer.parseInt( etJumlah.getText().toString());
//                    tvTotal.setText("Rp. " + totalHarga);
//
//                    int Diskon = (totalHarga * Integer.parseInt(etKodeBarang.getText().toString().substring(3)))/ 100;
//                    tvDiskon.setText("Rp. "+ Diskon);
//
//                    int JumlahBayar = totalHarga - Diskon;
//                    tvJumlahBayar.setText("Rp. " + JumlahBayar);
                }
            }
        }
    }
}