package hk.hku.eee.hkueee.menuactivity;
/*
* This function shows teachers' information form HKU EEE department.
* */
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hk.hku.eee.hkueee.R;
import hk.hku.eee.hkueee.Staff.CardPagerAdapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;


import hk.hku.eee.hkueee.Staff.*;
public class Staff extends AppCompatActivity {

    private Button mButton;
    private ViewPager mViewPager;

    private CardPagerAdapter mCardAdapter;
    private ShadowTransformer mCardShadowTransformer;
    private CardFragmentPagerAdapter mFragmentCardAdapter;
    private ShadowTransformer mFragmentCardShadowTransformer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);


        Button cteacherinfo = (Button) findViewById(R.id.teacherinfo);//findViewByID
        cteacherinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //show teacher information in the dialog.
                    showDialog();

            }
        });

        //Add teacher items to the Card.
        mCardAdapter = new CardPagerAdapter();
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherscchan,R.string.te1));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherktchau,R.string.te2));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachervincenttam,R.string.te3));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherfok,R.string.te4));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherycwu,R.string.te5));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherqchen,R.string.te6));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherchesi,R.string.te7));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherchoi,R.string.te8));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherchoy,R.string.te9));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkyeung,R.string.te10));

        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherchu,R.string.te11));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherhill,R.string.te12));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherhou,R.string.te13));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkbhuang,R.string.te14));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherrsyhui,R.string.te15));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherjiang,R.string.te16));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkwok,R.string.te17));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherptlai,R.string.te18));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacheremlam,R.string.te19));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherjclam,R.string.te20));

        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkhlam,R.string.te21));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherwhlam,R.string.te22));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachercklee,R.string.te23));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherwklee,R.string.te24));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherwnlee,R.string.te25));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkcleung,R.string.te26));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkhli,R.string.te27));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachervokli,R.string.te28));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachertliu,R.string.te29));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkslui,R.string.te30));

        mCardAdapter.addCardItem(new CardItem(R.drawable.teachergkhpang,R.string.te31));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachermhpong,R.string.te32));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherpwtpong,R.string.te33));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherhkhso,R.string.te34));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachersctan,R.string.te35));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachernctien,R.string.te36));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkkmtsia,R.string.te37));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherkkywong,R.string.te38));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teachernwong,R.string.te39));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherexwu,R.string.te40));

        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherjhyuen,R.string.te41));
        mCardAdapter.addCardItem(new CardItem(R.drawable.teacherjzhong,R.string.te42));

        mFragmentCardAdapter = new CardFragmentPagerAdapter(getSupportFragmentManager(),
                dpToPixels(2, this));

        mCardShadowTransformer = new ShadowTransformer(mViewPager, mCardAdapter);
        mFragmentCardShadowTransformer = new ShadowTransformer(mViewPager, mFragmentCardAdapter);

        mViewPager.setAdapter(mCardAdapter);
        mViewPager.setPageTransformer(false, mCardShadowTransformer);
        mViewPager.setOffscreenPageLimit(3);



    }


    public static float dpToPixels(int dp, Context context) {
        return dp * (context.getResources().getDisplayMetrics().density);
    }


    private void showDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);

        int teacherpage = mViewPager.getCurrentItem();
        //judge which teacher information showed in the dialog.
        switch (teacherpage){
            case 0:
                builder.setIcon(R.drawable.teacherscchan);
                builder.setTitle(R.string.te1);
                builder.setMessage(R.string.teinfo0);
                break;
            case 1:
                builder.setIcon(R.drawable.teacherktchau);
                builder.setTitle(R.string.te2);
                builder.setMessage(R.string.teinfo1);
                break;
            case 2:
                builder.setIcon(R.drawable.teachervincenttam);
                builder.setTitle(R.string.te3);
                builder.setMessage(R.string.teinfo2);
                break;
            case 3:
                builder.setIcon(R.drawable.teacherfok);
                builder.setTitle(R.string.te4);
                builder.setMessage(R.string.teinfo3);
                break;
            case 4:
                builder.setIcon(R.drawable.teacherycwu);
                builder.setTitle(R.string.te5);
                builder.setMessage(R.string.teinfo4);

                break;
            case 5:
                builder.setIcon(R.drawable.teacherqchen);
                builder.setTitle(R.string.te6);
                builder.setMessage(R.string.teinfo5);

                break;
            case 6:
                builder.setIcon(R.drawable.teacherchesi);
                builder.setTitle(R.string.te7);
                builder.setMessage(R.string.teinfo6);

                break;
            case 7:
                builder.setIcon(R.drawable.teacherchoi);
                builder.setTitle(R.string.te8);
                builder.setMessage(R.string.teinfo7);

                break;
            case 8:
                builder.setIcon(R.drawable.teacherchoy);
                builder.setTitle(R.string.te9);
                builder.setMessage(R.string.teinfo8);

                break;
            case 9:
                builder.setIcon(R.drawable.teacherkyeung);
                builder.setTitle(R.string.te10);
                builder.setMessage(R.string.teinfo9);

                break;

            case 10:
                builder.setIcon(R.drawable.teacherchu);
                builder.setTitle(R.string.te11);
                builder.setMessage(R.string.teinfo10);

                break;
            case 11:
                builder.setIcon(R.drawable.teacherhill);
                builder.setTitle(R.string.te12);
                builder.setMessage(R.string.teinfo11);

                break;
            case 12:
                builder.setIcon(R.drawable.teacherhou);
                builder.setTitle(R.string.te13);
                builder.setMessage(R.string.teinfo12);

                break;
            case 13:
                builder.setIcon(R.drawable.teacherkbhuang);
                builder.setTitle(R.string.te14);
                builder.setMessage(R.string.teinfo13);
                break;
            case 14:
                builder.setIcon(R.drawable.teacherrsyhui);
                builder.setTitle(R.string.te15);
                builder.setMessage(R.string.teinfo14);
                break;
            case 15:
                builder.setIcon(R.drawable.teacherjiang);
                builder.setTitle(R.string.te16);
                builder.setMessage(R.string.teinfo15);
                break;
            case 16:
                builder.setIcon(R.drawable.teacherkwok);
                builder.setTitle(R.string.te17);
                builder.setMessage(R.string.teinfo16);
                break;
            case 17:
                builder.setIcon(R.drawable.teacherptlai);
                builder.setTitle(R.string.te18);
                builder.setMessage(R.string.teinfo17);
                break;
            case 18:
                builder.setIcon(R.drawable.teacheremlam);
                builder.setTitle(R.string.te19);
                builder.setMessage(R.string.teinfo18);
                break;
            case 19:
                builder.setIcon(R.drawable.teacherjclam);
                builder.setTitle(R.string.te20);
                builder.setMessage(R.string.teinfo19);
                break;

            case 20:
                builder.setIcon(R.drawable.teacherkhlam);
                builder.setTitle(R.string.te21);
                builder.setMessage(R.string.teinfo20);
                break;
            case 21:
                builder.setIcon(R.drawable.teacherwhlam);
                builder.setTitle(R.string.te22);
                builder.setMessage(R.string.teinfo21);
                break;
            case 22:
                builder.setIcon(R.drawable.teachercklee);
                builder.setTitle(R.string.te23);
                builder.setMessage(R.string.teinfo22);
                break;
            case 23:
                builder.setIcon(R.drawable.teacherwklee);
                builder.setTitle(R.string.te24);
                builder.setMessage(R.string.teinfo23);
                break;
            case 24:
                builder.setIcon(R.drawable.teacherwnlee);
                builder.setTitle(R.string.te25);
                builder.setMessage(R.string.teinfo24);
                break;
            case 25:
                builder.setIcon(R.drawable.teacherkcleung);
                builder.setTitle(R.string.te26);
                builder.setMessage(R.string.teinfo25);
                break;
            case 26:
                builder.setIcon(R.drawable.teacherkhli);
                builder.setTitle(R.string.te27);
                builder.setMessage(R.string.teinfo26);
                break;
            case 27:
                builder.setIcon(R.drawable.teachervokli);
                builder.setTitle(R.string.te28);
                builder.setMessage(R.string.teinfo27);
                break;
            case 28:
                builder.setIcon(R.drawable.teachertliu);
                builder.setTitle(R.string.te29);
                builder.setMessage(R.string.teinfo28);
                break;
            case 29:
                builder.setIcon(R.drawable.teacherkslui);
                builder.setTitle(R.string.te30);
                builder.setMessage(R.string.teinfo29);
                break;

            case 30:
                builder.setIcon(R.drawable.teachergkhpang);
                builder.setTitle(R.string.te31);
                builder.setMessage(R.string.teinfo30);
                break;
            case 31:
                builder.setIcon(R.drawable.teachermhpong);
                builder.setTitle(R.string.te32);
                builder.setMessage(R.string.teinfo31);
                break;
            case 32:
                builder.setIcon(R.drawable.teacherpwtpong);
                builder.setTitle(R.string.te33);
                builder.setMessage(R.string.teinfo32);
                break;
            case 33:
                builder.setIcon(R.drawable.teacherhkhso);
                builder.setTitle(R.string.te34);
                builder.setMessage(R.string.teinfo33);
                break;
            case 34:
                builder.setIcon(R.drawable.teachersctan);
                builder.setTitle(R.string.te35);
                builder.setMessage(R.string.teinfo34);
                break;
            case 35:
                builder.setIcon(R.drawable.teachernctien);
                builder.setTitle(R.string.te36);
                builder.setMessage(R.string.teinfo35);
                break;
            case 36:
                builder.setIcon(R.drawable.teacherkkmtsia);
                builder.setTitle(R.string.te37);
                builder.setMessage(R.string.teinfo36);
                break;
            case 37:
                builder.setIcon(R.drawable.teacherkkywong);
                builder.setTitle(R.string.te38);
                builder.setMessage(R.string.teinfo37);
                break;
            case 38:
                builder.setIcon(R.drawable.teachernwong);
                builder.setTitle(R.string.te39);
                builder.setMessage(R.string.teinfo38);
                break;
            case 39:
                builder.setIcon(R.drawable.teacherexwu);
                builder.setTitle(R.string.te40);
                builder.setMessage(R.string.teinfo39);
                break;
            case 40:
                builder.setIcon(R.drawable.teacherjhyuen);
                builder.setTitle(R.string.te41);
                builder.setMessage(R.string.teinfo40);
                break;
            case 41:
                builder.setIcon(R.drawable.teacherjzhong);
                builder.setTitle(R.string.te42);
                builder.setMessage(R.string.teinfo41);
                break;
            default:
                builder.setMessage("Woo, it maybe error!");
                break;
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

}
