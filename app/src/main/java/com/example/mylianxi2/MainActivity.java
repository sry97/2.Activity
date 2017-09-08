package com.example.mylianxi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0&&resultCode==0){
            String str1=data.getStringExtra("ret");

            EditText et1=(EditText)findViewById(R.id.Edit1);
            et1.setText(str1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                EditText editt = (EditText) findViewById(R.id.Edit1);
                intent1.putExtra("editt", editt.getText().toString());
                startActivityForResult(intent1,0);

            }
        });

    }

}
