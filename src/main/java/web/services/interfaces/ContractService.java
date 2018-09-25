package web.services.interfaces;

import web.models.Contract;

import java.util.List;

public interface ContractService {
    List<Contract> findAll();
}
