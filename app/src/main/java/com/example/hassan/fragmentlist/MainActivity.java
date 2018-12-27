package com.example.hassan.fragmentlist;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity  extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LatihanListFragment simpleListFragment = new LatihanListFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, simpleListFragment).commit();
    }
}
