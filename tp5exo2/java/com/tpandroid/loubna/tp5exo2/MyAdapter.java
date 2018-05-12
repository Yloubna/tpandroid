package com.tpandroid.loubna.tp5exo2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by loubnayousfi on 5/9/18.
 */

public class MyAdapter extends ArrayAdapter<Personne>{
    private Context context;
    private int resource;
    private List<Personne> liste;

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Personne> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.liste = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v==null){
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(resource,parent,false);
        }
        Personne p = liste.get(position);
        if (p!=null){
            TextView nom =  v.findViewById(R.id.nom);
            TextView fonction = v.findViewById(R.id.fonction);
            if (nom!=null){
                nom.setText(p.getNom());
            }
            if (fonction!=null){
                fonction.setText(p.getFonction());
            }
        }
        return v;

    }
}
