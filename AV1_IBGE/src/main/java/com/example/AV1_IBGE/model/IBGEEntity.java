package com.example.AV1_IBGE.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ibge")
public class IBGEEntity {

    @Id
    private String id;
    private String tipoNoticia;
    private String tipoRelease;
    private String titulo;
    private String introducao;
    private String data_publicacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoNoticia() {
        return tipoNoticia;
    }

    public void setTipoNoticia(String noticias) {
        this.tipoNoticia = noticias;
    }

    public String getTipoRelease() {
        return tipoRelease;
    }

    public void setTipoRelease(String releases) {
        this.tipoRelease = releases;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getData_publicacao() {
        return data_publicacao;
    }

    public void setData_publicacao(String data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
}
