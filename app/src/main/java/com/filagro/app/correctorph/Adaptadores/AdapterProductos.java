package com.filagro.app.correctorph.Adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.filagro.app.correctorph.DataSet.ContenidoProductos;
import com.filagro.app.correctorph.R;

import java.util.List;

public class AdapterProductos extends RecyclerView.Adapter<AdapterProductos.ViewHolder> {

    private List<ContenidoProductos> contenido;
    private int layout;
    private OnItemClickListener itemClickListener;

    public AdapterProductos(List<ContenidoProductos> names, int layout, OnItemClickListener listener){

        this.contenido = names;
        this.layout = layout;
        this.itemClickListener = listener;

    }

    @NonNull
    @Override
    public AdapterProductos.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        ViewHolder vh = new ViewHolder(vista);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProductos.ViewHolder viewHolder, int i) {

        viewHolder.bind(contenido.get(i), itemClickListener);

    }

    @Override
    public int getItemCount() {
        return contenido.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvtitulo;
        private TextView tvproductos;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvtitulo = itemView.findViewById(R.id.tv_titulo);
            tvproductos = itemView.findViewById(R.id.tv_contenido);

        }

        public void bind(final ContenidoProductos contenido, final OnItemClickListener listener){

            tvtitulo.setText(contenido.getTitulo());
            tvproductos.setText(contenido.getProductos());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(contenido, getAdapterPosition());
                }
            });

        }
    }

    public interface OnItemClickListener {
        void onItemClick(ContenidoProductos contenido, int position);
    }
}
