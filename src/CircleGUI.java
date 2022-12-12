import javax.swing.*;

public class CircleGUI extends JFrame{
    private JPanel pnlMain;
    private JTextField tfRadius;
    private JTextField tfArea;
    private JTextField tfCircumference;
    private JButton btnClear;
    private JButton btnCompute;

    public static void main(String[] args) {
        CircleGUI app = new CircleGUI();
        app.setContentPane(app.pnlMain);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public CircleGUI() {
        btnCompute.addActionListener(e -> {
            double radius = Double.parseDouble(tfRadius.getText());
            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;
            tfArea.setText(String.valueOf(String.format("%.2f", area)));
            tfCircumference.setText(String.valueOf(String.format("%.2f", circumference)));
        });
        btnClear.addActionListener(e -> {
            tfRadius.setText("");
            tfArea.setText("");
            tfCircumference.setText("");
        });
    }
}
