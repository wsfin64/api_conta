package br.edu.ifpb.contavirtual.service;

import br.edu.ifpb.contavirtual.model.Conta;
import br.edu.ifpb.contavirtual.repositories.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;



}
