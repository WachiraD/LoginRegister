package com.example.david.loginregister;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;

public class MybradcastReceiver extends BroadcastReceiver {
    public MybradcastReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

            SmsMessage[] msgs = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                    if(msgs !=null && msgs.length>0) {
                        for (SmsMessage m : msgs) {
                            m.getDisplayMessageBody();
                        }
                    }

        throw new UnsupportedOperationException("Not yet implemented");
    }
}
