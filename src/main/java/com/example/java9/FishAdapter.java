package com.example.java9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.CircularArray;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class FishAdapter extends RecyclerView.Adapter<FishAdapter.ViewHolder> {

        // поля адаптера
        private final LayoutInflater inflater; // поле для трансформации layout-файла во View-элемент
        private List<Fish> fishs = null;
        ; // поле коллекции контейнера для хранения данных (объектов класса Fish)

        // конструктор адаптера
        public FishAdapter(Context context, List<Fish> fish) {
            this.inflater = LayoutInflater.from(context);
            this.fishs = fishs;
        }

        // метод onCreateViewHolder() возвращает объект ViewHolder(), который будет хранить данные по одному объекту Fish
        @Override
        public FishAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.list_item, parent, false); // трансформация layout-файла во View-элемент
            return new ViewHolder(view);
        }

        // метод onBindViewHolder() выполняет привязку объекта ViewHolder к объекту Fish по определенной позиции
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Fish fish = fishs.get(position);
            holder.fishView.setImageResource(fish.getFishResource());
            holder.nameView.setText(fish.getName());
            holder.fishDescriptionView.setText(fish.getFishDescription());
            holder.populationSizeView.setText(fish.getPopulationSize());
        }

        // метод getItemCount() возвращает количество объектов в списке
        @Override
        public int getItemCount() {
            return fishs.size();
        }

        // созданный статический класс ViewHolder
        public static class ViewHolder extends RecyclerView.ViewHolder {
            // неизменяемые поля представления
            final ImageView fishView;
            final TextView nameView, fishDescriptionView, populationSizeView;

            // конструктор класса ViewHolder с помощью которого мы связываем поля и представление list_item.xml
            ViewHolder(View view) {
                super(view);
                fishView = view.findViewById(R.id.fishResource);
                nameView = view.findViewById(R.id.name);
                fishDescriptionView = view.findViewById(R.id.fishDescription);
                populationSizeView = view.findViewById(R.id.populationSize);
            }
        }
    }


