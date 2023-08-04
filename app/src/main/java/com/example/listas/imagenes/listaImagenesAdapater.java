package com.example.listas.imagenes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.listas.R;
import com.example.listas.databinding.ImageListItemBinding;

import java.util.List;

public class listaImagenesAdapater extends RecyclerView.Adapter<listaImagenesAdapater.ImagenesViewHolder>{

    public listaImagenesAdapater(List<ImagenesLista> listaImagenes) {
        this.listaImagenes = listaImagenes;
    }

    private List<ImagenesLista> listaImagenes;

    @NonNull
    @Override
    public ImagenesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ImageListItemBinding Binding = ImageListItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ImagenesViewHolder(Binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagenesViewHolder holder, int position) {

        ImagenesLista imagen = listaImagenes.get(position);

        // Asignar los valores a los elementos de tu diseño de ítem de lista
        holder.textView.setText(imagen.getNombre());
        holder.textView1.setText(imagen.getDescripcion());
        Glide.with(holder.itemView.getContext())
                .load(imagen.getUrlImagen())
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return listaImagenes.size();
    }


    public class ImagenesViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView textView1;

        public ImagenesViewHolder(@NonNull ImageListItemBinding Binding) {
            super(Binding.getRoot());

            imageView = Binding.imageView;
            textView = Binding.textView1;
            textView1 = Binding.textView2;


            Binding.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION) {
                        ImagenesLista imagen = listaImagenes.get(position);

                        Bundle bundle = new Bundle();
                        bundle.putString("nombre", imagen.getNombre());
                        bundle.putString("descripcion", imagen.getDescripcion());
                        bundle.putString("urlImagen", imagen.getUrlImagen());


                        Navigation.findNavController(Binding.getRoot())
                                .navigate(R.id.action_thirdFragment_to_fiftFragment,bundle);
                    }

                }
            });



        }
    }
}
