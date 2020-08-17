package com.example.android.thefirst;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TeamLayout extends FrameLayout {

    private int deberts = 0;
    private int polt = 0;
    private int terts = 0;
    private int res = 0;

    private void updateDeberts() {
        TextView debertsTextView = findViewById(R.id.deberts_Text_Viev);
        debertsTextView.setText(Integer.toString(deberts));
    }

    public void setName(String name) {
        TextView nameTextView = findViewById(R.id.comandNameTextView);
        nameTextView.setText(name);
    }

    {
        LayoutInflater.from(getContext()).inflate(R.layout.team, this);

        findViewById(R.id.incrementDebertsButton).setOnClickListener(
            new OnClickListener() { @Override public void onClick(View v) {
                deberts++;
                updateDeberts();
            } }
        );

        findViewById(R.id.decrementDebertsButton).setOnClickListener(
            new OnClickListener() { @Override public void onClick(View v) {
                deberts--;
                updateDeberts();
            } }
        );

    }
    private void updatePolt(){
        TextView poltTextView = findViewById(R.id.polt_Text_Viev);
        poltTextView.setText(Integer.toString(polt));
    }
    {
        findViewById(R.id.incrementPoltButton).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                polt++;
                updatePolt();
            }
        });

        findViewById(R.id.decrementPoltButton).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                polt--;
                updatePolt();
            }
        });
    }

    private void updateTerts(){
        TextView tertsTextView = findViewById(R.id.terts_Text_View);
        tertsTextView.setText(Integer.toString(terts));
    }
    {
        findViewById(R.id.incrementTertsButton).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                terts++;
                updateTerts();
            }
        });

        findViewById(R.id.decrementTertsButton).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                terts--;
                updateTerts();
            }
        });
    }
    {
        findViewById(R.id.button_result).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                res = deberts*50 + polt*50 + terts*20 + checkBella();
                resultUpdate();
            }
        });
    }
    public void resultUpdate(){
        TextView resutTextView = findViewById(R.id.result_first_team1);
        resutTextView.setText(Integer.toString(res));
    }
    public int checkBella(){
        CheckBox bella = findViewById(R.id.checkBoxFirstTeam);
        if(bella.isChecked())
            return 20;
        else return 0;
    }



    public TeamLayout(@NonNull Context context) {
        super(context);
    }

    public TeamLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TeamLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TeamLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

}
