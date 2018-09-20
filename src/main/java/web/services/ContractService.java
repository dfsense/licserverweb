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
@Repository
@Transactional
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> findAll() {
        ArrayList<Contract> list = new ArrayList<>();
        list.add(new Contract());
        list.add(new Contract());
        return list;
    }
}
