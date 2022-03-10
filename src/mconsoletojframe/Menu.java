/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mconsoletojframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import view.IMC;
import view.jfCalcDiasVida;
import view.jfPesquisa;

/**
 *
 * @author João Vitor
 */
public class Menu extends JFrame implements ActionListener {

    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, menuC, subMenu;
        JMenuItem menuItem;

        // Cria o menuBar
        menuBar = new JMenuBar();
        // Construir o menuBar
        menu = new JMenu("Formulários");
        // Cria um atalho na letra "F" 
        menu.setMnemonic(KeyEvent.VK_F);
        // Add o menu "Formulário a barra de menus "menuBar"
        menuBar.add(menu);

        // Criar os itens do menu menu(Formulário)        
        // Item calc
        menuItem = new JMenuItem("Calc. IMC", KeyEvent.VK_C);
        menuItem.setActionCommand("mIMC");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        // Item dias de vida
        menuItem = new JMenuItem("Dias de Vida", KeyEvent.VK_D);
        menuItem.setActionCommand("mDiasDeVida");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        // Item pesquisa
        menuItem = new JMenuItem("Pesquisa", KeyEvent.VK_P);
        menuItem.setActionCommand("mPesquisa");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        // teste com outro menus
        menuC = new JMenu("Cadastros");
        menuC.setMnemonic(KeyEvent.VK_C);
        menuBar.add(menuC);

        subMenu = new JMenu("Clientes");
        subMenu.setMnemonic(KeyEvent.VK_C);
        menuC.add(subMenu);

        menuItem = new JMenuItem("Cadastro", KeyEvent.VK_C);
        menuItem.setActionCommand("cadClientes");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);

        menuItem = new JMenuItem("Listar", KeyEvent.VK_L);
        menuItem.setActionCommand("listaClientes");
        menuItem.addActionListener(this);
        subMenu.add(menuItem);

        menuItem = new JMenuItem("Gerenciar", KeyEvent.VK_G);
        menuItem.setActionCommand("gerenciar");
        menuItem.addActionListener(this);
        menuC.add(menuItem);

        return menuBar;
    }

    public Container createContenPane() {
        // Cria painel para o JFrame
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    private static void createAndShowGUI() {
        JFrame janela = new JFrame("Menu Pricipal");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Menu menu = new Menu();
        janela.setJMenuBar(menu.createMenuBar());
        janela.setContentPane(menu.createContenPane());

        janela.setSize(240, 260);
        janela.setVisible(true);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ação da barra de menus
        if ("mIMC".equals(e.getActionCommand())) {
            IMC jfIMC = new IMC();
            jfIMC.setVisible(true);
            jfIMC.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mDiasDeVida".equals(e.getActionCommand())) {
            jfCalcDiasVida jfCalcVida = new jfCalcDiasVida();
            jfCalcVida.setVisible(true);
            jfCalcVida.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("mPesquisa".equals(e.getActionCommand())) {
            jfPesquisa janelaPesq = new jfPesquisa();
            janelaPesq.setVisible(true);
            janelaPesq.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        }
        if ("cadClientes".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "Cadastro de clientes!");
        }
        if ("listaClientes".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "Lista Clientes!");
        }
        if ("gerenciar".equals(e.getActionCommand())) {
            JOptionPane.showMessageDialog(this, "Gerenciar Clientes!");
        }
    }
}
