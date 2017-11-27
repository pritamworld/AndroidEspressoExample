package espresso.priteshpatel.com.androidespressoexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.changeText:
                EditText editText = (EditText) findViewById(R.id.inputField);
                editText.setText("Lalala");
                break;
            case R.id.switchActivity:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
        }

    }
}
