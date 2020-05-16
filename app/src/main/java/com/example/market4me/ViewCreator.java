package com.example.market4me;

import android.content.Context;
import android.widget.LinearLayout;

class ViewCreator {

    static LinearLayout linearLayout(Context context, int orientation) {


        /* Orientation:
         ** 0 = LinearLayout.HORIZONTAL
         ** 1 = LinearLayout.VERTICAL */

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(orientation);

        return linearLayout;
    }

    static LinearLayout.LayoutParams layoutParams(Context context, int width, int height) {

        /*  width & height:
         ** -1 = LinearLayout.LayoutParams.MATCH_PARENT
         ** -2 = LinearLayout.LayoutParams.WRAP_CONTENT*/
        return new LinearLayout.LayoutParams(width, height);
    }

    static LinearLayout.LayoutParams layoutParams(Context context, int width, int height, float weight) {

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(width, height);
        layoutParams.weight = weight;
        return layoutParams;
    }


}
