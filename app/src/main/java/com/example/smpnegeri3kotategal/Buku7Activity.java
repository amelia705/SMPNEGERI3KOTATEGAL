package com.example.smpnegeri3kotategal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku7);
    }

    public void mat7(View view) {
        goToUrl("https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }
    public void penjas7(View view) {
        goToUrl("https://drive.google.com/file/d/1IH2zX5IZNIUUjL-xHT3eOS2HE8QJDipw/view?usp=sharing");
    }
    public void ipa1kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1IVlMAu5WvVR5WCMfXqzqXmyJfEN1KViQ/view?usp=sharing");
    }
    public void ppkn7(View view) {
        goToUrl("https://drive.google.com/file/d/1IHQihHJPuT2Wjv6whNvwtgcXDXX_pjMO/view?usp=sharing");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}