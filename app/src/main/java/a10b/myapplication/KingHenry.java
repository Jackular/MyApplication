package a10b.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KingHenry extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_LATLNG = "com.unimaps.latlan";
    public final static String EXTRA_MESSAGE_NAME = "com.unimaps.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_king_henry);
    }
    public void onClickHenryMap(View v) {
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(EXTRA_MESSAGE_LATLNG, new double[]{50.798112, -1.099570});
        intent.putExtra(EXTRA_MESSAGE_NAME, "King Henry");
        startActivity(intent);
    }
}
