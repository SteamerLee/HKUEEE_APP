package hk.hku.eee.hkueee.Staff;
/*
* This function is used for card items building.(Teacher information function)
* */
import android.support.v7.widget.CardView;

public interface CardAdapter {

    int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
