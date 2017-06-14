package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by user on 6/14/17.
 */

public class ArticleFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.news_article,container,false);
    }

}
