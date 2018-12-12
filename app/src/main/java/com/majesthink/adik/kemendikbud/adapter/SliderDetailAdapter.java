package com.majesthink.adik.kemendikbud.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.majesthink.adik.kemendikbud.R;
import com.majesthink.adik.kemendikbud.model.Categories;
import com.majesthink.adik.kemendikbud.model.SliderDetail;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderDetailAdapter extends RecyclerView.Adapter<SliderDetailAdapter.SliderDetailHolder> {

    Context context;
    List<SliderDetail> sliderDetailList;


    @NonNull
    @Override
    public SliderDetailHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.detail_slider_preview_item, viewGroup, false);
        return new SliderDetailHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderDetailHolder categoriesHolder, int i) {

        SliderDetail sliderDetail = sliderDetailList.get(i);

        Picasso.get()
                .load(sliderDetailList.get(i).getSLIDER_IMG())
                .fit()
                .centerCrop()
                .into(categoriesHolder.slider_img);
    }

    @Override
    public int getItemCount() {
        return sliderDetailList.size();
    }

    public class SliderDetailHolder extends RecyclerView.ViewHolder {
        RoundedImageView slider_img;
        public SliderDetailHolder(@NonNull View itemView) {
            super(itemView);

            slider_img = itemView.findViewById(R.id.slider_detail);
        }
    }

    public SliderDetailAdapter(Context context, List<SliderDetail> sliderDetailList){
        this.context = context;
        this.sliderDetailList = sliderDetailList;
    }
}
