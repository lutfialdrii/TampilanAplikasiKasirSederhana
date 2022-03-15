package com.example.aplikasikasir;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvJumlahBayar, tvHarga,tvBarang, tvTotal, tvDiskon, tvKodeBarang;
    private EditText etKodeBarang, etJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);

        etKodeBarang = findViewById(R.id.etKodeBarang);
        etJumlah = findViewById(R.id.etJumlah);
        Button btnHitung = findViewById(R.id.btnHitung);
        tvJumlahBayar = findViewById(R.id.tvJumlahBayar);
        tvBarang = findViewById(R.id.tvBarang);
        tvTotal = findViewById(R.id.tvTotal);
        tvDiskon = findViewById(R.id.tvDiskon);
        tvHarga = findViewById(R.id.tvHarga);
        tvKodeBarang = findViewById(R.id.tvKodeBarang);

        btnHitung.setOnClickListener(this);
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnHitung) {

            //Proses pengecekan inputan, bila kosong maka terdapat peringatan
            String Kode = etKodeBarang.getText().toString().trim();
            String Jumlah = etJumlah.getText().toString().trim();
            boolean tidakdiinput = false;
            if (TextUtils.isEmpty(Kode)) {
                tidakdiinput = true;
                etKodeBarang.setError("Tidak boleh kosong!");
            }
            if (TextUtils.isEmpty(Jumlah)) {
                tidakdiinput = true;
                etJumlah.setError("Tidak boleh kosong!");
            }

            //Logic
            if (!tidakdiinput) {
                String kodebarang = etKodeBarang.getText().toString().substring(0,3);
                String diskon = etKodeBarang.getText().toString().substring(3);
                switch (kodebarang) {
                    case "AND": {
                        String nama1 = "Android";
                        int harga1 = 1000000;
                        tvBarang.setText(nama1);
                        tvHarga.setText(String.valueOf(harga1));

                        tvKodeBarang.setText(kodebarang + diskon);

                        int totalHarga = harga1 * Integer.parseInt(etJumlah.getText().toString());
                        tvTotal.setText(String.valueOf(totalHarga));

                        int Diskon = (totalHarga * Integer.parseInt(diskon)) / 100;
                        tvDiskon.setText(String.valueOf(Diskon));

                        int JumlahBayar = totalHarga - Diskon;
                        tvJumlahBayar.setText(String.valueOf(JumlahBayar));
                        break;
                    }
                    case "IOS": {
                        String nama1 = "Apple";
                        int harga1 = 2000000;
                        tvBarang.setText(nama1);
                        tvHarga.setText(String.valueOf(harga1));

                        tvKodeBarang.setText(kodebarang + diskon);

                        int totalHarga = harga1 * Integer.parseInt(etJumlah.getText().toString());
                        tvTotal.setText(String.valueOf(totalHarga));

                        int Diskon = (totalHarga * Integer.parseInt(diskon)) / 100;
                        tvDiskon.setText(String.valueOf(Diskon));

                        int JumlahBayar = totalHarga - Diskon;
                        tvJumlahBayar.setText(String.valueOf(JumlahBayar));
                        break;
                    }
                    case "BLB": {
                        String nama1 = "Black Berry";
                        int harga1 = 1750000;
                        tvBarang.setText(nama1);
                        tvHarga.setText(String.valueOf(harga1));

                        tvKodeBarang.setText(kodebarang + diskon);

                        int totalHarga = harga1 * Integer.parseInt(etJumlah.getText().toString());
                        tvTotal.setText(String.valueOf(totalHarga));

                        int Diskon = (totalHarga * Integer.parseInt(diskon)) / 100;
                        tvDiskon.setText(String.valueOf(Diskon));

                        int JumlahBayar = totalHarga - Diskon;
                        tvJumlahBayar.setText(String.valueOf(JumlahBayar));
                        break;
                    }
                    case "WNP": {
                        String nama1 = "Windows Phone";
                        int harga1 = 2500000;
                        tvBarang.setText(nama1);
                        tvHarga.setText(String.valueOf(harga1));

                        tvKodeBarang.setText(kodebarang + diskon);

                        int totalHarga = harga1 * Integer.parseInt(etJumlah.getText().toString());
                        tvTotal.setText(String.valueOf(totalHarga));

                        int Diskon = (totalHarga * Integer.parseInt(diskon)) / 100;
                        tvDiskon.setText(String.valueOf(Diskon));

                        int JumlahBayar = totalHarga - Diskon;
                        tvJumlahBayar.setText(String.valueOf(JumlahBayar));
                        break;
                    }
                    default: {
                        String nama1 = "Tidak Terdefinisi";
                        tvBarang.setText(nama1);
                        tvHarga.setText(nama1);
                        tvKodeBarang.setText(nama1);
                        tvTotal.setText(nama1);
                        tvDiskon.setText(nama1);
                        tvJumlahBayar.setText(nama1);

                        break;
                    }
                }
            }
        }
    }
}