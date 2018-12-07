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
import com.squareup.picasso.Picasso;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesHolder> {

    Context context;
    List<Categories> categoriesList;


    @NonNull
    @Override
    public CategoriesHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.categories_item, viewGroup, false);
        return new CategoriesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesHolder categoriesHolder, int i) {

        Categories categories = categoriesList.get(i);

        Picasso.get()
                .load(categoriesList.get(i).getCATEGORIES_ICON())
                .into(categoriesHolder.categories_icon);
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public class CategoriesHolder extends RecyclerView.ViewHolder {
        RelativeLayout holder;
        ImageView categories_icon;
        public CategoriesHolder(@NonNull View itemView) {
            super(itemView);

            holder = itemView.findViewById(R.id.categories_holder);
            categories_icon = itemView.findViewById(R.id.categories_icon);
        }
    }

    public CategoriesAdapter(Context context, List<Categories> categoriesList){
        this.context = context;
        this.categoriesList = categoriesList;
    }
}
