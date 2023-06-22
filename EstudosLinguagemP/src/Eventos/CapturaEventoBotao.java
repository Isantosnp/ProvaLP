package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao implements ActionListener {  // classe de caputra do evento, ela é o conjunto entre interface, ação e executor
    private JButton botao;

    public void janela(){//Interface do usuário
        JFrame  frame = new JFrame();
        botao = new JButton();

        //Registra evento
        botao.addActionListener(this);
        botao.setText(" Clique aqui ");

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent evento){   // metodo que faz a ação do botão, tudo que for relacionado a ação e o resuldado da ação deve estar dentro desse método
        botao.setText("Opa! Você clicou mesmo ");

        //Altera a fonte
        botao.setFont(new Font("SansSerif", Font.BOLD,20));
    }

    public static void main(String[] args) {   //Executor
        CapturaEventoBotao captura = new CapturaEventoBotao();
        captura.janela();
    }
}
