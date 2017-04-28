package a10b.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Park extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_LATLNG = "com.unimaps.latlan";
    public final static String EXTRA_MESSAGE_NAME = "com.unimaps.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park);
    }
    public void OnClickPark(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(EXTRA_MESSAGE_LATLNG, new double[]{50.798889, -1.098041});
        intent.putExtra(EXTRA_MESSAGE_NAME, "Park");
        startActivity(intent);
    }
}
