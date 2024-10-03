package com.example.myjokeapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolderJoke extends RecyclerView.ViewHolder {
    private TextView id;
    private TextView setup;
    private TextView punchline;

    public viewHolderJoke(@NonNull View itemView) {
        super(itemView);

        id=itemView.findViewById(R.id.jpkeid);
        setup=itemView.findViewById(R.id.setup);
        punchline=itemView.findViewById(R.id.punchline);

    }
    public void bind(ModelJoke model){
        id.setText(String.valueOf(model.getId()));
        setup.setText(model.getSetup());
        punchline.setText(model.getPunchline());
    }
}
