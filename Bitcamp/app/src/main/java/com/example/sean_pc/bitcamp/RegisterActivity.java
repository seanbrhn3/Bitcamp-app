package com.example.sean_pc.bitcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       final EditText userNameReg = (EditText) findViewById(R.id.userNameReg);
       final EditText pswdReg = (EditText) findViewById(R.id.pswdReg);
       final EditText pswdRegConf = (EditText) findViewById(R.id.pswdRegConf);
        //if the two password fields arent the same then throw an error
        //else let them submit
        if(pswdReg.equals(pswdRegConf)){
            }else{

            }
    }
    public void BackonClick(View view){
        Intent bintent = new Intent(RegisterActivity.this, Camp.class);
        startActivity(bintent);
    }
}
