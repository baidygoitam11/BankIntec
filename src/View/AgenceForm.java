package View;
import Entites.Agence;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AgenceForm extends JFrame {
    JTextField txtNum, txtNom, txtAdresse, txtContact, txtEmail, txtNb;

    JButton btnValider, btnEnregistrer, btnSupprimer;

    public AgenceForm() {

        setTitle("Formulaire d'agence");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.add(new JLabel("N° Agence"));
        txtNum = new JTextField();
        panel.add(txtNum);

        panel.add(new JLabel("Nom"));
        txtNom = new JTextField();
        panel.add(txtNom);

        panel.add(new JLabel("Adresse"));
        txtAdresse = new JTextField();
        panel.add(txtAdresse);

        panel.add(new JLabel("Contact"));
        txtContact = new JTextField();
        panel.add(txtContact);

        panel.add(new JLabel("Email"));
        txtEmail = new JTextField();
        panel.add(txtEmail);

        panel.add(new JLabel("Nb Personnes"));
        txtNb = new JTextField();
        panel.add(txtNb);
        btnValider = new JButton("Liste");
        btnEnregistrer = new JButton("Enregistrer");
        btnSupprimer = new JButton("Supprimer");

        panel.add(btnValider);
        panel.add(btnEnregistrer);

        add(panel, BorderLayout.CENTER);
        add(btnSupprimer, BorderLayout.SOUTH);
        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num = Integer.parseInt(txtNum.getText());
                String nom = txtNom.getText();
                String adresse = txtAdresse.getText();
                String contact = txtContact.getText();
                String email = txtEmail.getText();
                int nb = Integer.parseInt(txtNb.getText());

                Agence agence = new Agence(
                        num, nom, adresse,
                        contact, email, nb
                );

                JOptionPane.showMessageDialog(null,
                        "Agence créée avec succès !");
            }
        });
        btnSupprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtNum.setText("");
                txtNom.setText("");
                txtAdresse.setText("");
                txtContact.setText("");
                txtEmail.setText("");
                txtNb.setText("");
            }
        });
    }


}


