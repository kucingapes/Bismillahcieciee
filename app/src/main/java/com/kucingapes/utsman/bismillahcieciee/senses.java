package com.kucingapes.utsman.bismillahcieciee;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sackcentury.shinebuttonlib.ShineButton;

public class senses extends AppCompatActivity {

    ShineButton btnMata;
    ShineButton btnHidung;
    ShineButton btnKuping;
    ShineButton btnLidah;
    ShineButton btnKulit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senses);
        bindView();
        setupFullscreen();
        setupChecked();


    }

    private void bindView() {
        btnMata = (ShineButton) findViewById(R.id.ic_mata);
        btnHidung = (ShineButton) findViewById(R.id.ic_hidung);
        btnKuping = (ShineButton) findViewById(R.id.ic_kuping);
        btnLidah = (ShineButton) findViewById(R.id.ic_lidah);
        btnKulit = (ShineButton) findViewById(R.id.ic_kulit);
    }

    private void setupFullscreen() {
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
    }

    private void setupChecked() {
        btnMata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMata.setChecked(false);
            }
        });

        btnKuping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnKuping.setChecked(false);
            }
        });

        btnHidung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnHidung.setChecked(false);
            }
        });

        btnLidah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnLidah.setChecked(false);
            }
        });

        btnKulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnKulit.setChecked(false);
            }
        });
    }
}
