package com.example.labirin.bodymassindex;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Labirin on 6/17/2017.
 */


import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.labirin.bodymassindex.R;

public class FirstActivity extends Activity implements OnClickListener {

    TextView txtBerat, txtTinggi, txtHasil, txtKeterangan1,txtKeterangan2;
    EditText edBerat, edTinggi;
    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        txtBerat = (TextView) findViewById(R.id.txtBerat);
        edBerat = (EditText) findViewById(R.id.edBerat);
        txtTinggi = (TextView) findViewById(R.id.txtTinggi);
        edTinggi = (EditText) findViewById(R.id.edTinggi);
        btHitung = (Button) findViewById(R.id.btHitung);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        txtKeterangan1 = (TextView) findViewById(R.id.txtKeterangan1);
        txtKeterangan2 = (TextView) findViewById(R.id.txtKeterangan2);



        btHitung.setOnClickListener(this);

    }

    public void onClick(View v) {
        String hasil = "";
        Double hitung = 0.0;
        if (v.getId() == btHitung.getId()) {
            try {
                Double x1 = Double.parseDouble(edBerat.getText().toString());
                Double x2 = Double.parseDouble(edTinggi.getText().toString());
                Double hitung1 = x2 / 100;
                hitung = (x1 / (hitung1 * hitung1));
                hasil = String.valueOf(hitung);
                // txtHasil = String.valueOf(hasil);


            } catch (Exception e) {
                e.printStackTrace();
            }

            if (hitung == 0.0) {
                txtKeterangan1.setText("Input your height and weight".toString());
            } else if (hitung <= 18.5) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Underwight".toString());
            } else if (hitung <= 24.5) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Normal".toString());
            } else if (hitung <= 29.5) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Overweight".toString());
            } else if (hitung <= 34.5) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Obese 1".toString());
            } else if (hitung <= 39.5) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Obese 2".toString());
            } else if (hitung >= 40) {
                txtKeterangan1.setText(hasil.toString());
                txtKeterangan2.setText("Obese 3".toString());
            }

        }
    }

    public void hapus (View arg0) {
        edBerat.setText("");
        edTinggi.setText("");
        txtKeterangan1.setText("");
        txtKeterangan2.setText("");
        edTinggi.setFocusable(true);
    }


    public boolean onCreateOptionMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        //      getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}