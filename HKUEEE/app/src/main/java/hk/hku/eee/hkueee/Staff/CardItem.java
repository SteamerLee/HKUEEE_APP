package hk.hku.eee.hkueee.Staff;
/*
 * This function is used for card items building.(Teacher information function)
 * */
import android.view.View;

public class CardItem {

    private int mImageResource;
    private int mteachernameResource;

    public CardItem(int teacherImage,int teachername) {
        mImageResource = teacherImage;
        mteachernameResource = teachername;
    }

    public int getImage() {return mImageResource;}

    public int getteachername() {return mteachernameResource;}
}
