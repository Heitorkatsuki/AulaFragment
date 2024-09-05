package com.aula1.fragmentaula.ui.social;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.aula1.fragmentaula.R;

public class SocialFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_social,container,false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}