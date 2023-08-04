package com.example.listas.lista_palabras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.listas.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FirstFragment extends Fragment {
    //Creamos un objeto de la clase viewBinding.
    private FragmentFirstBinding Binding;
    //Creamos el arraylist.
    private List<String> ArrayList = new ArrayList<>();
    //Instanciamos un objeto de la clase adapter.
    public ListaPalabrasAdapter listaPalabrasAdapter = new ListaPalabrasAdapter(wordListAutoGenerate());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Configuramos un objeto de la clase viewBinding y enlazamos el codigo con el diseño.
        Binding = FragmentFirstBinding.inflate(inflater, container, false);
        return Binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Configuramos el adaptador del recyclerview.
        Binding.recyclerview.setAdapter(listaPalabrasAdapter);
        Binding.recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        Binding.recyclerview.setHasFixedSize(true);


        //Configuramos el evento escuchador del boton flotante para que cuando se precione agregre una palabra nueva.
        Binding.floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ArrayList.add("Palabra" + ArrayList.size());

                Binding.recyclerview.getAdapter().notifyItemInserted(ArrayList.size());
                Binding.recyclerview.smoothScrollToPosition(ArrayList.size());
            }
        });

    }

    //Funcion que deberia agregar una pablabra nueva al aaraylist.
    public void ModificarArray(String nuevaPalabra) {
        ArrayList.add(nuevaPalabra);
        Objects.requireNonNull(Binding.recyclerview.getAdapter()).notifyItemInserted(ArrayList.size() - 1);
    }

    private List<String> wordListAutoGenerate() {
        for (int i = 0; i <= 20; i++) {
            ArrayList.add("Palabra: " + i);
        }
        return ArrayList;
    }
}