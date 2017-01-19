package com.sda.pieper.databindingpersonapp;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.sda.pieper.databindingpersonapp.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPerson(new Person("Adrian", "Pieper", 1));

    }
}
