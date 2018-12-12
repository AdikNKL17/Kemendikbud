package com.majesthink.adik.kemendikbud.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.majesthink.adik.kemendikbud.R;
import com.majesthink.adik.kemendikbud.model.Slider;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderHolder> {

    Context context;
    List<Slider> sliderList;

    @NonNull
    @Override
    public SliderHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.slider_item, viewGroup, false);

        return new SliderHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SliderHolder sliderHolder, int i) {
        Slider slider = sliderList.get(i);

        Picasso.get()
                .load(sliderList.get(i).getSLIDER_THUMBNAIL())
                .fit()
                .centerCrop()
                .into(sliderHolder.sliderImage);
    }

    @Override
    public int getItemCount() {
        return sliderList.size();
    }

    public class SliderHolder extends RecyclerView.ViewHolder {
        RoundedImageView sliderImage;
        public SliderHolder(@NonNull View itemView) {
            super(itemView);

            sliderImage = itemView.findViewById(R.id.banner);
        }
    }

    public SliderAdapter(Context context, List<Slider> sliderList) {
        this.context = context;
        this.sliderList = sliderList;
    }
}
