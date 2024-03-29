package com.example.catalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenreEntity {
    private Integer id;
    private String name;
    private String genre;
    private String urlStream;
}
