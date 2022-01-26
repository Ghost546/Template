package com.tisbi.template;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<Person> persons;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_person_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Person person = persons.get(position);
        holder.name.setText(person.getFirstname());
        holder.age.setText(person.getAge());
        holder.number.setText(person.getNumber());
        holder.address.setText(person.getAddress());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;
        TextView number;
        TextView address;
        ViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.name_text);
            age = view.findViewById(R.id.age_text);
            number = view.findViewById(R.id.number_text);
            address = view.findViewById(R.id.address_text);
        }
    }

    PersonAdapter(Context context, ArrayList<Person> people) {
        this.inflater = LayoutInflater.from(context);
        this.persons = people;
    }
}
