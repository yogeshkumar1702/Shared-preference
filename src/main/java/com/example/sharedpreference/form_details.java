package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class form_details extends AppCompatActivity {

    private static final String PreferenceName = "Mypref";
    SharedPreferences sharedPreferences;

    TextView Name;
    TextView Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_details);

        sharedPreferences = getSharedPreferences(PreferenceName, Context.MODE_PRIVATE);

        Name = findViewById(R.id.textview_name);
        Value = findViewById(R.id.textview_value);

        if(sharedPreferences.contains("name") &&
                sharedPreferences.contains("value")){

            String name = sharedPreferences.getString("name","");
            String value = sharedPreferences.getString("value","");

            Name.setText(name);
            Value.setText(value);
        }
    }
}
