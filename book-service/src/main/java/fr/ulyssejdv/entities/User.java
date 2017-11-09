package fr.ulyssejdv.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by ulysse on 09/11/2017.
 */
@Data
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "user")
    private Set<Historique> historiques;
}
