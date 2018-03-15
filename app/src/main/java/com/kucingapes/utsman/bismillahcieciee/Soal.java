package com.kucingapes.utsman.bismillahcieciee;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sackcentury.shinebuttonlib.ShineButton;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class Soal extends AppCompatActivity {


    /* set skor awal 0 */
    private int score = 0;

    LinearLayout soal_01, soal_02, soal_03, soal_04, soal_05;

    ShineButton btnBetul_01, btnSalah_01
            , btnBetul_02, btnSalah_02
            , btnBetul_03, btnSalah_03
            , btnBetul_04, btnSalah_04
            , btnBetul_05, btnSalah_05;

    TextView textScore, textKuis;
    Button lanjutSoalBtn;
    RelativeLayout layoutLanjut, layoutScore;
    KonfettiView viewKonfetti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);
        setupFullscreen(); /* setup fullscreen */
        bindView(); /* method bind, mengarahkan pada id di xml */
        btnSetup(); /* setup warna button benar dan salah */

        lanjutSoalBtn.setEnabled(false); /* seting awal button lanjut soal disable */

        /* method soal-soal */
        mSoal_1();
        mSoal_2();
        mSoal_3();
        mSoal_4();
        mSoal_5();

        konfetti();
    }

    private void konfetti() {
        viewKonfetti = findViewById(R.id.viewKonfetti);
        viewKonfetti.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1.5f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(5000L)
                .addShapes(Shape.RECT, Shape.CIRCLE)
                .addSizes(new Size(12, 5f))
                .setPosition(-100f, viewKonfetti.getWidth() + 800f, -100f, -100f)
                .stream(100, 5000L);
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

    private void bindView() {
        btnBetul_01 = findViewById(R.id.ic_betul_1);
        btnSalah_01 = findViewById(R.id.ic_salah_1);

        btnBetul_02 = findViewById(R.id.ic_betul_2);
        btnSalah_02 = findViewById(R.id.ic_salah_2);

        btnBetul_03 = findViewById(R.id.ic_betul_3);
        btnSalah_03 = findViewById(R.id.ic_salah_3);

        btnBetul_04 = findViewById(R.id.ic_betul_4);
        btnSalah_04 = findViewById(R.id.ic_salah_4);

        btnBetul_05 = findViewById(R.id.ic_betul_5);
        btnSalah_05 = findViewById(R.id.ic_salah_5);

        soal_01 = findViewById(R.id.soal_1);
        soal_02 = findViewById(R.id.soal_2);
        soal_03 = findViewById(R.id.soal_3);
        soal_04 = findViewById(R.id.soal_4);
        soal_05 = findViewById(R.id.soal_5);

        lanjutSoalBtn = findViewById(R.id.btnLanjutSoal);

        textScore = findViewById(R.id.textScore);
        textKuis = findViewById(R.id.textKuis);

        layoutLanjut = findViewById(R.id.layoutLanjut);
        layoutScore = findViewById(R.id.score);

    }

    private void btnSetup() {
        // soal 1
        btnBetul_01.setBtnColor(Color.GRAY);
        btnBetul_01.setBtnFillColor(Color.YELLOW);

        btnSalah_01.setBtnColor(Color.GRAY);
        btnSalah_01.setBtnFillColor(Color.RED);

        // soal 2
        btnBetul_02.setBtnColor(Color.GRAY);
        btnBetul_02.setBtnFillColor(Color.YELLOW);

        btnSalah_02.setBtnColor(Color.GRAY);
        btnSalah_02.setBtnFillColor(Color.RED);

        // soal 3
        btnBetul_03.setBtnColor(Color.GRAY);
        btnBetul_03.setBtnFillColor(Color.YELLOW);

        btnSalah_03.setBtnColor(Color.GRAY);
        btnSalah_03.setBtnFillColor(Color.RED);

        // soal 4
        btnBetul_04.setBtnColor(Color.GRAY);
        btnBetul_04.setBtnFillColor(Color.YELLOW);

        btnSalah_04.setBtnColor(Color.GRAY);
        btnSalah_04.setBtnFillColor(Color.RED);

        // soal 5
        btnBetul_05.setBtnColor(Color.GRAY);
        btnBetul_05.setBtnFillColor(Color.YELLOW);

        btnSalah_05.setBtnColor(Color.GRAY);
        btnSalah_05.setBtnFillColor(Color.RED);
    }



    /* METHOD SOAL 1 */
    private void mSoal_1() {
        /* buton salah adalah jawaban yang salah, di set animasi jadi 1 */
        btnSalah_01.setAnimDuration(1);

        btnBetul_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabBener();
                btnBetul_01.setEnabled(false);
                btnSalah_01.setEnabled(false);
                lanjutEnable();
            }
        });

        btnSalah_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabSalah();
                btnBetul_01.setEnabled(false);
                btnSalah_01.setEnabled(false);
                lanjutEnable();
            }
        });
    }

    /* METHOD SOAL 2 */
    private void mSoal_2() {
        btnBetul_02.setAnimDuration(1);

        btnBetul_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabSalah();
                btnBetul_02.setEnabled(false);
                btnSalah_02.setEnabled(false);
                lanjutEnable();
            }
        });
        btnSalah_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabBener();
                btnBetul_02.setEnabled(false);
                btnSalah_02.setEnabled(false);
                lanjutEnable();
            }
        });
    }

    /* METHOD SOAL 3 */
    private void mSoal_3() {
        btnBetul_03.setAnimDuration(1);

        btnBetul_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabSalah();
                btnBetul_03.setEnabled(false);
                btnSalah_03.setEnabled(false);
                lanjutEnable();
            }
        });
        btnSalah_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabBener();
                btnBetul_03.setEnabled(false);
                btnSalah_03.setEnabled(false);
                lanjutEnable();
            }
        });
    }

    /* METHOD SOAL 4 */
    private void mSoal_4() {
        btnSalah_04.setAnimDuration(1);

        btnBetul_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabBener();
                btnBetul_04.setEnabled(false);
                btnSalah_04.setEnabled(false);
                lanjutEnable();
            }
        });
        btnSalah_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabSalah();
                btnBetul_04.setEnabled(false);
                btnSalah_04.setEnabled(false);
                lanjutEnable();
            }
        });
    }

    /* METHOD SOAL 5 */
    private void mSoal_5() {
        btnSalah_05.setAnimDuration(1);

        btnBetul_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabBener();
                btnBetul_05.setEnabled(false);
                btnSalah_05.setEnabled(false);
                lanjutEnable();
                lanjutSoalBtn.setText("Lihat Skor");
            }
        });
        btnSalah_05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jwabSalah();
                btnBetul_05.setEnabled(false);
                btnSalah_05.setEnabled(false);
                lanjutEnable();
                lanjutSoalBtn.setText("Lihat Skor");
            }
        });
    }

    /* Method ketika untuk mengaktifkan button lanjut setelah menjawab soal */
    private void lanjutEnable() {
        lanjutSoalBtn.setEnabled(true);
    }

    /* Method jika jawaban benar */
    private void jwabBener() {
        Toast.makeText(getApplicationContext(), "Tepat", Toast.LENGTH_SHORT).show();
        score += 2;
    }

    /* Method jika jawaban salah */
    private void jwabSalah() {
        Toast.makeText(getApplicationContext(), "Tidak Tepat", Toast.LENGTH_SHORT).show();
    }


    /* onClick button lanjut soal */
    public void lanjutSoal(View view) {
        /* setting skor ke textview */
        textScore.setText(String.valueOf(score));

        /* logika ketika soal-soal visible */
        if (soal_01.getVisibility() == View.VISIBLE) {
            soal_01.setVisibility(View.GONE);
            soal_02.setVisibility(View.VISIBLE);
            lanjutSoalBtn.setEnabled(false);

        } else if (soal_02.getVisibility() == View.VISIBLE) {
            soal_02.setVisibility(View.GONE);
            soal_03.setVisibility(View.VISIBLE);
            lanjutSoalBtn.setEnabled(false);

        } else if (soal_03.getVisibility() == View.VISIBLE) {
            soal_03.setVisibility(View.GONE);
            soal_04.setVisibility(View.VISIBLE);
            lanjutSoalBtn.setEnabled(false);

        } else if (soal_04.getVisibility() == View.VISIBLE) {
            soal_04.setVisibility(View.GONE);
            soal_05.setVisibility(View.VISIBLE);
            lanjutSoalBtn.setEnabled(false);

        } else if (soal_05.getVisibility() == View.VISIBLE) {
            soal_05.setVisibility(View.GONE);
            layoutLanjut.setVisibility(View.GONE);
            layoutScore.setVisibility(View.VISIBLE);
            lanjutSoalBtn.setEnabled(false);
            textKuis.setVisibility(View.GONE);


        }
    }

}
