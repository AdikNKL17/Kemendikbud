package com.majesthink.adik.kemendikbud;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SliderItemDecoration extends RecyclerView.ItemDecoration {
    private int margin;

    public SliderItemDecoration(int margin){
        this.margin = margin;
    }

    @Override
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state){

        rect.right = margin;
        rect.top = margin;
        rect.bottom = margin;

        if (recyclerView.getChildLayoutPosition(view) == 0){
            rect.left = margin;
        }
    }
}
