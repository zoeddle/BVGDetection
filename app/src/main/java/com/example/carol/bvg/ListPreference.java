package com.example.carol.bvg;

import android.content.Context;
import android.util.AttributeSet;

public class ListPreference extends android.preference.ListPreference {
    public ListPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        super.onDialogClosed(positiveResult);

        setSummary(getSummary());
    }

    @Override
    public CharSequence getSummary() {
        return this.getValue();
    }
}
