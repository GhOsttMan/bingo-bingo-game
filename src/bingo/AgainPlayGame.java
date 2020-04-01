package bingo;


	public class AgainPlayGame extends javax.swing.JFrame {

	    
	    public AgainPlayGame() {
	        initComponents();
	    }

	                            
	    private void initComponents() {

	        jLabel2 = new javax.swing.JLabel();
	        jTextField1 = new javax.swing.JTextField();
	        jButton1 = new javax.swing.JButton();
	        jButton2 = new javax.swing.JButton();
	        jButton3 = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel3 = new javax.swing.JLabel();
	        jTextField2 = new javax.swing.JTextField();

	        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingofinal/drawing.gif"))); 

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(153, 255, 0));
	        setPreferredSize(new java.awt.Dimension(601, 601));

	        jButton1.setBackground(new java.awt.Color(255, 255, 0));
	        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton1.setText("START PLAY");
	        jButton1.setBorder(null);
	        jButton1.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });

	        jButton2.setBackground(new java.awt.Color(255, 255, 0));
	        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton2.setText("CONTINUE");
	        jButton2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton2ActionPerformed(evt);
	            }
	        });

	        jButton3.setBackground(new java.awt.Color(255, 255, 0));
	        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
	        jButton3.setText("EXIT");
	        jButton3.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton3ActionPerformed(evt);
	            }
	        });

	        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingofinal/draw.gif"))); 

	        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bingofinal/drawing.jpg"))); 

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(73, 73, 73)
	                                .addComponent(jButton3))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(34, 34, 34)
	                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGap(52, 52, 52)
	                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(124, 124, 124)
	                        .addComponent(jLabel1))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jLabel3)
	                        .addGap(116, 116, 116)
	                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(657, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jLabel1)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(35, 35, 35)
	                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(27, 27, 27)
	                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(26, 26, 26)
	                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(23, 23, 23)
	                        .addComponent(jLabel3))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(73, 73, 73)
	                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(1560, Short.MAX_VALUE))
	        );

	        pack();
	    }
	    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        
	    }                                        

	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        
	    }                                        

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        
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
	            java.util.logging.Logger.getLogger(AgainPlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(AgainPlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(AgainPlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(AgainPlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new AgainPlayGame().setVisible(true);
	            }
	        });
	    }

	                     
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField jTextField2;
	                      
	}
	

