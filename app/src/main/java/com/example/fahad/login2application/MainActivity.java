package com.example.fahad.login2application;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn, btn_exit;
    EditText et_name, et_Email, et_Password, et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setBounds();

    }

    public void setBounds() {
        btn_exit = findViewById(R.id.button_exit);
        btn_exit.setOnClickListener(this);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
        et_name = findViewById(R.id.editText_name);
        et_Email = findViewById(R.id.editText_Email);
        et_Password = findViewById(R.id.editText_password);
        et_phone = findViewById(R.id.editText_phone);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button :
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("Name", et_name.getText().toString());
            intent.putExtra("Email", et_Email.getText().toString());
            intent.putExtra("Password", et_Password.getText().toString());
            intent.putExtra("Phone", et_phone.getText().toString());
            startActivity(intent);
            break;

            case R.id.button_exit :
            AlertDialog.Builder alertDialogBox = new AlertDialog.Builder(this);
            AlertDialog alerDialog = alertDialogBox.create();
            alerDialog.setTitle("WARNING !");
            alerDialog.setMessage("Are you sure you want to close the application ?");
            alerDialog.setButton(DialogInterface.BUTTON_POSITIVE,"Yes",new DialogButtonListeners());
            alerDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"No",new DialogButtonListeners());
            alerDialog.show();
            break;
        }
    }
    public class DialogButtonListeners implements DialogInterface.OnClickListener{

        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which){
                case DialogInterface.BUTTON_POSITIVE :
                    MainActivity.this.finish();
                    break;
                    case DialogInterface.BUTTON_NEGATIVE:
                        dialog.cancel();
                        break;
            }
        }
    }
}