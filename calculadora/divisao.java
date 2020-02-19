package calculadora;

import javax.swing.JOptionPane;

public class divisao {
    public void multiplicar(double x1,double x2){
        double resultado = x1/x2;
         JOptionPane.showMessageDialog (null, "A Divisão dos numeros é igual a: " + resultado,
                "Resultado", JOptionPane.PLAIN_MESSAGE );
    }
}
