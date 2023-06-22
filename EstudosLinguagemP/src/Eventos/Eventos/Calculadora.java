package Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener {

    private double num, result;
     private int calculation;
    private JButton botao0;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton divisor;
    private JButton multiplicador;
    private JButton soma;
    private JButton subtracao;
    private JButton ponto;
    private JButton igualar;

    public void janela() {
        JFrame frame = new JFrame();
        TextField textField = new TextField();   //Visor da calculadora
        JLabel label = new JLabel();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setVisible(true);
        frame.setLayout(null);

        botao0 = new JButton();
        botao1 = new JButton();
        botao2 = new JButton();
        botao3 = new JButton();
        botao4 = new JButton();
        botao5 = new JButton();
        botao6 = new JButton();
        botao7 = new JButton();
        botao8 = new JButton();
        botao9 = new JButton();
        divisor = new JButton();
        multiplicador = new JButton();
        soma = new JButton();
        subtracao = new JButton();
        ponto = new JButton();
        igualar = new JButton();




        frame.getContentPane().add(botao0);
        frame.getContentPane().add(botao1);
        frame.getContentPane().add(botao2);
        frame.getContentPane().add(botao3);
        frame.getContentPane().add(botao4);
        frame.getContentPane().add(botao5);
        frame.getContentPane().add(botao6);
        frame.getContentPane().add(botao7);
        frame.getContentPane().add(botao8);
        frame.getContentPane().add(botao9);
        frame.getContentPane().add(divisor);
        frame.getContentPane().add(multiplicador);
        frame.getContentPane().add(soma);
        frame.getContentPane().add(subtracao);
        frame.getContentPane().add(ponto);
        frame.getContentPane().add(igualar);

        botao0.setBounds(20,10, 60,80 );
        botao1.setBounds(80,10, 60,80 );
        botao2.setBounds(140,10, 60,80 );
        botao3.setBounds(200,10, 60,80 );
        botao4.setBounds(20,90, 60,80 );
        botao5.setBounds(80,90, 60,80 );
        botao6.setBounds(140,90, 60,80 );
        botao7.setBounds(20,170, 60,80 );
        botao8.setBounds(80,170, 60,80 );
        botao9.setBounds(140,170, 60,80 );
        divisor.setBounds(200,90, 60,80 );
        multiplicador.setBounds(140,250, 60,80 );
        soma.setBounds(80,250, 60,80 );
        subtracao.setBounds(200,170, 60,80 );
        ponto.setBounds(200,250, 60,80 );
        igualar.setBounds(20,250, 60,80 );

        botao0.addActionListener( this);
        botao1.addActionListener(this);
        botao2.addActionListener(this);
        botao3.addActionListener( this);
        botao4.addActionListener( this);
        botao5.addActionListener( this);
        botao6.addActionListener( this);
        botao7.addActionListener( this);
        botao8.addActionListener( this);
        botao9.addActionListener(this);
        divisor.addActionListener( this);
        multiplicador.addActionListener(this);
        soma.addActionListener(this);
        subtracao.addActionListener(this);
        ponto.addActionListener(this);
        igualar.addActionListener( this);



    }
    public void actionPerformed(ActionEvent evento){
        botao0.setText(" 0 ");
        botao0.addActionListener( this);
        botao0.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao1.setText(" 1 ");
        botao1.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao2.setText(" 2 ");
        botao2.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao3.setText(" 3 ");
        botao3.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao4.setText(" 4 ");
        botao4.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao5.setText(" 5 ");
        botao5.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao6.setText(" 6 ");
        botao6.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao7.setText(" 7 ");
        botao7.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao8.setText(" 8 ");
        botao8.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao9.setText(" 9 ");
        botao9.setFont(new Font("SansSerif ", Font.BOLD, 20));

        divisor.setText(" / ");
        divisor.setFont(new Font("SansSerif ", Font.BOLD, 20));

        multiplicador.setText(" x ");
        multiplicador.setFont(new Font("SansSerif ", Font.BOLD, 20));

        soma.setText(" + ");
        soma.setFont(new Font("SansSerif ", Font.BOLD, 20));

        subtracao.setText(" -- ");
        subtracao.setFont(new Font("SansSerif ", Font.BOLD, 20));

        ponto.setText(" . ");

        ponto.setFont(new Font("SansSerif ", Font.BOLD, 20));

        igualar.setText(" = ");

        igualar.setFont(new Font("SansSerif ", Font.BOLD, 20));

    }

    public static void main(String[] args) {
        Calculadora captura = new Calculadora();
        captura.janela();
    }
}
