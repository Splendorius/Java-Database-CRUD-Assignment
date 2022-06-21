package com.example.bazy_danych_zadanie;

public class Name {

    public static String getName() {
        return Name;
    }

    public static void setName(String name) {
        Name = name;
    }
    private static String Name;

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
