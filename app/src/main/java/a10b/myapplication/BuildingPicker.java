package a10b.myapplication;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.content.Intent;

public class BuildingPicker extends AppCompatActivity {
    public final static String EXTRA_MESSAGE_LATLNG = "com.unimaps.latlan";
    public final static String EXTRA_MESSAGE_NAME = "com.unimaps.name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building_picker);
    }
    public void onClickAngle(View v) {
        Intent intent = new Intent(this, Anglesea.class);
        startActivity(intent);
    }
    public void onClickKing(View v) {
        Intent intent = new Intent(this, KingHenry.class);
        startActivity(intent);
    }
    public void OnClickPark(View v) {
        Intent intent = new Intent(this, Park.class);
        startActivity(intent);
    }
    public void onClickPort(View v) {
        Intent intent = new Intent(this, Portland.class);
        startActivity(intent);
    }
    public void onClickMill(View v) {
        Intent intent = new Intent(this, Milldam.class);
        startActivity(intent);
    }
    public void onClickBuck(View v) {
        Intent intent = new Intent(this, Buckingham.class);
        startActivity(intent);
    }
    public void onLionGateClick2(View v) {
        Intent intent = new Intent(this, lionGate.class);
        startActivity(intent);
    }
    public void onClickRich(View v) {
        Intent intent = new Intent(this, Richmond.class);
        startActivity(intent);
    }
}
