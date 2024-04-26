package com.example.AV1_IBGE.service;

import com.example.AV1_IBGE.model.IBGEEntity;
import com.example.AV1_IBGE.repository.IBGERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Service
public class IBGEService {

    @Autowired
    private IBGERepository ibgeRepository;

    public List<IBGEEntity> obterTodos() {return ibgeRepository.findAll();}

    public IBGEEntity inserirNoticias(IBGEEntity ibge) {return ibgeRepository.save(ibge);}
    public IBGEEntity inserirReleases(IBGEEntity ibge) {return ibgeRepository.save(ibge);}

    private String consultarURL(String apiURL){
        String dados = "";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiURL, String.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            dados = responseEntity.getBody();
        } else {
            dados = "Falha ao obter dados. Código de Status: " + responseEntity.getStatusCode();
        }
        return dados;
    }

    public String  consultarNoticiasEReleases() { return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias");}

    public String consultarNoticias() {
        return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=noticia");
    }

    public String consultarReleases() { return consultarURL("https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release");}

}
