package com.example.romancehof.ui.tree;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.romancehof.R;

public class TreeFragment extends Fragment {

    private TreeViewModel treeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        treeViewModel =
                ViewModelProviders.of(this).get(TreeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tree, container, false);
        /*final TextView textView = root.findViewById(R.id.text_tree);
        treeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}