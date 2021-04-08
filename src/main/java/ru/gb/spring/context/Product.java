package ru.gb.spring.context;

public class Product {
    int id;
    String name;
    float coast;

    public Product(int id, String name, float coat) {
        this.id = id;
        this.name = name;
        this.coast = coat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCoat() {
        return coast;
    }

    public void setCoat(float coat) {
        this.coast = coat;
    }

    @Override
    public String toString() {
        return "ru.gb.spring.context.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coast=" + coast +
                '}';
    }



}
