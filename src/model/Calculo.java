package model;

import com.oracle.webservices.internal.api.EnvelopeStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Alves
 * @since 22/03/2019
 * @version 1.0 Aragorn Version
 */
public class Calculo {
    private double valueA;
    private double valueB;
    private double valueC;
    
    public Calculo() { }
    
    /**
     * @param valueA defines the value of A
     * @param ValueB defines the value of B
     * @param ValueC defines the value of C
     */
    public Calculo(double valueA, double ValueB, double ValueC) {
        this.valueA = valueA;
        this.valueB = ValueB;
        this.valueC = ValueC;
    }
    
    //getters
    public double getValueA() {
        return valueA;
    }

    public void setValueA(double valueA) {
        this.valueA = valueA;
    }

    public double getValueB() {
        return valueB;
    }

    public void setValueB(double valueB) {
        this.valueB = valueB;
    }

    public double getValueC() {
        return valueC;
    }

    public void setValueC(double valueC) {
        this.valueC = valueC;
    }
    //setters
    
    /**
     * @param op is which kind of result the user want to see
     * @return the results/String with the result
     */
    public String results(String op){
        switch(op){
            case "result":
                return "JOptionPane";
            case "resolution":
                return bhaskaraResolution();
            case "both":
                return "";
        }
        return "Erro";
    }
    /**
     * 
     * @return makes the bhaskara calculation
     */
    public String bhaskara(){
        double delta = (Math.pow(valueB, 2)-4*this.valueA*this.valueC);
        if (delta>0){
            double x1 = (-(this.valueB)+ Math.sqrt(delta))/(2*this.valueA);
            double x2 = (-(this.valueB)- Math.sqrt(delta))/(2*this.valueA);   
            return "O Valor de x1 é: " + String.valueOf(x1)+
                   "\nO valor de x2 é: " +String.valueOf(x2);
        }
        return "Não há raizes reais";//
    }
    
    /**
     * @return in a string all the resolution of the bhaskara calculation, step by step.
     */
    public String bhaskaraResolution(){
        String x = String.valueOf(this.valueA)+"X²"+" + "+String.valueOf(this.valueB)+"X"+" + "+String.valueOf(this.valueC)+" = 0"+
                   "\n x = -"+String.valueOf(this.valueB)+"±√"+String.valueOf(this.valueB)+"² -4 * "+String.valueOf(this.valueA)+" * "+String.valueOf(this.valueC+" / 2 * "+String.valueOf(this.valueA))+
                   "\n x = -"+String.valueOf(this.valueB)+"±√"+String.valueOf(Math.pow(this.valueB, 2))+" -"+String.valueOf(-4*this.valueA*this.valueC)+" / "+String.valueOf(2*this.valueA)+
                   "\n x = -"+String.valueOf(this.valueB)+"±√"+String.valueOf(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))+" / "+String.valueOf(2*this.valueA)+
                   "\n x = -"+String.valueOf(this.valueB)+"± "+String.valueOf(Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))+" / "+String.valueOf(2*this.valueA));
        
        String x1= "\n x¹ = -"+String.valueOf(this.valueB)+"- "+String.valueOf(Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))+" / "+String.valueOf(2*this.valueA))+
                   "\n x¹ = -"+String.valueOf(this.valueB + (Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))))+" / "+String.valueOf(2*this.valueA)+
                   "\n x¹ = -"+String.valueOf((this.valueB + (Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC))))) / (2*this.valueA));
        
        String x2= "\n x² = -"+String.valueOf(this.valueB)+"+ "+String.valueOf(Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))+" / "+String.valueOf(2*this.valueA))+
                   "\n x² = "+String.valueOf(this.valueB - (Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC)))))+" / "+String.valueOf(2*this.valueA)+
                   "\n x² = "+String.valueOf((this.valueB - (Math.sqrt(Math.pow(this.valueB, 2)-(-(-4*this.valueA*this.valueC))))) / (2*this.valueA));
        
        return x + "\n" + x1 + "\n" + x2;
    }
    
    /**
     * @return returns all the values and the calculation
     */
    @Override
    public String toString() {
        return "A=" + this.valueA + "\n B=" + this.valueB + "\n C=" + this.valueC + "\nteste:" + bhaskara();
    }
           
}
