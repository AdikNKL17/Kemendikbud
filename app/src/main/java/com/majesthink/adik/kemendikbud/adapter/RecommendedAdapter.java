package com.majesthink.adik.kemendikbud.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.majesthink.adik.kemendikbud.activity.DetailActivity;
import com.majesthink.adik.kemendikbud.R;
import com.majesthink.adik.kemendikbud.model.Recommended;
import com.makeramen.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.RecommendedHolder> {

    Context context;
    List<Recommended> recommendedList;

    @NonNull
    @Override
    public RecommendedHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recommended_item, viewGroup, false);
        return new RecommendedHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedHolder recommendedHolder, int i) {
        final Recommended recommended = recommendedList.get(i);

        Picasso.get()
                .load(recommendedList.get(i).getApp_icon())
                .fit()
                .centerCrop()
                .into(recommendedHolder.appIcon);

        recommendedHolder.appName.setText(recommended.getApp_name());
        recommendedHolder.appDeveloper.setText(recommended.getApp_developer());
        recommendedHolder.appSize.setText(Integer.toString(recommended.getSize()));
        recommendedHolder.appRate.setText(Double.toString(recommended.getRate()));

        recommendedHolder.recommendedWrapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                intent.putExtra("APP_NAME", recommended.getApp_name());
                intent.putExtra("APP_ICON", recommended.getApp_icon());
                intent.putExtra("APP_DEVELOPER", recommended.getApp_developer());
                intent.putExtra("APP_SIZE", Integer.toString(recommended.getSize()));
                intent.putExtra("APP_RATE", Double.toString(recommended.getRate()));
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return recommendedList.size();
    }

    public class RecommendedHolder extends RecyclerView.ViewHolder {

        RelativeLayout recommendedWrapper;
        RoundedImageView appIcon;
        TextView appName, appDeveloper, appSize, appRate;

        public RecommendedHolder(@NonNull View itemView) {
            super(itemView);
            appIcon = itemView.findViewById(R.id.app_icon);
            appName = itemView.findViewById(R.id.app_name);
            appDeveloper = itemView.findViewById(R.id.app_developer);
            appSize = itemView.findViewById(R.id.size);
            appRate = itemView.findViewById(R.id.app_rate);
            recommendedWrapper = itemView.findViewById(R.id.recommended_wrapper);
        }
    }

    public RecommendedAdapter (Context context, List<Recommended> recommendedList){
        this.context = context;
        this.recommendedList = recommendedList;
    }
}
