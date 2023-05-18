package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> numbers = new ArrayList<Integer>(100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvMessage = findViewById(R.id.editTextTextPersonName);
        TextView textOuput = findViewById(R.id.textOuput);

        Button btn1 = findViewById(R.id.button_1);
        Button btn2 = findViewById(R.id.button_2);
        Button btn3 = findViewById(R.id.button_3);
        Button calc = findViewById(R.id.calcular);






        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text =getTextInput()+ "1+";
                numbers.add(1);
                tvMessage.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getTextInput()+"2+";
                numbers.add(2);
                tvMessage.setText(text);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getTextInput()+"3+";
                numbers.add(3);
                tvMessage.setText(text);
            }
        });

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = numbers.stream().mapToInt(Integer::valueOf).sum();
                String text ="La suma es:"+sum;
                textOuput.setText(text);
            }
        });


    }
    private String getTextInput(){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        return editText.getText().toString();

    }
}