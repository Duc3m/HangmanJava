/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Component.LetterButton;
import java.util.ArrayList;
import GUI.Game;
import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author Duc3m
 */
public class Game extends javax.swing.JFrame {
    
    CardLayout cardLayout;
    ArrayList<LetterButton> letterButtons;
    int tries = 0;

    public Game() {
        initComponents();
        initialize();
    }
    
    private void initialize() {
        setLocationRelativeTo(null);
        cardLayout = (CardLayout) mainPanel.getLayout();
        letterButtons = new ArrayList<>();
        for(int i=65; i<=90; i++) {
            LetterButton lb = new LetterButton((char) i);
            letterButtons.add(lb);
        }
        for(LetterButton i : letterButtons) {
            i.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if(tries < 11 && i.hidden == false) {
                        i.hide();
                        tries++;
                        hang();
                    }
                    if(tries == 11) {
                        cardLayout.show(mainPanel, "gameOver");
                    }
                }
            });
            lettersPanel.add(i);
        }
    }
    
    private void hang() {
        hangLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hang-"+tries+".png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        playBtn = new javax.swing.JButton();
        howtoplayBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        game = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        middlePanel = new javax.swing.JPanel();
        hangLabel = new javax.swing.JLabel();
        wordPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        lettersPanel = new javax.swing.JPanel();
        gameOver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        newgameBtn = new javax.swing.JButton();
        quitBtn1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(new java.awt.CardLayout());

        mainMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HANGMAN GAME");

        playBtn.setBackground(new java.awt.Color(204, 204, 204));
        playBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        playBtn.setText("PLAY");
        playBtn.setBorder(null);
        playBtn.setFocusable(false);
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playBtnMousePressed(evt);
            }
        });

        howtoplayBtn.setBackground(new java.awt.Color(204, 204, 204));
        howtoplayBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        howtoplayBtn.setText("HOW TO PLAY");
        howtoplayBtn.setBorder(null);
        howtoplayBtn.setFocusable(false);

        quitBtn.setBackground(new java.awt.Color(204, 204, 204));
        quitBtn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        quitBtn.setText("QUIT");
        quitBtn.setBorder(null);
        quitBtn.setFocusable(false);
        quitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quitBtnMousePressed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(545, 545, 545)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(howtoplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(555, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(howtoplayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(quitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        mainPanel.add(mainMenu, "mainMenu");

        game.setBackground(new java.awt.Color(255, 255, 255));
        game.setLayout(new java.awt.BorderLayout());

        topPanel.setBackground(new java.awt.Color(153, 255, 255));
        topPanel.setPreferredSize(new java.awt.Dimension(1280, 60));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        game.add(topPanel, java.awt.BorderLayout.PAGE_START);

        middlePanel.setBackground(new java.awt.Color(255, 255, 255));
        middlePanel.setPreferredSize(new java.awt.Dimension(1280, 460));

        hangLabel.setBackground(new java.awt.Color(255, 255, 255));
        hangLabel.setPreferredSize(new java.awt.Dimension(1280, 400));

        wordPanel.setPreferredSize(new java.awt.Dimension(1280, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("word goes here");

        javax.swing.GroupLayout wordPanelLayout = new javax.swing.GroupLayout(wordPanel);
        wordPanel.setLayout(wordPanelLayout);
        wordPanelLayout.setHorizontalGroup(
            wordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        wordPanelLayout.setVerticalGroup(
            wordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout middlePanelLayout = new javax.swing.GroupLayout(middlePanel);
        middlePanel.setLayout(middlePanelLayout);
        middlePanelLayout.setHorizontalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .addComponent(wordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        middlePanelLayout.setVerticalGroup(
            middlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middlePanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(hangLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(wordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        game.add(middlePanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setPreferredSize(new java.awt.Dimension(1280, 200));

        lettersPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bottomPanelLayout = new javax.swing.GroupLayout(bottomPanel);
        bottomPanel.setLayout(bottomPanelLayout);
        bottomPanelLayout.setHorizontalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomPanelLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(lettersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        bottomPanelLayout.setVerticalGroup(
            bottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(lettersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        game.add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        mainPanel.add(game, "game");

        gameOver.setBackground(new java.awt.Color(255, 255, 255));
        gameOver.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GAME OVER!");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 60));
        gameOver.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        newgameBtn.setText("NEW GAME");
        newgameBtn.setPreferredSize(new java.awt.Dimension(180, 60));
        gameOver.add(newgameBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 541, -1, -1));

        quitBtn1.setText("QUIT");
        quitBtn1.setPreferredSize(new java.awt.Dimension(180, 60));
        quitBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quitBtn1MousePressed(evt);
            }
        });
        quitBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtn1ActionPerformed(evt);
            }
        });
        gameOver.add(quitBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 541, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hang-11.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(1280, 460));
        gameOver.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        mainPanel.add(gameOver, "gameOver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMousePressed
        cardLayout.show(mainPanel, "game");
    }//GEN-LAST:event_playBtnMousePressed

    private void quitBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtnMousePressed
        dispose();
    }//GEN-LAST:event_quitBtnMousePressed

    private void quitBtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitBtn1MousePressed
        dispose();
    }//GEN-LAST:event_quitBtn1MousePressed

    private void quitBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JPanel game;
    private javax.swing.JPanel gameOver;
    private javax.swing.JLabel hangLabel;
    private javax.swing.JButton howtoplayBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel lettersPanel;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel middlePanel;
    private javax.swing.JButton newgameBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton quitBtn1;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel wordPanel;
    // End of variables declaration//GEN-END:variables
}
