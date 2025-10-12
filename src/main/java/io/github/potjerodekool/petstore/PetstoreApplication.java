package io.github.potjerodekool.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetstoreApplication.class, args);
	}

}


/*
        final var petTypes = List.of("Cat", "Dog");

        final var pets = petTypes.stream()
                .map(petType -> {
                    final var pet = new Pet();
                    pet.setId(UUID.randomUUID());
                    pet.setType(petType);
                    pet.setName(petType);
                    return pet;
                })
                .toList();
 */