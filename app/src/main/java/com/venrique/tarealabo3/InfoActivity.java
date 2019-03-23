package com.venrique.tarealabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.venrique.tarealabo3.utils.AppConstant;

public class InfoActivity extends AppCompatActivity {

    private EditText user,pass,email,gen;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        user = findViewById(R.id.txt_user2);
        pass = findViewById(R.id.txt_pass2);
        email = findViewById(R.id.txt_email2);
        gen = findViewById(R.id.txt_gen2);
        share = findViewById(R.id.btn_share);

        Bundle info = getIntent().getExtras();

        user.setText(info.getString(AppConstant.EXTRA_USER));
        pass.setText(info.getString(AppConstant.EXTRA_PASS));
        email.setText(info.getString(AppConstant.EXTRA_EMAIL));
        gen.setText(info.getString(AppConstant.EXTRA_GENDER));

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle extras = new Bundle();
                /*extras.putString(Intent.EXTRA_TEXT,user.getText().toString());
                extras.putString(Intent.EXTRA_TEXT,pass.getText().toString());
                extras.putString(Intent.EXTRA_TEXT,email.getText().toString());
                extras.putString(Intent.EXTRA_TEXT,gen.getText().toString());*/

                extras.putString(AppConstant.EXTRA_USER,user.getText().toString());
                extras.putString(AppConstant.EXTRA_PASS,pass.getText().toString());
                extras.putString(AppConstant.EXTRA_EMAIL,email.getText().toString());
                extras.putString(AppConstant.EXTRA_GENDER,gen.getText().toString());

                Intent mIntent = new Intent();
                mIntent.setType("text/plain");
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.putExtras(extras);
                startActivity(mIntent);
            }
        });

    }
}
