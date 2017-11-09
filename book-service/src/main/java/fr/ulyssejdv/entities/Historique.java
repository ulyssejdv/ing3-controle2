package fr.ulyssejdv.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

/**
 * Created by ulysse on 09/11/2017.
 */
@Entity(name = "emprunts")
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateEmprunt;

    private Date dateRetour;

    @ManyToOne
    private Livre livre;

    @ManyToOne
    private User user;
}
