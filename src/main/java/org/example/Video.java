package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Video extends Media  {
    private static final String typeMedia = "Video";

    public Video(String name, String fileExtension, String size) {
        super(name, fileExtension, size);
    }
}
