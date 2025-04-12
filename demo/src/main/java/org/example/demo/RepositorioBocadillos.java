package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioBocadillos {
    private static final ObservableList<Bocadillo> bocadillos = FXCollections.observableArrayList();

    public static ObservableList<Bocadillo> getBocadillos() {
        return bocadillos;
    }

    public static void insertarPersona(Bocadillo bocadillo) {
        bocadillos.add(bocadillo);
    }
}
