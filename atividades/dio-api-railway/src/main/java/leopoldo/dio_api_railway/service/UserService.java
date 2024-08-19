package leopoldo.dio_api_railway.service;

import leopoldo.dio_api_railway.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}