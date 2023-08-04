package com.example.listas.imagenes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.listas.databinding.FragmentThirdBinding;
import com.example.listas.imagenes.ImagenesLista;
import com.example.listas.imagenes.listaImagenesAdapater;

import java.util.ArrayList;

public class ThirdFragment extends Fragment {

    //Creamos una instancia del objeto viewBinding.
    private FragmentThirdBinding Binding;
    //Creamos una instancia de la clase de las imagenes.
    ImagenesLista imagenesLista = new ImagenesLista();

    //Llamamos a la funcion que nos dara el el arraylist de la clase.
    ArrayList<ImagenesLista> listaImagenes = imagenesLista.getListaImagenes();

    public com.example.listas.imagenes.listaImagenesAdapater listaImagenesAdapater = new listaImagenesAdapater(listaImagenes);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater  inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding = FragmentThirdBinding.inflate(inflater,container,false);
        return Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Binding.recyclerview1.setAdapter(listaImagenesAdapater);
        Binding.recyclerview1.setLayoutManager(new LinearLayoutManager(getContext()));
        Binding.recyclerview1.setHasFixedSize(true);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Binding = null;
    }
}