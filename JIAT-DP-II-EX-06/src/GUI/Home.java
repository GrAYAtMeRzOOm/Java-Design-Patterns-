/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Sources.Shape;
import Sources.ShapeFactory;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author grays
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    int maxX;
    int minX = 0;
    int maxY;
    int minY = 0;
    Graphics graphics;
    Color selectedColor;

    public Home() {
        initComponents();
        graphics = panelArtBoard.getGraphics();
        maxX = panelArtBoard.getWidth();
        maxY = panelArtBoard.getHeight();
        radSquare.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shapeGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelArtBoard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbRed = new javax.swing.JLabel();
        lbGreen = new javax.swing.JLabel();
        lbBlue = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbShape = new javax.swing.JLabel();
        radSquare = new javax.swing.JRadioButton();
        radCircle = new javax.swing.JRadioButton();
        radTriangle = new javax.swing.JRadioButton();
        lbColourDis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfSize = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        panelArtBoard.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelArtBoardLayout = new javax.swing.GroupLayout(panelArtBoard);
        panelArtBoard.setLayout(panelArtBoardLayout);
        panelArtBoardLayout.setHorizontalGroup(
            panelArtBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panelArtBoardLayout.setVerticalGroup(
            panelArtBoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shape Maker");
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Pick a Colour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Red");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Green");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Blue");

        lbRed.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbRed.setForeground(new java.awt.Color(0, 0, 0));
        lbRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRed.setText("00.00");

        lbGreen.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbGreen.setForeground(new java.awt.Color(0, 0, 0));
        lbGreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGreen.setText("00.00");

        lbBlue.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbBlue.setForeground(new java.awt.Color(0, 0, 0));
        lbBlue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBlue.setText("00.00");

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/square.png"))); // NOI18N
        jButton2.setText("Draw the Shape");
        jButton2.setIconTextGap(5);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Shape Type");

        lbShape.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbShape.setForeground(new java.awt.Color(0, 0, 0));
        lbShape.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbShape.setText("Square");

        radSquare.setBackground(new java.awt.Color(0, 204, 51));
        shapeGroup.add(radSquare);
        radSquare.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        radSquare.setForeground(new java.awt.Color(0, 0, 0));
        radSquare.setMnemonic('1');
        radSquare.setText("Square");
        radSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSquareActionPerformed(evt);
            }
        });

        radCircle.setBackground(new java.awt.Color(0, 204, 51));
        shapeGroup.add(radCircle);
        radCircle.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        radCircle.setForeground(new java.awt.Color(0, 0, 0));
        radCircle.setMnemonic('2');
        radCircle.setText("Circle");
        radCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCircleActionPerformed(evt);
            }
        });

        radTriangle.setBackground(new java.awt.Color(0, 204, 51));
        shapeGroup.add(radTriangle);
        radTriangle.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        radTriangle.setForeground(new java.awt.Color(0, 0, 0));
        radTriangle.setMnemonic('3');
        radTriangle.setText("Triangle");
        radTriangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTriangleActionPerformed(evt);
            }
        });

        lbColourDis.setBackground(new java.awt.Color(255, 255, 255));
        lbColourDis.setText(" ");
        lbColourDis.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        lbColourDis.setOpaque(true);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Size");

        tfSize.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tfSize.setForeground(new java.awt.Color(0, 0, 0));
        tfSize.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSizeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSizeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbGreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbShape, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(lbBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(radSquare)
                    .addComponent(radCircle)
                    .addComponent(radTriangle)
                    .addComponent(lbColourDis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(panelArtBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbColourDis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbRed))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbGreen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(lbBlue))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(lbShape))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radSquare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radCircle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radTriangle)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelArtBoard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSquareActionPerformed
        lbShape.setText("Square");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/square.png")));
    }//GEN-LAST:event_radSquareActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (shapeGroup.getSelection() != null) {
            if (!tfSize.getText().isEmpty()) {
                if (selectedColor != null) {
                    Integer shapeSize = Integer.valueOf(tfSize.getText());
                    int currentMaxX = maxX - shapeSize;
                    int currentMaxY = maxY - shapeSize;

                    int currentMin = Math.round(shapeSize / 2);

                    int x = (int) (Math.random() * (currentMaxX - currentMin + 1) + currentMin);
                    int y = (int) (Math.random() * (currentMaxY - currentMin + 1) + currentMin);
                    if (radSquare.isSelected()) {
                        Shape s = ShapeFactory.getShape(selectedColor, shapeSize);

                        graphics.setColor(s.getColor());
                        graphics.fillRect(x, y, shapeSize, shapeSize);
                    }
                    if (radCircle.isSelected()) {
                        Shape s = ShapeFactory.getShape(selectedColor, shapeSize);

                        graphics.setColor(s.getColor());
                        graphics.fillOval(x, y, shapeSize, shapeSize);
                    }
                    if (radTriangle.isSelected()) {
                        Shape s = ShapeFactory.getShape(selectedColor, shapeSize);

                        graphics.setColor(s.getColor());
                        graphics.fillPolygon(new int[]{x, x - (currentMin), x + (currentMin)}, new int[]{y, y + currentMin, y + currentMin}, 3);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Colour is not selected", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Add a size to draw the shape", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a shape to Draw", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        selectedColor = JColorChooser.showDialog(this, "Pick a Colour for the Shape", Color.BLACK);
        if (selectedColor != null) {
            lbColourDis.setBackground(selectedColor);
            lbRed.setText(String.valueOf(selectedColor.getRed()));
            lbGreen.setText(String.valueOf(selectedColor.getGreen()));
            lbBlue.setText(String.valueOf(selectedColor.getBlue()));
        } else {
            JOptionPane.showMessageDialog(this, "Colour is not Selected", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        } else {
            if (!tfSize.getText().isEmpty()) {
                if (Integer.valueOf(tfSize.getText()) > maxX || Integer.valueOf(tfSize.getText()) > maxY) {
                    JOptionPane.showMessageDialog(this, "Size is Greater than the ArtBoard", "Error", JOptionPane.ERROR_MESSAGE);
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_tfSizeKeyTyped

    private void radCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCircleActionPerformed
        lbShape.setText("Circle");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/circle.png")));
    }//GEN-LAST:event_radCircleActionPerformed

    private void radTriangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTriangleActionPerformed
        lbShape.setText("Triangle");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/triangle.png")));
    }//GEN-LAST:event_radTriangleActionPerformed

    private void tfSizeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSizeKeyPressed

    }//GEN-LAST:event_tfSizeKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home = new Home();
                home.setVisible(true);
                home.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Resources/ico.png")));
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBlue;
    private javax.swing.JLabel lbColourDis;
    private javax.swing.JLabel lbGreen;
    private javax.swing.JLabel lbRed;
    private javax.swing.JLabel lbShape;
    private javax.swing.JPanel panelArtBoard;
    private javax.swing.JRadioButton radCircle;
    private javax.swing.JRadioButton radSquare;
    private javax.swing.JRadioButton radTriangle;
    private javax.swing.ButtonGroup shapeGroup;
    private javax.swing.JTextField tfSize;
    // End of variables declaration//GEN-END:variables
}