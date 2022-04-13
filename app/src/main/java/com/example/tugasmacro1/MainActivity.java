package com.example.tugasmacro1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randomNumber = random.nextInt(20)+1;
    }

    public void tebak(View view){
        String pesan;
        try {
            EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
            int tebakNomor = Integer.parseInt(editTextNumber.getText().toString());
            if (tebakNomor > 20)
                pesan="Masukan Angka 1-20";
            else if (tebakNomor > randomNumber  )
                pesan="Terlalu Tinggi :D";
            else if (tebakNomor < randomNumber)
                pesan="Terlalu Kecil :D";
            else{
                pesan=("Tebakan Benar :D");
                randomNumberGenerator();
            }
            Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
        } catch (Exception e){
            Toast.makeText(this, "Masukan Angka 1-20",Toast.LENGTH_LONG).show();
        }
    }

    public void randomNumberGenerator(){
        Random random = new Random();
        randomNumber = random.nextInt(20)+1;
    }
}