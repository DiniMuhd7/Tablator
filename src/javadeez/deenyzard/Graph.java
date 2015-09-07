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
import java.awt.Graphics.*;

/**
 *
 * @author shamsadam
 */
public class Graph extends javax.swing.JFrame {

    // Declaring standalone variables
    static int xy=1;
    Stack str=new Stack(100);
    String ori=new String();
    Stack stry=new Stack(100);
    String oriy=new String();
    int size,x=0,y=0;
    static int con=1;
    
    static float sc = 50;
    static double r = 0.1;
    
    public static final int GRAPH_WIDTH = 1300;
    public static final int GRAPH_HEIGHT = 900;
	
    //public static final Color LINE_COLOR = Color.BLACK;
    //public static final Color CANVAS_BACKGROUND = Color.CYAN;
	
	
    private int x1 = GRAPH_WIDTH / 2;
    private int y1 = GRAPH_HEIGHT / 8;
    private int x2 = x1;
    private int y2 = GRAPH_HEIGHT / 8 * 7;
   
    private DrawGraph GraphPane;
    
    /**
     * Creates new form Graph
     */
    public Graph() {
        super("Smart Graph");
        initComponents();
        
        setBackground(Color.WHITE);
        size = 802;
        setSize(size+540,size+20);
        //setVisible(true);
        //setLayout(null);
	//setSize(size+270,size+10);
        
        //jPanel3.setBounds(5, 66, 100, 100);
       // jPanel3.setVisible(true);
             
     /*
        JPanel Pane = new JPanel(new GridLayout());
        Pane.setBackground(Color.BLUE);
        JLabel jLabel1 = new JLabel("Coordinates");
        Pane.add(jLabel1);
        JLabel jLabel2 = new JLabel("Scale");
        Pane.add(jLabel2);
        JLabel jLabel3 = new JLabel("New Curve X");
        Pane.add(jLabel3);
        JLabel jLabel4 = new JLabel("New Curve Y");
        Pane.add(jLabel4);
        JLabel jLabel5 = new JLabel ("Parametric");
        Pane.add(jLabel5);
       */
        
        //JTextField jTextField1 = new JTextField("");
        //Pane.add(jTextField1);
       // jTextField1.setBounds(400, 200, 300, 300);
       // jTextField1.setSize(new Dimension(GRAPH_WIDTH, GRAPH_HEIGHT));
        
        //JTextField jTextField2 = new JTextField("");
        //Pane.add(jTextField2);
        //JTextField jTextField3 = new JTextField("");
        //Pane.add(jTextField3);
        //JTextField jTextField4 = new JTextField("");
        //Pane.add(jTextField4);
        //JTextField jTextField5 = new JTextField("");
       // Pane.add(jTextField5);
        //JTextField jTextField6 = new JTextField("");
       // Pane.add(jTextField6);
        
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        
        jTextField1.setFont( new Font("Gurmukhi MN", 0, 15));
        jTextField2.setFont( new Font("Gurmukhi MN", 0, 15));
        jTextField3.setFont( new Font("Gurmukhi MN", 0, 15));
        jTextField4.setFont( new Font("Gurmukhi MN", 0, 15));
        jTextField5.setFont( new Font("Gurmukhi MN", 0, 15));
        jTextField6.setFont( new Font("Gurmukhi MN", 0, 15));
        
        
        // Creating a custom object to draw graph        
        GraphPane = new DrawGraph();
        GraphPane.setPreferredSize(new Dimension(GRAPH_WIDTH, GRAPH_HEIGHT));
        
        // Create a container that will hold components
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(GraphPane, BorderLayout.CENTER);
        
        this.setPreferredSize(this.getPreferredSize());
        //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //this.setState(Frame.ICONIFIED);
        pack();
        setVisible(true);
        requestFocus();
        
        validate();
    }
    
    
    
    public class DrawGraph extends JPanel {
    
    @Override
    public void paint(Graphics g) {
        
        //g.draw3DRect(0, 0, 500, 400, true);
        g.clearRect(0,0,900,850);
	g.setClip(0,0,850,850);
	Dimension d=new Dimension();
	d=getSize();
        g.setColor(Color.BLACK);
	g.drawLine(0,size/2,size,size/2);
	g.drawLine(size/2,0,size/2,size);
        g.setColor(Color.GREEN);
        
        for(int q=50;q<size/2;q+=50){
				
            g.drawLine(size/2+q,0,size/2+q,size);
            g.drawLine(size/2-q,0,size/2-q,size);
            g.drawLine(0,size/2+q,size,size/2+q);
            g.drawLine(0,size/2-q,size,size/2-q);
	
        }
            
        g.setColor(Color.RED);
        
        int a=size/2,b=size/2,aa,bb;
	float y=0,x=0;
	float s=(float)(350/sc);
        
        
        if(ori.length()>=1||oriy.length()>=1){
		if(xy==1)
		{
                    if(con==1){
			for(x=0;x<=s;x+=r)
			{
				
                            y=eval(ori,x);
                            System.out.println(x+" "+y);
                            aa=(int)(size/2+sc*x);
                            bb=(int)(size/2-sc*y);
                            g.drawLine(a,b,(int)(aa),(int)(bb));
                            a=(int)(aa);
                            b=(int)(bb);
				
			}
				
                            a=size/2;
                            b=size/2;
				
				
                            for(x=0;x>=-s;x-=r){
				System.out.println("hello");
				y=eval(ori,x);
				System.out.println(x+"    "+y);
				g.drawLine(a,b,(int)(size/2+sc*x),(int)(size/2-(sc*y)));
				a=(int)(size/2+sc*x);
				b=(int)(size/2-(sc*y));				
                            }
                    }
				
                }
                else if (xy==2){
				if(con==1){
				for(y=0;y<=s;y+=r)
				{
				aa=(int)(size/2+sc*x);
				bb=(int)(size/2-sc*y);
				x=evaly(oriy,y);
				
				g.drawLine(a,b,aa,bb);
				a=aa;
				b=bb;
				
				}
				
				a=size/2;
				b=size/2;
				
					for(y=0;y>=-s;y-=r){
					System.out.println("hello");
					x=evaly(oriy,y);
					System.out.println(x+"    "+y);
					g.drawLine(a,b,(int)(size/2+sc*x),(int)(size/2-(sc*y)));
					a=(int)(size/2+sc*x);
					b=(int)(size/2-(sc*y));				
				}
				}
		}
                else if (xy==3){
				
				if(con==1){
					for(float t=0;t<s;t+=r){
					y=evalt(ori,t);
					x=evalt(oriy,t);
					g.drawLine((int)(size/2+sc*x),(int)(size/2-(sc*y)),(int)(size/2+sc*x),(int)(size/2-(sc*y)));
					a=size/2+(int)(sc*x);
				b=size/2-(int)(sc*y);	
					
				} 
					for(float t=0;t>-s;t-=r){
					System.out.println("hello");
					x=evalt(oriy,t);
					y=evalt(ori,t);
					
					g.drawLine((int)(size/2+sc*x),(int)(size/2-(sc*y)),(int)(size/2+sc*x),(int)(size/2-(sc*y)));
					a=size/2+(int)(sc*x);
				b=size/2-(int)(sc*y);	
				}
                                        
				
                                }
                                
                }
        }
        
        validate();
        
        
    }
    
    }
    
    
    
    float eval(String str, float d) {
	
	
	String s=new String();
	int j=0;

	
	s=str.replaceAll("x","(0"+Float.toString(d)+")");
	Stack infix=new Stack(200);
	for(int l=0;l<s.length();l++)
	{
			
		infix.push(s.charAt(l));
	}
	Stack post=new Stack(200);
	post=infix.infipost(post);
	d=(float)post.posteval();
	System.out.println(d);
	j++;
	return d;
}
    
    float evaly(String str, float d){
	
	
	String s=new String();
	int j=0;

	
	s=str.replaceAll("y","(0"+Float.toString(d)+")");
	Stack infix=new Stack(200);
	for(int l=0;l<s.length();l++)
	{
			
		infix.push(s.charAt(l));
	}
	Stack post=new Stack(200);
	post=infix.infipost(post);
	d=(float)post.posteval();
	System.out.println(d);
	j++;
	return d;
}
 
    
    float evalt(String str, float d){
	
	
	String s=new String();
	int j=0;

	
	s=str.replaceAll("t","(0"+Float.toString(d)+")");
	Stack infix=new Stack(200);
	for(int l=0;l<s.length();l++)
	{
			
		infix.push(s.charAt(l));
	}
	Stack post=new Stack(200);
	post=infix.infipost(post);
	d=(float)post.posteval();
	System.out.println(d);
	j++;
	return d;
}
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1350, 910));
        setSize(new java.awt.Dimension(800, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
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

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 900));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setText("COORDINATES :");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("ERROR MESSAGE BOX :");

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("SCALE :");

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "0 . 0 1 : 1", "0 . 0 5 : 1", "0 . 1 : 1", "0 . 5 : 1", "1 : 1", "5 : 1", "1 0 : 1", "5 0 : 1", "1 0 0 : 1", "5 0 0 : 1", "1 0 0 0 : 1", " ", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("NEW CURVE (X) :");

        jTextField3.setText("x * sinx");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("NEW CURVE (Y ) :");

        jTextField4.setText("y = 4 * 1 / 2");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Draw Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Draw Graph");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("PARAMETRIC CURVE (X) :");

        jTextField5.setText("x = sint 15 * 5");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel7.setText("PARAMETRIC CURVE (Y) :");

        jTextField6.setText("y = cost 20 * 8");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("Draw Graph");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel8.setText("GRAPH HELP :");

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setText("Guide");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField6)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 850, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        
        if ( jList1.getSelectedValue() == "0 . 0 1 : 1") {
            
            sc=(float)(50/0.01);
            r=0.00005;
        }
        else if ( jList1.getSelectedValue() == "0 . 0 5 : 1") {
            
            sc=(float)(50/0.05);
            r=0.00025;
        }
        else if ( jList1.getSelectedValue() == "0 . 1 : 1") {
            
            sc=(float)(50/0.1);
            r=0.0005;
        }
        else if ( jList1.getSelectedValue() == "0 . 5 : 1") {
            
            sc=(float)(50/0.5);
            r=0.0025;
        }
        else if ( jList1.getSelectedValue() == "1 : 1") {
            
            sc=(float)(50/1);
            r=0.005;
        }
        else if ( jList1.getSelectedValue() == "5 : 1") {
            
            sc=(float)(50/5);
            r=0.025;
        }
        else if ( jList1.getSelectedValue() == "1 0 : 1") {
            
            sc=(float)(50/10);
            r=0.05;
        }
        else if ( jList1.getSelectedValue() == "5 0 : 1") {
            
            sc=(float)(50/50);
            r=0.25;
        }
        else if ( jList1.getSelectedValue() == "1 0 0 : 1") {
            
            sc=(float)0.5;
            r=0.5;
        }
        else if ( jList1.getSelectedValue() == "5 0 0 : 1") {
            
            sc=(float)0.1;
            r=2.5;
        }
        else if ( jList1.getSelectedValue() == "1 0 0 0 : 1") {
            
            sc=(float)0.05;
            r=5;
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton5 ) {
            
            new GraphHelp().setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton1 ) {
        
            xy=1;
            Stack infix=new Stack(200);
            Stack post=new Stack(200);
            String s=new String();

            s=jTextField3.getText();
            
            if(s.length()<1)
            {
                jTextField2.setText("Insufficient Data");
                jTextField2.setForeground(Color.RED);
                JOptionPane.showMessageDialog(this, "Please Enter Value");
                con=2;
            }
            else {
                
                    con=1;
                    jTextField2.setForeground(Color.BLUE);
                    jTextField2.setText("No Errors");
                    System.out.println(str+"  ");
                    s=s.replaceAll("arcsin","%");
                    s=s.replaceAll("arccos",";");
                    s=s.replaceAll("arctan",":");
                    s=s.replaceAll("sinh","q");
                    s=s.replaceAll("cosh","w");
                    s=s.replaceAll("tanh","z");
                    s=s.replaceAll("sin","#");
                    s=s.replaceAll("cos","~");
                    s=s.replaceAll("tan","@");
                    s=s.replaceAll("log","&");

                    s=s.replaceAll("ln","`");
                    s=s.replaceAll("sqrt","n");
                    s=s.replaceAll("cbrt","o");
                    s=s.replaceAll("sqre","s");
                    s=s.replaceAll("cube","c");
                    s=s.replaceAll("e","2.718281828459045");
                    s=s.replaceAll("pi","3.141592653589793");


                    for(int i=0;i<s.length();i++)
                        infix.push(s.charAt(i));
                        post=infix.infipost(post);
			str=infix;
			ori=s;
		}
        
        }
        
        repaint();
	validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton2 ) {
            
           xy=2;
           Stack infix=new Stack(200);
           Stack post=new Stack(200);
           String s=new String();

           s=jTextField4.getText();
           
           if(s.length()<1)
           {
               
                jTextField2.setForeground(Color.RED);
                jTextField2.setText("Insufficient Data");
                JOptionPane.showMessageDialog(this, "Please Enter Value");
                con=2;
				
           }
           else {
               
		con=1;
                jTextField2.setForeground(Color.BLUE);
		jTextField2.setText("No Errors");
		System.out.println(str+"  ");
		s=s.replaceAll("arcsin","%");
		s=s.replaceAll("arccos",";");
		s=s.replaceAll("arctan",":");
		s=s.replaceAll("sinh","q");
		s=s.replaceAll("cosh","w");
		s=s.replaceAll("tanh","z");
		s=s.replaceAll("sin","#");
		s=s.replaceAll("cos","~");
		s=s.replaceAll("tan","@");
		s=s.replaceAll("log","&");

		s=s.replaceAll("ln","`");
		s=s.replaceAll("sqrt","n");
		s=s.replaceAll("cbrt","o");
		s=s.replaceAll("sqre","s");
		s=s.replaceAll("cube","c");
		s=s.replaceAll("e","2.718281828459045");
		s=s.replaceAll("pi","3.141592653589793");


		for(int i=0;i<s.length();i++)
                    infix.push(s.charAt(i));
                    post=infix.infipost(post);
                    stry=infix;
                    oriy=s;
                                
            }
                                
        }
        
        repaint();
	validate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton3 ) {
        
           
            xy=3;
            Stack infix1=new Stack(200);
            Stack post1=new Stack(200);
            Stack infix2=new Stack(200);
            Stack post2=new Stack(200);
            String s1=new String();
            String s2=new String();
            s1=jTextField5.getText();
            s2=jTextField6.getText();
            
            if(s1.length()<1||s2.length()<1)
            {
                jTextField2.setForeground(Color.RED);
                jTextField2.setText("Insufficient Data");
                JOptionPane.showMessageDialog(this, "Please Enter Value");
                con=2;
					
            }
            else {
                    con=1;
                    jTextField2.setForeground(Color.BLUE);
                    jTextField2.setText("No Errors");
                    s1=s1.replaceAll("arcsin","%");
                    s1=s1.replaceAll("arccos",";");
                    s1=s1.replaceAll("arctan",":");
                    s1=s1.replaceAll("sinh","q");
                    s1=s1.replaceAll("cosh","w");
                    s1=s1.replaceAll("tanh","z");
                    s1=s1.replaceAll("sin","#");
                    s1=s1.replaceAll("cos","~");
                    s1=s1.replaceAll("tan","@");
                    s1=s1.replaceAll("log","&");

                    s1=s1.replaceAll("ln","`");
                    s1=s1.replaceAll("sqrt","n");
                    s1=s1.replaceAll("cbrt","o");
                    s1=s1.replaceAll("sqre","s");
                    s1=s1.replaceAll("cube","c");
                    s1=s1.replaceAll("e","2.718281828459045");
                    s1=s1.replaceAll("pi","3.141592653589793");
				
				
                    s2=s2.replaceAll("arcsin","%");
                    s2=s2.replaceAll("arccos",";");
                    s2=s2.replaceAll("arctan",":");
                    s1=s1.replaceAll("sinh","q");
                    s1=s1.replaceAll("cosh","w");
                    s1=s1.replaceAll("tanh","z");
                    s2=s2.replaceAll("sin","#");
                    s2=s2.replaceAll("cos","~");
                    s2=s2.replaceAll("tan","@");
                    s2=s2.replaceAll("log","&");

                    s2=s2.replaceAll("ln","`");
                    s2=s2.replaceAll("sqrt","n");
                    s2=s2.replaceAll("cbrt","o");
                    s2=s2.replaceAll("sqre","s");
                    s2=s2.replaceAll("cube","c");
                    s2=s2.replaceAll("e","2.718281828459045");
                    s2=s2.replaceAll("pi","3.141592653589793");
				
                    for(int i=0;i<s1.length();i++)
                        infix1.push(s1.charAt(i));
                        post1=infix1.infipost(post1);
                        
			for(int i=0;i<s2.length();i++)
                            infix2.push(s2.charAt(i));
                            post2=infix2.infipost(post2);
                            str=infix1;
                            stry=infix2;
                            ori=s1;
                            oriy=s2;
				
            }
		
        }
         
        repaint();
	validate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
        float x= evt.getX();
	float y= evt.getY();
        
	if( x >850|| y >850)
            
            jTextField1.setText("Out of Bounds");
        
        else {
            x=(x-350)/sc;
            y=(350-y)/sc;
            jTextField1.setText(x+" : "+y);
            
        }
    }//GEN-LAST:event_formMouseMoved

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jTextField3 ) {
            
            // DO NOTHING 
        }
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jTextField4 ) {
            
            // DO NOTHING 
        }
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jTextField5 ) {
            
            // DO NOTHING
        }
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jTextField6 ) {
            
           // DO NOTHING
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton4 ) {
            
            this.setState(ICONIFIED);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        if ( evt.getSource() == jButton6 ) {
            
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
        }
    }//GEN-LAST:event_jButton6ActionPerformed
/**/
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
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
