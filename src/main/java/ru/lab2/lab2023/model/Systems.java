package ru.lab2.lab2023.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Systems {
    ERP ("Enterprise Resource Planning"),
    CRM ("Customer Relationship Management"),
    RN("Service 1"),
    WMS ("Warehouse Management System");

    private final String name;

    Systems(String name) {
        this.name = name;
    }

    @JsonValue
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}