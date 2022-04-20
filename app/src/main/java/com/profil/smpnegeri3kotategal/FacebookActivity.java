package com.profil.smpnegeri3kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        WebView web = (WebView) findViewById(R.id.webview);
        web.loadUrl("https://www.facebook.com/smp3tegalyess");
        web.setWebViewClient(new WebViewClient());
    }
}