package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.BookViewHolder> {

    private List<CartItem> bookItemList;
    private Context context;

    public Adapter(Context context, List<CartItem> cartItemList) {
        this.context = context;
        this.bookItemList = cartItemList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Liên kết layout item_book.xml với ViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        CartItem cartItem = bookItemList.get(position);

        // Gán dữ liệu cho từng item
        holder.itemImage.setImageResource(cartItem.getImageResId());
        holder.itemTitle.setText(cartItem.getTitle());

    }

    @Override
    public int getItemCount() {
        return bookItemList.size();
    }

    // ViewHolder chứa các thành phần trong item_book.xml
    public static class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemTitle;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemTitle = itemView.findViewById(R.id.itemTitle);
        }
    }
}
