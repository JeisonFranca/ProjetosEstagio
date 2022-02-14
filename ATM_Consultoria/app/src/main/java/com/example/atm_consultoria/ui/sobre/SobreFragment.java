package com.example.atm_consultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atm_consultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SobreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SobreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SobreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SobreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SobreFragment newInstance(String param1, String param2) {
        SobreFragment fragment = new SobreFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TODO PARAMETRO .setDescription
        String descricao = "ATM Consultoria";

        View view = new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("jeisonfrancarj@gmail.com", "Email de contato")
                .addWebsite("https://google.com/", "Acesse nosso site")
                .addGroup("Nossas redes sociais")
                .addFacebook("the.medy", "Facebook")
                .addTwitter("medyo80", "Twitter")
                .addGitHub("medyo","GitHub")
                .addInstagram("medyo80", "Instagram")

                .create();
        return view;

        /*return inflater.inflate(R.layout.fragment_sobre, container, false);*/
    }
}