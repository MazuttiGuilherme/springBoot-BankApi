package projetos.SpringBoot_BankApi.domain.repository;

import org.springframework.data.jpa.reposytory.JpaRepository
import projetos.SpringBoot_BankApi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}