package com.example.java9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Fish> fish = new ArrayList<Fish>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_fish);

        // создадим адаптер и загрузим в него контейнер с данными
        FishAdapter adapter = new FishAdapter(this, fish);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        fish.add( new Fish("Лещ", "Хищная рыба, обитает в реках Днепр и Дон.",
                R.drawable.lesh, "Численность большая"));
        fish.add( new Fish("Карась", "Травоядная рыба, обитает в заросших водоёмах.",
                R.drawable.carassius, "Численность большая"));
        fish.add( new Fish("Щука", "Хищная рыба, обитает в зарослях водоёмов.",
                R.drawable.shchuka, "Численность большая"));
        fish.add( new Fish("Окунь", " Хищная рыба, обитает в озёрах.",
                R.drawable.okun, "Численность большая"));
        fish.add( new Fish("Сом", "Хищная рыба, обитает в крупных реках",
                R.drawable.som, "Численность большая"));
    }
}