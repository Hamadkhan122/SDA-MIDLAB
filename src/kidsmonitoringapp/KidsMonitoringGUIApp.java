package kidsmonitoringapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KidsMonitoringGUIApp extends JFrame {
    private Sensor motionSensor = new Sensor();

    public KidsMonitoringGUIApp() {
        setTitle("Kids Monitoring App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JButton dangerButton = new JButton("Simulate Dangerous Activity");

        motionSensor.registerObserver(new ParentApp());
        motionSensor.registerObserver(new EmergencyService());

        dangerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                motionSensor.detectActivity("danger");
            }
        });

        add(new JLabel("Click the button to simulate dangerous activity:"));
        add(dangerButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new KidsMonitoringGUIApp().setVisible(true);
        });
    }
}
