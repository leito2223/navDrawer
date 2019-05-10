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
        Barberia.add("VIP Alisette                                                                          11.000.00\n40min");
        Barberia.add("VIP Comb Service                                                                    3.000.00\n40min");
        Barberia.add("VIP Cut                                                                                10.000.00\n40min");
        Barberia.add("VIP Cut & Shave                                                                    15.000.00\n40min");
        Barberia.add("VIP Cut & Trim                                                                     15.000.00\n40min");
        Barberia.add("VIP Keratine                                                                        21.000.00\n40min");
        Barberia.add("VIP Kids                                                                               7.000.00\n40min");
        Barberia.add("VIP Royal Shave                                                                    8.000.00\n40min");
        Barberia.add("VIP Trim                                                                               8.000.00\n40min");
        item.put("    Barberia "+ Barberia.size(), Barberia);
        ArrayList<String> Spa = new ArrayList<>();
        Spa.add("VIP Spa Mani                                                                      9.000.00\n40min");
        Spa.add("VIP Spa Pedi                                                                      12.000.00\n40min");
        item.put("    Spa "+ Spa.size(), Spa);

ExpandableAdapter adapter = new ExpandableAdapter(item);
expandableListView.setAdapter(adapter);


        return view;
    }
}

