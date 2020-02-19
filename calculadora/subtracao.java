package calculadora;

import javax.swing.JOptionPane;

public class subtracao {
    public void subtrair(double x1,double x2){
        double resultado = x1 - x2;
         JOptionPane.showMessageDialog (null, "A Subtração dos numeros é igual a: " + resultado,
                "Resultado", JOptionPane.PLAIN_MESSAGE );
    }
}
