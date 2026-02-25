package com.mycompany.app.project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataStore<User, String> userStore = new DataStore<>();

        try {
            System.out.println("Importar usuarios...");
            userStore.add("123", new User("123", "Fernando"));
            userStore.add("456", new User("456", "Maria"));
            userStore.add("789", new User("789", "Ana"));
            // userStore.add(null, new User("789", "Ana"));

            System.out.println("Encontrado: " + userStore.find("123"));
            System.out.println("Eliminado: " + userStore.remove("123"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        List<User> users = userStore.getAll(); 
        for (User user: users) {
            System.out.println(user);
        }
    }
}
