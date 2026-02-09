package com.example.area;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareActivity extends AppCompatActivity {

    EditText side;
    Button calc;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        side = findViewById(R.id.etSide);
        calc = findViewById(R.id.btnCalc);
        result = findViewById(R.id.tvSquareResult);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s = Double.parseDouble(side.getText().toString());
                double area = s * s;
                result.setText("Square Area = " + area);
            }
        });
    }
}
