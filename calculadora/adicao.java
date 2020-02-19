package calculadora;
import javax.swing.JOptionPane;
public class adicao {
    double resultado;
    public void somar(double x1,double x2){
        resultado = x1 + x2;
        JOptionPane.showMessageDialog (null, "A Soma dos numeros é igual a: " + resultado,
                "Resultado", JOptionPane.PLAIN_MESSAGE );
    }
}
