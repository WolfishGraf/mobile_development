package com.mirea.strakhoval.toastapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtText;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtText = (EditText) findViewById(R.id.editTextText);

        edtText.setText("Hello MIREA!");

        str = String.format("СТУДЕНТ № 23 ГРУППА БИСО-03-19 Количество символов - %d",
                edtText.getText().toString().length());
    }

    public void onBtnCountClick(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                str,
                Toast.LENGTH_LONG);
        toast.show();
    }
}