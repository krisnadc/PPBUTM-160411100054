package com.ina.moduldua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText pemesan, jumlah1, jumlah2, jumlah3, bayar2;
    TextView menu,sajian, jumlah, total2, kembalian2;
    CheckBox Arabica, Robusta, American ;
    RadioButton panas1, dingin1, panas2, dingin2, panas3, dingin3;
    Button tombol, cek;
    Double Ar, Ro, Am, total, bayari, kembalian;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pemesan=(EditText)findViewById(R.id.pemesan);
        jumlah1=(EditText)findViewById(R.id.jumlah1);
        jumlah2=(EditText)findViewById(R.id.jumlah2);
        jumlah3=(EditText)findViewById(R.id.jumlah3);
        bayar2=(EditText)findViewById(R.id.bayar2);

        menu=(TextView)findViewById(R.id.menu);
        sajian=(TextView)findViewById(R.id.sajian);
        jumlah=(TextView)findViewById(R.id.jumlah);
        total2=(TextView)findViewById(R.id.total2);
        kembalian2=(TextView)findViewById(R.id.kembalian2);

        Arabica=(CheckBox) findViewById(R.id.Arabica);
        Robusta=(CheckBox) findViewById(R.id.Robusta);
        American=(CheckBox) findViewById(R.id.American);

        panas1=(RadioButton)findViewById(R.id.panas1);
        panas2=(RadioButton)findViewById(R.id.panas2);
        panas3=(RadioButton)findViewById(R.id.panas3);
        dingin1=(RadioButton)findViewById(R.id.dingin1);
        dingin2=(RadioButton)findViewById(R.id.dingin2);
        dingin3=(RadioButton)findViewById(R.id.dingin3);

        cek=(Button)findViewById(R.id.cek);
        tombol=(Button)findViewById(R.id.tombol);

    }

    public void cek(View view) {
        Ar=0.0; Ro=0.0; Am=0.0; total=0.0; bayari=0.0; kembalian=0.0;

        if (Arabica.isChecked()){
            Ar=Double.parseDouble(jumlah1.getText().toString())*5000;
            if (panas1.isChecked()){
                Ar=Double.parseDouble(jumlah1.getText().toString())*5000+1000;
            }
            if (dingin1.isChecked()){
                Ar=Double.parseDouble(jumlah1.getText().toString())*5000+2000;
            }
        }
        if (Robusta.isChecked()){
            Ro=Double.parseDouble(jumlah2.getText().toString())*6000;
            if (panas2.isChecked()){
                Ro=Double.parseDouble(jumlah2.getText().toString())*6000+1000;
            }
            if (panas2.isChecked()){
                Ro=Double.parseDouble(jumlah2.getText().toString())*6000+2000;
            }
        }
        if (American.isChecked()){
            Am=Double.parseDouble(jumlah3.getText().toString())*7000;
            if (panas3.isChecked()){
                Am=Double.parseDouble(jumlah3.getText().toString())*7000+1000;
            }
            if (panas3.isChecked()){
                Am=Double.parseDouble(jumlah3.getText().toString())*7000+2000;
            }
        }
        total=Ar+Ro+Am;
        total2.setText(Double.toString(total));
    }



    public void tombol(View view) {
        bayari=Double.parseDouble(bayar2.getText().toString());
        kembalian=bayari-total;
        kembalian2.setText(Double.toString(kembalian));
        if (bayari<total){
            Toast.makeText(this,pemesan.getText().toString()+" Mohon Maaf Uang anda kurang Rp. " + (kembalian*-1), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Terima Kasih,"+pemesan.getText().toString()+" Transaksi berhasil. Kembalian Rp. " +kembalian, Toast.LENGTH_LONG).show();
        }


    }
}
