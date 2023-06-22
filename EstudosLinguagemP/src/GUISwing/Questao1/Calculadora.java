package GUISwing.Questao1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
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
        JPanel painel = new JPanel();


        frame.setSize(300, 300);
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

        frame.getContentPane().add(painel.add(painel.add(botao0)));
        frame.getContentPane().add(painel.add(painel.add(botao1)));
        frame.getContentPane().add(painel.add(painel.add(botao2)));
        frame.getContentPane().add(painel.add(painel.add(botao3)));
        frame.getContentPane().add(painel.add(painel.add(botao4)));
        frame.getContentPane().add(painel.add(painel.add(botao5)));
        frame.getContentPane().add(painel.add(painel.add(botao6)));
        frame.getContentPane().add(painel.add(painel.add(botao7)));
        frame.getContentPane().add(painel.add(painel.add(botao8)));
        frame.getContentPane().add(painel.add(painel.add(botao9)));
        frame.getContentPane().add(painel.add(painel.add(divisor)));
        frame.getContentPane().add(painel.add(painel.add(multiplicador)));
        frame.getContentPane().add(painel.add(painel.add(soma)));
        frame.getContentPane().add(painel.add(painel.add(subtracao)));
        frame.getContentPane().add(painel.add(painel.add(ponto)));
        frame.getContentPane().add(painel.add(painel.add(igualar)));


        botao0.setBounds(50, 50, 50, 50);
        botao1.setBounds(100, 50, 50, 50);
        botao2.setBounds(150, 50, 50, 50);
        botao3.setBounds(50, 100, 50, 50);
        botao4.setBounds(100, 100, 50, 50);
        botao5.setBounds(150, 100, 50, 50);
        botao6.setBounds(50, 150, 50, 50);
        botao8.setBounds(100, 150, 50, 50);
        botao9.setBounds(150, 150, 50, 50);
        divisor.setBounds(2, 2, 89, 61);
        multiplicador.setBounds(2, 2, 89, 61);
        soma.setBounds(2, 2, 89, 61);
        subtracao.setBounds(2, 2, 89, 61);
        ponto.setBounds(2, 2, 89, 61);
        igualar.setBounds(2, 2, 89, 61);


        botao0.addActionListener((ActionListener) this);
        botao1.addActionListener((ActionListener) this);
        botao2.addActionListener((ActionListener) this);
        botao3.addActionListener((ActionListener) this);
        botao4.addActionListener((ActionListener) this);
        botao5.addActionListener((ActionListener) this);
        botao6.addActionListener((ActionListener) this);
        botao7.addActionListener((ActionListener) this);
        botao8.addActionListener((ActionListener) this);
        botao9.addActionListener((ActionListener) this);
        divisor.addActionListener((ActionListener) this);
        multiplicador.addActionListener((ActionListener) this);
        soma.addActionListener((ActionListener) this);
        subtracao.addActionListener((ActionListener) this);
        ponto.addActionListener((ActionListener) this);
        igualar.addActionListener((ActionListener) this);


    }

    public void actionPerformed(ActionEvent evento) {
        botao0.setText(" 0 ");
        botao0.setBackground(Color.PINK);
        botao0.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao1.setText(" 1 ");
        botao1.setBackground(Color.PINK);
        botao1.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao2.setText(" 2 ");
        botao2.setBackground(Color.PINK);
        botao2.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao3.setText(" 3 ");
        botao3.setBackground(Color.PINK);
        botao3.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao4.setText(" 4 ");
        botao4.setBackground(Color.PINK);
        botao4.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao5.setText(" 5 ");
        botao5.setBackground(Color.PINK);
        botao5.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao6.setText(" 6 ");
        botao6.setBackground(Color.PINK);
        botao6.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao7.setText(" 7 ");
        botao7.setBackground(Color.PINK);
        botao7.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao8.setText(" 8 ");
        botao8.setBackground(Color.PINK);
        botao8.setFont(new Font("SansSerif ", Font.BOLD, 20));

        botao9.setText(" 9 ");
        botao9.setBackground(Color.PINK);
        botao9.setFont(new Font("SansSerif ", Font.BOLD, 20));

        divisor.setText(" / ");
        divisor.setBackground(Color.PINK);
        divisor.setFont(new Font("SansSerif ", Font.BOLD, 20));

        multiplicador.setText(" x ");
        multiplicador.setBackground(Color.PINK);
        multiplicador.setFont(new Font("SansSerif ", Font.BOLD, 20));

        soma.setText(" + ");
        soma.setBackground(Color.PINK);
        soma.setFont(new Font("SansSerif ", Font.BOLD, 20));

        subtracao.setText(" - ");
        subtracao.setBackground(Color.PINK);
        subtracao.setFont(new Font("SansSerif ", Font.BOLD, 20));

        ponto.setText(" . ");
        ponto.setBackground(Color.PINK);
        ponto.setFont(new Font("SansSerif ", Font.BOLD, 20));

        igualar.setText(" = ");
        igualar.setBackground(Color.PINK);
        igualar.setFont(new Font("SansSerif ", Font.BOLD, 20));

    }


    public static void main(String[] args) {
        Calculadora captura = new Calculadora();
        captura.janela();
    }
}
