package dev.nakive.oovvoo.model;

public class user {
    private String id, name, nominal;

    public user(String id, String name, String nominal) {
        this.id = id;
        this.name = name;
        this.nominal = nominal;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }
}