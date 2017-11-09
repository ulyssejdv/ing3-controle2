package fr.ulyssejdv.repositories;

import fr.ulyssejdv.entities.Livre;
import fr.ulyssejdv.models.LivreDto;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ulysse on 09/11/2017.
 */
@Repository
public class LivreDao extends AbstractDAO<LivreDto, Livre, Long> {

    protected LivreDao(Mapper dozer, Class<LivreDto> livreDtoClass, Class<Livre> livreClass, PagingAndSortingRepository<Livre, Long> repository) {
        super(dozer, livreDtoClass, livreClass, repository);
    }
}
