package com.majesthink.adik.kemendikbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.majesthink.adik.kemendikbud.adapter.SliderAdapter;
import com.majesthink.adik.kemendikbud.model.Slider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Slider> sliderList = new ArrayList<>();
    SliderAdapter sliderAdapter;
    RecyclerView sliderItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderItem = findViewById(R.id.banner_slider);
        sliderAdapter = new SliderAdapter(this, sliderList);
        sliderItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        sliderItem.setItemAnimator(new DefaultItemAnimator());
        sliderItem.setAdapter(sliderAdapter);

        int margin = getResources().getDimensionPixelSize(R.dimen.slider_margin);
        sliderItem.addItemDecoration(new SliderItemDecoration(margin));

        dataSlider();
    }

    private void dataSlider() {

        Slider slider = new Slider("Slider 1", "https://s3-eu-west-1.amazonaws.com/assets.kobaltmusic.com/_blogcenter/AWAL-App-Blog-Header.png?mtime=20170327211900");
        sliderList.add(slider);

        slider = new Slider("Slider 2", "https://i1.wp.com/www.feedough.com/wp-content/uploads/2018/03/mobile-app-promotion-51-3.png?resize=1280%2C620&ssl=1");
        sliderList.add(slider);
    }
}
