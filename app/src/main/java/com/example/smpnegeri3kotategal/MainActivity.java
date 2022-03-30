package com.example.smpnegeri3kotategal;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;


public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout = AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

    }
    public void profil(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, GuruActivity.class);
        startActivity(intent);
    }

    public void ekskul(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void perpus(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, PerpusActivity.class);
        startActivity(intent);
    }

    public void galery(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

    public void raport(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, RaportActivity.class);
        startActivity(intent);
    }

    public void edukasi(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, EdukasiActivity.class);
        startActivity(intent);
    }

    public void facebook(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.MainActivity.this, FacebookActivity.class);
        startActivity(intent);
    }

    public void youtube(View view) {
        goToUrl("https://youtube.com/channel/UCvxnEquTYoySco_8qQZ5aQA/");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}

