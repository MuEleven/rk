package com.bw.rikao;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private WebView wb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv1 = (TextView) findViewById(R.id.tv1);
        wb1 = (WebView) findViewById(R.id.wb1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wb1.loadUrl("http://172.17.8.100/small/commodity/v1/bannerShow");
                wb1.setWebViewClient(new WebViewClient());
            }
        });
    }
}
