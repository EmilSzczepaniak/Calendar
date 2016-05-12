import javafx.scene.control.*;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Emil on 12.05.2016.
 */
public class GUI extends JFrame implements ActionListener {
    private JLabel lblCalendar;
    private JButton btnAdd, btnDelete,btnDataPicker,btnTimePicker,btnExit;
    private JTextArea taEvent;
    private JTextField tfDatePicker,tfTimePicker;
    private JTable tblDbDate;
    private JMenuBar menuBar;


   public GUI(){
       super("Calendar");
       setSize(600,400);
       setLayout(null);

       btnAdd = new JButton("Dodaj zdarzenie");
       btnAdd.setBounds(60,320,140,20);
       add(btnAdd);

       btnDelete = new JButton("Usuń zdarzenie");
       btnDelete.setBounds(260,320,140,20);
       add(btnDelete);

       taEvent = new JTextArea("Opis zdarzenia");
       taEvent.setBounds(30,100,200,200);
       add(taEvent);
       taEvent.setVisible(true);

       tfDatePicker = new JTextField("Miejsce na datę");
       tfDatePicker.setBounds(30,30, 100, 20);
       add(tfDatePicker);
       tfDatePicker.setVisible(true);

       btnDataPicker = new JButton("...");
       btnDataPicker.setBounds(130,30,20,19);
       add(btnDataPicker);
       btnDataPicker.setVisible(true);

       tblDbDate = new JTable();
       tblDbDate.setBounds(260,100,300,200);
       add(tblDbDate);

       btnTimePicker = new JButton("Ustaw");
       btnTimePicker.setBounds(130,65,20,19);
       add(btnTimePicker);
       btnTimePicker.setVisible(true);

       tfTimePicker = new JTextField("Miejsce na czas");
       tfTimePicker.setBounds(30,65, 100, 20);
       add(tfTimePicker);
       tfTimePicker.setVisible(true);

       btnExit = new JButton("Wyjście");
       btnExit.setBounds(420,320,140,20);
       add(btnExit);
       btnExit.addActionListener(this);




   }



    @Override
    public void actionPerformed(ActionEvent e) {
    Object source = e.getSource();
        if(source == btnExit){
            dispose();
        }

    }
}
