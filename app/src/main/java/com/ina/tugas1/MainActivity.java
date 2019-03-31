package com.ina.tugas1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtV;
    EditText edit1, edit2;
    double view1,view2,hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.Edit1);
        edit2=(EditText)findViewById(R.id.Edit2);
        txtV=(TextView)findViewById(R.id.hasilnya);
    }

    public void konver(){
        view1=Double.parseDouble(edit1.getText().toString());
        view2=Double.parseDouble(edit2.getText().toString());
    }

    public void iya(View view) {
        konver();
        hasil=view1/((view2/100)*(view2/100));
        if (hasil < 18.5){
            txtV.setText(Double.toString(hasil)+" Underweight");
        }
        else if (hasil >= 18.5 && hasil <= 24.9){
            txtV.setText(Double.toString(hasil)+" Normal Weight");
        }
        else if (hasil >= 25 && hasil <= 29.9){
            txtV.setText(Double.toString(hasil)+" Over weight");
        }
        else if (hasil >= 30 && hasil <= 34.9){
            txtV.setText(Double.toString(hasil)+" Obesity 1");
        }
        else if (hasil >= 35 && hasil <= 39.9){
            txtV.setText(Double.toString(hasil) + " Obesity 2");
        }
        else{
            txtV.setText(Double.toString(hasil)+ " Obesity 3");
        }
    }
}
