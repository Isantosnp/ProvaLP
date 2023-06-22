package GUISwing;

import javax.swing.*;
public class framesPanels {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Meu primeiro frame em Java");
                janela.setVisible(true);
        janela.setSize (300,200);
    }
}
 /*/
 O Jframe é a criação de uma janela. Para o usuário conseguir visualiza-la é necessário que você crie o objeto de frame
 JFrame janela = new JFrame("Meu primeiro frame em Java");

 E depois coloque os métodos de tamanho, permitir visualização , como:
 janela.setVisible(true);   (Tornar a janela visivel)
 janela.setSize (300,200);  (horizontal, vertical)

  */
