package com.venrique.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.venrique.tarealabo3.utils.AppConstant;

public class ShowActivity extends AppCompatActivity {

    private TextView user,pass,email,gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        user = findViewById(R.id.txt_user3);
        pass=findViewById(R.id.txt_pass3);
        email=findViewById(R.id.txt_email3);
        gender=findViewById(R.id.txt_gen3);

        Bundle datos = getIntent().getExtras();

        user.setText(datos.getString(AppConstant.EXTRA_USER));
        pass.setText(datos.getString(AppConstant.EXTRA_PASS));
        email.setText(datos.getString(AppConstant.EXTRA_EMAIL));
        gender.setText(datos.getString(AppConstant.EXTRA_GENDER));
    }
}
