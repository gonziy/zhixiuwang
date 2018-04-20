package com.zxxapp.mall.maintenance.ui.mine.child;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zxxapp.mall.maintenance.R;
import com.zxxapp.mall.maintenance.ui.shopping.ShopListActivity;

public class UserInfoEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info_edit);
    }

    public static void start(Context mContext) {
        Intent intent = new Intent(mContext, UserInfoEditActivity.class);
        intent.putExtra("ServiceId", 0);
        ActivityOptionsCompat options = ActivityOptionsCompat.makeBasic();
        ActivityCompat.startActivity(mContext, intent, options.toBundle());
    }
}
