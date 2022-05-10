package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Media {
    private String name;
    private String fileExtension;
    private String size;
    private String typeMedia;
    private Date dateCreation;

    public Media (String name, String fileExtension, String size) {
        this.name = name;
        this.fileExtension= fileExtension;
        this.size = size;
        this.dateCreation = new Date();

    }


}
