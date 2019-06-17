package project.doors.theme;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

@SuppressWarnings("ALL")
public class DoorsTheme {

    private static int selectedTheme = 0;

    private static SharedPreferences getPrefs(Context c) {
        SharedPreferences prefs = c.getSharedPreferences("theme", Context.MODE_PRIVATE);
        try {
            c = c.createPackageContext("com.doors.styles", 0);
            prefs = c.getSharedPreferences("theme", Context.MODE_PRIVATE);
            File prefsFile = new File(c.getApplicationInfo().dataDir + "/shared_prefs/theme.xml");
            if (prefsFile.exists() && !prefsFile.canRead()) {
                Log.e("DoorsTheme", "No permission to read theme settings! Please contact the developer!");
                Toast.makeText(c, "No permission to read theme settings! Please contact the developer!", Toast.LENGTH_LONG).show();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.i("DoorsTheme", "Application package com.doors.styles not found. Using preferences from this application package instead.");
        }
        return prefs;
    }

    public static boolean isDarkMode(Context context){
        return getPrefs(context).getBoolean("dark_mode", false);
    }

    public static String getColorAccent(Context context){
        return getPrefs(context).getString("color_accent", "default_blue");
    }

    public static void checkTheme(Context context) {
        Boolean isDarkMode = isDarkMode(context);
        if (isDarkMode)
            context.setTheme(R.style.DoorsTheme_Dark);
        else
            context.setTheme(R.style.DoorsTheme_Light);
        finishSelection(context, isDarkMode);
    }

    public static void checkDialogTheme(Context context) {
        Boolean isDarkMode = isDarkMode(context);
        if (isDarkMode)
            context.setTheme(R.style.DoorsTheme_Dark_DialogTheme);
        else
            context.setTheme(R.style.DoorsTheme_Light_DialogTheme);
        finishSelection(context, isDarkMode);
    }

    public static void checkNoActionBarTheme(Context context) {
        Boolean isDarkMode = isDarkMode(context);
        if (isDarkMode)
            context.setTheme(R.style.DoorsTheme_Dark_NoActionBar);
        else
            context.setTheme(R.style.DoorsTheme_Light_NoActionBar);
        finishSelection(context, isDarkMode);
    }

    private static void finishSelection(Context c, Boolean isDarkMode) {
        if (isDarkMode) recent(c, R.color.DoorsTheme_black);
        else recent(c, R.color.DoorsTheme_white);
        if(!c.getResources().getBoolean(R.bool.DoorsTheme_lazy_loading) || selectedTheme == 0)
            switch (getColorAccent(c)) {
                case "yellow_gold":
                    selectedTheme = R.style.DoorsTheme_yellow_gold;
                    break;
                case "gold":
                    selectedTheme = R.style.DoorsTheme_gold;
                    break;
                case "orange_bright":
                    selectedTheme = R.style.DoorsTheme_orange_bright;
                    break;
                case "orange_dark":
                    selectedTheme = R.style.DoorsTheme_orange_dark;
                    break;
                case "rust":
                    selectedTheme = R.style.DoorsTheme_rust;
                    break;
                case "pale_rust":
                    selectedTheme = R.style.DoorsTheme_pale_rust;
                    break;
                case "brick_red":
                    selectedTheme = R.style.DoorsTheme_brick_red;
                    break;
                case "mod_red":
                    selectedTheme = R.style.DoorsTheme_mod_red;
                    break;
                case "pale_red":
                    selectedTheme = R.style.DoorsTheme_pale_red;
                    break;
                case "red":
                    selectedTheme = R.style.DoorsTheme_red;
                    break;
                case "rose_bright":
                    selectedTheme = R.style.DoorsTheme_rose_bright;
                    break;
                case "rose":
                    selectedTheme = R.style.DoorsTheme_rose;
                    break;
                case "plum_light":
                    selectedTheme = R.style.DoorsTheme_plum_light;
                    break;
                case "plum":
                    selectedTheme = R.style.DoorsTheme_plum;
                    break;
                case "orchid_light":
                    selectedTheme = R.style.DoorsTheme_orchid_light;
                    break;
                case "orchid":
                    selectedTheme = R.style.DoorsTheme_orchid;
                    break;
                case "default_blue":
                    selectedTheme = R.style.DoorsTheme_default_blue;
                    break;
                case "navy_blue":
                    selectedTheme = R.style.DoorsTheme_navy_blue;
                    break;
                case "purple_shadow":
                    selectedTheme = R.style.DoorsTheme_purple_shadow;
                    break;
                case "purple_shadow_dark":
                    selectedTheme = R.style.DoorsTheme_purple_shadow_dark;
                    break;
                case "iris_pastel":
                    selectedTheme = R.style.DoorsTheme_iris_pastel;
                    break;
                case "iris_spring":
                    selectedTheme = R.style.DoorsTheme_iris_spring;
                    break;
                case "violet_red_light":
                    selectedTheme = R.style.DoorsTheme_violet_red_light;
                    break;
                case "violet_red":
                    selectedTheme = R.style.DoorsTheme_violet_red;
                    break;
                case "cool_blue_bright":
                    selectedTheme = R.style.DoorsTheme_cool_blue_bright;
                    break;
                case "cool_blue":
                    selectedTheme = R.style.DoorsTheme_cool_blue;
                    break;
                case "seafoam":
                    selectedTheme = R.style.DoorsTheme_seafoam;
                    break;
                case "seafoam_teal":
                    selectedTheme = R.style.DoorsTheme_seafoam_teal;
                    break;
                case "mint_light":
                    selectedTheme = R.style.DoorsTheme_mint_light;
                    break;
                case "mint_dark":
                    selectedTheme = R.style.DoorsTheme_mint_dark;
                    break;
                case "turf_green":
                    selectedTheme = R.style.DoorsTheme_turf_green;
                    break;
                case "sport_green":
                    selectedTheme = R.style.DoorsTheme_sport_green;
                    break;
                case "gray":
                    selectedTheme = R.style.DoorsTheme_gray;
                    break;
                case "gray_brown":
                    selectedTheme = R.style.DoorsTheme_gray_brown;
                    break;
                case "steel_blue":
                    selectedTheme = R.style.DoorsTheme_steel_blue;
                    break;
                case "metal_blue":
                    selectedTheme = R.style.DoorsTheme_metal_blue;
                    break;
                case "pale_moss":
                    selectedTheme = R.style.DoorsTheme_pale_moss;
                    break;
                case "moss":
                    selectedTheme = R.style.DoorsTheme_moss;
                    break;
                case "meadow_green":
                    selectedTheme = R.style.DoorsTheme_meadow_green;
                    break;
                case "green":
                    selectedTheme = R.style.DoorsTheme_green;
                    break;
                case "overcast":
                    selectedTheme = R.style.DoorsTheme_overcast;
                    break;
                case "storm":
                    selectedTheme = R.style.DoorsTheme_storm;
                    break;
                case "blue_gray":
                    selectedTheme = R.style.DoorsTheme_blue_gray;
                    break;
                case "gray_dark":
                    selectedTheme = R.style.DoorsTheme_gray_dark;
                    break;
                case "liddy_green":
                    selectedTheme = R.style.DoorsTheme_liddy_green;
                    break;
                case "sage":
                    selectedTheme = R.style.DoorsTheme_sage;
                    break;
                case "camouflage_desert":
                    selectedTheme = R.style.DoorsTheme_camouflage_desert;
                    break;
                case "camouflage":
                    selectedTheme = R.style.DoorsTheme_camouflage;
                    break;
            }
        c.setTheme(selectedTheme);
        Log.i("DoorsTheme", "Applied theme with color accent " + getColorAccent(c) + " and dark mode set to " + isDarkMode);
    }

    private static void recent(Context c, int color){
        ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(
                c.getString(R.string.DoorsTheme_recents_name),
                BitmapFactory.decodeResource(c.getResources(), R.drawable.DoorsTheme_recents_icon),
                ContextCompat.getColor(c, color)
        );
        ((Activity)c).setTaskDescription(taskDescription);
    }
}
