package com.majesthink.adik.kemendikbud.activity;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.majesthink.adik.kemendikbud.R;
import com.majesthink.adik.kemendikbud.SliderItemDecoration;
import com.majesthink.adik.kemendikbud.adapter.SliderDetailAdapter;
import com.majesthink.adik.kemendikbud.model.SliderDetail;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    android.support.v7.widget.Toolbar toolbarm;
    RecyclerView recyclerView;
    SliderDetailAdapter sliderDetailAdapter;
    List<SliderDetail> sliderDetailList = new ArrayList<>();

    ImageView app_detail_icon;
    TextView app_detail_name, app_detail_developer, app_detail_size, app_detail_rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toolbarm = findViewById(R.id.toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            toolbarm.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
        toolbarm.setNavigationIcon(R.drawable.ic_close);
        toolbarm.inflateMenu(R.menu.detail_menu);

        app_detail_icon = findViewById(R.id.app_icon);
        app_detail_name = findViewById(R.id.app_name);
        app_detail_developer = findViewById(R.id.app_developer);
        app_detail_size = findViewById(R.id.size);
        app_detail_rate = findViewById(R.id.app_rate);

        recyclerView = findViewById(R.id.slider_preview);

        loadIntentData();
        loadSlider();
        dataSlider();
    }



    private void loadIntentData() {
        String APP_NAME = getIntent().getStringExtra("APP_NAME");
        String APP_ICON = getIntent().getStringExtra("APP_ICON");
        String APP_DEVELOPER = getIntent().getStringExtra("APP_DEVELOPER");
        String APP_SIZE = getIntent().getStringExtra("APP_SIZE");
        String APP_RATE = getIntent().getStringExtra("APP_RATE");

        Picasso.get()
                .load(APP_ICON)
                .resize(300, 300)
                .into(app_detail_icon);

        app_detail_name.setText(APP_NAME);
        app_detail_developer.setText(APP_DEVELOPER);
        app_detail_size.setText(APP_SIZE);
        app_detail_rate.setText(APP_RATE);

    }

    private void dataSlider() {
        SliderDetail sliderDetail = new SliderDetail("asad", "https://www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge_wm_brw/public/article_images/2017/07/action-launcher-notification-previews.jpg?itok=q27LwA8I");
        sliderDetailList.add(sliderDetail);
        sliderDetail = new SliderDetail("asad", "https://www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge_wm_brw/public/article_images/2017/11/nova-settings-hero-red-pixel.jpg?itok=dprD8mfy");
        sliderDetailList.add(sliderDetail);
        sliderDetail = new SliderDetail("asad", "https://vyavasthit.com/wp-content/uploads/2018/03/arrow-launcher-s8-2017.jpg");
        sliderDetailList.add(sliderDetail);
        sliderDetail = new SliderDetail("asad", "https://www.androidcentral.com/sites/androidcentral.com/files/styles/xlarge_wm_brw/public/article_images/2017/08/notification-preview-blue-action-launcher-pixel.jpg?itok=rL2n-Eod");
        sliderDetailList.add(sliderDetail);
        sliderDetail = new SliderDetail("asad", "https://i.imgur.com/yvy583p.png?1");
        sliderDetailList.add(sliderDetail);
    }

    private void loadSlider() {
        recyclerView.findViewById(R.id.slider_preview);
        sliderDetailAdapter = new SliderDetailAdapter(this, sliderDetailList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(sliderDetailAdapter);

        int space = getResources().getDimensionPixelSize(R.dimen.slider_margin);
        recyclerView.addItemDecoration(new SliderItemDecoration(space));

    }
}
