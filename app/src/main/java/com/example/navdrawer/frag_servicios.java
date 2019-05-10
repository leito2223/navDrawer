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
        Barberia.add("VIP Alisette                                                                             22.600.00\n 30min");
        Barberia.add("VIP Beard Spa                                                                           22.600.00\n 20min");
        Barberia.add("VIP Beard Trim                                                                          8.000.00\n40min");
        Barberia.add("VIP Beard Wax                                                                          8.000.00 \n 30min");
        Barberia.add("VIP Black Mask                                                                         7.000.00\n 15min");
        Barberia.add("VIP Comb                                                                                    6.000.00\n 20min");
        Barberia.add("VIP Cut                                                                                    3.500.00\n 80min");
        Barberia.add("VIP Cut & Shave                                                                       10.000.00\n 80min");
        Barberia.add("VIP Cut & Trim                                                                          15.000.00\n 15min");
        Barberia.add("VIP Facial                                                                             15.000.00\n 30min");
        Barberia.add("VIP Facial Spa                                                                           5.000.00\n90min");
        Barberia.add("VIP Keratin 1                                                                            15.000.00\n120min");
        Barberia.add("VIP Keratin 2                                                                             23.730.00\n130min");
        Barberia.add("VIP Keratin 3                                                                              33.900.00\n60min");
        Barberia.add("VIP Keratin 4                                                                             45.200.00\n40min");
        Barberia.add("VIP Kids                                                                             28.250.00\n40min");
        Barberia.add("VIP Facial                                                                             7.000.00\n45min");
        Barberia.add("VIP Shave                                                                             8.000.00\n 40min");
        Barberia.add("VIP Tint Service                                                                      23.730.00\n 45min");
        Barberia.add("VIP Tint Service 2                                                                    28.250.00\n40min");



        item.put("    Barberia " + Barberia.size(), Barberia);
        ArrayList<String> Spa = new ArrayList<>();
        Spa.add("VIP Pedicure                                                                             9.040.00\n40min");
        item.put("     Uñas  "+ Spa.size(), Spa);

        ExpandableAdapter adapter = new ExpandableAdapter(item);
        expandableListView.setAdapter(adapter);
        return view;
    }
}
