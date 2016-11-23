package com.example.chango.controlescompuestos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ControlLogin ctlControlLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ctlControlLogin = (ControlLogin)findViewById(R.id.CtlLogin);
        ctlControlLogin.setOnLoginListener(new OnLoginListener(){
            @Override
            public void onLogin(String usuario, String password){
                if (usuario.equals("demo") && password.equals("demo"))
                    ctlControlLogin.setMensaje("Login correcto!");
                else
                    ctlControlLogin.setMensaje("Vuelva a intentarlo.");
            }
        });
    }
}
