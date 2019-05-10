package com.example.navdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class frag_servicios extends Fragment {
    View view;
    public frag_servicios() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_servicios,container,false);
        ExpandableListView expandableListView = view.findViewById(R.id.ELSA);
        HashMap<String, List<String>> item = new HashMap<>();
        ArrayList<String> Barberia = new ArrayList<>();
        Barberia.add("VIP Alisette");
        Barberia.add("VIP Beard Spa");
        Barberia.add("VIP Beard Trim");
        Barberia.add("VIP Beard Trim");
        Barberia.add("VIP Beard Wax");
        Barberia.add("VIP Black Mask");
        Barberia.add("VIP Comb");
        Barberia.add("VIP Cut");
        Barberia.add("VIP Cut & Shave");
        Barberia.add("VIP Cut & Trim");
        Barberia.add("VIP Facial");
        Barberia.add("VIP Facial Spa");
        Barberia.add("VIP Keratin 1");
        Barberia.add("VIP Keratin 2");
        Barberia.add("VIP Keratin 3");
        Barberia.add("VIP Keratin 4");
        Barberia.add("VIP Kids");
        Barberia.add("VIP Facial");
        Barberia.add("VIP Shave");
        Barberia.add("VIP Tint Service");
        Barberia.add("VIP Tint Service 2");



        item.put("Barberia", Barberia);
        ArrayList<String> Spa = new ArrayList<>();
        Spa.add("VIP Pedicure");
        item.put("Spa", Spa);

        ExpandableAdapter adapter = new ExpandableAdapter(item);
        expandableListView.setAdapter(adapter);
        return view;
    }
}
