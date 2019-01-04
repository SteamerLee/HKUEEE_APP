package hk.hku.eee.hkueee.menuactivity;
/*
* This is a mini test for fun, test the distance between user and HKU.
* Use GPS/WiFi to detect the location, and give back to the latitude and longitude;
* and then, calculate the distance and show it on the screen.
* */
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;

import hk.hku.eee.hkueee.R;

public class BaiduMap extends AppCompatActivity {
    private ImageButton cgamebutton;
    public LocationClient mLocationClient;
    private TextView positontext;
    public BDLocationListener myListener = new MyLocationListener();
    public double latitude;
    public double longitude;
    public double totaldist;
    public double dist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu_map);
        cgamebutton = (ImageButton)findViewById(R.id.gamebutton);

        mLocationClient=new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(myListener);

        // setting
        LocationClientOption option=new LocationClientOption();
        option.setLocationMode(LocationClientOption.LocationMode.Hight_Accuracy);
        //optional; default: high-accuracy
        option.setCoorType("bd09ll");
        //optional
        int span = 1000;
        option.setScanSpan(span);
        //optional, location interval
        option.setIsNeedAddress(true);
        //optional, if true, it can provide address information.
        // In listener-getCountry(),getProvince(), getCity();
        option.setOpenGps(true);
        //optional,default-False, which means it does not need GPS;
        mLocationClient.setLocOption(option);

        mLocationClient.start();

        cgamebuttonfuc();
    }

    private void cgamebuttonfuc(){
        cgamebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //show the result in a dialog.
                showDialog();

            }
        });
    }

    private void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.drawable.hkulogoicon);
        builder.setTitle("HKU is waiting for you");
        cDistance( longitude, latitude);
        totaldist = dist;
        //Search and location maybe spend few seconds, please wait for a moment before you click the test button.
        //due to some unpredictable reasons, sometimes it may not correctly detect the location and it will give back(4.9E-324,4.9E-324).
        if (latitude  == 4.9E-324 || longitude == 4.9E-324){
            //if it cannot detect the correct location, it will show the word below.
            builder.setMessage("Your location\n" +
                    "Latitude: " + latitude +
                    "\nLongitude: " + longitude +
                    "\nOh, the location shows you are in Gulf of Guinea. It maybe a location error!"+
                    "\n\nActually, you are in my heart!" +
                    "\nI hope we can meet on Pokfulam Road next year!"
            );
        }
        else {
            //correctly detect the location
            builder.setMessage("Your location\n" +
                    "Latitude: " + latitude +
                    "\nLongitude: " + longitude +
                    "\n\nYou are about " + totaldist + " km from HKU." +
                    "\nI hope we can meet on Pokfulam Road next year!"
            );
        }

        builder.setPositiveButton("close",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        AlertDialog dialog=builder.create();
        dialog.show();

    }

    //get the latitude and longitude.
    public class MyLocationListener implements BDLocationListener{

        @Override
        public void onReceiveLocation(BDLocation bdLocation) {

            latitude = bdLocation.getLatitude();
            longitude = bdLocation.getLongitude();

        }
    }

    //calculate the distance between user and HKU.
    public void cDistance (double clongitude, double clatitude){
            double EARTHRADIUS = 6378137.0;

            double lo1 = clongitude, la1 = clatitude;// User Location
            double lo2 = 114.1492592720, la2 = 22.2876331660;// HKU Location

            double Lat1 = la1 * Math.PI / 180.0;
            double Lat2 = la2 * Math.PI / 180.0;
            double a = Lat1 - Lat2;
            double Lon1 = lo1 * Math.PI / 180.0;
            double Lon2 = lo2 * Math.PI / 180.0;
            double b =  Lon1 - Lon2;
            double s1 = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                    + Math.cos(Lat1) * Math.cos(Lat2)
                    * Math.pow(Math.sin(b / 2), 2)));
            double s2 = s1 * EARTHRADIUS;
            double s3= Math.round(s2 * 10000) / 10000;
            dist = s3 / 1000;//kilometer

    }

}
