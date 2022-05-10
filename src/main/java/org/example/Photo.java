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
    private String typeMedia = "Photo";

    Photo(String name, String fileExtension, String size) {
        super(name, fileExtension, size);
    }


}
