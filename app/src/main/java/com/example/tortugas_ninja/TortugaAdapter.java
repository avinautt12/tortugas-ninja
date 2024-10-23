package com.example.tortugas_ninja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import java.util.List;

public class TortugaAdapter extends RecyclerView.Adapter<TortugaAdapter.ViewHolder> {

    private List<TortugaNinja> tortugas;

    public TortugaAdapter(List<TortugaNinja> tortugas) {
        this.tortugas = tortugas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tortuga, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TortugaNinja tortuga = tortugas.get(position);
        holder.nombreTextView.setText("Nombre: " +tortuga.getNombre());
        holder.armaTextView.setText("Arma: " + tortuga.getArma());
        holder.descripcionTextView.setText("Descripción: " +tortuga.getDescripcion());
        holder.imagenImageView.setImageResource(tortuga.getImagen());
    }

    @Override
    public int getItemCount() {
        return tortugas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nombreTextView;
        TextView armaTextView;
        TextView descripcionTextView;
        ImageView imagenImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.textViewNombre);
            armaTextView = itemView.findViewById(R.id.textViewArma);
            descripcionTextView = itemView.findViewById(R.id.textViewDescripcion);
            imagenImageView = itemView.findViewById(R.id.imageViewTortuga);
        }
    }

}
