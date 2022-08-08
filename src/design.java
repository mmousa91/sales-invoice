import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;
import java.awt.*;




public class design extends JFrame {

    public JTextField invoiceDate,customerName,invoicenum,invoiceTotal;
    public JLabel jinvoicenum,jcustomername,jinvoicedate,jinvoicet;

    public JMenuBar menuBar;
    public JMenu fileMenu;
    public JMenuItem loadFileItem;
    public JMenuItem saveFileItem;



    public design(){
        setTitle("Design Preview");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);



         //setting the bounds for the jFrame
        setBounds(50,50,1100,600);
       //  Border br = BorderFactory.createLineBorder(Color.DARK_GRAY);



         //creating a jPanel for the jFrame

        //create leftSide panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(20,20,500,500);
        panel.setBackground(Color.CYAN);
        add(panel);
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"invoice table",
                TitledBorder.LEFT,TitledBorder.TOP));

     // create jmenu

        menuBar = new JMenuBar();

        fileMenu = new JMenu("file");
        menuBar.add(fileMenu);
        loadFileItem = new JMenuItem("load file");
        saveFileItem = new JMenuItem("save file");
        fileMenu.add(loadFileItem);
        fileMenu.add(saveFileItem);
        setJMenuBar(menuBar);


        //create table
        String[][] rec={
                {"","","",""},
                {"","","",""}

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

        MyListener l =new MyListener();
        create.addActionListener(l);

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
        add(panel1);


       JButton save =new JButton("save");
        save.setBackground(Color.LIGHT_GRAY);
        save.setBounds(100,450,100,40);
        panel1.add(save);

        JButton cancel =new JButton("cancel");
        cancel.setBackground(Color.LIGHT_GRAY);
        cancel.setBounds(300,450,100,40);
        panel1.add(cancel);

        //invoice data
       JPanel invoiceData = new JPanel();
        invoiceData.setBounds(20,20,470,150);
        invoiceData.setBackground(Color.GREEN);
      invoiceData.setLayout(null);
        panel1.add(invoiceData);

        invoicenum = new JTextField(10);
        invoicenum.setBounds(100,10,100,20);
        invoicenum.setEditable(false);
        invoiceData.add(invoicenum);

        jinvoicenum= new JLabel("invoice num");
       jinvoicenum.setBounds(10,3,100,50);
       invoiceData.add(jinvoicenum);


        invoiceDate = new JTextField(20);
        invoiceDate.setBounds(100,40,200,20);
        invoiceData.add(invoiceDate);

        jinvoicedate = new JLabel("invoice date");
        jinvoicedate.setBounds(10,30,100,50);
        invoiceData.add(jinvoicedate);


        customerName = new JTextField(20);
        customerName.setBounds(100,70,200,20);
        invoiceData.add(customerName);

        jcustomername = new JLabel("customer name ");
        jcustomername.setBounds(10,55,100,50);
        invoiceData.add(jcustomername);

        invoiceTotal = new JTextField(10);
        invoiceTotal.setBounds(100,100,100,20);
        invoiceTotal.setEditable(false);
        invoiceData.add(invoiceTotal);

        jinvoicet= new JLabel("invoice Total");
        jinvoicet.setBounds(10,85,100,50);
        invoiceData.add(jinvoicet);


        JPanel invoiceItem = new JPanel();
        invoiceItem.setBounds(20,200,470,200);
        invoiceItem.setBackground(Color.ORANGE);
        invoiceItem.setLayout(null);
        invoiceItem.setBorder(BorderFactory.createTitledBorder("invoice item"));
        panel1.add(invoiceItem);

        String[][] rec1={
                {"1","mohamed","1000","1000","1000"},
                {"2","gogo","1000","1000","1000"}

        };
        String[] header1 ={"No","Item Name","Item Price","Count"," Item total"};
        JTable table1 = new JTable(rec1,header1);
        //table1.setBounds(10,20,400,150);
        JScrollPane sc1 = new JScrollPane(table1);
       sc1.setBounds(20,20,420,150);
        invoiceItem.add(sc1);






        //adding the panel to the container of the frame




     }



    public static void main (String[] args){

         new design().setVisible(true);
     }

}
