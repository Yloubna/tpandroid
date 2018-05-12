package com.tpandroid.loubna.tp5exo3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by loubnayousfi on 5/9/18.
 */

public class ListFragment extends android.app.ListFragment {
    private static final String VALUE = "value";
    private String[] values ={"SI","Infographie","AppMobiles","Rédac","webSemantique"};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(),R.layout.activity_main_layout);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        DetailsFragment fragment = (DetailsFragment) getFragmentManager().findFragmentById(R.id.detailscours);
        if (fragment!=null && fragment.isInLayout()){
            fragment.setText(item);
        } else {
            Intent intent = new Intent(getActivity().getApplicationContext(),Cours.class);
            intent.putExtra(VALUE,item);
            startActivity(intent);
        }
    }
}
