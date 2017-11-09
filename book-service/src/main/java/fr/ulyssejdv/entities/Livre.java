package fr.ulyssejdv.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ulysse on 09/11/2017.
 */
@Data
@Entity(name = "livres")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    private Boolean neuf;

    @OneToMany
    private Set<Categorie> categories;


}
