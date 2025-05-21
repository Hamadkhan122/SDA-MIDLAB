package kidsmonitoringapp;

import javax.swing.JOptionPane;

public class EmergencyService implements Observer {
    public void update(String message) {
        JOptionPane.showMessageDialog(null, "Emergency Service Alerted: " + message, "Emergency!", JOptionPane.ERROR_MESSAGE);
    }
}
