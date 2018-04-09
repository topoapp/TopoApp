package navigation.maps.sharing.location.address.digital.app.topo.mylibrary;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;



import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



/**
 * Created by Manoj on 4/19/2017.
 */

public class Utility {


    public static Typeface fontTitlereguler;
    public static void loadFonts(Context con) {
        //fontTitlereguler =  getTypefaceInAsset(R.string.montserrat, con);

    }

    public static Typeface getTypefaceInAsset(int font_name, Context con) {
        return Typeface.createFromAsset(con.getAssets(), "fonts/" + con.getResources().getString(font_name));
    }

    public static boolean isEmpty(EditText editText) {
        boolean flag = false;
        if (editText.getText().toString().equals("") || editText.getText().toString().length() == 0) {
            flag = true;
        }
        return flag;
    }
    public static void startPermissionActivity(Activity context, int type) {
        Intent permissionIntent = new Intent(context, PermissionsActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        permissionIntent.putExtras(bundle);
        permissionIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(permissionIntent);
    }
}