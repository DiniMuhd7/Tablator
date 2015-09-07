/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeez.deenyzard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author shamsadam
 */
public class Determ extends javax.swing.JFrame implements ActionListener {

    
    // Setting up buttons for a nested panel
    
    //JButton b1= new JButton("Determinant");
    //JButton b2= new JButton("Solution of linear equations");
    JButton b3= new JButton("Calculate");
    JButton b4= new JButton("Calculate");
    JButton b5 = new JButton("Calculate");
    JButton bClear = new JButton("Clear");
    JButton home = new JButton("Home");
    
    // Setting up textfield fo ra nested panel
    JTextField t1=new JTextField("",100);
    JTextField t2=new JTextField("",100);
    JTextField t3=new JTextField("",100);
    JTextField t4=new JTextField("",100);
    JTextField t5=new JTextField("",100);
    JTextField t6=new JTextField("",100);
    JTextField t7=new JTextField("",100);
    JTextField t8=new JTextField("",100);
    JTextField t9=new JTextField("",100);
    JTextField t10=new JTextField("",100);
    JTextField t11=new JTextField("",100);
    JTextField t12=new JTextField("",100);
    JTextField t13=new JTextField("",100);
    JTextField t14=new JTextField("",100);
    JTextField t15=new JTextField("",100);
    JTextField t16=new JTextField("",100);
    JTextField res=new JTextField("",100);
    
    
    ///////////////////////////////////////
    JLabel l1=new JLabel("Choose the degree of the matrix :");
    JLabel l2=new JLabel("Enter the elements :");
    JLabel l3=new JLabel("Determinant:");
    JLabel l00=new JLabel("A [0][0] :");
    JLabel l01=new JLabel("A [0][1] :");
    JLabel l02=new JLabel("A [0][2] :");
    JLabel l03=new JLabel("A [0][3] :");
    JLabel l10=new JLabel("A [1][0] :");
    JLabel l11=new JLabel("A [1][1] :");
    JLabel l12=new JLabel("A [1][2] :");
    JLabel l13=new JLabel("A [1][3] :");
    JLabel l20=new JLabel("A [2][0] :");
    JLabel l21=new JLabel("A [2][1] :");
    JLabel l22=new JLabel("A [2][2] :");
    JLabel l23=new JLabel("A [2][3] :");
    JLabel l30=new JLabel("A [3][0] :");
    JLabel l31=new JLabel("A [3][1] :");
    JLabel l32=new JLabel("A [3][2] :");
    JLabel l33=new JLabel("A [3][3] :");
    JLabel l40=new JLabel("A [4][0] :");
    JLabel l41=new JLabel("A [4][1] :");
    JLabel l42=new JLabel("A [4][2] :");
    JLabel l43=new JLabel("A [4][3] :");
   
     
    
    // Variables intialization 
    static int d=0;	
    //int w=100,h=40,l=120,b=40;
    int w=100, h=50, l=120, b=40;
    
    
    // Constructor 
    public Determ() {
        
        super("Determinant of a Matrix");
        setSize(800, 500);
        initComponents();
        
        b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
        bClear.addActionListener(this);
	//b2.addActionListener(this);
        
	home.addActionListener(this);
	res.setEditable(false);
        res.setForeground(Color.RED);
        res.setFont(new Font("Gurmukhi MN", 0, 14));
    }
    
    
    public void actionPerformed(ActionEvent ae ) {
        
        if ( ae.getSource() == b3 ) {
           
            try{
            float a[][]=new float[2][2];
            String tt1=t1.getText();
            String tt2=t2.getText();
            String tt3=t3.getText();
            String tt4=t4.getText();
            Float f1=new Float(tt1);
            Float f2=new Float(tt2);
            Float f3=new Float(tt3);
            Float f4=new Float(tt4);
            a[0][0]=f1.floatValue();
            a[0][1]=f2.floatValue();
            a[1][0]=f3.floatValue();
            a[1][1]=f4.floatValue();
			
            float r=a[0][0]*a[1][1]-a[1][0]*a[0][1];
            res.setText(""+r);
            
            } catch(Exception e){
		res.setText("Error");
		
            }
            
        }
        
        else if ( ae.getSource() == b4 ) {
            
            try {
            
                float a[][]=new float[3][3];
		String tt1=t1.getText();
                String tt2=t2.getText();
                String tt3=t3.getText();
		String tt4=t4.getText();
		String tt5=t5.getText();
		String tt6=t6.getText();
		String tt7=t7.getText();
		String tt8=t8.getText();
		String tt9=t9.getText();
		Float f1=new Float(tt1);
		Float f2=new Float(tt2);
		Float f3=new Float(tt3);
		Float f4=new Float(tt4);
		Float f5=new Float(tt5);
		Float f6=new Float(tt6);
		Float f7=new Float(tt7);
		Float f8=new Float(tt8);
		Float f9=new Float(tt9);
		a[0][0]=f1.floatValue();
		a[0][1]=f2.floatValue();
		a[0][2]=f3.floatValue();
		a[1][0]=f4.floatValue();
		a[1][1]=f5.floatValue();
		a[1][2]=f6.floatValue();
		a[2][0]=f7.floatValue();
		a[2][1]=f8.floatValue();
		a[2][2]=f9.floatValue();
			
		float r=calcu(a[0][0],a[0][1],a[0][2],a[1][0],a[1][1],a[1][2],a[2][0],a[2][1],a[2][2]);
		res.setText(""+r);
			
            }   catch(Exception e){
                
                res.setText("Error");
			
            }
        }
        
        else if ( ae.getSource() == b5 ) {
           
            try {
			
                float a[][]=new float[4][4];
		String tt1=t1.getText();
		String tt2=t2.getText();
		String tt3=t3.getText();
		String tt4=t4.getText();
		String tt5=t5.getText();
		String tt6=t6.getText();
		String tt7=t7.getText();
		String tt8=t8.getText();
		String tt9=t9.getText();
		String tt10=t10.getText();
		String tt11=t11.getText();
		String tt12=t12.getText();
		String tt13=t13.getText();
		String tt14=t14.getText();
		String tt15=t15.getText();
		String tt16=t16.getText();
		Float f1=new Float(tt1);
		Float f2=new Float(tt2);
		Float f3=new Float(tt3);
		Float f4=new Float(tt4);
		Float f5=new Float(tt5);
		Float f6=new Float(tt6);
		Float f7=new Float(tt7);
		Float f8=new Float(tt8);
		Float f9=new Float(tt9);
		Float f10=new Float(tt10);
		Float f11=new Float(tt11);
		Float f12=new Float(tt12);
		Float f13=new Float(tt13);
		Float f14=new Float(tt14);
		Float f15=new Float(tt15);
		Float f16=new Float(tt16);
		a[0][0]=f1.floatValue();
		a[0][1]=f2.floatValue();
		a[0][2]=f3.floatValue();
		a[0][3]=f4.floatValue();
		a[1][0]=f5.floatValue();
		a[1][1]=f6.floatValue();
		a[1][2]=f7.floatValue();
		a[1][3]=f8.floatValue();
		a[2][0]=f9.floatValue();
		a[2][1]=f10.floatValue();
		a[2][2]=f11.floatValue();
		a[2][3]=f12.floatValue();
		a[3][0]=f13.floatValue();
		a[3][1]=f14.floatValue();
		a[3][2]=f15.floatValue();
		a[3][3]=f16.floatValue();
		
                float r1=calcu(a[1][1],a[1][2],a[1][3],a[2][1],a[2][2],a[2][3],a[3][1],a[3][2],a[3][3]);
		float r2=calcu(a[1][2],a[1][3],a[1][0],a[2][2],a[2][3],a[2][0],a[3][2],a[3][3],a[3][0]);
		float r3=calcu(a[1][3],a[1][0],a[1][1],a[2][3],a[2][0],a[2][1],a[3][3],a[3][0],a[3][1]);
		float r4=calcu(a[1][0],a[1][1],a[1][2],a[2][0],a[2][1],a[2][2],a[3][0],a[3][1],a[3][2]);
		float r=a[0][0]*r1+a[0][1]*r2+a[0][2]*r3+a[0][3]*r4;
		res.setText(""+r);
			
            }   catch(Exception e)  {
				
                res.setText("Error");
			
            }
           
        }
        
        else if ( ae.getSource() == home ) {
            
            setVisible(false);
            new Determ().setVisible(true);
            
        }
        
        else if ( ae.getSource() == bClear ) {
            
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
            t15.setText("");
            t16.setText("");
            res.setText("");
            
            
        }
    }
    
    
    /////
    float calcu(float a, float b, float c,float d, float e, float f, float g, float h, float i){
		
        float x=a*(e*i-h*f)+b*(f*g-d*i)+c*(d*h-e*g);
		return x;
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bClose = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowDeiconified(java.awt.event.WindowEvent evt) {
                formWindowDeiconified(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("CALCULATE DETERMINANT OF A SQUARE ");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("CHOOSE DEGREE OF THE MATRIX :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("2x2");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("3x3");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("4x4");
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel3.setText("Deenyzard");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        bClose.setBackground(new java.awt.Color(0, 204, 51));
        bClose.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        bClose.setText("Close");
        bClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel2)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3))))
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bClose)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton1)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton2)
                .addGap(30, 30, 30)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(bClose, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
        
        if ( evt.getSource() == jRadioButton1 ) {
            
            d=2;
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            bClose.setVisible(false);
            setSize(600,550);
            
            //Container pane1 = new Container();
 
            jPanel1.add(l00);
            jPanel1.add(l01);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(b3);
            jPanel1.add(bClear);
            jPanel1.add(res);
            jPanel1.add(l2);
            jPanel1.add(l3);
            jPanel1.add(home);
            
            //int x=30,y=50;
            int x = 10, y = 130;
            l2.setBounds(x,y,2*l,b);
            y=y+h;
            l00.setBounds(x,y,w,h);
            t1.setBounds(x+w,y,l,b);
            l01.setBounds(x+w+l+30,y,w,h);
            t2.setBounds(x+2*w+l+30,y,l,b);
            y=y+h;
            l10.setBounds(x,y,w,h);
            t3.setBounds(x+w,y,l,b);
            l11.setBounds(x+w+l+30,y,w,h);
            t4.setBounds(x+2*w+l+30,y,l,b);
            
            y=y+3*h;
            b3.setBounds(x,y,l,b);
            l3.setBounds(x+3*w+10,y,l-10,h);
            res.setBounds(x+3*w+l-10,y,l,b);
            y=y+1*h;
            
            home.setBounds(x,y,l,b);
            
            bClear.setBounds(x+3*w+l-10,y,l, b);
            y=y+2*h;
            
           
            
            
            
            // Set fonts 
            /*
            t1.setFont(new Font("Arial",1,14));
            t2.setFont(new Font("Arial",1,14));
            t3.setFont(new Font("Arial",1,14));
            t4.setFont(new Font("Arial",1,14));
            l00.setFont(new Font("Arial",1,14));
            l01.setFont(new Font("Arial",1,14));
            l10.setFont(new Font("Arial",1,14));
            l11.setFont(new Font("Arial",1,14));
            res.setFont(new Font("Georgia",1,13));
            b3.setFont(new Font("Georgia",1,13));
            l2.setFont(new Font("Georgia",1,13));
            l3.setFont(new Font("Georgia",1,13));
            home.setFont(new Font("Georgia",1,13));
            */
            
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
        
        if ( evt.getSource() == jRadioButton2 ) {
            
            d=3;
            
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            setSize(750,700);
            
            
            jPanel1.add(l00);
            jPanel1.add(l01);
            jPanel1.add(l02);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(l12);
            jPanel1.add(l20);
            jPanel1.add(l21);
            jPanel1.add(l22);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(t5);
            jPanel1.add(t6);
            jPanel1.add(t7);
            jPanel1.add(t8);
            jPanel1.add(t9);
            jPanel1.add(b4);
            jPanel1.add(res);
            jPanel1.add(l2);
            jPanel1.add(l3);
            jPanel1.add(home);
            jPanel1.add(bClear);
            
            
            int x = 10, y = 130;
            l2.setBounds(x,y,2*l,b);
            y=y+h;
            l00.setBounds(x,y,w,h);
            t1.setBounds(x+w,y,l,b);
            l01.setBounds(x+w+l+30,y,w,h);
            t2.setBounds(x+2*w+l+30,y,l,b);
            l02.setBounds(x+2*w+2*l+50,y,w,h);
            t3.setBounds(x+3*w+2*l+50,y,l,b);
            y=y+h;
			
            l10.setBounds(x,y,w,h);
            t4.setBounds(x+w,y,l,b);
            l11.setBounds(x+w+l+30,y,w,h);
            t5.setBounds(x+2*w+l+30,y,l,b);
            l12.setBounds(x+2*w+2*l+50,y,w,h);
            t6.setBounds(x+3*w+2*l+50,y,l,b);
            y=y+h;
			
            l20.setBounds(x,y,w,h);
            t7.setBounds(x+w,y,l,b);
            l21.setBounds(x+w+l+30,y,w,h);
            t8.setBounds(x+2*w+l+30,y,l,b);
            l22.setBounds(x+2*w+2*l+50,y,w,h);
            t9.setBounds(x+3*w+2*l+50,y,l,b);
            y=y+h;
			
            y=y+3*h;
            b4.setBounds(x,y,l,b);
            l3.setBounds(x+3*w+10,y,l-10,h);
            res.setBounds(x+3*w+l-10,y,l,b);
            y=y+1*h;
			
            home.setBounds(x,y,l,b);
            
            bClear.setBounds(x+3*w+l-10,y,l, b);
            y=y+2*h;
            
            
            
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        System.out.println("Activated");
        
        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        System.out.println("Closed");
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        System.out.println("Closing");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        // TODO add your handling code here:
        
        System.out.println("Deactivated");
    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowDeiconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeiconified
        // TODO add your handling code here:
        
        System.out.println("Deiconified");
    }//GEN-LAST:event_formWindowDeiconified

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
        
        System.out.println("Iconified");
    }//GEN-LAST:event_formWindowIconified

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        System.out.println("Opened");
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        // TODO add your handling code here:
        
        if ( evt.getSource() == jRadioButton3 ) {
            
            d=4;
			
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            jRadioButton3.setVisible(false);
            setSize(1000,750);
			
            jPanel1.add(l00);
            jPanel1.add(l01);
            jPanel1.add(l02);
            jPanel1.add(l03);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(l12);
            jPanel1.add(l13);
            jPanel1.add(l20);
            jPanel1.add(l21);
            jPanel1.add(l22);
            jPanel1.add(l23);
            jPanel1.add(l30);
            jPanel1.add(l31);
            jPanel1.add(l32);
            jPanel1.add(l33);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(t5);
            jPanel1.add(t6);
            jPanel1.add(t7);
            jPanel1.add(t8);
            jPanel1.add(t9);
            jPanel1.add(t10);
            jPanel1.add(t11);
            jPanel1.add(t12);
            jPanel1.add(t13);
            jPanel1.add(t14);
            jPanel1.add(t15);
            jPanel1.add(t16);
            jPanel1.add(b5);
            jPanel1.add(res);
            jPanel1.add(l2);
            jPanel1.add(l3);
            jPanel1.add(home);
            jPanel1.add(bClear);
            
            
            int x = 10, y = 130;
            l2.setBounds(x,y,2*l,b);
            y=y+h;
            l00.setBounds(x,y,w,h);
            t1.setBounds(x+w,y,l,b);
            l01.setBounds(x+w+l+30,y,w,h);
            t2.setBounds(x+2*w+l+30,y,l,b);
            l02.setBounds(x+2*w+2*l+50,y,w,h);
            t3.setBounds(x+3*w+2*l+50,y,l,b);
            l03.setBounds(x+3*w+3*l+70,y,w,h);
            t4.setBounds(x+4*w+3*l+70,y,l,b);
            y=y+h;
			
            l10.setBounds(x,y,w,h);
            t5.setBounds(x+w,y,l,b);
            l11.setBounds(x+w+l+30,y,w,h);
            t6.setBounds(x+2*w+l+30,y,l,b);
            l12.setBounds(x+2*w+2*l+50,y,w,h);
            t7.setBounds(x+3*w+2*l+50,y,l,b);
            l13.setBounds(x+3*w+3*l+70,y,w,h);
            t8.setBounds(x+4*w+3*l+70,y,l,b);
            y=y+h;
			
            l20.setBounds(x,y,w,h);
            t9.setBounds(x+w,y,l,b);
            l21.setBounds(x+w+l+30,y,w,h);
            t10.setBounds(x+2*w+l+30,y,l,b);
            l22.setBounds(x+2*w+2*l+50,y,w,h);
            t11.setBounds(x+3*w+2*l+50,y,l,b);
            l23.setBounds(x+3*w+3*l+70,y,w,h);
            t12.setBounds(x+4*w+3*l+70,y,l,b);
            y=y+h;
			
            l30.setBounds(x,y,w,h);
            t13.setBounds(x+w,y,l,b);
            l31.setBounds(x+w+l+30,y,w,h);
            t14.setBounds(x+2*w+l+30,y,l,b);
            l32.setBounds(x+2*w+2*l+50,y,w,h);
            t15.setBounds(x+3*w+2*l+50,y,l,b);
            l33.setBounds(x+3*w+3*l+70,y,w,h);
            t16.setBounds(x+4*w+3*l+70,y,l,b);
            y=y+h;
			
            y=y+2*h;
            b5.setBounds(x,y,l,b);
            l3.setBounds(x+3*w+10,y,l-10,h);
            res.setBounds(x+3*w+l-10,y,l,b);
            y=y+1*h;
			
            home.setBounds(x,y,l,b);
            
            bClear.setBounds(x+3*w+l-10,y,l, b);
            y=y+2*h;
        }
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void bCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == bClose ) {
            
            dispose();
        }
    }//GEN-LAST:event_bCloseActionPerformed

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
            java.util.logging.Logger.getLogger(Determ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Determ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Determ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Determ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Determ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bClose;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
