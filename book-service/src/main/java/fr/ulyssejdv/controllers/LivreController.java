package fr.ulyssejdv.controllers;

import fr.ulyssejdv.models.LivreDto;
import fr.ulyssejdv.repositories.LivreDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ulysse on 09/11/2017.
 */
@RestController
@RequestMapping(path = "/books")
public class LivreController extends AbstractController<LivreDto, Long, LivreDao> {

    @Autowired
    public LivreController(LivreDao livreDao) {
        super(livreDao);
    }
}
