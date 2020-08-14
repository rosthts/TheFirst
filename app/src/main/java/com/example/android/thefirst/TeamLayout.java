package com.example.android.thefirst;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TeamLayout extends FrameLayout {

    private int deberts = 0;

    private void updateDeberts() {
        TextView debertsTextView = findViewById(R.id.deberts_Text_Viev);
        debertsTextView.setText(Integer.toString(deberts));
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
