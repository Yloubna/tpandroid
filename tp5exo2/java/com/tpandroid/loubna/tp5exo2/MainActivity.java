package com.tpandroid.loubna.tp5exo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Personne> personnes;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Personne> personnes = new ArrayList<>();
        initList(personnes);
        MyAdapter adapter = new MyAdapter(this,R.layout.details,personnes);
        final ListView list = findViewById(R.id.myliste);
        list.setAdapter(adapter);
    }

    private void initList(ArrayList<Personne> personnes) {
        Personne personne1 = new Personne("Loubna","Etudiante");
        personnes.add(personne1);

        Personne personne2 = new Personne("Ilyes","Developpeur");
        personnes.add(personne2);

        Personne personne3 = new Personne("Wadie","Consultant");
        personnes.add(personne3);

        Personne personne4 = new Personne("Nahel","Médecin");
        personnes.add(personne4);

        Personne personne5 = new Personne("Sidahmed","Architecte");
        personnes.add(personne5);
    }

    public void GoDown (View v){
        Toast.makeText(this,"Vous avez cliqué sur : "+v.getTag(),Toast.LENGTH_SHORT).show();
        int a = (Integer) v.getTag();
        Personne P = personnes.get(a);
        personnes.remove(a);
        personnes.add(a+1,P);
        adapter.notifyDataSetChanged();
    }

 public void GoUp (View v){
        Toast.makeText(this,"Vous avez cliqué sur : "+v.getTag(),Toast.LENGTH_SHORT).show();
        int a = (Integer) v.getTag();
        Personne P = personnes.get(a);
        personnes.remove(a);
        personnes.add(a-1,P);
        adapter.notifyDataSetChanged();
    }

}
