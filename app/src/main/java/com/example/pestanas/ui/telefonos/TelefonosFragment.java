package com.example.pestanas.ui.telefonos;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.pestanas.R;

public class TelefonosFragment extends Fragment {

    private TelefonosViewModel mViewModel;

    public static TelefonosFragment newInstance() {
        return new TelefonosFragment();
    }

    Button btnAceptar1;
    TextView txttexto1;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root=inflater.inflate(R.layout.fragment_telefonos,container,false);
        btnAceptar1=root.findViewById(R.id.btnAceptar);
        txttexto1=root.findViewById(R.id.txtTexto);

        btnAceptar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txttexto1.setText("Telefonos");
            }
        });


     return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TelefonosViewModel.class);
        // TODO: Use the ViewModel
    }

}
