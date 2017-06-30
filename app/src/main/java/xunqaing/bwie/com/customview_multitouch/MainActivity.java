package xunqaing.bwie.com.customview_multitouch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this,ImageViewerActivity.class);
        startActivity(i);

//        int a[] = {1,2,3};
//
//        System.out.println(a[4]);
    }
}
