package fr.ulyssejdv.models;

import java.util.Set;

/**
 * Created by ulysse on 09/11/2017.
 */
public class UserDto {

    private Long id;

    private String nom;

    private String prenom;

    private Set<HistoriqueDto> historiques;
}
