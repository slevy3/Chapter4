package com.bignerdranch.android.geoquiz;


public class Question {

    private int mTextresId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        mTextresId = textResId;
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextresId() {
        return mTextresId;
    }

    public void setTextresId(int textresId) {
        mTextresId = textresId;
    }
}
