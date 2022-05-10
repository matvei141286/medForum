package org.example;

import lombok.*;

import java.util.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor

public class Media {
    private final  String name;
    private final  String fileExtension;
    private final String size;
    private String typeMedia;
    private Date dateCreation = new Date();
}
