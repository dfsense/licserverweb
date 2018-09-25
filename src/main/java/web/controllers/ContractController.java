package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import web.models.Contract;
import web.services.impl.ContractServiceImpl;

import java.util.List;

@Controller
public class ContractController {
    @Autowired
    private ContractServiceImpl contractService;

    @GetMapping("/contracts")
    public @ResponseBody
    String getContracts(){

        List<Contract> list = contractService.findAll();

        return "That's OK!";
    }
}
