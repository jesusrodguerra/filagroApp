package com.filagro.app.correctorph;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterVerificacion extends RecyclerView.Adapter<AdapterVerificacion.ViewHolder> {

    private List<contenido_verificacion> contenido;
    private int layout;
    private OnItemClickListener itemClickListener;

    public AdapterVerificacion(List<contenido_verificacion> names, int layout, OnItemClickListener listener){

        this.contenido = names;
        this.layout = layout;
        this.itemClickListener = listener;
    }


    @NonNull
    @Override
    public AdapterVerificacion.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        ViewHolder vh = new ViewHolder(vista);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterVerificacion.ViewHolder viewHolder, int i) {

        viewHolder.bind(contenido.get(i), itemClickListener);
    }

    @Override
    public int getItemCount() {
        return contenido.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvtitulo;
        private TextView tvcontenido;
        private ImageView tvcolor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvtitulo = itemView.findViewById(R.id.tv_titulo_verificacion);
            tvcontenido = itemView.findViewById(R.id.tv_contenido_verificacion);
            tvcolor = itemView.findViewById(R.id.tv_color_verificacion);
        }

        public void bind(final contenido_verificacion contenido, final OnItemClickListener listener){

            tvtitulo.setText(contenido.getTitulo());
            tvcontenido.setText(contenido.getVerificacion());
            tvcolor.setImageResource(contenido.getColor());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(contenido, getAdapterPosition());
                }
            });
        }
    }

    public interface OnItemClickListener{
        void onItemClick(contenido_verificacion contenido, int position);
    }
}
