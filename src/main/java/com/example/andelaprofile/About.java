package com.example.andelaprofile;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

       webView = (WebView) findViewById(R.id.web_view);
       webView.setWebViewClient(new WebViewClient(){
       @Override
        public void  onReceivedSslError(WebView view , SslErrorHandler handler, SslError error){
           handler.proceed();
       }});
       webView.loadUrl("https://andela.com/alc");
        
    }
}
