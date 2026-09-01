package io.github.potjerodekool.petstore.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class ImageService {

    private final Map<String, byte[]> imageStore = new HashMap<String, byte[]>();

    public String storeImage(final byte[] data) {
        final var id = UUID.randomUUID().toString();
        final var url = "/images/" + id;
        imageStore.put(url, data);
        return url;
    }

    public byte[] getImage(final String url) {
        return imageStore.get(url);
    }

}
