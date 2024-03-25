package com.example.first1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btAdd ;
    private EditText edtHobbies ;
    private TextView txtHobbies ;
    private TextView txtText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btAdd =findViewById(R.id.btAdd);
        edtHobbies =findViewById(R.id.edtHobbies);
        txtHobbies =findViewById(R.id.txtHobbies);
        txtText=findViewById(R.id.txtText);
        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (!edtHobbies.getText().toString().isEmpty()){
                    txtHobbies.setText(edtHobbies.getText().toString());
                    txtHobbies.setVisibility(View.VISIBLE);
               }
            }
        });


    }
}