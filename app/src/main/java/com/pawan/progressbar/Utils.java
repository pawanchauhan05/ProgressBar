package com.pawan.progressbar;

import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

/**
 * Created by pawan on 29/12/16.
 */

public class Utils {

    public static void showProgressBar(ProgressDialog progressDialog) {
        progressDialog.show();
        progressDialog.setCancelable(true);
    }

    public static void showCustomProgressBar(ProgressDialog progressDialog) {
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        progressDialog.show();
        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setCancelable(true);
    }

    public static void hideProgressBar(ProgressDialog progressDialog) {
        progressDialog.hide();
    }
}
