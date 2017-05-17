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
public class Cirurgico {
    private String nome;
    Scanner lerInt = new Scanner(System.in);
    private int qtdDeMedico;
    private List<Hospital> lista = new ArrayList();
    
    public Cirurgico(){
        nome = null;
                    
    }
        public void tipoCirurgico(){
            
        System.out.print("\nProcedimento Cirurgico\n(1)Oftalmo\n(2)Rinoplastia\n(3)Bléfaro\n(4)Adeno\nOpção: ");
        int tipo = lerInt.nextInt();
        
        if (tipo==1){
            this.nome = "Oftalmo" ;
        }
        if (tipo==2){
            this.nome = "Rinoplastia" ;
        }
        if (tipo==3){
            this.nome = "Bléfaro" ;
        }
        if (tipo==4){
            this.nome = "Adeno" ;
        }
         
    }
}
