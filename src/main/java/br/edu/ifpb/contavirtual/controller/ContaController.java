package br.edu.ifpb.contavirtual.controller;


import br.edu.ifpb.contavirtual.model.Conta;
import br.edu.ifpb.contavirtual.service.ContaService;
import br.edu.ifpb.contavirtual.service.CorrentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @Autowired
    private CorrentistaService correntistaService;



}
