package kidsmonitoringapp;

import javax.swing.JOptionPane;

public class ParentApp implements Observer {
    public void update(String message) {
        JOptionPane.showMessageDialog(null, "Parent Notified: " + message, "Alert", JOptionPane.WARNING_MESSAGE);
    }
}
