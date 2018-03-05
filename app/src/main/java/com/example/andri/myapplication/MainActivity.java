package com.example.andri.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText login = findViewById(R.id.login);
        findViewById(R.id.ok).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);

                Intent text  = intent.putExtra("login", login.getText().toString());
                startActivity(intent);

            }
        });

        //RelativeLayout relativeLayout =findViewById(R.id.toolbar_container);
        //View inflate = getLayoutInflater().
          //      inflate(R.layout.toolbar_simple, null, false);
        //relativeLayout.removeAllViews();
        //relativeLayout.addView(inflate);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("MyLOG", item.getTitle().toString());
        return super.onOptionsItemSelected(item);
    }

}
