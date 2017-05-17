/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author 31312020
 */
public class Autorizacao {
    private String dataDaAvaliacao;
    ItemDeProcedimentos lista;
    Estado estado;
    Local local;
    Segurado segurado;
    Scanner lerInt = new Scanner(System.in);
    
    
    public Autorizacao(){
        //Pendente pendente = new Pendente();
        TipoAutorizacao tipo = TipoAutorizacao.PENDENTE;
        lista = new ItemDeProcedimentos();
    }
    public void autorizacao(){
        System.out.print("\nDeseja autorizar procedimento(s)?\n(1)Sim\n(2)Não\nOpção: ");
        int opc = lerInt.nextInt();
        
        if (opc==1){
            autorizar();
        }
        if (opc==2){
            negar();
        }
    }
    
    public void autorizar(){
        TipoAutorizacao tipo = TipoAutorizacao.AUTORIZADO;
        System.out.println(tipo.getAutorizacao());
    }
    public void negar(){
        TipoAutorizacao tipo = TipoAutorizacao.NEGADO;
        System.out.println(tipo.getAutorizacao());
    }
    
    public enum TipoAutorizacao{
        AUTORIZADO("\nAutorizado"), NEGADO("\nNegado"), PENDENTE("\nPendente");
    
    private String tipo;
    
    TipoAutorizacao(String tipo){
        this.tipo = tipo;
    }
    public String getAutorizacao(){
        return this.tipo;
    }
    
    }
}



    

