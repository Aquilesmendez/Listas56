package com.example.listas.imagenes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.listas.R;
import com.example.listas.databinding.FragmentFiftBinding;

public class FiftFragment extends Fragment {

    private FragmentFiftBinding Binding;
    private String nombre;
    private String descripcion;
    private String urlImagen;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            nombre = bundle.getString("nombre");
            descripcion = bundle.getString("descripcion");
            urlImagen = bundle.getString("urlImagen");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Binding = FragmentFiftBinding.inflate(inflater,container,false);
        return Binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Asignar los valores a las vistas correspondientes en tu diseño
        Binding.textView3.setText(nombre);
        Binding.textView4.setText(descripcion);
        Glide.with(requireContext())
                .load(urlImagen)
                .into(Binding.imageView2);

        Binding.botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(Binding.getRoot())
                        .navigate(R.id.action_fiftFragment_to_thirdFragment);
            }
        });


    }
}