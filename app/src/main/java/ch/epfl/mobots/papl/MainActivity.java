package ch.epfl.mobots.papl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int START_OPENCV_ACTIVITY = 1;

    private Button btnFreeGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Moving from MainActivity to FreeGameActivity (with a setOnClickListener)
        btnFreeGame = findViewById(R.id.btn_free_game);
        btnFreeGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToFreeGameActivity();
            }
        });

    }





    // Method for the setOnClickListener leading from MainActivity to FreeGameActivity
    private void moveToFreeGameActivity() {
        Intent intent = new Intent(MainActivity.this, FreeGameActivity.class);
        startActivity(intent);
    }





    // XML callback leading from MainActivity to OpenCVTestActivity
    public void StartOpenCVTest(View view) {
        Intent intentToDeviceListActivity = new Intent(this, OpenCVTestActivity.class);
        startActivityForResult(intentToDeviceListActivity, START_OPENCV_ACTIVITY);
    }





    // XML callback leading from MainActivity to TakeAndLoadPictureTestActivity
    public void StartTakeAndLoadPictureTest(View view) {
        Intent intentToDeviceListActivity = new Intent(this, TakeAndLoadPictureTestActivity.class);
        startActivityForResult(intentToDeviceListActivity, START_OPENCV_ACTIVITY);
    }




}

