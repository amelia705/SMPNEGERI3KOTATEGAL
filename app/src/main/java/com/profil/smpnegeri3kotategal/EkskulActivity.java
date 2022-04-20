package com.profil.smpnegeri3kotategal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.hdrekskul1,
            R.drawable.hdrekskul2,
            R.drawable.hdrekskul3,
            R.drawable.hdrekskul1,
            R.drawable.hdrekskul2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void pramuka(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, PmrActivity.class);
        startActivity(intent);
    }

    public void futsal(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, FutsalActivity.class);
        startActivity(intent);
    }

    public void volly(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, VollyActivity.class);
        startActivity(intent);
    }

    public void karate(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, KarateActivity.class);
        startActivity(intent);
    }

    public void basket(View view) {
        Intent intent = new Intent(com.profil.smpnegeri3kotategal.EkskulActivity.this, BasketActivity.class);
        startActivity(intent);
    }
}