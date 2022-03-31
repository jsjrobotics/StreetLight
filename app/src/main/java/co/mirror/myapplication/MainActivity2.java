package co.mirror.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private static final String redOff = "#22FF0000";
    private static final String redOn  = "#FFFF0000";
    private static final String yellowOff = "#22FFFF00";
    private static final String yellowOn  = "#FFFFFF00";
    private static final String greenOff = "#2200FF00";
    private static final String greenOn  = "#FF00FF00";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((ImageView) findViewById(R.id.red)).setColorFilter(Color.parseColor(redOff));
        ((ImageView) findViewById(R.id.yellow)).setColorFilter(Color.parseColor(yellowOff));
        ((ImageView) findViewById(R.id.green)).setColorFilter(Color.parseColor(greenOff));
    }
}
