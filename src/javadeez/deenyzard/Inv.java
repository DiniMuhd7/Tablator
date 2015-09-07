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
public class Inv extends javax.swing.JFrame implements ActionListener {

    
    // Setting up nested labels 
    JLabel l2=new JLabel("Enter the elements of the Matrix:");
    JLabel l3=new JLabel("Inverse of the Matrix:");
    
    JLabel l00=new JLabel("A [0][0]:");
    JLabel l01=new JLabel("A [0][1]:");
    JLabel l02=new JLabel("A [0][2]:");
	
    JLabel l10=new JLabel("A [1][0]:");
    JLabel l11=new JLabel("A [1][1]:");
    JLabel l12=new JLabel("A [1][2]:");
	
    JLabel l20=new JLabel("A [2][0]:");
    JLabel l21=new JLabel("A [2][1]:");
    JLabel l22=new JLabel("A [2][2]:");
	
    JLabel i00=new JLabel("I [0][0]:");
    JLabel i01=new JLabel("I [0][1]:");
    JLabel i02=new JLabel("I [0][2]:");
	
    JLabel i10=new JLabel("I [1][0]:");
    JLabel i11=new JLabel("I [1][1]:");
    JLabel i12=new JLabel("I [1][2]:");
	
    JLabel i20=new JLabel("I [2][0]:");
    JLabel i21=new JLabel("I [2][1]:");
    JLabel i22=new JLabel("I [2][2]:");
    
    
    // Setting up nested textfields
    JTextField t1=new JTextField("",100);
    JTextField t2=new JTextField("",100);
    JTextField t3=new JTextField("",100);
    JTextField t4=new JTextField("",100);
    JTextField t5=new JTextField("",100);
    JTextField t6=new JTextField("",100);
    JTextField t7=new JTextField("",100);
    JTextField t8=new JTextField("",100);
    JTextField t9=new JTextField("",100);
	
    JTextField i1=new JTextField("",100);
    JTextField i2=new JTextField("",100);
    JTextField i3=new JTextField("",100);
    JTextField i4=new JTextField("",100);
    JTextField i5=new JTextField("",100);
    JTextField i6=new JTextField("",100);
    JTextField i7=new JTextField("",100);
    JTextField i8=new JTextField("",100);
    JTextField i9=new JTextField("",100);
        
        
    JButton b3=new JButton("Calculate");
    JButton b4=new JButton("Calculate");
    JButton home=new JButton("Home");
    JButton bClear = new JButton("Clear");
	
    static int d=0;
    //int w=60,h=40,l=120,b=40;
    int w=100, h=50, l=120, b=40;
        
    
    /**
     * Creates new form Inv
     */
    public Inv() {
        
        super("Inverse of a Matrix");
        initComponents();
        
        i1.setEditable(false);
	i2.setEditable(false);
	i3.setEditable(false);
	i4.setEditable(false);
	i5.setEditable(false);
	i6.setEditable(false);
	i7.setEditable(false);
	i8.setEditable(false);
	i9.setEditable(false);
        
        i1.setForeground(Color.RED);
        i2.setForeground(Color.RED);
        i3.setForeground(Color.RED);
        i4.setForeground(Color.RED);
            
            
        i5.setForeground(Color.RED);
        i6.setForeground(Color.RED);
        i7.setForeground(Color.RED);
        i8.setForeground(Color.RED);
        i9.setForeground(Color.RED);
        
        bClear.addActionListener(this);
        home.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent ae ) {
        
        if ( ae.getSource() == bClear ) {
            
            
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            
            
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            
            
            i1.setText("");
            i2.setText("");
            i3.setText("");
            i4.setText("");
            
            
            i5.setText("");
            i6.setText("");
            i7.setText("");
            i8.setText("");
            i9.setText("");
            
        }
        
        else if ( ae.getSource() == b3 ) {
            
           try  {
			
                float a[][]=new float[2][2];
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		Float f1=new Float(s1);
		Float f2=new Float(s2);
		Float f3=new Float(s3);
		Float f4=new Float(s4);
			
		a[0][0]=f1.floatValue();
		a[0][1]=f2.floatValue();
		a[1][0]=f3.floatValue();
		a[1][1]=f4.floatValue();
		float d=det(a[0][0],a[0][1],a[1][0],a[1][1]);
		System.out.println(d);
		a[0][0]=a[0][0]/d;
		a[1][0]=a[1][0]/d;
		a[0][1]=a[0][1]/d;
		a[1][1]=a[1][1]/d;
			
			
		i1.setText(""+a[1][1]); 
		i2.setText(""+-1*a[0][1]);
		i3.setText(""+-1*a[1][0]);
		i4.setText(""+a[0][0]);		
			
           } catch(Exception e) {
				
                i1.setText("Error"); 
                i2.setText("Error");
		i3.setText("Error");
		i4.setText("Error");		
			
           } 
            
        }
        
        else if ( ae.getSource() == b4 ) {
            
           try  {
			
                float a[][]=new float[3][3];
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
		String s6=t6.getText();
		String s7=t7.getText();
		String s8=t8.getText();
		String s9=t9.getText();
			
		Float f1=new Float(s1);
		Float f2=new Float(s2);
		Float f3=new Float(s3);
		Float f4=new Float(s4);
		Float f5=new Float(s5);
		Float f6=new Float(s6);
		Float f7=new Float(s7);
		Float f8=new Float(s8);
		Float f9=new Float(s9);
			
		a[0][0]=f1.floatValue();
		a[0][1]=f2.floatValue();
		a[0][2]=f3.floatValue();
		a[1][0]=f4.floatValue();
		a[1][1]=f5.floatValue();
		a[1][2]=f6.floatValue();
		a[2][0]=f7.floatValue();
		a[2][1]=f8.floatValue();
		a[2][2]=f9.floatValue();

		float d=det(a[0][0],a[0][1],a[0][2],a[1][0],a[1][1],a[1][2],a[2][0],a[2][1],a[2][2]);
		float ii[][]=new float[3][3];
		System.out.println(d);
		ii[0][0]=det(a[1][1],a[1][2],a[2][1],a[2][2])/d;
		ii[0][1]=-1*det(a[1][0],a[1][2],a[2][0],a[2][2])/d;
		ii[0][2]=det(a[1][0],a[1][1],a[2][0],a[2][1])/d;
		ii[1][0]=-1*det(a[0][1],a[2][1],a[0][2],a[2][2])/d;
		ii[1][1]=det(a[0][0],a[0][2],a[2][0],a[2][2])/d;
		ii[1][2]=-1*det(a[0][0],a[0][1],a[2][0],a[2][1])/d;
		ii[2][0]=det(a[0][1],a[0][2],a[1][1],a[1][2])/d;
		ii[2][1]=-1*det(a[0][0],a[0][2],a[1][0],a[1][2])/d;
		ii[2][2]=det(a[0][0],a[0][1],a[1][0],a[1][1])/d;			
			
		i1.setText(""+ii[0][0]); 
		i2.setText(""+ii[1][0]);
		i3.setText(""+ii[2][0]);
		i4.setText(""+ii[0][1]);
		i5.setText(""+ii[1][1]);
		i6.setText(""+ii[2][1]);		
		i7.setText(""+ii[0][2]);
		i8.setText(""+ii[1][2]);
		i9.setText(""+ii[2][2]);		
			
			
           }    catch(Exception e)  {
               
		i1.setText("Error"); 
		i2.setText("Error");
		i3.setText("Error");
		i4.setText("Error");		
		i5.setText("Error"); 
		i6.setText("Error");
		i7.setText("Error");
		i8.setText("Error");
		i9.setText("Error");
			
           }
		 
            
        }
        
        else if ( ae.getSource() == home ) {
            
            setVisible(false);
            new Inv().setVisible(true);
            
        }
        
    }
    
    
    
    float det(float a, float b, float c, float d)   {
		
        return (a*d-c*b);
	
    }

    float det(float a, float b, float c,float d, float e, float f, float g, float h, float i)   {
		
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("CALCULATE INVERSE OF A SQUARE");

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

        jPanel3.setBackground(new java.awt.Color(0, 204, 51));

        jLabel3.setFont(new java.awt.Font("Georgia", 2, 13)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(19, 19, 19))
        );

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(jRadioButton2))))
                .addContainerGap(350, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jRadioButton1)
                .addGap(45, 45, 45)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
           
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            setSize(650,650);
            
            jPanel1.add(l00);
            jPanel1.add(l01);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(i00);
            jPanel1.add(i01);
            jPanel1.add(i10);
            jPanel1.add(i11);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(i1);
            jPanel1.add(i2);
            jPanel1.add(i3);
            jPanel1.add(i4);
            jPanel1.add(b3);
			
            jPanel1.add(l2);
            jPanel1.add(l3);
            jPanel1.add(home);
            jPanel1.add(bClear);
            
            
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
		
            y=y+2*h;
			
            l3.setBounds(x,y,2*l,b);
            y+=h;
            i00.setBounds(x,y,w,h);
            i1.setBounds(x+w,y,l,b);
            i01.setBounds(x+w+l+30,y,w,h);
            i2.setBounds(x+2*w+l+30,y,l,b);
            y=y+h;
            i10.setBounds(x,y,w,h);
            i3.setBounds(x+w,y,l,b);
            i11.setBounds(x+w+l+30,y,w,h);
            i4.setBounds(x+2*w+l+30,y,l,b);
			
            y=y+2*h;
			
            b3.setBounds(x,y,l,b);
            home.setBounds(x+l+20,y,l,b);
            
            bClear.setBounds(x+l+160,y,l,b);
            
            
            
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
        
        if ( evt.getSource() == jRadioButton2 ) {
            
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            setSize(765,750);
            
            
            jPanel1.add(l00);
            jPanel1.add(l01);
			
            jPanel1.add(l02);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(l12);
            jPanel1.add(l20);
            jPanel1.add(l21);
            jPanel1.add(l22);
            jPanel1.add(i00);
            jPanel1.add(i01);
            jPanel1.add(i02);
            jPanel1.add(i10);
            jPanel1.add(i11);
            jPanel1.add(i12);
            jPanel1.add(i20);
            jPanel1.add(i21);
            jPanel1.add(i22);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(t5);
            jPanel1.add(t6);
            jPanel1.add(t7);
            jPanel1.add(t8);
            jPanel1.add(t9);
            jPanel1.add(i1);
            jPanel1.add(i2);
            jPanel1.add(i3);
            jPanel1.add(i4);
            jPanel1.add(i5);
            jPanel1.add(i6);
            jPanel1.add(i7);
            jPanel1.add(i8);
            jPanel1.add(i9);
            jPanel1.add(b4);
			
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
            l02.setBounds(x+2*w+2*l+60,y,w,h);
            t3.setBounds(x+3*w+2*l+60,y,l,b);
            y=y+h;
			
            l10.setBounds(x,y,w,h);
            t4.setBounds(x+w,y,l,b);
            l11.setBounds(x+w+l+30,y,w,h);
            t5.setBounds(x+2*w+l+30,y,l,b);
            l12.setBounds(x+2*w+2*l+60,y,w,h);
            t6.setBounds(x+3*w+2*l+60,y,l,b);
            y=y+h;
			
            l20.setBounds(x,y,w,h);
            t7.setBounds(x+w,y,l,b);
            l21.setBounds(x+w+l+30,y,w,h);
            t8.setBounds(x+2*w+l+30,y,l,b);
            l22.setBounds(x+2*w+2*l+60,y,w,h);
            t9.setBounds(x+3*w+2*l+60,y,l,b);
            y=y+2*h;
			
            l3.setBounds(x,y,2*l,b);
            y=y+h;
            i00.setBounds(x,y,w,h);
            i1.setBounds(x+w,y,l,b);
            i01.setBounds(x+w+l+30,y,w,h);
            i2.setBounds(x+2*w+l+30,y,l,b);
            i02.setBounds(x+2*w+2*l+60,y,w,h);
            i3.setBounds(x+3*w+2*l+60,y,l,b);
            y=y+h;
			
            i10.setBounds(x,y,w,h);
            i4.setBounds(x+w,y,l,b);
            i11.setBounds(x+w+l+30,y,w,h);
            i5.setBounds(x+2*w+l+30,y,l,b);
            i12.setBounds(x+2*w+2*l+60,y,w,h);
            i6.setBounds(x+3*w+2*l+60,y,l,b);
            y=y+h;
			
            i20.setBounds(x,y,w,h);
            i7.setBounds(x+w,y,l,b);
            i21.setBounds(x+w+l+30,y,w,h);
            i8.setBounds(x+2*w+l+30,y,l,b);
            i22.setBounds(x+2*w+2*l+60,y,w,h);
            i9.setBounds(x+3*w+2*l+60,y,l,b);
			
            y=y+2*h;
            b4.setBounds(x,y,l,b);
            home.setBounds(x+l+20,y,l,b);
            
            bClear.setBounds(x+l+165,y,l,b);
            
          
            
            
          
            
            
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton1 ) {
            
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
