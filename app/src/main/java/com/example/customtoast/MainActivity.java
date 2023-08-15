package com.example.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button toastBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastBtn = findViewById(R.id.toast);

        View view =  getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.toastView));
        TextView toastText = view.findViewById(R.id.toastText);

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);



                toast.setView(view);


                toastText.setText("This is custom text");
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP | Gravity.RIGHT, 100,150);
                toast.show();
            }
        });



    }
}