package com.example.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView info;
    private Button Login;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        info=(TextView)findViewById(R.id.tvInfo);
        Login=(Button)findViewById(R.id.btnLogin);

        info.setText(" no of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validate(String userName, String userPassword){
        if((userName.equals("Sarah")) && (userPassword.equals("1234"))){
            Intent Intent= new Intent(MainActivity.this, SecondActivity.class);
            startActivity(Intent);

        }
       // else{
            //counter--;
         //   info.setText("number of attempts remaining: " + String.valueOf(counter));
          //  if(counter==0){
          //      Login.setEnabled(false);
           // }

       // }
    }
}
