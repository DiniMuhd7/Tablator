/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeez.deenyzard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author shamsadam
 */
public class Linear extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Linear
     */
    
    
    JLabel xx=new JLabel("X = ");
    JLabel yy=new JLabel("Y = ");
    JLabel ww=new JLabel("W = ");
    JLabel zz=new JLabel("Z = ");
    JLabel xx1=new JLabel("*X");
    JLabel yy1=new JLabel("*Y");
    JLabel zz1=new JLabel("*Z");
    JLabel ww1=new JLabel("*W");
    JLabel xx2=new JLabel("*X");
    JLabel yy2=new JLabel("*Y");
    JLabel zz2=new JLabel("*Z");
    JLabel ww2=new JLabel("*W");
    JLabel xx3=new JLabel("*X");
    JLabel yy3=new JLabel("*Y");
    JLabel zz3=new JLabel("*Z");
    JLabel ww3=new JLabel("*W");
    JLabel xx4=new JLabel("*X");
    JLabel yy4=new JLabel("*Y");
    JLabel zz4=new JLabel("*Z");
    JLabel ww4=new JLabel("*W");
    JLabel l4=new JLabel("=");
    JLabel l5=new JLabel("=");
    JLabel l6=new JLabel("=");
    JLabel l7=new JLabel("=");
    JLabel l8=new JLabel("+");
    JLabel l9=new JLabel("+");
    JLabel l10=new JLabel("+");
    JLabel l11=new JLabel("+");
    JLabel l12=new JLabel("+");
    JLabel l13=new JLabel("+");
    JLabel l14=new JLabel("+");
    JLabel l15=new JLabel("+");
    JLabel l16=new JLabel("+");
    JLabel l17=new JLabel("+");
    JLabel l18=new JLabel("+");
    JLabel l19=new JLabel("+");
    JLabel l20=new JLabel("+");
    
    
    JLabel l3=new JLabel("Enter the coefficients of the variables:");
	
    JButton home=new JButton("Home");
    JButton b1=new JButton("Solve");
    JButton b2=new JButton("Solve");
    JButton bClear = new JButton("Clear");
    
    
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
    JTextField tx=new JTextField("",100);
    JTextField ty=new JTextField("",100);
    JTextField tz=new JTextField("",100);
    JTextField tw=new JTextField("",100);
    JTextField ex = new JTextField("",100);
        
    //int w=20,h=40,l=100,b=40;
    int w=100,h=50,l=120,b=40;
    
        
    public Linear() {
        
        super("Linear Equations");
        initComponents();
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        home.addActionListener(this);
        bClear.addActionListener(this);
        
        tx.setForeground(Color.RED);
        ty.setForeground(Color.RED);
        tz.setForeground(Color.RED);
        
        tx.setEditable(false);
        ty.setEditable(false);
        tz.setEditable(false);
        
        validate();
        
    }
    
    
    
    public void actionPerformed(ActionEvent ae ) {
        
        if ( ae.getSource() == b1 ) {
            
           try  {
			
                float a[][]=new float[2][2];
		float b[][]=new float[2][2];
		float d[][]=new float[2][2];
		String tt1=t1.getText();
		String tt2=t2.getText();
		String tt3=t3.getText();
		String tt4=t4.getText();
		String tt5=t5.getText();
		String tt6=t6.getText();
		Float f1=new Float(tt1);
		Float f2=new Float(tt2);
		Float f3=new Float(tt3);
		Float f4=new Float(tt4);
		Float f5=new Float(tt5);
		Float f6=new Float(tt6);
			
		a[0][0]=f2.floatValue();
		a[0][1]=f3.floatValue();
		a[1][0]=f5.floatValue();
		a[1][1]=f6.floatValue();
			
		b[0][0]=f1.floatValue();
		b[0][1]=f3.floatValue();
		b[1][0]=f4.floatValue();
		b[1][1]=f6.floatValue();
			
		d[0][0]=f1.floatValue();
		d[0][1]=f2.floatValue();
		d[1][0]=f4.floatValue();
		d[1][1]=f5.floatValue();
                
		float x=-1*det(a[0][0],a[0][1],a[1][0],a[1][1])/det(d[0][0],d[0][1],d[1][0],d[1][1]);
		float y=det(b[0][0],b[0][1],b[1][0],b[1][1])/det(d[0][0],d[0][1],d[1][0],d[1][1]);
		
                tx.setText(""+x);
		ty.setText(""+y);
			
           }    catch(Exception e){
                
                tx.setText("Error");
			
                ty.setText("Error");
			
           } 
        }
        
        else if ( ae.getSource() == b2 ) {
            
           try  {
			
                float a[][]=new float[3][3];
                float b[][]=new float[3][3];
		float c[][]=new float[3][3];
		float d[][]=new float[3][3];
                
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
                String ttex=ex.getText();
                String tt14 = t14.getText();
                String tt15 = t15.getText();
                String tt16 = t16.getText();
                
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
                Float f13=new Float(ttex);
                Float f14 =new Float(tt14);
                Float f15=new Float(tt15);
                Float f16=new Float(tt16);
			
		a[0][0]=f4.floatValue();
		a[0][1]=f2.floatValue();
		a[0][2]=f3.floatValue();
		a[1][0]=f8.floatValue();
		a[1][1]=f6.floatValue();
		a[1][2]=f7.floatValue();
		a[2][0]=f12.floatValue();
		a[2][1]=f10.floatValue();
		a[2][2]=f11.floatValue();
                a[2][2]=f13.floatValue();
                
			
		b[0][0]=f1.floatValue();
		b[0][1]=f4.floatValue();
		b[0][2]=f3.floatValue();
		b[1][0]=f5.floatValue();
		b[1][1]=f8.floatValue();
		b[1][2]=f7.floatValue();
		b[2][0]=f9.floatValue();
		b[2][1]=f12.floatValue();
		b[2][2]=f11.floatValue();
			
		c[0][0]=f1.floatValue();
		c[0][1]=f2.floatValue();
		c[0][2]=f4.floatValue();
		c[1][0]=f5.floatValue();
		c[1][1]=f6.floatValue();
		c[1][2]=f8.floatValue();
		c[2][0]=f9.floatValue();
		c[2][1]=f10.floatValue();
		c[2][2]=f12.floatValue();
			
		d[0][0]=f1.floatValue();
		d[0][1]=f2.floatValue();
		d[0][2]=f3.floatValue();
		d[1][0]=f5.floatValue();
		d[1][1]=f6.floatValue();
		d[1][2]=f7.floatValue();
		d[2][0]=f9.floatValue();
		d[2][1]=f10.floatValue();
		d[2][2]=f11.floatValue();
			
		float x=det(a[0][0],a[0][1],a[0][2],a[1][0],a[1][1],a[1][2],a[2][0],a[2][1],a[2][2])/det(d[0][0],d[0][1],d[0][2],d[1][0],d[1][1],d[1][2],d[2][0],d[2][1],d[2][2]);
		float y=det(b[0][0],b[0][1],b[0][2],b[1][0],b[1][1],b[1][2],b[2][0],b[2][1],b[2][2])/det(d[0][0],d[0][1],d[0][2],d[1][0],d[1][1],d[1][2],d[2][0],d[2][1],d[2][2]);
		float z=det(c[0][0],c[0][1],c[0][2],c[1][0],c[1][1],c[1][2],c[2][0],c[2][1],c[2][2])/det(d[0][0],d[0][1],d[0][2],d[1][0],d[1][1],d[1][2],d[2][0],d[2][1],d[2][2]);
			
                tx.setText(""+x);
		ty.setText(""+y);
		tz.setText(""+z);
			
           }catch(Exception e){
				
               tx.setText("Invalid elements");
               ty.setText("Invalid elements");
               tz.setText("Invalid elements");
			
           } 
            
        }
        
        else if ( ae.getSource() == home ) {
            
            setVisible(false);
            new Linear().setVisible(true);
            
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
            tx.setText("");
            ty.setText("");
            tz.setText("");
            tw.setText("");
            ex.setText("");
        }
    }
    
    
    float det(float a, float b, float c, float d){
		
        return (a*d-c*b);
	
    }
    
    float det(float a, float b, float c,float d, float e, float f, float g, float h, float i){
		
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
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

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
            .addGap(0, 75, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("SIMULTANEOUS LINEAR EQUATIONS");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("ENTER THE NUMBER OF VARIABLES :");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("2 Variables Equation");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("3 Variables Equation");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
                .addContainerGap(335, Short.MAX_VALUE))
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
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addComponent(jRadioButton1)
                .addGap(45, 45, 45)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
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
            
            //l1.setVisible(false);
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            setSize(850,650);
            
            jPanel1.add(l3);
            jPanel1.add(l4);
            jPanel1.add(xx1);
            jPanel1.add(yy1);
            jPanel1.add(xx2);
            jPanel1.add(yy2);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(t5);
            jPanel1.add(t6);
            jPanel1.add(l5);
            jPanel1.add(l8);
            jPanel1.add(l9);
            jPanel1.add(tx);
            jPanel1.add(ty);
            jPanel1.add(xx);
            jPanel1.add(yy);
            jPanel1.add(home);
            jPanel1.add(b1);
            jPanel1.add(bClear);
                    
                    
            int x = 30, y = 130;
			
            l3.setBounds(x,y,4*l,b);
            y=y+h+10;
            
            t1.setBounds(x,y,l,b);x+=l;
            xx1.setBounds(x,y,w,h);x+=w+10;
            l8.setBounds(x,y,w,h);x+=w;
            t2.setBounds(x,y,l,b);x+=l;
            yy1.setBounds(x,y,w,b);x+=w+10;
            l4.setBounds(x,y,w,h);x+=w;
            t3.setBounds(x,y,l,b);			
            y=y+h+10;
            x=30;
			
            t4.setBounds(x,y,l,b);x+=l;
            xx2.setBounds(x,y,w,h);x+=w+10;
            l9.setBounds(x,y,w,h);x+=w;
            t5.setBounds(x,y,l,b);x+=l;
            yy2.setBounds(x,y,w,b);x+=w+10;
            l5.setBounds(x,y,w,h);x+=w;
            t6.setBounds(x,y,l,b);			
            y=y+2*h+10;
            x=30;

            b1.setBounds(x,y,l,b); x=x+2*l; 
            xx.setBounds(x,y,w*2,h); tx.setBounds(x+2*w,y,l+w,b); y=y+h+10;
            x=30+2*l; yy.setBounds(x,y,w*2,h); ty.setBounds(x+2*w,y,l+w,b); x=30;
			
			
            home.setBounds(x,y,l,b);
            
            y=240+2*l;
            bClear.setBounds(x,y,l,b);
            
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
        
        if ( evt.getSource() == jRadioButton2 ) {
            
            JOptionPane.showMessageDialog(this, "Sorry, This feature is not available yet.");
            setVisible(false);
            new Linear().setVisible(true);
            
            /*
            jLabel2.setVisible(false);
            jRadioButton1.setVisible(false);
            jRadioButton2.setVisible(false);
            setSize(1200,700);
            
            jPanel1.add(l3);
            jPanel1.add(l4);
            jPanel1.add(xx1);
            jPanel1.add(yy1);
            jPanel1.add(zz1);
            jPanel1.add(xx2);
            jPanel1.add(yy2);
            jPanel1.add(zz2);
            jPanel1.add(xx3);
            jPanel1.add(yy3);
            jPanel1.add(zz3);
            jPanel1.add(t1);
            jPanel1.add(t2);
            jPanel1.add(t3);
            jPanel1.add(t4);
            jPanel1.add(t5);
            jPanel1.add(t6);
            jPanel1.add(t7);
            jPanel2.add(t8);
            jPanel1.add(t9);
            jPanel1.add(t10);
            jPanel1.add(t11);
            jPanel1.add(t12);
            jPanel1.add(l5);
            jPanel1.add(l6);
            jPanel1.add(l8);
            jPanel1.add(l9);
            jPanel1.add(l10);
            jPanel1.add(l11);
            jPanel1.add(l12);
            jPanel1.add(l13);
            jPanel1.add(tx);
            jPanel1.add(ty);
            jPanel1.add(tz);
            jPanel1.add(xx);
            jPanel1.add(yy);
            jPanel1.add(zz);
            jPanel1.add(home);
            jPanel1.add(b2);
            jPanel1.add(bClear);
            jPanel1.add(ex);
			
            int x = 30, y = 130;
			
            l3.setBounds(x,y,4*l,b);
            y=y+h+10;
            
            
            t1.setBounds(x,y,l,b);x+=l;
            xx1.setBounds(x,y,w,h);x+=w+10;
            l8.setBounds(x,y,w,h);x+=w;
            t2.setBounds(x,y,l,b);x+=l;
            yy1.setBounds(x,y,w,b);x+=w+10;
            l9.setBounds(x,y,w,b); x+=w;
            t3.setBounds(x,y,l,b);	x+=l;		
            zz1.setBounds(x,y,w,b); x+=w;
            l4.setBounds(x,y,w,h);x+=w;
            t4.setBounds(x,y,l,b);			
            y=y+h+10;
            x=30;
			
            t5.setBounds(x,y,l,b);x+=l;
            xx2.setBounds(x,y,w,h);x+=w+10;
            l10.setBounds(x,y,w,h);x+=w;
            t6.setBounds(x,y,l,b);x+=l;
            yy2.setBounds(x,y,w,b);x+=w+10;
            l11.setBounds(x,y,w,b); x+=w;
            t7.setBounds(x,y,l,b);	x+=l;	
            zz2.setBounds(x,y,w,b); x+=w;
            l5.setBounds(x,y,w,h);x+=w;
            t8.setBounds(x,y,l,b); 
            
            
            ex.setBounds(x,y,w+20,b);
            //x+=w;
            
            
            y=y+h+10;
            x=30;
			
            t9.setBounds(x,y,l,b);x+=l;
            xx3.setBounds(x,y,w,h);x+=w+10;
            l12.setBounds(x,y,w,h);x+=w;
            t10.setBounds(x,y,l,b);x+=l;
            yy3.setBounds(x,y,w,b);x+=w+10;
            l13.setBounds(x,y,w,b); x+=w;
            t11.setBounds(x,y,l,b);	x+=l;	
            zz3.setBounds(x,y,w,b); x+=w;
            l6.setBounds(x,y,w,h);x+=w;
            t12.setBounds(x,y,l,b);			
            y=y+h+10;
            x=30;
			
            y=y+h;
            b2.setBounds(x,y,l,b); x=x+2*l; 
            xx.setBounds(x,y,w*2,h); tx.setBounds(x+2*w,y,l+w,b); y=y+h+10;
            x=30+2*l;
			 
            yy.setBounds(x,y,w*2,h); ty.setBounds(x+2*w,y,l+w,b); x=30+2*l;y=y+h+10;
			
            zz.setBounds(x,y,w*2,h); tz.setBounds(x+2*w,y,l+w,b); x=30;
			
			
			
            home.setBounds(x,y-h,l,b);
            
            x=30;
            y=490;
            y = y + l;
            
            bClear.setBounds(x,y-h,l,b);
            
        */
            
        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        dispose();
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
            java.util.logging.Logger.getLogger(Linear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Linear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Linear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Linear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Linear().setVisible(true);
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
