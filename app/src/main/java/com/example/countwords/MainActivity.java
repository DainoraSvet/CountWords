package com.example.countwords;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Spinner spinner;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables
        editText = findViewById(R.id.editText);
        spinner = findViewById(R.id.spinner);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.result_text);

        //button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //text from editText
                String text = editText.getText().toString();

                //check if text is empty
                if (text.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter text", Toast.LENGTH_SHORT).show();
                    return;
                }

                //selected option from spinner
                String selectedOption = spinner.getSelectedItem().toString();

                //text analyzer

                //count words or characters based on selected option

            }
        });
    }
}
