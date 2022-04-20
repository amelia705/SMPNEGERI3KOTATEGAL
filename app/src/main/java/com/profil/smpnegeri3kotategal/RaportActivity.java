package com.profil.smpnegeri3kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class RaportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raport);
        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://smpn3tegal.sch.id/raport3/");
        web.setWebViewClient(new WebViewClient());
    }
}