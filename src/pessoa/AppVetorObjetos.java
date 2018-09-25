package pessoa;

import javax.swing.JOptionPane;

public class AppVetorObjetos {

    public static void main(String[] args) {

        Pessoa vPessoas[] = new Pessoa[5];

        for (int i = 0; i < vPessoas.length; i++) {

            vPessoas[i] = new Pessoa(JOptionPane.showInputDialog("Nome:"),
                    Integer.parseInt(JOptionPane.showInputDialog("Idade:")),
                    JOptionPane.showInputDialog("Sexo (f/m:").charAt(0)
            );
        }

        for (Pessoa pessoa : vPessoas) {
            JOptionPane.showMessageDialog(null,
                    pessoa.imprimir());
        }
    }

}
