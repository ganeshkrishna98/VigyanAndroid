package com.ksu_cem.vigyan

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar

class Teacher_Webview_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher__webview__main)
        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.tlclnt)
        val setting = webView.settings
        setting.javaScriptEnabled = true

        val ProgressBar = findViewById<ProgressBar>(R.id.progressBar)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                ProgressBar.isShown
                super.onPageStarted(view, url, favicon)
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                ProgressBar.setVisibility(View.INVISIBLE)
                super.onPageFinished(view, url)
            }

        }
        webView.loadUrl("https://vigyanportal.web.app")
    }
}


