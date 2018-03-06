package br.com.devmedia.mobile.signos;

import java.io.Serializable;

/**
 * Created by david on 02/03/18.
 */

public class Signo implements Serializable {
    private int diainicio;
    private int diafim;
    private int mesinicio;
    private int mesfim;
    private String nome;
    private String imagem;

    public Signo() {
    }
    public Signo(int diainicio, int diafim, int mesinicio, int mesfim, String nome, String imagem) {
        this.diainicio = diainicio;
        this.diafim = diafim;
        this.mesinicio = mesinicio;
        this.mesfim = mesfim;
        this.nome = nome;
        this.imagem = imagem;
    }
    public int getDiainicio() {return diainicio;}
    public int getDiafim() {return diafim;}
    public int getMesinicio() {return mesinicio;}
    public int getMesfim() {return mesfim;}
    public String getNome() {return nome;}
    public String getImagem() {return imagem;}
}
