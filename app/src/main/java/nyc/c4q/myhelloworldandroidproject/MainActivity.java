package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewUser;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUser= (TextView)findViewById(R.id.textView);
        textViewUser.setText("Hello, world on start");
        Log.d(TAG,"My main method is ruuing now...!!");

    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "ON start ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"On Pause!!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ON stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"On Destroy!!");
    }
}