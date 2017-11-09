package fr.ulyssejdv.repositories;

import fr.ulyssejdv.entities.Livre;
import fr.ulyssejdv.entities.User;
import fr.ulyssejdv.models.UserDto;
import org.dozer.Mapper;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ulysse on 09/11/2017.
 */
@Repository
public class UserDao extends AbstractDAO<UserDto, User, Long> {

    protected UserDao(Mapper dozer, Class<UserDto> userDtoClass, Class<User> userClass, PagingAndSortingRepository<User, Long> repository) {
        super(dozer, userDtoClass, userClass, repository);
    }
}
