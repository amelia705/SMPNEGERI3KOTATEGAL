package com.example.smpnegeri3kotategal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class GaleriActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.hdrgaleri1,
            R.drawable.hdrgaleri2,
            R.drawable.hdrgaleri3,
            R.drawable.hdrgaleri1,
            R.drawable.hdrgaleri2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }


    public void kemah(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.GaleriActivity.this, KemahActivity.class);
        startActivity(intent);
    }

    public void harikartini(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.GaleriActivity.this, HariKartiniActivity.class);
        startActivity(intent);
    }

    public void drumband(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.GaleriActivity.this, DrumBandActivity.class);
        startActivity(intent);
    }

    public void karnaval(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.GaleriActivity.this, KarnavalActivity.class);
        startActivity(intent);
    }

    public void studytour(View view) {
        Intent intent = new Intent(com.example.smpnegeri3kotategal.GaleriActivity.this, StudyTourActivity.class);
        startActivity(intent);
    }
}