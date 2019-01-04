/*
* Application name: HKUEEE
* Brief: This APP mainly is provided to some students who want to apply MSc programme in Electrical and electronic department in the University of HONG KONG.
* Function: Programme Description and Composite fees, Teacher information, Life and Lab, FAQ, Admission checking, mini test and so on.
* Notes: This APP is only for studying Android, but not for business use.
* Date:2018.11.21.
* Developer: Terry(Sihong Chen), Samuel(Zhenglong Li), Harrison(Jiuming Wang)
* */


package hk.hku.eee.hkueee;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SlidingDrawer;
import android.widget.TextView;

import hk.hku.eee.hkueee.menuactivity.Apply;
import hk.hku.eee.hkueee.menuactivity.BaiduMap;
import hk.hku.eee.hkueee.menuactivity.Course;
import hk.hku.eee.hkueee.menuactivity.Entrance;
import hk.hku.eee.hkueee.menuactivity.FAQ;
import hk.hku.eee.hkueee.menuactivity.Lab;
import hk.hku.eee.hkueee.menuactivity.Life;
import hk.hku.eee.hkueee.menuactivity.ProgrammeDescription;
import hk.hku.eee.hkueee.menuactivity.Staff;

public class HomeActivity extends AppCompatActivity {
    private SlidingDrawer mdrawer;
    private ImageButton mSlideButton;
    private ImageButton mimageButton11;
    private ImageButton mimageButton12;
    private ImageButton mimageButton13;
    private ImageButton mimageButton21;
    private ImageButton mimageButton22;
    private ImageButton mimageButton23;
    private ImageButton mimageButton31;
    private ImageButton mimageButton32;
    private ImageButton mimageButton33;

    private TextView mText;
    private boolean flag;
    //private HashMap<String, Object> map;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*build a sliding drawer from the bottom of the main page;*/
        mdrawer = (SlidingDrawer)findViewById(R.id.slidingDrawer);
        mSlideButton = (ImageButton)findViewById(R.id.handle);
        mimageButton11 = (ImageButton)findViewById(R.id.imageButton11);
        mimageButton12 = (ImageButton)findViewById(R.id.imageButton12);
        mimageButton13 = (ImageButton)findViewById(R.id.imageButton13);
        mimageButton21 = (ImageButton)findViewById(R.id.imageButton21);
        mimageButton22 = (ImageButton)findViewById(R.id.imageButton22);
        mimageButton23 = (ImageButton)findViewById(R.id.imageButton23);
        mimageButton31 = (ImageButton)findViewById(R.id.imageButton31);
        mimageButton32 = (ImageButton)findViewById(R.id.imageButton32);
        mimageButton33 = (ImageButton)findViewById(R.id.imageButton33);

        /*--Define menu activity trigger, including nine functions*/
        mimageButton1();
        mimageButton2();
        mimageButton3();
        mimageButton4();
        mimageButton5();
        mimageButton6();
        mimageButton7();
        mimageButton8();
        mimageButton9();
        drawerlistener();

    }


    //ProgrammeDescription(Terry), Teacher(Samuel), Life(Terry)
    private void mimageButton1(){
        mimageButton11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton1 = new Intent(HomeActivity.this, ProgrammeDescription.class);
                startActivity(intentmimageButton1);
            }
        });
    }
    private void mimageButton2(){
        mimageButton12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton2 = new Intent(HomeActivity.this, Staff.class);
                startActivity(intentmimageButton2);
            }
        });
    }
    private void mimageButton3(){
        mimageButton13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton3 = new Intent(HomeActivity.this, Life.class);
                startActivity(intentmimageButton3);
            }
        });
    }

    //F&Q(Samuel), Entrance(Harrsion), Lab(Terry)
    private void mimageButton4(){
        mimageButton21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton4 = new Intent(HomeActivity.this, FAQ.class);
                startActivity(intentmimageButton4);
            }
        });
    }
    private void mimageButton5(){
        mimageButton22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton5 = new Intent(HomeActivity.this, Entrance.class);
                startActivity(intentmimageButton5);
            }
        });
    }
    private void mimageButton6(){
        mimageButton23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton6 = new Intent(HomeActivity.this, Course.class);
                startActivity(intentmimageButton6);
            }
        });
    }

    //BaiduMap(Actually it is a game)(Samuel), Apply(Harrison), Link(TBC)
    private void mimageButton7(){
        mimageButton31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton7 = new Intent(HomeActivity.this, BaiduMap.class);
                startActivity(intentmimageButton7);
            }
        });
    }
    private void mimageButton8(){
        mimageButton32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton8 = new Intent(HomeActivity.this, Apply.class);
                startActivity(intentmimageButton8);
            }
        });
    }
    private void mimageButton9(){
        mimageButton33.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intentmimageButton9 = new Intent(HomeActivity.this, Lab.class);
                startActivity(intentmimageButton9);
            }
        });
    }



    private void drawerlistener(){
        mdrawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {

            @Override
            public void onDrawerOpened() {
                flag = true;
                mSlideButton.setImageResource(R.drawable.pulldown);
            }
        });

        mdrawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {

            @Override
            public void onDrawerClosed() {
                flag = false;
                mSlideButton.setImageResource(R.drawable.clickme);
            }
        });
    }

}
