package com.example.area;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText v1, v2;
    Button rect, tri, circle;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v1 = findViewById(R.id.etValue1);
        v2 = findViewById(R.id.etValue2);
        rect = findViewById(R.id.btnRectangle);
        tri = findViewById(R.id.btnTriangle);
        circle = findViewById(R.id.btnCircle);
        result = findViewById(R.id.tvResult);


        rect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(v1.getText().toString());
                double b = Double.parseDouble(v2.getText().toString());
                double area = a * b;
                result.setText("Rectangle Area = " + area);
            }
        });


        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(v1.getText().toString());
                double b = Double.parseDouble(v2.getText().toString());
                double area = 0.5 * a * b;
                result.setText("Triangle Area = " + area);
            }
        });

        Button square = findViewById(R.id.btnSquare);

        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SquareActivity.class);
                startActivity(i);
            }
        });



        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double r = Double.parseDouble(v1.getText().toString());
                double area = Math.PI * r * r;
                result.setText("Circle Area = " + area);
            }
        });
    }
}
