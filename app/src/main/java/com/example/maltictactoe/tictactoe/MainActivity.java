package com.example.maltictactoe.tictactoe;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private Game game1;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        game1 = new Game(this);
        setContentView(game1);
    }
}