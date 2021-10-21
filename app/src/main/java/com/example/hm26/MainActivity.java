package com.example.hm26;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText gmail,pin;
    private Button tap;
    private TextView text1,text2,text3;
    String email = "admin@gmail.com";
    String pincod = "admin";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gmail = findViewById(R.id.box3);
        pin = findViewById(R.id.box4);
        tap = findViewById(R.id.button1);
        text1 = findViewById(R.id.exit2);
        text2 = findViewById(R.id.parol);
        text3 = findViewById(R.id.tap);
        tap.setOnClickListener(view -> {
            if (gmail.getText().toString().equals(email)&&pin.getText().toString().equals(pincod)) {
                gmail.setVisibility(View.GONE);
                pin.setVisibility(View.GONE);
                tap.setVisibility(View.GONE);
                text1.setVisibility(View.GONE);
                text2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                Toast.makeText(this, "Вы успешно зашли", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,"Неправильные данные!",Toast.LENGTH_SHORT).show();
            }
        });
        gmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void afterTextChanged(Editable s) {

                if (gmail.getText().toString().length()>0){
                    tap.setBackgroundColor(getColor(R.color.orange));
                } else {
                    tap.setBackgroundColor(getColor(R.color.grey));

                }
            }
        });
    }

}
