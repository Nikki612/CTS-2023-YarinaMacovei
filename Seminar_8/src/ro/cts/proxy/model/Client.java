package ro.cts.proxy.model;

public class Client {
    private String name;
    private int age;

    public Client(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
