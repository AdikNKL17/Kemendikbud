package com.majesthink.adik.kemendikbud;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

import com.majesthink.adik.kemendikbud.adapter.CategoriesAdapter;
import com.majesthink.adik.kemendikbud.adapter.NewestAdapter;
import com.majesthink.adik.kemendikbud.adapter.RecommendedAdapter;
import com.majesthink.adik.kemendikbud.adapter.SliderAdapter;
import com.majesthink.adik.kemendikbud.model.Categories;
import com.majesthink.adik.kemendikbud.model.Newest;
import com.majesthink.adik.kemendikbud.model.Recommended;
import com.majesthink.adik.kemendikbud.model.Slider;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Slider> sliderList = new ArrayList<>();
    private List<Categories> categoriesList = new ArrayList<>();
    private List<Recommended> recommendedList = new ArrayList<>();
    private List<Newest> newestList = new ArrayList<>();
    SliderAdapter sliderAdapter;
    CategoriesAdapter categoriesAdapter;
    RecommendedAdapter recommendedAdapter;
    NewestAdapter newestAdapter;
    RecyclerView sliderItem, categoriesItem, recommendedItem, newestItem;
    /*RoundedImageView searchMenu;*/
    /*SimpleSearchView searchView;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderItem = findViewById(R.id.banner_slider);
        categoriesItem = findViewById(R.id.list_categories);
        recommendedItem = findViewById(R.id.list_recommended);
        newestItem = findViewById(R.id.list_newest);

    /*    searchMenu = findViewById(R.id.menu_search);*/

        /*searchMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.showSearch();
            }
        });*/
        loadSlider();
        loadCategories();
        loadNewest();
        loadRecommended();
        dataSlider();
        dataCategories();
        dataRecommended();
        dataNewest();
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

    private void loadNewest() {

        newestAdapter = new NewestAdapter(this, newestList);
        newestItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        newestItem.setItemAnimator(new DefaultItemAnimator());
        int padding = getResources().getDimensionPixelSize(R.dimen.slider_margin);
        newestItem.addItemDecoration(new SliderItemDecoration(padding));
        newestItem.setAdapter(newestAdapter);

    }

    private void loadRecommended() {
        recommendedAdapter = new RecommendedAdapter(this, recommendedList);
        recommendedItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recommendedItem.setItemAnimator(new DefaultItemAnimator());
        recommendedItem.setAdapter(recommendedAdapter);
    }

    private void loadSlider(){


        sliderAdapter = new SliderAdapter(this, sliderList);
        sliderItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        sliderItem.setItemAnimator(new DefaultItemAnimator());
        sliderItem.setAdapter(sliderAdapter);

        int margin = getResources().getDimensionPixelSize(R.dimen.slider_margin);
        sliderItem.addItemDecoration(new SliderItemDecoration(margin));

        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(sliderItem);

    }

    private void loadCategories(){

        categoriesAdapter = new CategoriesAdapter(this, categoriesList);
        categoriesItem.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesItem.setItemAnimator(new DefaultItemAnimator());
        categoriesItem.setAdapter(categoriesAdapter);

        int padding = getResources().getDimensionPixelSize(R.dimen.slider_margin);
        categoriesItem.addItemDecoration(new SliderItemDecoration(padding));

    }

    private void dataSlider() {

        Slider slider = new Slider("Slider 1", "https://s3-eu-west-1.amazonaws.com/assets.kobaltmusic.com/_blogcenter/AWAL-App-Blog-Header.png?mtime=20170327211900");
        sliderList.add(slider);

        slider = new Slider("Slider 2", "https://i1.wp.com/www.feedough.com/wp-content/uploads/2018/03/mobile-app-promotion-51-3.png?resize=1280%2C620&ssl=1");
        sliderList.add(slider);

        slider = new Slider("Slider 3", "https://dps.usc.edu/files/2015/06/mobile-safety-app-banner-new1.png");
        sliderList.add(slider);
    }

    private void dataCategories(){
        Categories categories = new Categories("Racing", "https://www.iconsdb.com/icons/download/white/steering-wheel-512.png");
        categoriesList.add(categories);
        categories = new Categories("Sport", "https://www.iconsdb.com/icons/download/white/pool-512.png");
        categoriesList.add(categories);
        categories = new Categories("Education", "https://www.iconsdb.com/icons/download/white/steering-wheel-512.png");
        categoriesList.add(categories);
        categories = new Categories("Puzzle", "https://www.iconsdb.com/icons/download/white/puzzle-2-512.png");
        categoriesList.add(categories);
        categories = new Categories("Shooting", "https://www.iconsdb.com/icons/download/white/steering-wheel-512.png");
        categoriesList.add(categories);
        categories = new Categories("Education", "https://www.iconsdb.com/icons/download/white/steering-wheel-512.png");
        categoriesList.add(categories);
        categories = new Categories("Puzzle", "https://www.iconsdb.com/icons/download/white/puzzle-2-512.png");
        categoriesList.add(categories);
        categories = new Categories("Shooting", "https://www.iconsdb.com/icons/download/white/steering-wheel-512.png");
        categoriesList.add(categories);
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
