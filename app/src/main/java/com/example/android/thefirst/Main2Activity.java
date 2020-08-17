package com.example.android.thefirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final int[] spn = new int[]{R.id.spinner, R.id.spinner2, R.id.spinner3, R.id.spinner4};
        for (int i = 0; i < spn.length; i++){
           final int j = i;
    ArrayAdapter<?> adapter = ArrayAdapter.createFromResource(this, R.array.players_names, android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    Spinner spinner = findViewById(spn[i]);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int[] img = new int[]{R.id.imageView, R.id.imageView2, R.id.imageView3, R.id.imageView4};
                ImageView imageView = findViewById(img[j]);
                String[] choose = getResources().getStringArray(R.array.players_names);
                if (choose[position].equals("Рост"))
                imageView.setImageResource(R.drawable.rost);
                else
                if (choose[position].equals("Костя"))
                    imageView.setImageResource(R.drawable.kostya);
                else
                if (choose[position].equals("Ира"))
                    imageView.setImageResource(R.drawable.ira);
                else
                if (choose[position].equals("Ната"))
                    imageView.setImageResource(R.drawable.nata);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        }
        TextView firstCommandNameTextView = findViewById(R.id.comandNameTextView);
        firstCommandNameTextView.setText(R.string.team1);
}
}
