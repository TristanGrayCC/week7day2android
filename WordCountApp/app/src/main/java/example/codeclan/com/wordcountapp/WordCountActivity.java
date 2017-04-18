package example.codeclan.com.wordcountapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class WordCountActivity extends AppCompatActivity {

    private EditText textEditText;
    private Button shakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate is called");

        textEditText = (EditText) findViewById(R.id.question_text);
        shakeButton = (Button) findViewById(R.id.shake_button);
    }

    public void onShakeButtonClicked(View button) {
        Log.d(getClass().toString(), "onShake button was clicked");

        String textEntered = textEditText.getText().toString();

        Log.d(getClass().toString(), textEntered);

        TextEntry text = new TextEntry(textEntered);
        String newText = text.getTextEntry();

        Intent intent = new Intent(this, TextCountActivity.class);

        intent.putExtra("text", newText);

        startActivity(intent);

    }
}
