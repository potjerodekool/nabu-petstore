package io.github.potjerodekool.petstore.api.model;

import lombok.Data;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Data
public class PetDto {

    private UUID id;

    private CategoryDto category;

    private String name;

    private Status status;

    private Set<TagDto> tags;

    private List<String> photoUrls;
}
