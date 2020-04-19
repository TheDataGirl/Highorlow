package com.example.highorlow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void guess(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        int guessVal=Integer.parseInt(editText.getText().toString());
        String message;
        if(guessVal>randomnumber){
            message="Lower!";
        }else if (guessVal<randomnumber){
            message="Higher!";
        }else {
            message="You got it!Nice";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        Log.i("Entered Value", editText.getText().toString());
        Log.i("Random Number", Integer.toString(randomnumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomnumber = rand.nextInt(20) + 1;
    }
}
