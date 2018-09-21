package Niveles;

import java.awt.Dimension;
import javax.sound.sampled.Clip;
import java.awt.Graphics;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Nivel extends javax.swing.JDialog {

    int errores = 1;
    public Clip clip;
    public String ruta = "/Sonido/";
    int contador = 0;

    public class Imagen1 extends javax.swing.JPanel {

        public Imagen1() {
            this.setSize(250, 250); //se selecciona el tamaño del panel
        }

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

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(250, 250); //se selecciona el tamaño del panel
        }

//Se crea un metodo cuyo parametro debe ser un objeto Graphic
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

    public void reinicio() {
        Panel1.setEnabled(false);
        Panel2.setEnabled(false);

    }

    public Nivel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);

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

    public void reiniciar() {

        diferencia1.setEnabled(true);
        diferencia2.setEnabled(true);
        diferencia3.setEnabled(true);
        diferencia4.setEnabled(true);
        diferencia5.setEnabled(true);
        diferencia6.setEnabled(true);
        diferencia7.setEnabled(true);
        diferencia8.setEnabled(true);
        diferencia9.setEnabled(true);
        diferencia10.setEnabled(true);
        diferencia11.setEnabled(true);
        diferencia12.setEnabled(true);
        diferencia13.setEnabled(true);
        diferencia14.setEnabled(true);
        diferencia15.setEnabled(true);
        diferencia16.setEnabled(true);
        diferencia17.setEnabled(true);
        diferencia18.setEnabled(true);

        initComponents();

    }

    public boolean acierto() {

        if (contador == 9) {
            return true;

        } else {
            return false;
        }
    }

    public void mensaje() {
        if (!diferencia1.isEnabled()
                && !diferencia2.isEnabled()
                && !diferencia4.isEnabled()
                && !diferencia5.isEnabled()
                && !diferencia6.isEnabled()
                && !diferencia12.isEnabled()
                && !diferencia16.isEnabled()
                && !diferencia17.isEnabled()
                && !diferencia18.isEnabled()) {
            JOptionPane.showMessageDialog(this, "FELICIDADES GANO EL JUEGOs");

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        puntero1 = new javax.swing.JLabel();
        diferencia2 = new javax.swing.JLabel();
        diferencia6 = new javax.swing.JLabel();
        diferencia5 = new javax.swing.JLabel();
        diferencia3 = new javax.swing.JLabel();
        diferencia9 = new javax.swing.JLabel();
        diferencia8 = new javax.swing.JLabel();
        diferencia1 = new javax.swing.JLabel();
        diferencia7 = new javax.swing.JLabel();
        diferencia4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numeroacierto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        puntero2 = new javax.swing.JLabel();
        diferencia11 = new javax.swing.JLabel();
        diferencia15 = new javax.swing.JLabel();
        diferencia14 = new javax.swing.JLabel();
        diferencia12 = new javax.swing.JLabel();
        diferencia18 = new javax.swing.JLabel();
        diferencia17 = new javax.swing.JLabel();
        diferencia10 = new javax.swing.JLabel();
        diferencia16 = new javax.swing.JLabel();
        diferencia13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DIFERENCIAS");

        jPanel1.setBackground(new java.awt.Color(204, 255, 102));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel1.setFocusable(false);
        Panel1.setPreferredSize(new java.awt.Dimension(309, 293));
        Panel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel1MouseMoved(evt);
            }
        });
        Panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel1MouseClicked(evt);
            }
        });

        diferencia2.setEnabled(false);
        diferencia2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia2MouseClicked(evt);
            }
        });

        diferencia6.setEnabled(false);
        diferencia6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia6MouseClicked(evt);
            }
        });

        diferencia5.setEnabled(false);
        diferencia5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia5MouseClicked(evt);
            }
        });

        diferencia3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia3MouseClicked(evt);
            }
        });

        diferencia9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia9MouseClicked(evt);
            }
        });

        diferencia8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia8MouseClicked(evt);
            }
        });

        diferencia1.setEnabled(false);
        diferencia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia1MouseClicked(evt);
            }
        });

        diferencia7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia7MouseClicked(evt);
            }
        });

        diferencia4.setEnabled(false);
        diferencia4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(diferencia7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diferencia8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(diferencia5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntero1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(diferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addComponent(diferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(diferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(diferencia6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diferencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(diferencia5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puntero1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diferencia9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(diferencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(diferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diferencia7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("ENCUENTRE LAS 9 DIFERENCIAS ");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("MENU PRINCIPAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("REINICIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("DIFERENCIAS ENCONTRADAS");

        numeroacierto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numeroacierto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("ERRORES");

        error.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        error.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Panel2.setBackground(new java.awt.Color(255, 255, 255));
        Panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel2.setFocusable(false);
        Panel2.setPreferredSize(new java.awt.Dimension(309, 293));
        Panel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Panel2MouseMoved(evt);
            }
        });
        Panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel2MouseClicked(evt);
            }
        });

        diferencia11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia11MouseClicked(evt);
            }
        });

        diferencia15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia15MouseClicked(evt);
            }
        });

        diferencia14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia14MouseClicked(evt);
            }
        });

        diferencia12.setEnabled(false);
        diferencia12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia12MouseClicked(evt);
            }
        });

        diferencia18.setEnabled(false);
        diferencia18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia18MouseClicked(evt);
            }
        });

        diferencia17.setEnabled(false);
        diferencia17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia17MouseClicked(evt);
            }
        });

        diferencia10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia10MouseClicked(evt);
            }
        });

        diferencia16.setEnabled(false);
        diferencia16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia16MouseClicked(evt);
            }
        });

        diferencia13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diferencia13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(diferencia16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(diferencia17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(diferencia14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntero2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(diferencia10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diferencia13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(diferencia11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(diferencia12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(diferencia15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diferencia18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diferencia12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(diferencia14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diferencia15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diferencia17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(puntero2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diferencia18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(diferencia10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(diferencia13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diferencia16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(numeroacierto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(186, 186, 186)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numeroacierto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Panel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseMoved
        System.out.println(evt.getX() + "," + evt.getY());
        puntero2.setIcon(new ImageIcon("C:\\Users\\Alejandro\\Desktop\\archivosEMpresa\\Imagenes\\puntero.png"));
        puntero2.setSize(20, 18);
        puntero2.setLocation(evt.getX(), evt.getY());
        Imagen1 Imagen1 = new Imagen1();
        Panel1.add(Imagen1);
        Panel1.repaint();
    }//GEN-LAST:event_Panel1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int salida = JOptionPane.showConfirmDialog(this, "Seguro quiere salir de este nivel ?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (salida == JOptionPane.YES_OPTION) {
            dispose();
        } else {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void verificarAcierto(JLabel label, String ruta) {
        acierto();
        label.setDisabledIcon(new ImageIcon(getClass().getResource(ruta)));
        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        contador++;
        numeroacierto.setText("" + contador);
        if (acierto() == true) {
            JOptionPane.showMessageDialog(this, "Encontro todas las diferencias");

        }
    }

    private void diferencia2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia2MouseClicked
//        numeroacierto.setText(" " + aciertos++);
//        acierto();
//        diferencia2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/ta.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia2, "/imagenes/ta.png");
    }//GEN-LAST:event_diferencia2MouseClicked

    private void diferencia3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia3MouseClicked
//        numeroacierto.setText(" " + aciertos++);
//        acierto();
//        diferencia12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/jaja.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia12, "/imagenes/jaja.png");
    }//GEN-LAST:event_diferencia3MouseClicked

    private void diferencia5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia5MouseClicked
//        numeroacierto.setText(" " + aciertos++);
//        acierto();
//        diferencia5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/jaja.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia5, "/imagenes/mosca_1.png");

    }//GEN-LAST:event_diferencia5MouseClicked

    private void diferencia6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia6MouseClicked
//        numeroacierto.setText(" " + aciertos++);
//        acierto();
//        diferencia6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/pel.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia6, "/imagenes/pel.png");
    }//GEN-LAST:event_diferencia6MouseClicked

    private void diferencia8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia8MouseClicked
//        numeroacierto.setText(" " + aciertos++);
//        acierto();
//        diferencia17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojab.png")));
//
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia17, "/imagenes/hojab.png");
    }//GEN-LAST:event_diferencia8MouseClicked

    private void diferencia9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia9MouseClicked
//        acierto();
//        diferencia18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/talab.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia18, "/imagenes/talab.png");
    }//GEN-LAST:event_diferencia9MouseClicked

    private void Panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseClicked
        error.setText("" + errores++);
        sonidoError("error");
        JOptionPane.showMessageDialog(this, "ERROR NO HAY DIFERENCIAS", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Panel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reiniciar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void diferencia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia1MouseClicked
//        acierto();
//        diferencia1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojass.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia1, "/imagenes/hojass.png");
    }//GEN-LAST:event_diferencia1MouseClicked

    private void diferencia7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia7MouseClicked
//        acierto();
//        diferencia16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojatallo.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia16, "/imagenes/hojatallo.png");
    }//GEN-LAST:event_diferencia7MouseClicked

    private void diferencia4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia4MouseClicked
//        acierto();
//        diferencia4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/dife.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia4, "/imagenes/dife.png");

    }//GEN-LAST:event_diferencia4MouseClicked

    private void diferencia11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia11MouseClicked
//        acierto();
//        diferencia2.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/ta.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia2, "/imagenes/ta.png");
    }//GEN-LAST:event_diferencia11MouseClicked

    private void diferencia15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia15MouseClicked
//        acierto();
//        diferencia6.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/pel.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia6, "/imagenes/pel.png");
    }//GEN-LAST:event_diferencia15MouseClicked

    private void diferencia14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia14MouseClicked
//        acierto();
//        diferencia5.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/mosca_1.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia5, "/imagenes/mosca_1.png");
    }//GEN-LAST:event_diferencia14MouseClicked

    private void diferencia12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia12MouseClicked
//        acierto();
//        diferencia12.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/jaja.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia12, "/imagenes/jaja.png");
    }//GEN-LAST:event_diferencia12MouseClicked

    private void diferencia18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia18MouseClicked
//        acierto();
//        diferencia18.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/talab.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia18, "/imagenes/talab.png");
    }//GEN-LAST:event_diferencia18MouseClicked

    private void diferencia17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia17MouseClicked
//        acierto();
//        diferencia17.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojab.png")));
//
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia17, "/imagenes/hojab.png");
    }//GEN-LAST:event_diferencia17MouseClicked

    private void diferencia10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia10MouseClicked
//        acierto();
//        diferencia1.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojass.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia1, "/imagenes/hojass.png");
    }//GEN-LAST:event_diferencia10MouseClicked

    private void diferencia16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia16MouseClicked
//        acierto();
//        diferencia16.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/hojatallo.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia16, "/imagenes/hojatallo.png");
    }//GEN-LAST:event_diferencia16MouseClicked

    private void diferencia13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diferencia13MouseClicked
//        acierto();
//        diferencia4.setDisabledIcon(new ImageIcon(getClass().getResource("/imagenes/dife.png")));
//        sonidoAcierto("acierto");
//        JOptionPane.showMessageDialog(this, "Encontro la diferencia");
        verificarAcierto(diferencia4, "/imagenes/dife.png");
    }//GEN-LAST:event_diferencia13MouseClicked

    private void Panel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseMoved
        System.out.println(evt.getX() + "," + evt.getY());
        puntero1.setIcon(new ImageIcon("C:\\Users\\Alejandro\\Desktop\\archivosEMpresa\\Imagenes\\puntero.png"));
        puntero1.setSize(20, 18);
        puntero1.setLocation(evt.getX(), evt.getY());
        Imagen Imagen = new Imagen();
        Panel2.add(Imagen);
        Panel2.repaint();
    }//GEN-LAST:event_Panel2MouseMoved

    private void Panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseClicked
        error.setText("" + errores++);
        sonidoError("error");
        JOptionPane.showMessageDialog(this, "ERROR NO HAY DIFERENCIAS", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_Panel2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JLabel diferencia1;
    private javax.swing.JLabel diferencia10;
    private javax.swing.JLabel diferencia11;
    private javax.swing.JLabel diferencia12;
    private javax.swing.JLabel diferencia13;
    private javax.swing.JLabel diferencia14;
    private javax.swing.JLabel diferencia15;
    private javax.swing.JLabel diferencia16;
    private javax.swing.JLabel diferencia17;
    private javax.swing.JLabel diferencia18;
    private javax.swing.JLabel diferencia2;
    private javax.swing.JLabel diferencia3;
    private javax.swing.JLabel diferencia4;
    private javax.swing.JLabel diferencia5;
    private javax.swing.JLabel diferencia6;
    private javax.swing.JLabel diferencia7;
    private javax.swing.JLabel diferencia8;
    private javax.swing.JLabel diferencia9;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel numeroacierto;
    private javax.swing.JLabel puntero1;
    private javax.swing.JLabel puntero2;
    // End of variables declaration//GEN-END:variables
}
