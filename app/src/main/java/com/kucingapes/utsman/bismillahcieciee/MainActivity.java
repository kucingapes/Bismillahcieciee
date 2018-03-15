package com.kucingapes.utsman.bismillahcieciee;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity {

//    ShineButton shine1;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ini custom font - calighapy
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/CreteRound-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
        // custom font sampe sini
        setupFullscreen();
    }

    // push custom font - caligrahpy
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
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

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void materi(View view) {
        Intent iMateri = new Intent(this, Materi.class);
        startActivity(iMateri);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void soal(View view) {
        Intent iSoal = new Intent(this, Soal.class);
        startActivity(iSoal);
    }
}
