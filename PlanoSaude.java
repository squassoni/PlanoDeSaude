/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 31312020
 */
public class PlanoSaude {
    
    private int numeroAutorizacao;
    private ArrayList<Segurado> segurados;
    Operadora operadora;
    Procedimento procedimento;
    
    public PlanoSaude(int numeroAutorizacao){
        this.numeroAutorizacao = numeroAutorizacao;
        
        segurados = new ArrayList<Segurado>();
        operadora = new Operadora();
        procedimento = new Procedimento();
    }
    
    public int getNumeroAutorizacao(){
        return numeroAutorizacao;        
    }
    
    public void setNumeroAutorizacao(int numeroAutorizacao){
        this.numeroAutorizacao = numeroAutorizacao;
    }
    
    public ArrayList<Segurado> getSegurado(){
        return segurados;
    }
    
    
}

