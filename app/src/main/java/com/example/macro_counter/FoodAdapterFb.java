package com.example.macro_counter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import org.jetbrains.annotations.NotNull;
import org.parceler.Parcels;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class FoodAdapterFb extends FirebaseRecyclerAdapter<Food, FoodAdapterFb.FoodsViewholder> {
    private Context context;

    public FoodAdapterFb(@NonNull FirebaseRecyclerOptions<Food> options) {
        super(options);
    }

    @Override
    protected void
    onBindViewHolder(@NonNull FoodsViewholder holder, int position, @NonNull Food model)     {

        holder.tvAdapterFoodName.setText(model.getItemName());
        holder.tvAdapterCaloriesValue.setText(model.getCalories());

//        holder.btnAdapterAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(context, SearchDetailActivity.class);
////                i.putExtra("food", Parcels.wrap(food));
//                context.startActivity(i);
//            }
//        });

    }


    // "person.xml")in
    // which the data will be shown
    @NonNull
    @Override
    public FoodsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_entry, parent, false);
        return new FoodAdapterFb.FoodsViewholder(view);
    }

    // Sub Class to create references of the views in Crad
    // view (here "person.xml")
    class FoodsViewholder extends RecyclerView.ViewHolder {
        TextView tvAdapterFoodName, tvAdapterCalories, tvAdapterCaloriesValue;
        Button btnAdapterAdd;
        RelativeLayout container;

        public FoodsViewholder(@NonNull View itemView) {
            super(itemView);

            tvAdapterFoodName = itemView.findViewById(R.id.tvAdapterFoodName);
            tvAdapterCaloriesValue = itemView.findViewById(R.id.tvAdapterCaloriesValue);


            btnAdapterAdd = itemView.findViewById(R.id.btnAdapterAdd);
            container =  itemView.findViewById(R.id.container);




        }


    }

}
