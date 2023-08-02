package com.example.java9;

public class Fish {

    // поля сущности
    private String name; // поле названия животного
    private String fishDescription; // поле описания животного
    private int fishResource; // поле ресурса животного
    private String populationSize; // поле численности популяции

    // конструктор
    public Fish(String name, String fishDescription, int fishResource, String populationSize) {
        this.name = name;
        this.fishDescription = fishDescription;
        this.fishResource = fishResource;
        this.populationSize = populationSize;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFishDescription() {
        return fishDescription;
    }

    public void setFishDescription(String fishDescription) {
        this.fishDescription = fishDescription;
    }

    public int getFishResource() {
        return fishResource;
    }

    public void setFishResource(int FishResource) {
        this.fishResource = fishResource;
    }

    public String getPopulationSize() {
        return populationSize;
    }

    public void setPopulationSize(String populationSize) {
        this.populationSize = populationSize;
    }
}