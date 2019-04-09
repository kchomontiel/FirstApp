package com.creativityinmotion.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt_user=findViewById(R.id.txt_usuario);
                EditText txt_pass=findViewById(R.id.txt_pass);

                String user="";
                String password="";

                String user2="Carlos";
                String password2="12345";

                user=txt_user.getText().toString();
                password=txt_pass.getText().toString();

                if(user.equals(user2) && password.equals(password2)){
                    Toast.makeText(MainActivity.this, "Usuario y contraseña correctas", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
