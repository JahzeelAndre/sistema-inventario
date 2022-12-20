/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.bgs.login;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author JahzAndre
 */
public class Login extends JFrame{
    //Paneles
    JPanel panel, loginPanel;
    //Labels
    JLabel userNameLabel, userPasswordLabel;
    //TextFields & PasswordFields
    JTextField userNameField;
    
    JPasswordField userPasswordField;
    //Buttons
    JButton loginButton;
    public Login(){
        initComponents();
        this.setTitle("Bienvenidos");
        
        this.setSize(new Dimension(400, 450));
        this.setMinimumSize(new Dimension(400, 450));
        this.setMaximumSize(new Dimension(400, 450));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setContentPane(this.panel);
    }
    
    public final void initComponents(){
        this.panel = new JPanel();
        this.panel.setPreferredSize(new Dimension(500,450));
        this.panel.setMaximumSize(new Dimension(500,450));
        this.panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //<------ Iniciamos etiqueta usuario ------>
        this.userNameLabel = new JLabel("Ingresa tu usuario:");
        this.userNameLabel.setMaximumSize(new Dimension(180,30));
        this.userNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        this.userNameLabel.setFont(getCustomFont(16, false));
        //<------ Iniciamos caja de texto de usuario ------>
        this.userNameField = new JTextField();
        this.userNameField.setPreferredSize(new Dimension(150,30));
        this.userNameField.setMaximumSize(new Dimension(150,20));
        this.userNameField.setFont(getCustomFont(16, false));
        //<------ Iniciamos etiqueta contraseña ------>
        this.userPasswordLabel = new JLabel("Ingresa tu contraseña:");
        this.userPasswordLabel.setMaximumSize(new Dimension(180,30));
        this.userPasswordLabel.setHorizontalAlignment(JLabel.RIGHT);
        this.userPasswordLabel.setFont(getCustomFont(16, false));
        //<------ Iniciamos caja de texto contraseña ------>
        this.userPasswordField = new JPasswordField();this.loginPanel = new JPanel();
        this.userPasswordField.setPreferredSize(new Dimension(150,30));
        this.userPasswordField.setMaximumSize(new Dimension(100,30));
        this.userPasswordField.setFont(getCustomFont(16, false));
        //<------ Iniciamos panel del login ------>
        this.loginPanel = new JPanel();
        this.loginPanel.setLayout(new GridLayout(2,2));
        int widthLoginPanel = this.userPasswordLabel.getMaximumSize().width + this.userPasswordField.getMaximumSize().width + 10;
        int heightLoginPanel = this.userNameLabel.getMaximumSize().height + this.userPasswordLabel.getMaximumSize().height + 10; 
        this.loginPanel.setMaximumSize(new Dimension(widthLoginPanel, heightLoginPanel));
        this.loginPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
        this.loginPanel.add(this.userNameLabel);
        this.loginPanel.add(this.userNameField);
        this.loginPanel.add(this.userPasswordLabel);
        this.loginPanel.add(this.userPasswordField);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 0;   //request any extra vertical space
        c.anchor = GridBagConstraints.CENTER; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 0;       //aligned with button 2
        c.gridy = 0;       //third row
        c.gridwidth = 0;   //2 columns wide
        
        this.panel.add(this.loginPanel, c);
//        this.panel.add(this.loginPanel, new GridBagConstraints (0, 0, 1, 1, 0, 0, 
//                GridBagConstraints.CENTER,GridBagConstraints.CENTER, 
//                new Insets (0,0,0,0), 0, 0));
        this.loginButton = new JButton("Iniciar");
        this.loginButton.setFont(getCustomFont(18, false));
        this.loginButton.setPreferredSize(new Dimension(30,30));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default
        c.weighty = 0;   //request any extra vertical space
        c.anchor = GridBagConstraints.CENTER; //bottom of space
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 0;       //aligned with button 2
        c.gridy = 1;       //third row
        c.gridwidth = 0;   //2 columns wide
        this.panel.add(this.loginButton, c);
//        this.panel.add(this.loginButton, new GridBagConstraints (0, 1, 3, 1, 0, 0, 
//                GridBagConstraints.PAGE_END,GridBagConstraints.PAGE_END, 
//                new Insets (0,0,0,0), 0, 0));
    }
    
    public Font getCustomFont(int fontSize, boolean isBold) {
        Font myFont = new Font("arial", isBold ? Font.BOLD : Font.PLAIN,fontSize);
        return myFont;
                
    }
}
