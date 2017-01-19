package com.sda.pieper.databindingpersonapp;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sda.pieper.databindingpersonapp.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        final Person person = new Person("Adrian", "Pieper", 1);
        binding.setPerson(person);
        person.setName("Adam");

        binding.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                person.setName("");
                person.setSurname("");
                person.setAge(0);
            }
        });
        binding.showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, person.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
