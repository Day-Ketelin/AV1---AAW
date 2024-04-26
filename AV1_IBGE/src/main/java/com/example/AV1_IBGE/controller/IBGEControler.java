package com.example.AV1_IBGE.controller;

import com.example.AV1_IBGE.model.IBGEEntity;
import com.example.AV1_IBGE.service.IBGEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticiasereleases")
public class IBGEControler {



    @Autowired
    private IBGEService ibgeService;

    @GetMapping
    public List<IBGEEntity> obterTodos() {return ibgeService.obterTodos();}
    @GetMapping("/noticiasereleses")
    public String consultarNoticiasEReleses() {return ibgeService.consultarNoticiasEReleases();}

    @GetMapping("/noticias")
    public String consultarNoticias() { return ibgeService.consultarNoticias();}

    @GetMapping("/releases")
    public String consultarReleases() {return ibgeService.consultarReleases();}


    //IBGEService service = new IBGEService();

    @PostMapping
    public IBGEEntity inserirNoticia(@RequestBody IBGEEntity ibge) {return ibgeService.inserirNoticias((ibge));}
    @PostMapping
    public IBGEEntity inserirReleases(@RequestBody IBGEEntity ibge) {return ibgeService.inserirReleases(ibge);}
}
