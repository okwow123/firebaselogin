package com.google.firebase.quickstart.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by root on 17. 7. 9.
 */

public class RouteActivity extends BaseActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        TextView route = (TextView) findViewById(R.id.route);

        Intent intent = getIntent(); //이 액티비티를 부른 인텐트를 받는다.
        String age = intent.getStringExtra("id"); //"jizard"문자 받아옴

        route.setText(String.valueOf(age));



    }
}
