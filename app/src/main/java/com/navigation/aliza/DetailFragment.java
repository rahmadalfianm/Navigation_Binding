package com.navigation.aliza;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.navigation.aliza.databinding.FragmentDetailBinding;


public class DetailFragment extends Fragment {

   private TextView nama;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View view = inflater.inflate(R.layout.fragment_detail, container, false);
        FragmentDetailBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false);
        binding.txtNama.setText(getArguments().getString("nama"));
        return binding.getRoot();
    }

}