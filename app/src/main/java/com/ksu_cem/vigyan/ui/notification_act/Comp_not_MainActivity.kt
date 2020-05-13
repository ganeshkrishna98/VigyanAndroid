package com.ksu_cem.vigyan.ui.notification_act

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.ksu_cem.vigyan.R

class Comp_not_MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comp__not__main)
        supportActionBar?.hide()

        val webView = findViewById<WebView>(R.id.csnotifwv)
        val setting = webView.settings;
        setting.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webView.loadUrl("http://vigyan-portal.herokuapp.com/")

    }
}
