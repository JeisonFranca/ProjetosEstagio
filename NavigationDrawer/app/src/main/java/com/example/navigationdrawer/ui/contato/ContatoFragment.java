package com.example.navigationdrawer.ui.contato;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.databinding.FragmentContatoBinding;
import com.example.navigationdrawer.databinding.FragmentGalleryBinding;
import com.example.navigationdrawer.ui.gallery.GalleryViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContatoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContatoFragment extends Fragment {

    private ContatoViewModel ContatoViewModel;
    private @NonNull FragmentContatoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContatoViewModel =
                new ViewModelProvider(this).get(ContatoViewModel.class);

        binding = FragmentContatoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContato;

        ContatoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}