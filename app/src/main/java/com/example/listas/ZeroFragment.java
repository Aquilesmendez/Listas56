package com.example.listas;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.listas.databinding.FragmentZeroBinding;

public class ZeroFragment extends Fragment {

    //Declaramos el objeto viewBinding.
    private FragmentZeroBinding Binding;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Configuramos el objeto BiewBinding y enlazamos el diseño con el codigo
        Binding = FragmentZeroBinding.inflate(inflater,container,false);
        return Binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Creamos el evento escuchador para viajar al fragmento deseado.
        Binding.botonListaPalabras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(Binding.getRoot())
                        .navigate(R.id.action_zeroFragment_to_firstFragment);
            }
        });
        //Creamos el evento escuchador para viajar al fragmento deseado.
        Binding.botonListaImagenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(Binding.getRoot())
                        .navigate(R.id.action_zeroFragment_to_thirdFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Binding = null;
    }
}