package br.com.adsnoobs.sqliteappexemplo;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class UsuarioAdapter extends ArrayAdapter<Usuario> {

    private ArrayList<Usuario> usuarios;

    public UsuarioAdapter(@NonNull Context context, @NonNull ArrayList<Usuario> usuarios) {
        super(context, 0,usuarios);
        this.usuarios = usuarios;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Usuario usuario = usuarios.get(position);

        convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_usuario,null);

        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewAvatar);
        TextView textViewNome = (TextView)convertView.findViewById(R.id.textViewNome);
        TextView textViewEmail = (TextView)convertView.findViewById(R.id.textViewEmail);



        textViewNome.setText(usuario.getNome().toString());
        textViewEmail.setText(usuario.getEmail().toString());

        if (usuario.getAvatar() != null)
            imageView.setImageBitmap(usuario.getAvatar());

        return  convertView;
    }
}
