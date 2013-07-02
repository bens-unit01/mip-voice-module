package com.megamip.voice;

import com.example.megamip_voice_module_1_0.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	private WebView webView;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);

		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		
		//webView.loadUrl("http://www.google.com");

		String customHtml = "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Strict//EN'"+
         "'http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd'>" +
         		"<html xmlns='http://www.w3.org/1999/xhtml'>   <head> <meta http-equiv='content-type' content='text/html; charset=utf-8'/>"+
               " <title>Hello World - Google  Web Search API Sample</title>"+
               "<script src='https://www.google.com/jsapi'"+
               " type='text/javascript'></script>  <script language='Javascript' type='text/javascript'>"+
               " google.load('search', '1');"+
               "function OnLoad() {"+
               "  var searchControl = new google.search.SearchControl();"+
               " var localSearch = new google.search.ImageSearch();"+
               "searchControl.addSearcher(localSearch);"+
               "searchControl.draw(document.getElementById('searchcontrol'));"+
               "searchControl.execute('VW GTI');  }"+
               "google.setOnLoadCallback(OnLoad);   </script>   </head>"+
               "<body> <div id='searchcontrol'>Loading</div> </body> </html>";

		       webView.loadData(customHtml, "text/html", "UTF-8");

	}

}