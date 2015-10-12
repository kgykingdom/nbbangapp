package kykim.nbbangapp;

/**
 * Created by 1002507 on 2015-10-11.
 */
public class DataObject {
    private int mPictureId;
    private String mText;

    public DataObject(int picid, String text) {
        mPictureId = picid;
        mText = text;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public int getPicture() {
        return mPictureId;
    }
}
