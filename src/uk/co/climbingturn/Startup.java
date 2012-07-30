package uk.co.climbingturn;

import org.apache.cordova.*;
import android.os.Bundle;

public class Startup extends DroidGap
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/SaveReward.html");
    }
}
