package com.example.demo.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.Adapter;
import com.example.demo.CartItem;
import com.example.demo.R;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment {

    private RecyclerView bookRecyclerView;
    private Adapter bookAdapter;
    private List<CartItem> cartItemList;

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Liên kết RecyclerView từ layout
        bookRecyclerView = view.findViewById(R.id.bookRecyclerView);

        // Khởi tạo danh sách dữ liệu
        cartItemList = new ArrayList<>();
        cartItemList.add(new CartItem(R.drawable.chiecchuonggom, "Seller Information"));
        cartItemList.add(new CartItem(R.drawable.chiecthuyen, "Seller Information"));
        // Cấu hình RecyclerView
        bookAdapter = new Adapter(getContext(), cartItemList);
        bookRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        bookRecyclerView.setAdapter(bookAdapter);
    }
}
