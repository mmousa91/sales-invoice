import javax.swing.*;
import java.awt.*;

public class design extends JFrame {

    public design(){
         setTitle("Design Preview");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);


         //setting the bounds for the jframe
        setBounds(100,100,1050,600);
       //  Border br = BorderFactory.createLineBorder(Color.DARK_GRAY);
         Container c = getContentPane();

         //creating a jpanel for the jframe

         JButton create =new JButton("create new invoice");
         create.setLayout(new FlowLayout());
         create.setBackground(Color.LIGHT_GRAY);
         create.setBounds(20,500,150,50);

         JButton delete =new JButton("delete invoice");
         delete.setLayout(new FlowLayout());
         delete.setBackground(Color.LIGHT_GRAY);
         delete.setBounds(180,500,150,50);

         JButton save =new JButton("save");
         save.setLayout(new FlowLayout());
         save.setBackground(Color.LIGHT_GRAY);
         save.setBounds(700,500,100,50);

         JButton cancel =new JButton("cancel");
         cancel.setLayout(new FlowLayout());
         cancel.setBackground(Color.LIGHT_GRAY);
         cancel.setBounds(850,500,100,50);

        //create table
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"invoice table"));

        String[][] rec={
                {"1","1/1/2022","hala","5000"},
                {"2","15/1/2022","gogo","7000"}

        };
        String[] header ={"No","date","customer","total"};
        JTable table = new JTable(rec,header);
        panel.add(new JScrollPane(table));
        panel.setBounds(30,50,500,200);

         //adding the panel to the container of the frame
         c.add(create);
         c.add(delete);
         c.add(save);
         c.add(cancel);
         c.add(panel);


         setVisible(true);
     }

     public static void main (String[] args){

         new design();
     }

}
