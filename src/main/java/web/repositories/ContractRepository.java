package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;
import web.models.Contract;

@Repository
public interface ContractRepository extends CrudRepository<Contract, Long> {
}
