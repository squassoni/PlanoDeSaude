/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 31312020
 */
public class Segurado {
    
    private String nome;
    private long cpf;
    private ArrayList<PlanoSaude> planos;
    private List<Autorizacao> lista = new ArrayList();
    
    public Segurado(String nome, long cpf){
        
        this.nome = nome;
        this.cpf = cpf;
        
        planos = new ArrayList<PlanoSaude>();
        
    }
    public String getNome(){
        return nome;        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public long getCpf(){
        return cpf;        
    }
    
    public ArrayList<PlanoSaude> getPlano(){
        return planos;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    
}
