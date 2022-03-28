package com.example.smpnegeri3kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EdukasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi);
        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://nisn.data.kemdikbud.go.id/");
        web.setWebViewClient(new WebViewClient());
    }
}