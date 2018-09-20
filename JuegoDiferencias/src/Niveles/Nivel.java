package Niveles;

import java.awt.Dimension;
import javax.sound.sampled.Clip;
import java.awt.Graphics;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Nivel extends javax.swing.JDialog {

    public Clip clip;
    public String ruta = "/Sonido/";
    int contador = 1;

    public class Imagen1 extends javax.swing.JPanel {

        public Imagen1() {
            this.setSize(250, 250); //se selecciona el tamaño del panel
        }

        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/diferencia2_1.png"));

//se dibuja la imagen que tenemos en el paquete imageness dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(250, 250); //se selecciona el tamaño del panel
        }

//Se crea un metodo cuyo parametro debe ser un objeto Graphic
        @Override
        public void paint(Graphics grafico) {
            Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/diferenciados.png"));

//se dibuja la imagen que tenemos en el paquete imageness dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    public void reinicio() {
        jPanel4.setEnabled(false);
        jPanel5.setEnabled(false);

    }

    public Nivel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public void sonidoAcierto(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {

        }
    }

    public void sonidoReinicio(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {

        }
    }

    public void sonidoError(String archivo) {

        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        diferencia7 = new javax.swing.JLabel();
        diferencia9 = new javax.swing.JLabel();
        diferencia6 = new javax.swing.JLabel();
        diferencia8 = new javax.swing.JLabel();
        diferencia17 = new javax.swing.JLabel();
        diferencia18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        icono1 = new javax.swing.JLabel();
        diferencia11 = new javax.swing.JLabel();
        diferencia10 = new javax.swing.JLabel();
        diferencia13 = new javax.swing.JLabel();
        diferencia14 = new javax.swing.JLabel();
        diferencia15 = new javax.swing.JLabel();
        diferencia16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numeroacierto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DIFERENCIAS");

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setFocusable(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(309, 293));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        diferencia7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia7MouseClicked(evt);
            }
        });

        diferencia9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia9MouseClicked(evt);
            }
        });

        diferencia6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia6MouseClicked(evt);
            }
        });

        diferencia8.setEnabled(false);
        diferencia8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia8MouseClicked(evt);
            }
        });

        diferencia17.setEnabled(false);
        diferencia17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia17MouseClicked(evt);
            }
        });

        diferencia18.setEnabled(false);
        diferencia18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(diferencia6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(diferencia17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(diferencia7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(diferencia8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(diferencia9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(63, 63, 63)))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diferencia8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(diferencia6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(diferencia9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diferencia17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setFocusable(false);
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        icono1.setRequestFocusEnabled(false);

        diferencia11.setEnabled(false);
        diferencia11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia11MouseClicked(evt);
            }
        });

        diferencia10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia10MouseClicked(evt);
            }
        });

        diferencia13.setEnabled(false);
        diferencia13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia13MouseClicked(evt);
            }
        });

        diferencia14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        diferencia14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia14MouseClicked(evt);
            }
        });

        diferencia15.setEnabled(false);
        diferencia15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia15MouseClicked(evt);
            }
        });

        diferencia16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(diferencia11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(diferencia10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(diferencia13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(diferencia14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diferencia16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diferencia15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diferencia14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(diferencia11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diferencia15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(icono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(diferencia10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diferencia16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ENCUENTRE LAS 6 DIFERENCIAS ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("REINICIAR");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("DIFERENCIAS ENCONTRADAS");

        numeroacierto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(numeroacierto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroacierto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        System.out.println(evt.getX() + "," + evt.getY());
        icono1.setIcon(new ImageIcon("C:\\Users\\Alejandro\\Desktop\\archivosEMpresa\\Imagenes\\puntero.png"));
        icono1.setSize(20, 18);
        icono1.setLocation(evt.getX(), evt.getY());
        Imagen1 Imagen1 = new Imagen1();
        jPanel4.add(Imagen1);
        jPanel4.repaint();
    }//GEN-LAST:event_jPanel4MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int salida = JOptionPane.showConfirmDialog(this, "Seguro quiere salir de este nivel ?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (salida == JOptionPane.YES_OPTION) {
            dispose();
        } else {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved
        System.out.println(evt.getX() + "," + evt.getY());
        icono.setIcon(new ImageIcon("C:\\Users\\Alejandro\\Desktop\\archivosEMpresa\\Imagenes\\puntero.png"));
        icono.setSize(20, 18);
        icono.setLocation(evt.getX(), evt.getY());
        Imagen Imagen = new Imagen();
        jPanel5.add(Imagen);
        jPanel5.repaint();
    }//GEN-LAST:event_jPanel5MouseMoved

    private void diferencia13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia13MouseClicked
        diferencia13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/ta.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");

    }//GEN-LAST:event_diferencia13MouseClicked

    private void diferencia7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia7MouseClicked
        diferencia13.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/ta.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia7MouseClicked

    private void diferencia14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia14MouseClicked
        diferencia8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/jaja.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia14MouseClicked

    private void diferencia8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia8MouseClicked
        diferencia8.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/jaja.png")));     
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia8MouseClicked

    private void diferencia11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia11MouseClicked
        diferencia11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/mosca_1.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia11MouseClicked

    private void diferencia6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia6MouseClicked
        diferencia11.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/mosca_1.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia6MouseClicked

    private void diferencia15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia15MouseClicked
        diferencia15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/pel.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia15MouseClicked

    private void diferencia9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia9MouseClicked
        diferencia15.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/pel.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia9MouseClicked

    private void diferencia10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia10MouseClicked
        diferencia18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojab.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia10MouseClicked

    private void diferencia18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia18MouseClicked
        diferencia18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojab.png")));
//        numeroacierto.setText("" + acierto++);
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia18MouseClicked

    private void diferencia16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia16MouseClicked
        diferencia17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/talab.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia16MouseClicked

    private void diferencia17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia17MouseClicked
        diferencia17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/talab.png")));
        sonidoAcierto("acierto");
        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
    }//GEN-LAST:event_diferencia17MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

        sonidoError("error");
        JOptionPane.showMessageDialog(this, "ERROR NO HAY DIFERENCIAS");
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        sonidoError("error");
        JOptionPane.showMessageDialog(this, "ERROR NO HAY DIFERENCIAS");
    }//GEN-LAST:event_jPanel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diferencia10;
    private javax.swing.JLabel diferencia11;
    private javax.swing.JLabel diferencia13;
    private javax.swing.JLabel diferencia14;
    private javax.swing.JLabel diferencia15;
    private javax.swing.JLabel diferencia16;
    private javax.swing.JLabel diferencia17;
    private javax.swing.JLabel diferencia18;
    private javax.swing.JLabel diferencia6;
    private javax.swing.JLabel diferencia7;
    private javax.swing.JLabel diferencia8;
    private javax.swing.JLabel diferencia9;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel icono1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel numeroacierto;
    // End of variables declaration//GEN-END:variables
}
