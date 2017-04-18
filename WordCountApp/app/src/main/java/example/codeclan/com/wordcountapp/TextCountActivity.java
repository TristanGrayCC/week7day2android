package example.codeclan.com.wordcountapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 18/04/2017.
 */

public class TextCountActivity extends AppCompatActivity {

    private TextView textCountText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Log.d(getClass().toString(), "onCreate called");

        textCountText = (TextView) findViewById(R.id.answer_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("text");
        textCountText.setText(answer);
    }
}