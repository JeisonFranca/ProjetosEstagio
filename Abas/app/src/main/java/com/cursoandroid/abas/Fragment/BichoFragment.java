package com.cursoandroid.abas.Fragment;


import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cursoandroid.abas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BichoFragment extends Fragment implements View.OnClickListener {

    private ImageView cao, gato , leao, macaco, ovelha, vaca;
    private MediaPlayer mediaPlayer;

    public BichoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_bicho, container, false);

        cao = view.findViewById(R.id.cao);
        gato = view.findViewById(R.id.gato);
        leao = view.findViewById(R.id.leao);
        macaco = view.findViewById(R.id.macaco);
        ovelha = view.findViewById(R.id.ovelha);
        vaca = view.findViewById(R.id.vaca);

        cao.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.cao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.dog);
                tocarSom();
                break;

            case R.id.gato:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);
                tocarSom();
                break;

            case R.id.leao:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                tocarSom();
                break;

            case R.id.macaco:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.monkey);
                tocarSom();
                break;

            case R.id.ovelha:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.sheep);
                tocarSom();
                break;

            case R.id.vaca:
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cow);
                tocarSom();
                break;

        }
    }
    public void tocarSom(){
        if (mediaPlayer != null){
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
