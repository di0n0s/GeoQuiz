package com.bignerdrach.android.geoquiz;

/**
 * Created by sfcar on 16/11/2016.
 */

public class Question {

    private int mTextResId;
    private boolean mAnsweerTrue;

    public Question(int mTextResId, boolean mAnsweerTrue) {
        this.mTextResId = mTextResId;
        this.mAnsweerTrue = mAnsweerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnsweerTrue() {
        return mAnsweerTrue;
    }

    public void setAnsweerTrue(boolean answeerTrue) {
        mAnsweerTrue = answeerTrue;
    }
}
