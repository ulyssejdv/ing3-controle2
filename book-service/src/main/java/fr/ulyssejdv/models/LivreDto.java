package fr.ulyssejdv.models;

import java.util.Set;

/**
 * Created by ulysse on 09/11/2017.
 */
public class LivreDto {

    private Long id;

    private String titre;

    private Boolean neuf;

    private Set<CategorieDto> categories;
}
