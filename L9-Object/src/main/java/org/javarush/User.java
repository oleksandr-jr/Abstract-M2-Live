package org.javarush;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class User implements Cloneable {
    private int id;
    private String username;
    private String password;

    private ArrayList<String> strings;


    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    private void testMethod(){
        System.out.println("TestMethod");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(ArrayList<String> strings) {
        this.strings = strings;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User clone = new User(id, new String(username), new String(password));
        clone.setStrings((ArrayList<String>) strings.clone());


        return clone;
    }
}
