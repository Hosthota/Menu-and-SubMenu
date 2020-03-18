package com.example.submenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menuObj) {
        getMenuInflater().inflate(R.menu.menu, menuObj);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        ConstraintLayout constraintLayout = findViewById(R.id.cLayout);
        switch (item.getItemId()) {
            case R.id.Image:
                Toast.makeText(getApplicationContext(), "Navigating to Image activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
                return true;
            case R.id.Text:
                Toast.makeText(getApplicationContext(), "Navigating to Text activity", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this, TextActivity.class);
                startActivity(intent1);
                return true;
            case R.id.Red:
                constraintLayout.setBackgroundColor(Color.RED);
                Toast.makeText(getApplicationContext(), "Background Color set to red", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Black:
                constraintLayout.setBackgroundColor(Color.BLACK);
                Toast.makeText(getApplicationContext(), "Background Color set to Black", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Green:
                constraintLayout.setBackgroundColor(Color.GREEN);
                Toast.makeText(getApplicationContext(), "Background Color set to Green", Toast.LENGTH_SHORT).show();
                return true;
            default:
                super.onOptionsItemSelected(item);
        }
        return false;
    }
}
