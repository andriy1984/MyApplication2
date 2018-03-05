package com.example.andri.myapplication;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textView = findViewById(R.id.welcome);
        textView.setText(getIntent().getStringExtra("login"));

       /* SharedPreferences.Editor editor = getSharedPreferences("MyPrefFile", MODE_PRIVATE).edit();
        editor.putString("login", getIntent().getStringExtra("login"));
        editor.apply();

        SharedPreferences pref = getSharedPreferences("MyPrefFile", MODE_PRIVATE);
        pref.getString("login", "Andriy");
        Toast.makeText(this, pref.getString("login", "Andriy"), Toast.LENGTH_SHORT).show();*/

        Animation animation =
                AnimationUtils.loadAnimation(this, R.anim.fade);

        textView.startAnimation(animation);

    }
}
