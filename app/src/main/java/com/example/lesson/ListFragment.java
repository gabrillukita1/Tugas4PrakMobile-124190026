package com.example.lesson;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {


    View v;
    RecyclerView recyclerView;
    List<ModalClass> mList;
    Adapter adapter;

    public ListFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_list, container, false);

        recyclerView=v.findViewById(R.id.recyclerViewId);

        adapter= new Adapter(mList, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mList=new ArrayList<>();
        mList.add(new ModalClass(R.drawable.aplikasi," Aplikasi"));
        mList.add(new ModalClass(R.drawable.web,"Web"));
        mList.add(new ModalClass(R.drawable.mobile,"Mobile"));
        mList.add(new ModalClass(R.drawable.jarkom,"Jarkom"));
        mList.add(new ModalClass(R.drawable.basisdata,"BasisData"));
        mList.add(new ModalClass(R.drawable.pemweb,"PemWeb"));


    }
}