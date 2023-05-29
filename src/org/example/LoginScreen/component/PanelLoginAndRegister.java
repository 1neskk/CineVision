package org.example.LoginScreen.component;

import org.example.LoginScreen.swing.Button;
import org.example.LoginScreen.swing.MyPasswordField;
import org.example.LoginScreen.swing.MyTextField;

import org.example.Movies.MoviesDashboard;
import org.example.Users.User;
import org.example.Users.UserDB;

import org.example.AdminDashboard.AdminDashboard;

import java.awt.Window;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {

    public PanelLoginAndRegister() {
        initComponents();
        initRegister();
        initLogin();
        login.setVisible(false);
        register.setVisible(true);
    }

    public MyTextField txtUser = new MyTextField();
    public MyPasswordField txtPass = new MyPasswordField();
    public MyTextField txtAge = new MyTextField();
    public MyTextField txtGender = new MyTextField();

    private void initRegister() {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Cinevision");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(65,105,225));
        register.add(label);
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/user.png")));
        txtUser.setHint("Nome");
        register.add(txtUser, "w 60%");
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/pass.png")));
        txtPass.setHint("Senha");
        register.add(txtPass, "w 60%");
        txtAge.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/age.png")));
        txtAge.setHint("Idade");
        register.add(txtAge, "w 60%");
        txtGender.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/gender.png")));
        txtGender.setHint("Genero");
        register.add(txtGender, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(new Color(65,105,225));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("Registrar");
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        register.add(cmd, "w 40%, h 40");
    }

    public MyTextField loginField = new MyTextField();
    public MyPasswordField passField = new MyPasswordField();

    private void initLogin() {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Cinevision");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(65,105,225));
        login.add(label);
        loginField.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/mail.png")));
        loginField.setHint("Nome");
        login.add(loginField, "w 60%");
        passField.setPrefixIcon(new ImageIcon(getClass().getResource("/org/example/assets/pass.png")));
        passField.setHint("Senha");
        login.add(passField, "w 60%");
        Button cmd = new Button();
        cmd.setBackground(new Color(65,105,225));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("Login");
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
                login.add(cmd, "w 40%, h 40");
    }

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }

    public void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUser.getText();
        String password = new String(txtPass.getPassword());
        int age = Integer.parseInt(txtAge.getText());
        String gender = new String(txtGender.getText());

        User user = new User(username, password, age, gender);
        UserDB userDB = new UserDB();
        try {
            userDB.UserRegister(user);
            UserDB usersDB = new UserDB();
            try {
                usersDB.UserRegister(user);
                JOptionPane.showMessageDialog(null, "Registrado com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                e.printStackTrace();
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        String username = loginField.getText();
        String password = new String(passField.getPassword());
        try {
            User user = new User(username, password);
            UserDB userDB = new UserDB();
            if(userDB.UserLogin(user)) {
                JOptionPane.showMessageDialog(null, "Bem vindo " + user.getUsername() +"!");
                MoviesDashboard md = new MoviesDashboard();
                md.setVisible(true);
                Window w = SwingUtilities.getWindowAncestor(this);
                w.dispose();
                if (userDB.isAdmin(user)) {
                    AdminDashboard adminDashboard = new AdminDashboard();
                    adminDashboard.setVisible(true);
                    Window wind = SwingUtilities.getWindowAncestor(this);
                    wind.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos!");
            }

            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        this.disable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}
