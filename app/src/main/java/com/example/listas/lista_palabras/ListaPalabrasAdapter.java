package com.example.listas.lista_palabras;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listas.R;
import com.example.listas.databinding.WordListItemBinding;

import java.util.ArrayList;
import java.util.List;

public class ListaPalabrasAdapter extends RecyclerView.Adapter<ListaPalabrasAdapter.PalabrasViewHolder> {

    //Constructor de la clase.
    public ListaPalabrasAdapter(List<String> Arraylist){
        this.ArrayList = Arraylist;

    }
    private List<String> ArrayList;

    //Funcion que enlaza el diseño al adaptador.
    @NonNull
    @Override
    public PalabrasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        WordListItemBinding Binding = WordListItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new PalabrasViewHolder(Binding);
    }

    //Funcion que pinta el recyclerview con los datos recibidos.
    @Override
    public void onBindViewHolder(@NonNull PalabrasViewHolder holder, int position) {
        String element =ArrayList.get(position);
        holder.textView.setText(element);
    }

    //Funcion que devuelve el tamaño del arraylist.
    @Override
    public int getItemCount() {
        return ArrayList.size();
    }


    //Creamos la clase viewHolder con su constructor de la super clase
    public class PalabrasViewHolder extends RecyclerView.ViewHolder{
        //Instanciamos un objeto de la clase Textview
        private TextView textView;
        private boolean Clicked;


        //Creamos el objeto Binding y enlazamos el diseño a nuestro codigo.
        public PalabrasViewHolder(@NonNull WordListItemBinding Binding) {
            super(Binding.getRoot());

            textView = Binding.textView;

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!Clicked){
                        Binding.textView.setText("Clicked" + textView.getText().toString());
                        Clicked = true;
                    }else {

                        String textClicleado;
                        textClicleado = Binding.textView.getText().toString();
                        Bundle bundle = new Bundle();

                        bundle.putStringArrayList("arrayList", new ArrayList<>(ArrayList));
                        bundle.putString("texto",textClicleado);

                        Navigation.findNavController(Binding.getRoot())
                                .navigate(R.id.action_firstFragment_to_secondFragment,bundle);

                    }
                }
            });
        }
    }

}