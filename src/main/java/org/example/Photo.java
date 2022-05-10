package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

class Photo extends Media {
    private static final String typeMedia = "Photo";

    public Photo(String name, String fileExtension, String size) {
        super(name, fileExtension, size);
    }


}
