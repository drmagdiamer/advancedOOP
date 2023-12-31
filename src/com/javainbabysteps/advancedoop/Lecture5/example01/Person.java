package com.javainbabysteps.advancedoop.Lecture5.example01;

public class Person {
    private String name;
    private int id;

    private float salary;

    public Person() {
    }

    public Person(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.salary = builder.salary;;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    /////////

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder
    {
        private String name;
        private int id;

        private float salary;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder salary(float salary) {
            this.salary = salary;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
