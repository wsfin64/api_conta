package br.edu.ifpb.contavirtual.service;
import br.edu.ifpb.contavirtual.model.Correntista;
import br.edu.ifpb.contavirtual.repositories.CorrentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {



    @Autowired
    private CorrentistaRepository correntistaRepository;

}
