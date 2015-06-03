package appewtc.masterung.ishihara;

/**
 * Created by masterUNG on 6/3/15 AD.
 */
public class SsruModel {

    //Explicit
    private int modelAnInt;

    //Create Interface
    public interface OnSsruModelChangeListener {
        void onSsruModelChangeListener(SsruModel model);
    }

    private OnSsruModelChangeListener onSsruModelChangeListener;

    public void setOnSsruModelChangeListener(OnSsruModelChangeListener onSsruModelChangeListener) {
        this.onSsruModelChangeListener = onSsruModelChangeListener;
    }

    public int getModelAnInt() {
        return modelAnInt;
    }   //getter

    public void setModelAnInt(int modelAnInt) {
        this.modelAnInt = modelAnInt;

        if (this.onSsruModelChangeListener != null) {
            this.onSsruModelChangeListener.onSsruModelChangeListener(this);
        }

    }   //setter

}   // Main Class
