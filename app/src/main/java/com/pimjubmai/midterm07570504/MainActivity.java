package com.pimjubmai.midterm07570504;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button LoginButton = findViewById(R.id.button);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText UserEditText = findViewById(R.id.editText);
                EditText PasswordEditText = findViewById(R.id.editText2);

                String inputEmail = UserEditText.getText().toString();
                int value;
                try{
                    value = Integer.parseInt(inputEmail);
                }catch (Exception e){
                    value = -1;
                }

                String inputPassword = PasswordEditText.getText().toString();

                String success = "login_success";
                String failed = "login_failed";

                 member member = new member(inputEmail, inputPassword);
                //auth.setmEmail(inputEmail);
                //auth.setmPassword(inputPassword);

                boolean result =  member.check();

                if(result){
                    Toast.makeText(MainActivity.this, "ยินดีต้อนรับ", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Home1Activity.class);
                    intent.putExtra("aaa", 111);
                    startActivity(intent);

                }else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage("Invalid username or password");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    dialog.show();
                }
            }
        });

    }
}


