package javaswing;
import javax.swing.*;
public class JavaSwing {

    public static void main(String[] args) {
        //CRIAR UMA JANELA\\
        
       JFrame janela = new JFrame("MINHA PRIMEIRA JANELA");
       janela.setSize(300,200);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// AS ABAS DE MINIMIZAR E ABRIR NO CANTO SUPERIOR DIRETO DA TELA\\
       janela.setLayout(null);//LAYOUT LIVRE\\
       
       //CRIEAR UM BOTÃO\\
       
       JButton botao = new JButton("CLIQUE AQUI!");
       botao.setBounds(80, 70, 130, 30);//POSISÃO: X, Y, LARGURA E ALTURA\\
       botao.addActionListener(e -> {
       JOptionPane.showMessageDialog(null,"OLÁ, MUNDO SWING");
       });
       
       //ADICIONAR BUTÃO NA JANELA\\
       
       janela.add(botao);
       
       //TORNAR A JANELA VISIVEL\\
       
       janela.setVisible(true);
    }
    
}
