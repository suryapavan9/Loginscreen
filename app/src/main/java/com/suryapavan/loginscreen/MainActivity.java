package com.suryapavan.loginscreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b1;
    TextView tv1;
    int count = 0; // for tracking no.of trails


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize all variables
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        b1 = (Button) findViewById(R.id.button);
        tv1 = (TextView) findViewById(R.id.textView);

        //button click listener
        //button click listener

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                if(s1.equals("techpalle") && s2.equals("blossom")){

                    Intent i = new Intent(MainActivity.this,SecondActivity.class);

                    startActivity(i);

                    Toast.makeText(getApplicationContext(),"Login success",Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getApplicationContext(),"Login Failed",Toast.LENGTH_LONG).show();
                }
                tv1.setText(" "+count);
                count++;
            }

        });
    }
}
