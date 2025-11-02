package io.github.potjerodekool.petstore.api.model;

import java.util.UUID;

public class PetDto {

    private UUID id;

    private String type;

    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public PetDto id(final UUID id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public PetDto type(final String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PetDto name(final String name) {
        this.name = name;
        return this;
    }
}
