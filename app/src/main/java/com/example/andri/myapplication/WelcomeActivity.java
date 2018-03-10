package com.example.andri.myapplication;

import android.app.Activity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

       /* TextView textView = findViewById(R.id.welcome);
        textView.setText(getIntent().getStringExtra("login"));

       *//* SharedPreferences.Editor editor = getSharedPreferences("MyPrefFile", MODE_PRIVATE).edit();
        editor.putString("login", getIntent().getStringExtra("login"));
        editor.apply();

        SharedPreferences pref = getSharedPreferences("MyPrefFile", MODE_PRIVATE);
        pref.getString("login", "Andriy");
        Toast.makeText(this, pref.getString("login", "Andriy"), Toast.LENGTH_SHORT).show();*//*

        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.fade);

        textView.startAnimation(animation);*/


        final Dialog dialog = new Dialog(this);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setContentView(R.layout.dialog_two_button);
        TextView textView = dialog.findViewById(R.id.text_n);
        textView.setText("and");
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();

        dialog.findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.findViewById(R.id.no).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        WelcomeActivity.this,
                        "sdsds",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
