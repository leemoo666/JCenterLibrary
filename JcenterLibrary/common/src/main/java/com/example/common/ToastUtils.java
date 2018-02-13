package com.example.common;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by lixiaoming on 2018/2/13.
 */

public class ToastUtils {
    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
