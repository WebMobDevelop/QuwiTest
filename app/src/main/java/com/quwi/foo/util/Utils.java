package com.quwi.foo.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.fragment.app.FragmentActivity;

import java.util.Objects;

public class Utils {

    // close soft keyboard
    public static void hideSoftKeyboard(FragmentActivity activity) {
        try {
            View view = Objects.requireNonNull(activity).getCurrentFocus();
            if (view != null) {
                InputMethodManager imm = ((InputMethodManager) Objects.requireNonNull(activity).getSystemService(Context.INPUT_METHOD_SERVICE));
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception ignored) {
            // todo: send sentry log or ..
        }
    }
}
