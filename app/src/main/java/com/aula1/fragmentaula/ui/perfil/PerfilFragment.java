package com.aula1.fragmentaula.ui.perfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.aula1.fragmentaula.R;

public class PerfilFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil,container,false);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}