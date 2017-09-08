package com.example.mylianxi2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2=(Button)findViewById(R.id.button2) ;

        final Intent intent2=getIntent();
        final String text=intent2.getStringExtra("editt");
        final EditText et2=(EditText)findViewById(R.id.Edit2);
        et2.setText(text);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2.putExtra("ret","返回语句 : "+text);
                setResult(0,intent2);
                finish();
            }
        });
    }
}
