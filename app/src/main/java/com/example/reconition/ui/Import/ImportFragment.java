package com.example.reconition.ui.Import;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.reconition.R;

public class ImportFragment extends Fragment {

    private ImportViewModel importViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        importViewModel =
                ViewModelProviders.of(this).get(ImportViewModel.class);
        View root = inflater.inflate(R.layout.fragment_import, container, false);
        return root;
    }
}