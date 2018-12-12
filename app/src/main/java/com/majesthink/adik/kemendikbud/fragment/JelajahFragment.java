package com.majesthink.adik.kemendikbud.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.majesthink.adik.kemendikbud.R;
import com.majesthink.adik.kemendikbud.SliderItemDecoration;
import com.majesthink.adik.kemendikbud.adapter.NewestAdapter;
import com.majesthink.adik.kemendikbud.adapter.RecommendedAdapter;
import com.majesthink.adik.kemendikbud.adapter.SliderAdapter;
import com.majesthink.adik.kemendikbud.model.Newest;
import com.majesthink.adik.kemendikbud.model.Recommended;
import com.majesthink.adik.kemendikbud.model.Slider;

import java.util.ArrayList;
import java.util.List;

public  class JelajahFragment extends android.support.v4.app.Fragment {

    List<Slider> sliderList;
    SliderAdapter sliderAdapter;
    List<Newest> newestList;
    NewestAdapter newestAdapter;
    List<Recommended> recommendedList;
    RecommendedAdapter recommendedAdapter;
    RecyclerView sliderRecycler, newestRecyler, recommendedRecycler;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_jelajah, container, false);

        int margin = getResources().getDimensionPixelSize(R.dimen.slider_margin);

        sliderRecycler = view.findViewById(R.id.banner_slider);
        sliderList = new ArrayList<>();
        sliderAdapter = new SliderAdapter(container.getContext(), sliderList);
        sliderRecycler.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        sliderRecycler.setItemAnimator(new DefaultItemAnimator());
        sliderRecycler.addItemDecoration(new SliderItemDecoration(margin));
        sliderRecycler.setAdapter(sliderAdapter);

        newestRecyler = view.findViewById(R.id.list_newest);
        newestList = new ArrayList<>();
        newestAdapter = new NewestAdapter(container.getContext(), newestList);
        newestRecyler.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false));
        newestRecyler.setItemAnimator(new DefaultItemAnimator());
        newestRecyler.addItemDecoration(new SliderItemDecoration(margin));
        newestRecyler.setAdapter(newestAdapter);

        recommendedRecycler = view.findViewById(R.id.list_recommended);
        recommendedList = new ArrayList<>();
        recommendedAdapter = new RecommendedAdapter(container.getContext(), recommendedList);
        recommendedRecycler.setLayoutManager(new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false));
        recommendedRecycler.setItemAnimator(new DefaultItemAnimator());
        recommendedRecycler.setAdapter(recommendedAdapter);

        dataSlider();
        dataNewest();
        dataRecommended();

        return view;
    }

    private void dataSlider() {

        Slider slider = new Slider("Slider 1", "https://scontent-sea1-1.cdninstagram.com/vp/f8a344aa3bbb19d73929ef89a6f49dbf/5C58D5B6/t51.2885-15/e35/42003235_1213357218831829_4757450124296697989_n.jpg?se=7&ig_cache_key=MTg4Mzg4ODQyNzc5Mzg4MDQ1OA%3D%3D.2");
        sliderList.add(slider);

        slider = new Slider("Slider 2", "https://scontent-sea1-1.cdninstagram.com/vp/e522e792e0ec5f0369b2790c2b665a86/5C5DF5A1/t51.2885-15/fr/e15/p1080x1080/42523361_593987991019231_8499767258107468649_n.jpg?ig_cache_key=MTg3OTQwMDM3NDAwOTY1MzM5MA%3D%3D.2");
        sliderList.add(slider);

        slider = new Slider("Slider 3", "https://pbs.twimg.com/media/DtSVdXrXgAEbShS.jpg");
        sliderList.add(slider);
    }

    private void dataNewest() {

        Newest newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2009/FIS012009.jpg","Aku Tahu, Alat Transportasi! ","Stripe Inc", 4.5, 10);
        newestList.add(newest);
        newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2010/FIS032010.jpg","Kombinasi","Stripe Inc", 4.5, 10);
        newestList.add(newest);
        newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2012/ME12PAUD02.jpg","Siklus Krebs","Stripe Inc", 4.5, 10);
        newestList.add(newest);
        newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2013/ME13ABAHMA01.jpg","Cita - Citaku","Stripe Inc", 4.5, 10);
        newestList.add(newest);
        newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2013/ME13AIPABI01.jpg","Words","Stripe Inc", 4.5, 10);
        newestList.add(newest);
        newest = new Newest(0, "https://m-edukasi.kemdikbud.go.id/medukasi/res/icon-produk/me/me2012/ME12PAUD10.jpg","Apple","Stripe Inc", 4.5, 10);
        newestList.add(newest);

    }

    private void dataRecommended() {

        Recommended recommended = new Recommended(0, "http://www.iosicongallery.com/icons/stripe-dashboard-2018-10-03/512.png","Stripe","Stripe Inc", 4.5, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "https://cfcdnpull-creativefreedoml.netdna-ssl.com/wp-content/uploads/2015/06/Twitter-bird-white-blue2.png","Twitter","Twitter Inc", 4.1, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "http://whisper.sh/img/whisper-square-appicon@3x.png","Sum and Math","Edu Inc", 4.0, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "https://pbs.twimg.com/profile_images/655055033659183104/ryWP6nnJ_400x400.png","Smart Home","Smart Inc", 4.7, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "https://cfcdnpull-creativefreedoml.netdna-ssl.com/wp-content/uploads/2015/06/Twitter-bird-white-blue2.png","Twitter","Twitter Inc", 4.1, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "http://whisper.sh/img/whisper-square-appicon@3x.png","Sum and Math","Edu Inc", 4.0, 10);
        recommendedList.add(recommended);
        recommended = new Recommended(0, "https://pbs.twimg.com/profile_images/655055033659183104/ryWP6nnJ_400x400.png","Smart Home","Smart Inc", 4.7, 10);
        recommendedList.add(recommended);
    }
}
