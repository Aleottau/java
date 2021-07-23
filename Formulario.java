import javax.swing.JFrame;
import javax.swing.JLabel;

public class Formulario {

    public static void getForm() {
        JLabel label = new JLabel("Hola Mundo!");
        label.setBounds(0, 0, 150, 20);

        System.out.println(label.getText());

        JFrame frame = new JFrame("Mi Primera Ventana");
        System.out.println(frame.getTitle());
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        getForm();
    }
}
