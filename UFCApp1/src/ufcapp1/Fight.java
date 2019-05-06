/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufcapp1;

import java.util.Random;

/**
 *
 * @author brunoaguiar
 */
public class Fight {
    //Atributes
    private Fighter desafiado, desafiante;
    private int rounds;
    private boolean aproved;
    
    //public methods
    public void setFight(Fighter f1, Fighter f2){
        if (f1.getCategory() == f2.getCategory()  && f1 != f2){
            this.aproved = true;
            this.desafiado  = f1;
            this.desafiante = f2;
        } else{
            this.aproved = false;
            this.desafiado  = null;
            this.desafiante = null;
        }
    }
    public void fight(){
        if (this.aproved){
        System.out.println("@@@ Desafiado@@@");
        this.desafiado.introduction();
        System.out.println("@@@ Desafiado @@@");
        this.desafiante.introduction();
        
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(); // 0 1 2 
        switch (vencedor){
            case 0: // draw
                System.out.println("Draw!");
                this.desafiante.draw();
                this.desafiado.draw();
                break;
            case 1: //desafiado wins 
                System.out.println("Desafiado Wins" + this.desafiado.getName());
                this.desafiado.win();
                this.desafiante.lost();
                break;
            case 2: //desafiado lost
                System.out.println("Desafiante wins" + this.desafiante.getName());
                this.desafiado.lost();
                this.desafiante.win();
        }
        
    }else {
            System.out.println("a luta nao pode acontecer!");
        }
    }
    //special method

    public Fighter getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Fighter desafiado) {
        this.desafiado = desafiado;
    }

    public Fighter getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Fighter desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAproved() {
        return aproved;
    }

    public void setAproved(boolean aproved) {
        this.aproved = aproved;
    }
    
}
