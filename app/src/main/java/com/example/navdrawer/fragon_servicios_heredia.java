package com.example.navdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class fragon_servicios_heredia extends Fragment {
    View view;

    public fragon_servicios_heredia() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_servicios_heredia,container,false);
        ExpandableListView expandableListView = view.findViewById(R.id.ELH);
        HashMap<String, List<String>> item = new HashMap<>();
        ArrayList<String>  Barberia = new ArrayList<>();
        Barberia.add("VIP Alisette");
        Barberia.add("VIP Comb Service");
        Barberia.add("VIP Cut");
        Barberia.add("VIP Cut & Shave");
        Barberia.add("VIP Cut & Trim");
        Barberia.add("VIP Keratine");
        Barberia.add("VIP Kids");
        Barberia.add("VIP Royal Shave");
        Barberia.add("VIP Trim");
        item.put("Barberia", Barberia);
        ArrayList<String> Spa = new ArrayList<>();
        Spa.add("VIP Spa Mani");
        Spa.add("VIP Spa Pedi");
        item.put("Spa", Spa);

ExpandableAdapter adapter = new ExpandableAdapter(item);
expandableListView.setAdapter(adapter);


        return view;
    }
}

