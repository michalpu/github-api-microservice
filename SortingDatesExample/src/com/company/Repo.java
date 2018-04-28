package com.company;

public class Repo implements Comparable{
    private String name;
    private String date;

    public Repo(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    @Override
    public int compareTo(Object o) {
        return this.getDate().compareTo(((Repo) o).getDate());
    }

    @Override
    public String toString() {
        return "Repo{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
