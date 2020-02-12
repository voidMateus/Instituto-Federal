package bora;
import javax.swing.JOptionPane;
public class Bora {
    public static void main(String[] args) {
        String primeironumero =
               JOptionPane.showInputDialog("Insira um Dividendo:");
        String segundonumero =
                JOptionPane.showInputDialog("Insira o Divisor:");
        int numero1 = Integer.parseInt(primeironumero); 
        int numero2 = Integer.parseInt(segundonumero);
        
       float divisao = numero1 / numero2;
       
       JOptionPane.showMessageDialog(null,"O resultado desta divisão é: "+ divisao,"Divisao dos Numeros",
                JOptionPane.PLAIN_MESSAGE);
    }
    
}
