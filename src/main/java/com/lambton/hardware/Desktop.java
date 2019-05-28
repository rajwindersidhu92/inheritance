package com.lambton.hardware;

public class Desktop extends Computer {
    private float keyboardCompanyName;
    private float screetype;

    public float getKeyboardCompanyName() {
        return keyboardCompanyName;
    }

    public void setKeyboardCompanyName(float keyboardCompanyName) {
        this.keyboardCompanyName = keyboardCompanyName;
    }

    public float getScreetype() {
        return screetype;
    }

    public void setScreetype(float screetype) {
        this.screetype = screetype;
    }
}
