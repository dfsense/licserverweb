package web.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Contract;
import web.repositories.ContractRepository;

import java.util.List;

@Service
public class ContractServiceImpl {

    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
