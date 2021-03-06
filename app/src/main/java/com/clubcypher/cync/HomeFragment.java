package com.clubcypher.cync;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nisargkolhe on 5/29/15.
 */
public class HomeFragment extends Fragment {
    private List<Event> events;

    private RecyclerView rv;

    public HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        rv = (RecyclerView)rootView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity().getApplicationContext());
        rv.setLayoutManager(llm);

        initializeData();
        initializeAdapter();



        return rootView;
    }

    private void initializeData(){
        events = new ArrayList<>();
        events.add(new Event("(c)ode",R.drawable.codeposter,"The Programming Event"));
        events.add(new Event("Respawn",R.drawable.respawnposter,"The Gaming Event"));
        events.add(new Event("(c)lick",R.drawable.clickposter,"The Photography Event"));
        events.add(new Event("(c)reation",R.drawable.creationposter,"The Graphic Designing Event"));
        events.add(new Event("(c)rypt(c)ross",R.drawable.ccposter,"Cryptic Crossword"));
        events.add(new Event("(c)ynth",R.drawable.cynthposter,"The EDM Making Event"));
        events.add(new Event("Decypher",R.drawable.decypherposter,"The Online Cryptic Hunt"));
        events.add(new Event("Suprise Event",R.drawable.thposter,"???"));



    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(events);
        rv.setAdapter(adapter);
    }

}
