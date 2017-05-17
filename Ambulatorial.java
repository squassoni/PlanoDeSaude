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
public class Ambulatorial {
    Scanner lerInt = new Scanner(System.in);
    private String nome;
    private int qtdDeTecnico;
    private List<Clinica> lista = new ArrayList();
    
    public Ambulatorial(){
        nome = null;

    }
    public void tipoAmbulatorial(){
  
        System.out.print("\nProcedimento Ambulatorial:\n(1)Injeção\n(2)Curativo\n(3)Medicação\n(4)Coleta\n Opção:");
        int tipo = lerInt.nextInt();
        
        if (tipo==1){
            this.nome = "Injeção" ;
        }
        if (tipo==2){
            this.nome = "Curativo" ;
        }
        if (tipo==3){
            this.nome = "Medicação" ;
        }
        if (tipo==4){
            this.nome = "Coleta" ;
        }
         
    }
}
