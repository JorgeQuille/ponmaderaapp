package ponmaderaapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private String url = "https://job.ponmadera.com/trabajador";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.visor_web_id);
        final WebSettings configVisorWeb = webView.getSettings();
        configVisorWeb.setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}