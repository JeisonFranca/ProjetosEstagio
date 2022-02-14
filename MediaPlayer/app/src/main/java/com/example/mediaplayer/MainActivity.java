package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private SeekBar seekBar;
    private AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        seekVolume();
    }

    public void executarSom(View v) {
        if (mediaPlayer != null){
            mediaPlayer.start();
        }else {
            Toast.makeText(getApplicationContext(), "audio não carregado", Toast.LENGTH_SHORT).show();
        }
    }

    public void pausarSom(View v){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void pararSom(View v){
        if (mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.teste);
        }
    }
    
    public void seekVolume(){

        seekBar = findViewById(R.id.seekBarVolume);

        // TODO: configurar audio mananger
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        // TODO: recuperar os valores do volume maximo e o volume atual
        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        // TODO: configurar os valores máximos para seekbar
        seekBar.setMax(volumeMaximo);
        // TODO: configurar progresso atual do seekbar
        seekBar.setProgress(volumeAtual);

        // TODO: incrementar automaticamente o volume
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // TODO: configurar o stream do volume
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
                                                 // TODO: flags AudioManager.FLAG_SHOW_UI MOSTRA O LAYOUT DO VOLUME
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar){}
            @Override
            public void onStopTrackingTouch(SeekBar seekBar){}
        });
    }

    // TODO: parar a musica quando minimizar o app
    @Override
    protected void onStop() {
        super.onStop();
        if (mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    // TODO: configurações depois que a activity for fechada

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();

            // TODO: remove a alocação da musica na memoria
            mediaPlayer.release();

            mediaPlayer = null;

        }
    }
}