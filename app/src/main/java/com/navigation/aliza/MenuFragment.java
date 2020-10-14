package com.navigation.aliza;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.navigation.aliza.databinding.FragmentMenuBinding;


public class MenuFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //View view = inflater.inflate(R.layout.fragment_menu, container, false);
        FragmentMenuBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container,false);
        binding.btnNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("nama", "My Name is Aliza Rizqi Fitriana");
                Navigation.findNavController(view).navigate(R.id.action_menuFragment_to_detailFragment, bundle);
            }
        });
        return binding.getRoot();
    }
}