package com.dueeeke.dkplayer.activity.api;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.dueeeke.dkplayer.R;

/**
 * 基础API相关Demo
 * Created by xinyu on 2018/1/3.
 */

public class ApiActivity extends AppCompatActivity {

    private static final String VOD_URL = "http://mov.bn.netease.com/open-movie/nos/flv/2017/01/03/SC8U8K7BC_hd.flv";
//    private static final String VOD_URL = "http://vfile.hshan.com/2018/1524/9156/4430/152491564430.ssm/152491564430.m3u8";
//    private static final String VOD_URL = "https://aweme.snssdk.com/aweme/v1/play/?video_id=3fdb4876a7f34bad8fa957db4b5ed159&line=0&ratio=720p&media_type=4&vr_type=0";
    //断线自动重连,需加上ijkhttphook:
//    private static final String VOD_URL = "ijkhttphook:http://mov.bn.netease.com/open-movie/nos/flv/2017/01/03/SC8U8K7BC_hd.flv";
    private static final String LIVE_URL = "rtmp://live.hkstv.hk.lxdns.com/live/hks";
    //断线自动重连,需加上ijklivehook:
//    private static final String LIVE_URL = "ijklivehook:rtmp://live.hkstv.hk.lxdns.com/live/hks";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
    }

    public void skipToVodPlayer(View view) {
//        String path = Environment.getExternalStorageDirectory().getAbsolutePath();
//        String url = "file://" + path + File.separator + "test.mp4";
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("url", VOD_URL);
        intent.putExtra("isLive", false);
        startActivity(intent);
    }

    public void skipToLivePlayer(View view) {
        Intent intent = new Intent(this, PlayerActivity.class);
        intent.putExtra("url", LIVE_URL);
        intent.putExtra("isLive", true);
        startActivity(intent);
    }

    public void skipToCustomPlayer(View view) {
        startActivity(new Intent(this, CustomMediaPlayerActivity.class));
    }

    public void skipToDefinitionPlayer(View view) {
        startActivity(new Intent(this, DefinitionPlayerActivity.class));
    }

    public void skipToScreenShotPlayer(View view) {
        startActivity(new Intent(this, ScreenShotPlayerActivity.class));
    }

    public void skipToRawOrAssets(View view) {
        startActivity(new Intent(this, PlayRawAssetsActivity.class));
    }

    public void multiPlayer(View view) {
        startActivity(new Intent(this, MultiPlayerActivity.class));
    }
}
