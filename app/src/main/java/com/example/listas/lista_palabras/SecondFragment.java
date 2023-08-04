package com.example.listas.lista_palabras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.listas.R;
import com.example.listas.databinding.FragmentSecondBinding;
import com.example.listas.lista_palabras.FirstFragment;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding Binding;

    private String textoRecibido;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Verifica y guarda el dato recibido en una variable.
        if (getArguments() != null) {
            textoRecibido = getArguments().getString("texto");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Configura el objeto viewBinding y enlaza el diseño con el codigo.
        Binding = FragmentSecondBinding.inflate(inflater,container,false);
        return Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Seteamos el valor del widget con el dato recibido.
        Binding.textoRecibido.setText(textoRecibido);

        //Creamos el evento escuchador para guardar la palabra modificada en el array y viajar al fragmento anterior.
        Binding.botonModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuevaPalabra = Binding.textoRecibido.getText().toString();
                //No funciona falta probar el firstfragment.
                FirstFragment firstFragment = (FirstFragment) requireActivity().getSupportFragmentManager().findFragmentById(R.id.firstFragment);
                if (firstFragment != null) {
                    firstFragment.ModificarArray(nuevaPalabra);
                }
                Navigation.findNavController(Binding.getRoot())
                        .navigate(R.id.action_secondFragment_to_firstFragment);
            }
        });
    }
}