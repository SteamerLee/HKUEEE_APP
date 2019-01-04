package hk.hku.eee.hkueee.common;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by saidy on 2018/11/23.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    public MyPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Tab1();
            case 1: return new Tab2();
            case 2: return new Tab3();
            case 3: return new Tab4();
            case 4: return new Tab5();
            case 5: return new Tab6();

            /**/
            default:
                return null;
        }

    }
    @Override
    public int getCount() {
        return 6;
    }
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
        case 0: return "1st";
        case 1: return "2nd";
        case 2: return "3rd";
        case 3: return "4th";
        case 4: return "5th";
        case 5: return "6th";


        default: return null;
    }
    }

}
