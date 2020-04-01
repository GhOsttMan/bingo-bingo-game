
package bingo;


import java.awt.Color;
import java.util.Random;
public class MainPage extends javax.swing.JFrame {

   
    public MainPage() {
        initComponents();
    }
     public MainPage(String a , String b) {
         initComponents();
        jLabel3.setText(a);
        jLabel4.setText(b);     
    }

   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(36, 205, 241));

        jPanel3.setBackground(new java.awt.Color(146, 105, 232));
        jPanel3.setDoubleBuffered(false);
        jPanel3.setEnabled(false);
        jPanel3.setFocusable(false);

        jButton27.setText("4");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("18");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText("19");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText("15");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText("2");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("22");
        jButton32.setPreferredSize(new java.awt.Dimension(30, 30));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText("21");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText("25");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText("10");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText("20");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText("24");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText("6");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setText("13");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText("23");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setText("12");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText("7");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText("17");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText("5");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jButton45.setText("9");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jButton46.setText("3");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton47.setText("1");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setText("11");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setText("14");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton50.setText("8");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jButton51.setText("16");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(146, 105, 232));
        jPanel4.setDoubleBuffered(false);
        jPanel4.setEnabled(false);
        jPanel4.setFocusable(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(345, 346));

        jButton52.setText("4");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton53.setText("18");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jButton54.setText("19");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setText("15");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton56.setText("2");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });

        jButton57.setText("22");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        jButton58.setText("21");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton59.setText("25");
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton60.setText("10");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setText("20");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setText("24");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setText("6");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setText("13");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        jButton65.setText("23");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setText("12");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setText("7");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setText("17");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setText("5");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setText("9");
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setText("3");
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setText("1");
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setText("11");
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setText("14");
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setText("8");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setText("16");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(246, 246, 23));
        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jButton1.setText("Random 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jLabel1.setText("Player 2 :");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jLabel2.setText("Player 1 :");

        jButton2.setBackground(new java.awt.Color(246, 246, 23));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jButton2.setText("Random 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jLabel3.setForeground(new java.awt.Color(18, 8, 8));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); 
        jLabel4.setForeground(new java.awt.Color(18, 8, 8));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton33.setBackground(Color.red);
        String st,sa;
        st = jButton33.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        } 
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean[] Mark = new boolean[100];
        Random rand = new Random();
        int ok = 0,cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton27.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton27.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton28.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton28.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton29.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton29.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton30.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton30.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton31.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton31.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt =1 ;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton32.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton32.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt =1 ;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton33.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton33.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton34.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton34.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        
        ok = 0;
        cnt = 1 ;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton35.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton35.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton36.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton36.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton37.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton37.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton38.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton38.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton39.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton39.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton40.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton40.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton41.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton41.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton42.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton42.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton43.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton43.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton44.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton44.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
             cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton45.setText(a);
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton45.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt ++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton46.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton46.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton47.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton47.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton48.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton48.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton49.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton49.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt ++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton50.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton50.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        cnt = 1;
        while(ok == 0){
            cnt++;
            if(cnt > 100000){
                for(int i = 1 ; i <= 25 ;i++){
                    if(Mark[i] == false){
                        Mark[i] =true;
                        String a = Integer.toString(i);
                        jButton51.setText(a); 
                        break;
                    }
                }
                break;
            }
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton51.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
         boolean[] Mark = new boolean[100];
        Random rand = new Random();
        int ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton52.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton53.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton54.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton55.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton56.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton57.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton58.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton59.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton60.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton61.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton62.setText(a);
            Mark[n] = true;
            ok = 1;
        }
        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton63.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton64.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton65.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton66.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton67.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton68.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton69.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton70.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton71.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton72.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton73.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton74.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton75.setText(a);
            Mark[n] = true;
            ok = 1;
        }

        ok = 0;
        while(ok == 0){
            
            int  n = rand.nextInt(25)+1 ;
            if(Mark[n] == true) continue;
            String a = Integer.toString(n);
            jButton76.setText(a);
            Mark[n] = true;
            ok = 1;
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean horizon1(){
        Color a , b, c, d,e;
        a = jButton27.getBackground();
        b = jButton30.getBackground();
        c = jButton44.getBackground();
        d = jButton34.getBackground();
        e = jButton40.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton28.getBackground();
        b = jButton31.getBackground();
        c = jButton45.getBackground();
        d = jButton38.getBackground();
        e = jButton39.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton42.getBackground();
        b = jButton29.getBackground();
        c = jButton43.getBackground();
        d = jButton33.getBackground();
        e = jButton36.getBackground();
        
        boolean z =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton32.getBackground();
        b = jButton48.getBackground();
        c = jButton50.getBackground();
        d = jButton46.getBackground();
        e = jButton41.getBackground();
        
        boolean p =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton47.getBackground();
        b = jButton51.getBackground();
        c = jButton49.getBackground();
        d = jButton37.getBackground();
        e = jButton35.getBackground();
        
        boolean q =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        return (p || q || x || y || z);
    }
    public boolean horizon2(){
        Color a , b, c, d,e;
        a = jButton52.getBackground();
        b = jButton55.getBackground();
        c = jButton69.getBackground();
        d = jButton59.getBackground();
        e = jButton65.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton53.getBackground();
        b = jButton56.getBackground();
        c = jButton70.getBackground();
        d = jButton63.getBackground();
        e = jButton64.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton67.getBackground();
        b = jButton54.getBackground();
        c = jButton68.getBackground();
        d = jButton58.getBackground();
        e = jButton61.getBackground();
        
        boolean z =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton57.getBackground();
        b = jButton73.getBackground();
        c = jButton75.getBackground();
        d = jButton71.getBackground();
        e = jButton66.getBackground();
        
        boolean p =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton72.getBackground();
        b = jButton76.getBackground();
        c = jButton74.getBackground();
        d = jButton62.getBackground();
        e = jButton60.getBackground();
        
        boolean q =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        return (p || q || x || y || z);
    }
    public boolean ver1(){
        Color a , b, c, d,e;
        a = jButton27.getBackground();
        b = jButton28.getBackground();
        c = jButton42.getBackground();
        d = jButton32.getBackground();
        e = jButton47.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton30.getBackground();
        b = jButton31.getBackground();
        c = jButton29.getBackground();
        d = jButton48.getBackground();
        e = jButton51.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton44.getBackground();
        b = jButton45.getBackground();
        c = jButton43.getBackground();
        d = jButton50.getBackground();
        e = jButton49.getBackground();
        
        boolean z =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton34.getBackground();
        b = jButton38.getBackground();
        c = jButton33.getBackground();
        d = jButton46.getBackground();
        e = jButton37.getBackground();
        
        boolean p =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton40.getBackground();
        b = jButton39.getBackground();
        c = jButton36.getBackground();
        d = jButton41.getBackground();
        e = jButton35.getBackground();
        
        boolean q =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        return (p || q || x || y || z);
    }
    public boolean ver2(){
        Color a , b, c, d,e;
        a = jButton52.getBackground();
        b = jButton53.getBackground();
        c = jButton67.getBackground();
        d = jButton57.getBackground();
        e = jButton72.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton55.getBackground();
        b = jButton56.getBackground();
        c = jButton54.getBackground();
        d = jButton73.getBackground();
        e = jButton76.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton69.getBackground();
        b = jButton70.getBackground();
        c = jButton68.getBackground();
        d = jButton75.getBackground();
        e = jButton74.getBackground();
        
        boolean z =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton59.getBackground();
        b = jButton63.getBackground();
        c = jButton58.getBackground();
        d = jButton71.getBackground();
        e = jButton62.getBackground();
        
        boolean p =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton65.getBackground();
        b = jButton64.getBackground();
        c = jButton61.getBackground();
        d = jButton66.getBackground();
        e = jButton60.getBackground();
        
        boolean q =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        return (p || q || x || y || z);
    }
    public boolean diag1(){
        Color a , b, c, d,e;
        a = jButton27.getBackground();
        b = jButton31.getBackground();
        c = jButton43.getBackground();
        d = jButton46.getBackground();
        e = jButton35.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton47.getBackground();
        b = jButton48.getBackground();
        c = jButton43.getBackground();
        d = jButton38.getBackground();
        e = jButton40.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        return (x || y);
    }
    public boolean diag2(){
        Color a , b, c, d,e;
        a = jButton52.getBackground();
        b = jButton56.getBackground();
        c = jButton68.getBackground();
        d = jButton71.getBackground();
        e = jButton60.getBackground();
        
        boolean x =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        
        a = jButton72.getBackground();
        b = jButton73.getBackground();
        c = jButton68.getBackground();
        d = jButton63.getBackground();
        e = jButton65.getBackground();
        
        boolean y =  (a == b) && (b == c) && (c == d) && (d == e) && (e == Color.red);
        return (x || y);
    }
    public int check(){
        if(horizon1() == true  && ver1() == true && diag1() == true){
            if(horizon2() == true && ver2() == true && diag2() == true){
                return 0;
            }
            else{
                return 1;
            }
        }
        else{
            if(horizon2() == true && ver2() == true && diag2() == true){
                return 2;
            }
            else return 5;
        }
    }
   
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton27.setBackground(Color.red);
        String st,sa;
        st = jButton27.getText();
               sa = jButton52.getText();
        if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
          sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
        
         jButton28.setBackground(Color.red);
        String st,sa;
        st = jButton28.getText();
              sa = jButton52.getText();
        if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton42.setBackground(Color.red);
        String st,sa;
        st = jButton42.getText();
               sa = jButton52.getText();
        if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton32.setBackground(Color.red);
        String st,sa;
        st = jButton32.getText();
         sa =jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton47.setBackground(Color.red);
        String st,sa;
        st = jButton47.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
         sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
         jButton30.setBackground(Color.red);
        String st,sa;
        st = jButton30.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton31.setBackground(Color.red);
        String st,sa;
        st = jButton31.getText();
        sa = jButton52.getText();
        if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        } 
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton29.setBackground(Color.red);
        String st,sa;
        st = jButton29.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton48.setBackground(Color.red);
        String st,sa;
        sa = jButton52.getText();
        st = jButton48.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton51.setBackground(Color.red);
        String st,sa;
        sa = jButton52.getText();
        st = jButton51.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        } 
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton44.setBackground(Color.red);
        String st,sa;
        sa = jButton52.getText();
        st = jButton44.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton45.setBackground(Color.red);
        String st,sa;
        st = jButton45.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton43.setBackground(Color.red);
        String st,sa;
        st = jButton43.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton50.setBackground(Color.red);
        String st,sa;
        st = jButton50.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton49.setBackground(Color.red);
        String st,sa;
        st = jButton49.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
       sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton34.setBackground(Color.red);
        String st,sa;
        st = jButton34.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
       sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
    }
    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton38.setBackground(Color.red);
        String st,sa;
        st = jButton38.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton46.setBackground(Color.red);
        String st,sa;
        st = jButton46.getText();
        sa = jButton52.getText();
        if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton37.setBackground(Color.red);
        String st,sa;
        st = jButton37.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton40.setBackground(Color.red);
        String st,sa;
        st = jButton40.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton39.setBackground(Color.red);
        String st,sa;
        st = jButton39.getText();
        sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
         sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton36.setBackground(Color.red);
        String st,sa;
        st = jButton36.getText();
         sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton41.setBackground(Color.red);
        String st,sa;
        st = jButton41.getText();
         sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton35.setBackground(Color.red);
        String st,sa;
        st = jButton35.getText();
         sa = jButton52.getText();
         if(sa.equals(st)){
            jButton52.setBackground(Color.red);
        }
        sa =jButton53.getText();
         if(sa.equals(st)){
            jButton53.setBackground(Color.red);
        }
         sa = jButton54.getText();
         if(sa.equals(st)){
            jButton54.setBackground(Color.red);
        }
         sa=jButton55.getText();
         if(sa.equals(st)){
            jButton55.setBackground(Color.red);
        }
         sa = jButton56.getText();
          if(sa.equals(st)){
            jButton56.setBackground(Color.red);
        }
          sa = jButton57.getText();
        if(sa.equals(st)){
            jButton57.setBackground(Color.red);
        }
        sa = jButton58.getText();
         if(sa.equals(st)){
            jButton58.setBackground(Color.red);
        }
         sa = jButton59.getText();
        if(sa.equals(st)){
            jButton59.setBackground(Color.red);
        }
        sa = jButton60.getText();
       if(sa.equals(st)){
            jButton60.setBackground(Color.red);
        }
       sa = jButton61.getText();
        if(sa.equals(st)){
            jButton61.setBackground(Color.red);
        }
        sa = jButton62.getText();
         if(sa.equals(st)){
            jButton62.setBackground(Color.red);
        }
         sa = jButton63.getText();
          if(sa.equals(st)){
            jButton63.setBackground(Color.red);
        }
          sa = jButton64.getText();
           if(sa.equals(st)){
            jButton64.setBackground(Color.red);
        }
           sa = jButton65.getText();
            if(sa.equals(st)){
            jButton65.setBackground(Color.red);
        }
            sa = jButton66.getText();
             if(sa.equals(st)){
            jButton66.setBackground(Color.red);
        }
             sa = jButton67.getText();
              if(sa.equals(st)){
            jButton67.setBackground(Color.red);
        }
            sa = jButton68.getText();
               if(sa.equals(st)){
            jButton68.setBackground(Color.red);
        }
               sa =jButton69.getText();
                if(sa.equals(st)){
            jButton69.setBackground(Color.red);
        }
                sa = jButton70.getText();
        if(sa.equals(st)){
            jButton70.setBackground(Color.red);
        }
        sa = jButton71.getText();
         if(sa.equals(st)){
            jButton71.setBackground(Color.red);
        }
          sa = jButton72.getText();
         if(sa.equals(st)){
            jButton72.setBackground(Color.red);
        }
        sa = jButton73.getText();
         if(sa.equals(st)){
            jButton73.setBackground(Color.red);
        }
          sa = jButton74.getText();
         if(sa.equals(st)){
            jButton74.setBackground(Color.red);
        }
          sa = jButton75.getText();
         if(sa.equals(st)){
            jButton75.setBackground(Color.red);
        }
          sa = jButton76.getText();
         if(sa.equals(st)){
            jButton76.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton72.setBackground(Color.red);
         String st,sa;
        st = jButton72.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
        
    }
    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton76.setBackground(Color.red);
         String st,sa;
        st = jButton76.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton73.setBackground(Color.red);
         String st,sa;
        st = jButton73.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton75.setBackground(Color.red);
         String st,sa;
        st = jButton75.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton74.setBackground(Color.red);
         String st,sa;
        st = jButton74.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton52.setBackground(Color.red);
         String st,sa;
        st = jButton52.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton55.setBackground(Color.red);
         String st,sa;
        st = jButton55.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton61.setBackground(Color.red);
         String st,sa;
        st = jButton61.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton53.setBackground(Color.red);
         String st,sa;
        st = jButton53.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton67.setBackground(Color.red);
         String st,sa;
        st = jButton67.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton57.setBackground(Color.red);
         String st,sa;
        st = jButton57.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton56.setBackground(Color.red);
         String st,sa;
        st = jButton56.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton54.setBackground(Color.red);
         String st,sa;
        st = jButton54.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
         jButton69.setBackground(Color.red);
         String st,sa;
        st = jButton69.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton70.setBackground(Color.red);
         String st,sa;
        st = jButton70.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton68.setBackground(Color.red);
         String st,sa;
        st = jButton68.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton59.setBackground(Color.red);
         String st,sa;
        st = jButton59.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {
        jButton63.setBackground(Color.red);
         String st,sa;
        st = jButton63.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton58.setBackground(Color.red);
         String st,sa;
        st = jButton58.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton71.setBackground(Color.red);
         String st,sa;
        st = jButton71.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton62.setBackground(Color.red);
         String st,sa;
        st = jButton62.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton65.setBackground(Color.red);
         String st,sa;
        st = jButton65.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton64.setBackground(Color.red);
         String st,sa;
        st = jButton64.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton66.setBackground(Color.red);
         String st,sa;
        st = jButton66.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
         jButton60.setBackground(Color.red);
         String st,sa;
        st = jButton60.getText();
               sa = jButton27.getText();
        if(sa.equals(st)){
            jButton27.setBackground(Color.red);
        }
        sa =jButton28.getText();
         if(sa.equals(st)){
            jButton28.setBackground(Color.red);
        }
         sa = jButton29.getText();
         if(sa.equals(st)){
            jButton29.setBackground(Color.red);
        }
         sa=jButton30.getText();
         if(sa.equals(st)){
            jButton30.setBackground(Color.red);
        }
         sa = jButton31.getText();
          if(sa.equals(st)){
            jButton31.setBackground(Color.red);
        }
          sa = jButton32.getText();
        if(sa.equals(st)){
            jButton32.setBackground(Color.red);
        }
        sa = jButton33.getText();
         if(sa.equals(st)){
            jButton33.setBackground(Color.red);
        }
         sa = jButton34.getText();
        if(sa.equals(st)){
            jButton34.setBackground(Color.red);
        }
        sa = jButton35.getText();
       if(sa.equals(st)){
            jButton35.setBackground(Color.red);
        }
       sa = jButton36.getText();
        if(sa.equals(st)){
            jButton36.setBackground(Color.red);
        }
        sa = jButton37.getText();
         if(sa.equals(st)){
            jButton37.setBackground(Color.red);
        }
         sa = jButton38.getText();
          if(sa.equals(st)){
            jButton38.setBackground(Color.red);
        }
          sa = jButton39.getText();
           if(sa.equals(st)){
            jButton39.setBackground(Color.red);
        }
           sa = jButton40.getText();
            if(sa.equals(st)){
            jButton40.setBackground(Color.red);
        }
            sa = jButton41.getText();
             if(sa.equals(st)){
            jButton41.setBackground(Color.red);
        }
             sa = jButton42.getText();
              if(sa.equals(st)){
            jButton42.setBackground(Color.red);
        }
            sa = jButton43.getText();
               if(sa.equals(st)){
            jButton43.setBackground(Color.red);
        }
               sa =jButton44.getText();
                if(sa.equals(st)){
            jButton44.setBackground(Color.red);
        }
                sa = jButton45.getText();
        if(sa.equals(st)){
            jButton45.setBackground(Color.red);
        }
        sa = jButton46.getText();
         if(sa.equals(st)){
            jButton46.setBackground(Color.red);
        }
          sa = jButton47.getText();
         if(sa.equals(st)){
            jButton47.setBackground(Color.red);
        }
          sa = jButton48.getText();
         if(sa.equals(st)){
            jButton48.setBackground(Color.red);
        }
          sa = jButton49.getText();
         if(sa.equals(st)){
            jButton49.setBackground(Color.red);
        }
          sa = jButton50.getText();
         if(sa.equals(st)){
            jButton50.setBackground(Color.red);
        }
          sa = jButton51.getText();
         if(sa.equals(st)){
            jButton51.setBackground(Color.red);
        }
         if(check() == 1){
             new Winner1().setVisible(true);
         }
         else if(check() == 2){
             new Winner2().setVisible(true);
         }
         else if(check() == 0){
             new Draw().setVisible(true);
         }
    }
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
                
            }
            
        });
    }

    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
   

    private void setVisiable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
