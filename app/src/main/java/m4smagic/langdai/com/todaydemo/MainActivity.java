package m4smagic.langdai.com.todaydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.web.god.refresh.GodRefreshLayout;

public class MainActivity extends AppCompatActivity {

    GodRefreshLayout godRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        godRefreshLayout = findViewById(R.id.refreshLayout);

        godRefreshLayout.setRefreshManager();
    }
}
