package projetos.SpringBoot_BankApi.service;

import projetos.SpringBoot_BankApi.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
