import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BilingWarnet extends JFrame
{
    JLabel lblbiling=new JLabel("WARNET ANTOLINE");
    JLabel lblnama=new JLabel("Nama");
 JTextField txnama=new JTextField(100);
 JLabel lblpaket=new JLabel("Paket");
 String[] pilihpaket={"pilih paket","Malam","Siang","Pagi"};
 JComboBox cbpaket=new JComboBox(pilihpaket);
 JLabel lbljam=new JLabel("Jam");
 JRadioButton JamFull=new JRadioButton("Full");
 JRadioButton JamTidakFull=new JRadioButton("No FUll");
 JButton tblOke=new JButton("Oke");
 JButton tblExit=new JButton("Exit");

 JButton tolin=new JButton("Cetak");
 JTextArea hasil=new JTextArea();
 
 
 BilingWarnet()
 {
 setTitle("Pilih Biling");
 
 setLocation(300,100);
 setSize(400,350);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
     void Biling()
 {
 getContentPane().setLayout(null);
 
 getContentPane().add(lblbiling);
 lblbiling.setBounds(100,10,200,20);
 getContentPane().add(lblnama);
 lblnama.setBounds(10,30,200,20);
 getContentPane().add(txnama);
 txnama.setBounds(150,30,100,20);
 getContentPane().add(lblpaket);
 lblpaket.setBounds(10,60,100,20);
 getContentPane().add(cbpaket);
 cbpaket.setBounds(150,60,100,20);
 getContentPane().add(lbljam);
 lbljam.setBounds(10,90,200,20);
 getContentPane().add(JamFull);
 JamFull.setBounds(75,90,100,20);
 getContentPane().add(JamTidakFull);
 JamTidakFull.setBounds(200,90,100,20);
 getContentPane().add(tblOke);
 tblOke.setBounds(100,150,95,20);
 getContentPane().add(tblExit);
 tblExit.setBounds(200,150,95,20);

 getContentPane().add(tolin);
 tolin.setBounds(180,180,95,20);
 getContentPane().add(hasil); 
 hasil.setBounds(10,210,270,150);
  
 setVisible(true);
 
 }
         void AksiReaksi()
{

  tolin.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
       {
       hasil.append(txnama.getText()+"\n");
       if(JamFull.isSelected()==true)
           {
               hasil.append(JamFull.getText()+"\n");
           }
           else
           {
               hasil.append(JamTidakFull.getText()+"\n");
           }
           { String pilihkode = (String)
                   cbpaket.getSelectedItem();
           hasil.append(pilihkode+"\n");
           }
       }
  
  });

}
     
      public static void main(String args[]){
 BilingWarnet bl=new BilingWarnet();
 bl.Biling();
  bl.AksiReaksi();
      } 
}
