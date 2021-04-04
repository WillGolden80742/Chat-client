/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ConnectionFactory.Server;
import Model.bean.TreatFiles;
import Threads.CreateNewAccount;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import util.Communication;

/**
 *
 * @author William
 */
public class SingUP extends javax.swing.JFrame {

    private SelectorFile sf = new SelectorFile();
    private TreatFiles currentFile = new TreatFiles();
    private BufferedImage bi;

    public SingUP() {
        initComponents();
        setLocation(400, 150);
        setIconTop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectPicButton = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        logar = new javax.swing.JButton();
        password1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        profilPicLabel = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        messageLogin = new javax.swing.JLabel();
        nickName = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        selectPicButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        selectPicButton.setText("SELECIONAR FOTO");
        selectPicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPicButtonActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password.setToolTipText("senha");
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        logar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logar.setText("CADASTRAR");
        logar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logarMouseReleased(evt);
            }
        });
        logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarActionPerformed(evt);
            }
        });

        password1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password1.setToolTipText("senha repetida");
        password1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                password1KeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("@");
        jLabel1.setToolTipText("nickname do usuário");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CRIE SUA CONTA");

        profilPicLabel.setBackground(new java.awt.Color(255, 255, 255));
        profilPicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilPicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileLarge.png"))); // NOI18N
        profilPicLabel.setAlignmentX(0.5F);
        profilPicLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/passwordIcon.png"))); // NOI18N
        senha.setToolTipText("senha");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/passwordIcon.png"))); // NOI18N
        jLabel3.setToolTipText("repetir senha");

        messageLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        messageLogin.setForeground(new java.awt.Color(255, 51, 0));
        messageLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nickName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nickName.setToolTipText("nick name");
        nickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nickNameKeyReleased(evt);
            }
        });

        name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        name.setToolTipText("nome");
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nameIcon.png"))); // NOI18N
        jLabel5.setToolTipText("nome do usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectPicButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password)
                    .addComponent(password1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nickName)
                    .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name))
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(messageLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(profilPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(selectPicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(nickName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(messageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, nickName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {password, senha});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, password1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectPicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPicButtonActionPerformed
        sf.setVisible(true);
    }//GEN-LAST:event_selectPicButtonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        try {
            InputStream is = new ByteArrayInputStream(sf.getBytes());
            bi = ImageIO.read(is);
            bi = currentFile.resizeImage(bi, 200);
            profilPicLabel.setIcon(new ImageIcon(bi));
            this.currentFile = sf.getCurrentFile();
            this.currentFile.setBytes(currentFile.toByteArray(bi, currentFile.getFileFormat()));
        } catch (Exception ex) {
            this.currentFile = null;
            profilPicLabel.setIcon(new ImageIcon(getClass().getResource("/Images/profileLarge.png")));
        }
    }//GEN-LAST:event_formWindowGainedFocus


    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased

    }//GEN-LAST:event_passwordKeyReleased

    private void logarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logarMouseReleased

    }//GEN-LAST:event_logarMouseReleased

    private void password1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password1KeyReleased
        if (evt.getKeyChar() == 10) {
            cadastrar();
        }
    }//GEN-LAST:event_password1KeyReleased

    private void nickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nickNameKeyReleased
        nickName.setText(nickName.getText().replaceAll("[^A-Za-z0-9_]", ""));
        nickName.setText(limitText(nickName.getText()));
    }//GEN-LAST:event_nickNameKeyReleased


    private void logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarActionPerformed
        cadastrar();
    }//GEN-LAST:event_logarActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        name.setText(limitText(name.getText()));
    }//GEN-LAST:event_nameKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            new Login().setVisible(true);
            dispose();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(SingUP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void cadastrar() {
        if (password1.getText().equals(password.getText())) {

            messageLogin.setText("");
            if (password1.getText().length() < 8) {
                messageLogin.setText("Sua senha não pode ter menos de 8 caracteres");
            } else if (name.getText().length() == 0 || nickName.getText().length() == 0) {
                messageLogin.setText("Nome e nick name não podem estar vazios");
            } else if (checkNickName() == 1) {
                messageLogin.setText("Já existe esse nick name!");
            } else {
                CreateNewAccount cNA;
                try {
                    cNA = new CreateNewAccount(currentFile.getBytes(), currentFile.getFileFormat(), name.getText(), nickName.getText(), password.getText());
                } catch (NullPointerException ex) {
                    cNA = new CreateNewAccount(null, null, name.getText(), nickName.getText(), password.getText());
                }
                Thread t = new Thread(cNA);
                t.start();
                setVisible(false);
            }
            logar.setIcon(null);
        } else {
            messageLogin.setText("As senhas não são iguais!");
        }
    }

    private String limitText(String text) {
        return (text.length() > 20) ? text.substring(0, 20) : text;
    }

    private int checkNickName() {
        int i;
        Server server;
        server = new Server("192.168.56.1", 2134);
        Communication message = new Communication("CHECKCLIENT");
        message.setParam("nickName", nickName.getText());
        try {
            i = (int) server.outPut_inPut(message).getParam("CHECKCLIENTREPLY");
        } catch (NullPointerException ex) {
            i = 2;
        }
        return i;
    }

    private void setIconTop() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/chat.png")));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logar;
    private javax.swing.JLabel messageLogin;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nickName;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel profilPicLabel;
    private javax.swing.JButton selectPicButton;
    private javax.swing.JLabel senha;
    // End of variables declaration//GEN-END:variables
}