package com.example.dialogs;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = (Button) findViewById(R.id.btn_dialog);

        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                confirmFireMissiles();
                CustomDialogClass cdd=new CustomDialogClass(MainActivity.this);
                cdd.show();
            }
        });

    }

    public void confirmFireMissiles() {
        DialogFragment newFragment = new FireMissilesDialogFragment();
        newFragment.show(getSupportFragmentManager(), "missiles");
    }
}
