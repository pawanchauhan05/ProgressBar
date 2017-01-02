package com.pawan.progressbar;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

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

    public static void savePreferenceData(Context context, String key, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String readPreferenceData(Context context, String key, String defaultValue) {
        if (context != null) {
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
            return sp.getString(key, defaultValue);
        }
        return null;
    }

    public static void clearPreferences(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
    }

    public static void removePreferenceData(Context context, String key) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().remove(key).commit();
    }

    public static void changeCustomFont(Context context, View[] views, String font) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), font);
        if (font.equals("SERIF")) {
            typeface.create(Typeface.SERIF, Typeface.NORMAL);
        } else if (font.equals("SANS_SERIF")) {
            typeface.create(Typeface.SANS_SERIF, Typeface.NORMAL);
        } else if (font.equals("MONOSPACE")) {
            typeface.create(Typeface.MONOSPACE, Typeface.NORMAL);
        }

        for (View view : views) {
            if (view instanceof TextView)
                ((TextView) view).setTypeface(typeface);
            else if (view instanceof EditText)
                ((EditText) view).setTypeface(typeface);
            else if (view instanceof Button)
                ((Button) view).setTypeface(typeface);
            else if (view instanceof RadioButton)
                ((RadioButton) view).setTypeface(typeface);
        }
    }

    /*public static void changeCustomFont(Context context, View[] views, String font, int style) {
        String fontPath = "";

        Typeface typeface = Typeface.defaultFromStyle(Typeface.NORMAL);
        if (font.equals("Museo")) {
            fontPath = "fonts/museo-sans-300.ttf";
            typeface = Typeface.createFromAsset(context.getAssets(), fontPath);
        }
        //for default font
        if (font.equals("SERIF")) {
            typeface.create(Typeface.SERIF, style);
        } else if (font.equals("SANS_SERIF")) {
            typeface.create(Typeface.SANS_SERIF, style);
        } else if (font.equals("MONOSPACE")) {
            typeface.create(Typeface.MONOSPACE, style);
        }
        for (View view : views) {
            if (view instanceof TextView)
                ((TextView) view).setTypeface(typeface, style);
            else if (view instanceof EditText)
                ((EditText) view).setTypeface(typeface, style);
            else if (view instanceof Button)
                ((Button) view).setTypeface(typeface, style);
            else if (view instanceof RadioButton)
                ((RadioButton) view).setTypeface(typeface, style);
        }
    }*/
}
