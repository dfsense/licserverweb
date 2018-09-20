package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.models.Contract;
import web.repositories.ContractRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> findAll() {
        return contractRepository.findAll();
    }
}
