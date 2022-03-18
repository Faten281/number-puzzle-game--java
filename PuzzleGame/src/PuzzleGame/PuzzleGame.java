package PuzzleGame;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class PuzzleGame extends javax.swing.JFrame {
    public PuzzleGame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtn3 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jblNumOfClicks = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnSolution = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 4));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 88)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Puzzle Game ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 640, 120));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 4));
        jPanel2.setForeground(new java.awt.Color(102, 0, 102));

        jbtn3.setBackground(new java.awt.Color(204, 204, 255));
        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn3.setForeground(new java.awt.Color(51, 0, 153));
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(204, 204, 255));
        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn1.setForeground(new java.awt.Color(51, 0, 153));
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(204, 204, 255));
        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn2.setForeground(new java.awt.Color(51, 0, 153));
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(204, 204, 255));
        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn4.setForeground(new java.awt.Color(51, 0, 153));
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(204, 204, 255));
        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn8.setForeground(new java.awt.Color(51, 0, 153));
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(204, 204, 255));
        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn7.setForeground(new java.awt.Color(51, 0, 153));
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(204, 204, 255));
        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn6.setForeground(new java.awt.Color(51, 0, 153));
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(204, 204, 255));
        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn5.setForeground(new java.awt.Color(51, 0, 153));
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(204, 204, 255));
        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jbtn9.setForeground(new java.awt.Color(51, 0, 153));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, 350));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 4));
        jPanel3.setForeground(new java.awt.Color(102, 0, 102));

        jLabel2.setBackground(new java.awt.Color(204, 0, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Clicks");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));

        jblNumOfClicks.setBackground(new java.awt.Color(255, 204, 204));
        jblNumOfClicks.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jblNumOfClicks.setForeground(new java.awt.Color(102, 0, 102));
        jblNumOfClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNumOfClicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblNumOfClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblNumOfClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 260, 140));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 4));
        jPanel4.setForeground(new java.awt.Color(102, 0, 102));

        jbtnExit.setBackground(new java.awt.Color(255, 204, 204));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(153, 0, 153));
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnReset.setBackground(new java.awt.Color(255, 204, 204));
        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(153, 0, 153));
        jbtnReset.setText("Reset");
        jbtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jbtnSolution.setBackground(new java.awt.Color(255, 204, 204));
        jbtnSolution.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnSolution.setForeground(new java.awt.Color(153, 0, 153));
        jbtnSolution.setText("Solution");
        jbtnSolution.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 4));
        jbtnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolutionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit)
                .addGap(45, 45, 45))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 260, 200));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //public vars 
    int counter;
    
    //<<<<<<<<<<<<<< swap buttons >>>>>>>>>>>>>>>>>>>>>
    void EmptySpotChecker(JButton button1, JButton button2){
        String ShuffleNumber = button2.getText();
        
        if(ShuffleNumber == ""){
            button2.setText(button1.getText());
            button1.setText("");
        }
    }
    
    //<<<<<<<<<<<shuffle randomly at start >>>>>>>>>>>>>>>
    public void Shuffle(){
        Random random = new Random();
            int a []= new int[8];

            for (int i = 0; i < a.length; i++) {
                a[i]= random.nextInt(8) + 1;

                    for(int j=0; j<i; j++){          // to handle duplication
                        if(a[i]==a[j]){
                            i--;
                            break;
                        }
                    }
                 }
            jbtn1.setText(Integer.toString(a[0]));
            jbtn2.setText(Integer.toString(a[1]));
            jbtn3.setText(Integer.toString(a[2]));
            jbtn4.setText(Integer.toString(a[3]));
            jbtn5.setText(Integer.toString(a[4]));
            jbtn6.setText(Integer.toString(a[5]));
            jbtn7.setText(Integer.toString(a[6]));
            jbtn8.setText(Integer.toString(a[7])); 
            jbtn9.setText("");
        }
    
    
    //<<<<<<<<<<<<<< Solution checker >>>>>>>>>>>>>>>>>>>
    public void solutionChecker(){
        String b1 = jbtn1.getText();
        String b2 = jbtn2.getText();
        String b3 = jbtn3.getText();
        String b4 = jbtn4.getText();
        String b5 = jbtn5.getText();
        String b6 = jbtn6.getText();
        String b7 = jbtn7.getText();
        String b8 = jbtn8.getText();
        
        
        if(
            b1 == "1" &&
            b2 == "2" &&
            b3 == "3" &&
            b4 == "4" &&
            b5 == "5" &&
            b6 == "6" &&
            b7 == "7" &&
            b8 == "8"
            ){
            JOptionPane.showMessageDialog(
                        this,
                        "Congratulations! ... You Won !", 
                        "Puzzle Game",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        
        // increment counter
        counter++;
        jblNumOfClicks.setText(Integer.toString(counter));
        
    }
    
    //======================================================
    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        EmptySpotChecker(jbtn7, jbtn4);
        EmptySpotChecker(jbtn7, jbtn8);
        solutionChecker();
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        EmptySpotChecker(jbtn1, jbtn2);
        EmptySpotChecker(jbtn1, jbtn4); 
        solutionChecker();
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        EmptySpotChecker(jbtn2, jbtn1);
        EmptySpotChecker(jbtn2, jbtn5); 
        EmptySpotChecker(jbtn2, jbtn3);
        solutionChecker();
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        EmptySpotChecker(jbtn3, jbtn2);
        EmptySpotChecker(jbtn3, jbtn6);
        solutionChecker();
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        EmptySpotChecker(jbtn4, jbtn1);
        EmptySpotChecker(jbtn4, jbtn5);
        EmptySpotChecker(jbtn4, jbtn7);
        solutionChecker();
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        EmptySpotChecker(jbtn5, jbtn2);
        EmptySpotChecker(jbtn5, jbtn4);
        EmptySpotChecker(jbtn5, jbtn6);
        EmptySpotChecker(jbtn5, jbtn8);
        solutionChecker();
        
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        EmptySpotChecker(jbtn6, jbtn3);
        EmptySpotChecker(jbtn6, jbtn5);
        EmptySpotChecker(jbtn6, jbtn9);
        solutionChecker();
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        EmptySpotChecker(jbtn8, jbtn7);
        EmptySpotChecker(jbtn8, jbtn5);
        EmptySpotChecker(jbtn8, jbtn9);
        solutionChecker();
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        EmptySpotChecker(jbtn9, jbtn6);
        EmptySpotChecker(jbtn9, jbtn8);
        solutionChecker();
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Shuffle();
    }//GEN-LAST:event_formWindowActivated

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        Shuffle();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolutionActionPerformed
        jbtn1.setText("1");
        jbtn2.setText("2");
        jbtn3.setText("3");
        jbtn4.setText("4");
        jbtn5.setText("5");
        jbtn6.setText("6");
        jbtn7.setText("7");
        jbtn8.setText("8");
        jbtn9.setText("");
    }//GEN-LAST:event_jbtnSolutionActionPerformed
    private JFrame frame;   
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(
                        frame,
                        "Do you want to Exit ? ", 
                        "Puzzle Game",
                        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuzzleGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jblNumOfClicks;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSolution;
    // End of variables declaration//GEN-END:variables
}
