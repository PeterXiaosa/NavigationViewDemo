package com.example.xiaosa.navigationviewdemo;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    LinearLayout ll_camera,ll_gallery,ll_slideshow,ll_setting,ll_share,ll_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        initView();

        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.setDrawerListener(toogle);
        toogle.syncState();

        ll_camera.setOnClickListener(this);
        ll_gallery.setOnClickListener(this);
        ll_slideshow.setOnClickListener(this);
        ll_setting.setOnClickListener(this);
        ll_share.setOnClickListener(this);
        ll_send.setOnClickListener(this);
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getChildAt(0).getRootView();
        ll_camera = (LinearLayout) headerView.findViewById(R.id.ll_camera);
        ll_gallery = (LinearLayout) headerView.findViewById(R.id.ll_gallery);
        ll_slideshow = (LinearLayout) headerView.findViewById(R.id.ll_slideshow);
        ll_setting = (LinearLayout) headerView.findViewById(R.id.ll_setting);
        ll_share = (LinearLayout) headerView.findViewById(R.id.ll_share);
        ll_send = (LinearLayout) headerView.findViewById(R.id.ll_send);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ll_camera:
                Toast.makeText(this, "这里可以处理camera的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.ll_gallery:
                Toast.makeText(this, "这里可以处理gallery的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.ll_slideshow:
                Toast.makeText(this, "这里可以处理slideshow的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.ll_setting:
                Toast.makeText(this, "这里可以处理setting的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.ll_share:
                Toast.makeText(this, "这里可以处理share的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.ll_send:
                Toast.makeText(this, "这里可以处理send的点击事件", Toast.LENGTH_SHORT).show();
                drawer.closeDrawer(GravityCompat.START);
                break;
            default:
                drawer.closeDrawer(GravityCompat.START);
                break;
        }
    }
}
