package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Contract;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
}
