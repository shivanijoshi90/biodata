package com.shivani.biodata;

import
        androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox dance,music,movie,traveling;
    TextView bio_data,name,mobile,email_id,father_name,gender,religion,language_known,hobby,date_of_birth,qualification;
    RadioGroup radioGroup,rdGroup1;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


