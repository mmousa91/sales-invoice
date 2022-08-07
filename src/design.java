import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

import static javax.swing.BorderFactory.createTitledBorder;


public class design extends JFrame {

    public JTextField invoiceDate;
    public JLabel myLbl ;

    public design(){
        JFrame frame = new JFrame();
        frame.getContentPane();
        frame.setTitle("Design Preview");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);



         //setting the bounds for the jFrame
        frame.setBounds(50,50,1100,600);
       //  Border br = BorderFactory.createLineBorder(Color.DARK_GRAY);



         //creating a jPanel for the jFrame

        //create leftSide panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(20,20,500,500);
        panel.setBackground(Color.CYAN);
        frame.add(panel);
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"invoice table",
                TitledBorder.LEFT,TitledBorder.TOP));


        //create table
        String[][] rec={
                {"1","1/1/2022","hala","5000"},
                {"2","15/1/2022","gogo","7000"}

        };
        String[] header ={"No","date","customer","total"};
        JTable table = new JTable(rec,header);
        //table.setBounds(40,50,50,300);
        JScrollPane sc = new JScrollPane(table);
        sc.setBounds(20,20,450,200);
        panel.add(sc);





        // create createButton
       JButton create =new JButton("create new invoice");
        create.setBackground(Color.LIGHT_GRAY);
        create.setBounds(70,450,150,40);
        panel.add(create);

         // create deleteButton
        JButton delete =new JButton("delete invoice");
        delete.setBackground(Color.LIGHT_GRAY);
        delete.setBounds(270,450,150,40);
        panel.add(delete);

        // create rightSide panel
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        panel1.setBackground(Color.BLUE);
        panel1.setBounds(530,20,500,500);
        panel1.setLayout(null);
        frame.add(panel1);


       JButton save =new JButton("save");
        save.setBackground(Color.LIGHT_GRAY);
        save.setBounds(100,450,100,40);
        panel1.add(save);

        JButton cancel =new JButton("cancel");
        cancel.setBackground(Color.LIGHT_GRAY);
        cancel.setBounds(300,450,100,40);
        panel1.add(cancel);

        //invoice data
     /*   JPanel invoiceData = new JPanel();
        invoiceData.setBounds(20,20,470,150);
        invoiceData.setBackground(Color.GREEN);
        invoiceData.setLayout(null);
        panel1.add(invoiceData);
*/

         invoiceDate = new JTextField("7/8/2022");
         myLbl = new JLabel("invoice Date");
       invoiceDate.setBounds(40,10,100,50);
       myLbl.setLocation(20,10);
       panel1.add(invoiceDate,myLbl);
        //panel1.add(invoiceDate,BorderLayout.WEST);
        //panel1.add(myLbl,BorderLayout.CENTER);




        //adding the panel to the container of the frame



         frame.setVisible(true);
     }



    public static void main (String[] args){

         new design();
     }

}
