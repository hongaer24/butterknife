package com.example.hongaer.butterknife;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class Butterknife extends Activity {

    @BindView(R.id.tv_butterknife)
    TextView tvButterknife;
    @BindView(R.id.cb_butterknife)
    CheckBox cbButterknife;
    @BindView(R.id.bt_butterknife)
    Button btButterknife;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butterknife);
        ButterKnife.bind(this);

        initData();

    }

    private void initData() {

         tvButterknife.setText("呆逼好帅");
    }

    @OnClick(R.id.cb_butterknife)
    void cbButton(View v) {
        Toast.makeText(Butterknife.this, "点击cb", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.bt_butterknife)
    void btButton(View v) {

        Toast.makeText(Butterknife.this, "点击button", Toast.LENGTH_SHORT).show();
    }
}
