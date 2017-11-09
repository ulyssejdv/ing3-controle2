package fr.ulyssejdv.repositories;

import fr.ulyssejdv.entities.Categorie;
import fr.ulyssejdv.entities.User;
import fr.ulyssejdv.models.CategorieDto;
import fr.ulyssejdv.models.UserDto;
import org.dozer.Mapper;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ulysse on 09/11/2017.
 */
@Repository
public class CategorieDao extends AbstractDAO<CategorieDto, Categorie, Long> {
    protected CategorieDao(Mapper dozer, Class<CategorieDto> categorieDtoClass, Class<Categorie> categorieClass, PagingAndSortingRepository<Categorie, Long> repository) {
        super(dozer, categorieDtoClass, categorieClass, repository);
    }
}
