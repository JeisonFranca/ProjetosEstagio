package com.example.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        // TODO: ESCONDER STATUSBAR E BARRA DE NAVEGAÇÃO
        View decorView = getWindow()/*Recupera um objeto de tela*/
                        .getDecorView()/*Recupera um objeto para manipular componentes de tela*/;

        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN /*| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION */;

        decorView.setSystemUiVisibility(uiOpcoes);


        // TODO: ESCONDER A ACTIONBAR
        getSupportActionBar().hide();


        // TODO: EXECUTAR O VIDEO
        videoView.setMediaController(new MediaController(this));
        // TODO: DEFINE O CAMINHO DO VIDEO
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        // TODO: INICIAR O VIDEO
        videoView.start();
    }
}