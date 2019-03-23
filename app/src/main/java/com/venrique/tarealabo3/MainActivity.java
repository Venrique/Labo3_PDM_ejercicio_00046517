package com.venrique.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.venrique.tarealabo3.utils.AppConstant;

public class MainActivity extends AppCompatActivity {

    private EditText user,pass,email,gender;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.txt_user);
        pass = findViewById(R.id.txt_pass);
        email = findViewById(R.id.txt_email);
        gender = findViewById(R.id.txt_gen);
        save = findViewById(R.id.btn_save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = user.getText().toString();
                String contra = pass.getText().toString();
                String correo = email.getText().toString();
                String genero = gender.getText().toString();

                Bundle info = new Bundle();
                info.putString(AppConstant.EXTRA_USER,usuario);
                info.putString(AppConstant.EXTRA_PASS,contra);
                info.putString(AppConstant.EXTRA_EMAIL,correo);
                info.putString(AppConstant.EXTRA_GENDER,genero);

                Intent mIntent = new Intent(MainActivity.this,InfoActivity.class);
                mIntent.putExtras(info);
                startActivity(mIntent);
            }
        });

    }
}
