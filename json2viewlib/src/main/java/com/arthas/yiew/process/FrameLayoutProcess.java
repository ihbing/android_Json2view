package com.arthas.yiew.process;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.arthas.yiew.Utils;
import com.arthas.yiew.decode.YiewBean;
import com.arthas.yiew.process.base.LayoutProcess;
import com.arthas.yiew.process.base.ViewProcess;

/**
 * Created by zhangyn on 17/4/5.
 */

public class FrameLayoutProcess {
    public static View process(Context context, ViewGroup parent, YiewBean yiew) {
        FrameLayout view = new FrameLayout(context);

        ViewGroup.LayoutParams params = Utils.createLayoutParams(parent, yiew);
        view.setLayoutParams(params);


        LayoutProcess.applyaLayout(view, params, yiew);
        ViewProcess.applyView(view, yiew);



        return view;
    }
}