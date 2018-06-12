package codepath.apps.demointroandroid;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewDemoActivity extends android.app.Activity {

    WebView gvWebview;

    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(codepath.apps.demointroandroid.R.layout.activity_web_view_demo);
        populateWebview();
    }

    private void populateWebview() {
        gvWebview = findViewById(codepath.apps.demointroandroid.R.id.gvWebview);
        android.webkit.WebSettings webSettings = gvWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        gvWebview.setWebViewClient(new WebViewClient());

        gvWebview.loadUrl("http://www.google.com");

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(codepath.apps.demointroandroid.R.menu.activity_grid_view_demo, menu);
        return true;
    }
}
