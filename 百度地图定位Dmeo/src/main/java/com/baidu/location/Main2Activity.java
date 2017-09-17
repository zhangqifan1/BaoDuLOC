package com.baidu.location;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baidu.baidulocationdemo.R;
import com.baidu.location.demo.DingweiActivity;

public class Main2Activity extends Activity implements View.OnClickListener {

    /**
     * 定位
     */
    private Button mButDingwei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();


    }

    private void initView() {
        mButDingwei = (Button) findViewById(R.id.butDingwei);
        mButDingwei.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.butDingwei:
                startActivity(new Intent(this, DingweiActivity.class));
                break;
        }
    }
}
