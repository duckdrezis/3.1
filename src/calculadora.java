import javax.swing.JOptionPane;
public class calculadora {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("insira o primeiro número:");
        String input2 = JOptionPane.showInputDialog("insira o segundo número:");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        int soma = num1 + num2;

        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
}