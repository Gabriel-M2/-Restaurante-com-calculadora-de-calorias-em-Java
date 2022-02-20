package calorias;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula_7e8 extends JPanel {

    JLabel lbLanches, lbBebidas, lbAcompanhamentos, lbPedido, lbTtCalorias;

    JButton btnSair, btnEnviarPedido;

    JRadioButton rbtCachorroQuente, rbtMistoQuente, rbtXSalada, rbtXBurguer, rbtChopp, rbtRefrigerante, rbtGT, rbtBeats, rbtFritas, rbtPolenta, rbtCamarão, rbtLula;

    ButtonGroup grpLanches, grpBebidas, grpAcompanhamentos;

    Float calorias = 0f;

    public Aula_7e8() {
        inicializar();
        Eventos();
    }

    public void inicializar() {
        setLayout(null);

//        grpLanches.add(rbtCachorroQuente);
//        grpLanches.add(rbtMistoQuente);
//        grpLanches.add(rbtXSalada);
//        grpLanches.add(rbtXBurguer);

        //-----------------------------------------------------
//        setBackground(Color.white);
        btnSair = new JButton("SAIR");
        btnSair.setBounds(757,419,122,33);
        add(btnSair);
        //----------------------------------------------------
        lbLanches = new JLabel("Lanches");
        lbLanches.setBounds(53,40,95,25);
        add(lbLanches);
        // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
        lbBebidas = new JLabel("Bebidas");
        lbBebidas.setBounds(270,40,95,25);
        add(lbBebidas);
        // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
        lbAcompanhamentos = new JLabel("Acompanhamentos");
        lbAcompanhamentos.setBounds(487,40,217,25);
        add(lbAcompanhamentos);

        //---------------------------------------------------
        grpLanches = new ButtonGroup();
        grpBebidas = new ButtonGroup();
        grpAcompanhamentos = new ButtonGroup();

        //---------------------------------------------------
        rbtXBurguer = new JRadioButton("X Burguer");
        rbtXBurguer.setBounds(53,93,95,15);
        add(rbtXBurguer);
        //---------------------------------------------------
        rbtCachorroQuente = new JRadioButton("Cachorro Quente");
        rbtCachorroQuente.setBounds(53,131,150,15);
        add(rbtCachorroQuente);
        //---------------------------------------------------
        rbtMistoQuente = new JRadioButton("Misto Quente");
        rbtMistoQuente.setBounds(53,169,130,15);
        add(rbtMistoQuente);
        //---------------------------------------------------
        rbtXSalada = new JRadioButton("X Salada");
        rbtXSalada.setBounds(53,207,95,15);
        add(rbtXSalada);
        //---------------------------------------------------
        rbtChopp = new JRadioButton("Chopp");
        rbtChopp.setBounds(270,93,95,15);
        add(rbtChopp);
        //---------------------------------------------------
        rbtRefrigerante = new JRadioButton("Refrigerante");
        rbtRefrigerante.setBounds(270,131,130,15);
        add(rbtRefrigerante);
        //---------------------------------------------------
        rbtGT = new JRadioButton("GT");
        rbtGT.setBounds(270,169,95,15);
        add(rbtGT);
        //---------------------------------------------------
        rbtBeats = new JRadioButton("Skol Beats");
        rbtBeats.setBounds(270,207,110,15);
        add(rbtBeats);
        //---------------------------------------------------
        rbtFritas = new JRadioButton("Fritas");
        rbtFritas.setBounds(493,93,95,15);
        add(rbtFritas);
        //---------------------------------------------------
        rbtPolenta = new JRadioButton("Polenta");
        rbtPolenta.setBounds(493,131,95,15);
        add(rbtPolenta);
        //---------------------------------------------------
        rbtCamarão = new JRadioButton("Camarão");
        rbtCamarão.setBounds(493,169,95,15);
        add(rbtCamarão);
        //---------------------------------------------------
        rbtLula = new JRadioButton("Lula");
        rbtLula.setBounds(493,207,95,15);
        add(rbtLula);
        //---------------------------------------------------
        grpLanches.add(rbtXBurguer);
        grpLanches.add(rbtXSalada);
        grpLanches.add(rbtMistoQuente);
        grpLanches.add(rbtCachorroQuente);
        // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
        grpBebidas.add(rbtChopp);
        grpBebidas.add(rbtRefrigerante);
        grpBebidas.add(rbtGT);
        grpBebidas.add(rbtBeats);
        // -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
        grpAcompanhamentos.add(rbtFritas);
        grpAcompanhamentos.add(rbtCamarão);
        grpAcompanhamentos.add(rbtPolenta);
        grpAcompanhamentos.add(rbtLula);
        //------------------------------------------------------

        btnEnviarPedido = new JButton("Enviar Pedido");
        btnEnviarPedido.setBounds(320,290,173,40);
        add(btnEnviarPedido);

        lbPedido = new JLabel("Pedidos Realizados: ");
        lbPedido.setBounds(39,384,658,25);
        add(lbPedido);

        lbTtCalorias = new JLabel("Total de Calorias: ");
        lbTtCalorias.setBounds(39,423,335,25);
        add(lbTtCalorias);


    }

    public void Eventos() {
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        btnEnviarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbPedido.setText("Pedidos Realizados: ");
                lbTtCalorias.setText("Total de Calorias: ");

                if (grpLanches.getSelection() != null && grpBebidas.getSelection() != null && grpAcompanhamentos.getSelection() != null){

                        if (rbtXBurguer.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "X Burguer, ");
                            calorias = 303f;
                        } else if (rbtCachorroQuente.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Cachorro quente, ");
                            calorias = 290f;
                        } else if (rbtMistoQuente.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Misto Quente, ");
                            calorias = 284f;
                        } else if (rbtXSalada.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "X Salada, ");
                            calorias = 334f;
                        }

                        if (rbtChopp.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Chopp, ");
                            calorias += 180f;
                        } else if (rbtRefrigerante.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Refrigerante, ");
                            calorias += 41f;
                        } else if (rbtGT.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "GT, ");
                            calorias += 75f;
                        } else if (rbtBeats.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Beats, ");
                            calorias += 157f;
                        }

                        if (rbtFritas.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Fritas.");
                            calorias += 312f;
                        } else if (rbtCamarão.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Camarão.");
                            calorias += 720f;
                        } else if (rbtPolenta.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Polenta.");
                            calorias += 104f;
                        } else if (rbtLula.isSelected()) {
                            lbPedido.setText(lbPedido.getText() + "Lula.");
                            calorias += 175f;
                        }

                        lbTtCalorias.setText(lbTtCalorias.getText() + calorias);

                }else{
                    JOptionPane.showMessageDialog(null, "Selecione ao menos 1 de cada categoria e tente novamente");
                }

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("calorias.Aula_7e8");
        frame.getContentPane().add(new Aula_7e8());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 900, 500);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
//        frame.setBackground(new Color(0x1B1A19));


    }
}