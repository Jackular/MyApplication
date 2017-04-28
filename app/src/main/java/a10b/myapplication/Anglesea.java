package a10b.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Anglesea extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_LATLNG = "com.unimaps.latlan";
    public final static String EXTRA_MESSAGE_NAME = "com.unimaps.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anglesea);

    }

    public void onAngleseaMapClick(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(EXTRA_MESSAGE_LATLNG, new double[]{50.797775 , -1.098041});
        intent.putExtra(EXTRA_MESSAGE_NAME, "Anglesea");
        startActivity(intent);
    }
}
