/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mconsoletojframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author João Vitor
 */
public class mCalculadoraDesconto implements ActionListener {

    JFrame janela = new JFrame();
    //criando Painel/Container para add os objetos
    JPanel painel = new JPanel();
    //Input dos objetos
    JLabel jlabel = new JLabel("Valor: ");
    JTextField jtfsValor = new JTextField(5);
    JButton btnCalc = new JButton("Calcular");
    JComboBox descontos = new JComboBox();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new mCalculadoraDesconto();
    }

    private mCalculadoraDesconto() {
        janela.setTitle("Calculadora de desconto");
        janela.setSize(450, 100);
        janela.setLocation(50, 50);
        janela.setLocationRelativeTo(null);
        //Define a exibição do botão fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        // add JLabel ao painel 
        painel.add(jlabel);
        // add JTextField ao painel 
        painel.add(jtfsValor);
        // add Combo Box ao painel
        painel.add(descontos);
        // add JButton ao painel
        painel.add(btnCalc);
        // add Painel ao JFrame
        janela.add(painel);
        // Define o carregamento do JFrame
        janela.setVisible(true);
        //Resgistrando o botão no Listener
        btnCalc.addActionListener(this);

        //Add itens no combo
        descontos.addItem("Selecione...");
        descontos.addItem("10%");
        descontos.addItem("20%");
        descontos.addItem("30%");
        descontos.addItem("40%");
        descontos.addItem("50%");
        descontos.addItem("75%");

    }

    public void limpar() {
        jtfsValor.setText("");
        descontos.setSelectedIndex(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalc) {
            if (jtfsValor.getText().isBlank() || descontos.getSelectedItem().equals("Selecione...")) {
                JOptionPane.showMessageDialog(null, "Ambos os campos devem ser "
                        + "preenchidos!");
            } else {
                float valor = Float.parseFloat(jtfsValor.getText());
                float valorComDesconto = 0;
                // percentual = descontos.getSelectedItem() 
                int indexComboBox = descontos.getSelectedIndex();

                switch (indexComboBox) {
                    case 1:
                        valorComDesconto = (float) (valor - (valor * 0.10));
                        break;
                    case 2:
                        valorComDesconto = (float) (valor - (valor * 0.20));
                        break;
                    case 3:
                        valorComDesconto = (float) (valor - (valor * 0.30));
                        break;
                    case 4:
                        valorComDesconto = (float) (valor - (valor * 0.40));
                        break;
                    case 5:
                        valorComDesconto = (float) (valor - (valor * 0.50));
                        break;
                    case 6:
                        valorComDesconto = (float) (valor - (valor * 0.75));
                        break;
                }
                JOptionPane.showMessageDialog(null, "Valor Total: " + NumberFormat.getCurrencyInstance().format(valor) + " reais"
                        + "\nValor com desconto: " + NumberFormat.getCurrencyInstance().format(valorComDesconto) + " reais");
            }
            limpar();
        }
    }
}


