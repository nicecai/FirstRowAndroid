package activitytest.example.com.activitylifecycletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    private static final String TAG = "NormalActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        savedInstanceState = getIntent().getBundleExtra("mainActivityBundle");
        if(savedInstanceState!=null){
            Log.d(TAG, savedInstanceState.getString("data_key"));
        }
    }
}
