package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao  implements ActionListener {
    private JButton botao;

    public void janela(){
        JFrame frame = new JFrame();
        botao = new JButton();

        botao.addActionListener(this);
        frame.getContentPane().add(botao);
        botao.setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent evento){
        botao.setText("Botão clicado ");
        botao.setFont(new Font("SansSerif ", Font.BOLD, 20));
    }

    public static void main(String[] args) {
        CapturaEventoBotao captura = new CapturaEventoBotao();
        captura.janela();
    }
}
