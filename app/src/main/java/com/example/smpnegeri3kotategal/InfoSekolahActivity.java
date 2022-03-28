package com.example.smpnegeri3kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InfoSekolahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_sekolah);
        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://smpn3tegal.sch.id/home/berita-cat/1-3-INFO%20SEKOLAH");
        web.setWebViewClient(new WebViewClient());
    }
}