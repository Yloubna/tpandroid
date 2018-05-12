package com.tpandroid.loubna.tp5exo3;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by loubnayousfi on 5/12/18.
 */

public class Cours extends Activity {
    private static final String VALUE = "value";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.detailsfragment);
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String s = extras.getString(VALUE);
            TextView view = findViewById(R.id.label);
            view.setText(s);
        }
    }
}
