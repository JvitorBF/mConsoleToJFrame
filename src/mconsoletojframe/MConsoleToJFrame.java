/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mconsoletojframe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame; //Import do JFrame
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import view.IMC;
import view.jfCalcDiasVida;
import view.jfPesquisa;

//import javax.swing.*; // O * serve para importar tudo que esta dentro do swing
/**
 *
 * @author jairb
 */
public class MConsoleToJFrame implements ActionListener {

    JFrame janela = new JFrame();
    //criando Painel/Container para add os objetos
    JPanel painel = new JPanel();
    JLabel jlNome = new JLabel("Seu nome: ");
    //Vamos criar um input/JTField
    JTextField jtfsNome = new JTextField(5);
    JButton btnOk = new JButton("OK");
    JButton btnIMC = new JButton("Calc. IMC");
    JButton btnDVida = new JButton("Calc. Dias Vida");
    JButton btnPesquisa = new JButton("Pesquisa");
    JComboBox cbLinguagens = new JComboBox();
    JCheckBox chkJava = new JCheckBox("Java");
    JCheckBox chkPHP = new JCheckBox("PHP");
    JCheckBox chkPy = new JCheckBox("Python");
    JCheckBox chkCobol = new JCheckBox("Cobol");
    JButton btnChk = new JButton("Check's?");
    JLabel jlCheckBox = new JLabel("Qual linguagem já programou?");
    JLabel jlRadioButton = new JLabel("Desconto: ");
    JRadioButton jrb10 = new JRadioButton("10%");
    JRadioButton jrb20 = new JRadioButton("20%");
    JRadioButton jrb30 = new JRadioButton("30%");
    JButton btnRadioButton = new JButton("Calcular desc.");
    ButtonGroup bgDesconto = new ButtonGroup();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new MConsoleToJFrame();
    }

    private MConsoleToJFrame() {
        janela.setTitle("Janela Principal");
        janela.setSize(750, 200);
        janela.setLocation(50, 50);
        //Define a exibição do botão fechar
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        //add label ao painel
        painel.add(jlNome);
        //add jtextField ao painel
        painel.add(jtfsNome);
        //add ComboBox ao  painel
        painel.add(cbLinguagens);
        //add botão ao painel
        painel.add(btnOk);
        //add botão IMC ao painel
        painel.add(btnIMC);
        //add botão jfCalcVida ao painel
        painel.add(btnDVida);

        //add Label do check
        painel.add(jlCheckBox);
        //Add checks aos painel
        painel.add(chkJava);
        painel.add(chkCobol);
        painel.add(chkPHP);
        painel.add(chkPy);
        //add btnChecks ao painel
        painel.add(btnChk);
        // exercicio de Radio Button
        painel.add(jlRadioButton);
        painel.add(jrb10);
        painel.add(jrb20);
        painel.add(jrb30);
        painel.add(btnRadioButton);
        // add botão pesquisa ao painel
        painel.add(btnPesquisa);
        //add o Painel na janela
        janela.add(painel);
        //defini que o jFrame vai ser carregado
        janela.setVisible(true);
        //Registrando o botão no Listener
        btnOk.addActionListener(this);
        btnIMC.addActionListener(this);
        btnDVida.addActionListener(this);
        btnChk.addActionListener(this);
        btnPesquisa.addActionListener(this);
        btnRadioButton.addActionListener(this);
        // Registrar os Radio Button ao grupo 
        bgDesconto.add(jrb10);
        bgDesconto.add(jrb20);
        bgDesconto.add(jrb30);

        //Add itens no combo
        cbLinguagens.addItem("Selecione...");
        cbLinguagens.addItem("Java");
        cbLinguagens.addItem("PHP");
        cbLinguagens.addItem("C#");
        cbLinguagens.addItem("C++");
        cbLinguagens.addItem("Ruby");
        cbLinguagens.addItem("Python");
        cbLinguagens.addItem("Pascal");
        cbLinguagens.addItem("Cobol");
        cbLinguagens.addItem("Fortran");
        cbLinguagens.addItem("JavaScript");
        cbLinguagens.addItem("Delphi");
        cbLinguagens.addItem("Kotlin");
        cbLinguagens.addItem("Go");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            if (!jtfsNome.getText().isBlank()) {
                JOptionPane.showMessageDialog(null, "Você digitou: "
                        + jtfsNome.getText());
            } else if (!cbLinguagens.getSelectedItem().equals("Selecione...")) {
                JOptionPane.showMessageDialog(null, "Linguagem de programação "
                        + "selecionada foi: " + cbLinguagens.getSelectedItem());
            } else {
                JOptionPane.showMessageDialog(null, "Digitar nome ou selecionar"
                        + " linguagem!");
            }
        }
        if (e.getSource() == btnIMC) {
            IMC jfIMC = new IMC();
            jfIMC.setVisible(true);
            jfIMC.jtfSNome.setText(jtfsNome.getText());
            jfIMC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if (e.getSource() == btnDVida) {
            jfCalcDiasVida jfCalcVida = new jfCalcDiasVida();
            jfCalcVida.setVisible(true);
            jfCalcVida.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if (e.getSource() == btnPesquisa) {
            jfPesquisa jfPsq = new jfPesquisa(); // cria o objeto JFrame
            jfPsq.setVisible(true); // seta que esse JFrame agora é visível 
            jfPsq.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if (e.getSource() == btnChk) {
            verChk();
            limparChk();
        }
        if (e.getSource() == btnRadioButton) {
            calcDesc();
        }
    }

    private void verChk() {
        String msg = "Linguagens: \n";
        int countChk = 0;
        if (chkCobol.isSelected()) {
            msg = msg + chkCobol.getText() + "\n";
            countChk++;
        }
        if (chkJava.isSelected()) {
            msg = msg + chkJava.getText() + "\n";
            countChk++;
        }
        if (chkPHP.isSelected()) {
            msg = msg + chkPHP.getText() + "\n";
            countChk++;
        }
        if (chkPy.isSelected()) {
            msg = msg + chkPy.getText() + "\n";
            countChk++;
        }
        if (countChk > 0) {
            JOptionPane.showMessageDialog(null, msg);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Nenhuma linguagem selecionada!",
                    ".:Linguagens:.", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparChk() {
        chkCobol.setSelected(false);
        chkJava.setSelected(false);
        chkPHP.setSelected(false);
        chkPy.setSelected(false);
    }

    private void calcDesc() {
        if (jrb10.isSelected() || jrb20.isSelected() || jrb30.isSelected()) {
            if (jrb10.isSelected()) {
                JOptionPane.showMessageDialog(painel, "O seu desconto é de: "
                        + jrb10.getText());
            }
            if (jrb20.isSelected()) {
                JOptionPane.showMessageDialog(painel, "O seu desconto é de: "
                        + jrb20.getText());
            }
            if (jrb30.isSelected()) {
                JOptionPane.showMessageDialog(painel, "O seu desconto é de: "
                        + jrb30.getText());
            }
            bgDesconto.clearSelection();
        } else {
            JOptionPane.showMessageDialog(painel, "Seu tosco, selecione um desconto!");
        }
    }
}
