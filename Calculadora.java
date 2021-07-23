import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculadora {
    public void crearInterfaz() {
        // Creamos una etiqueta para el numero 1
        JLabel numero1Label = new JLabel("Numero 1:");
        // Le asigno posicion y tamaño a la etiqueta
        numero1Label.setBounds(10, 10, 100, 20);
        // Creamos una campo de texto para el numero 1
        JTextField numero1Text = new JTextField();
        // Le asigno posicion y tamaño a la campo de texto
        numero1Text.setBounds(120, 10, 130, 20);
        // Creamos una etiqueta para el numero 1
        JLabel numero2Label = new JLabel("Numero 2:");
        // Le asigno posicion y tamaño a la etiqueta
        numero2Label.setBounds(10, 40, 100, 20);
        // Creamos una campo de texto para el numero 1
        JTextField numero2Text = new JTextField();
        // Le asigno posicion y tamaño a la campo de texto
        numero2Text.setBounds(120, 40, 130, 20);
        // Crear boton de suma
        JButton sumaBoton = new JButton("+");
        // Le asigno posicion y tamaño al boton
        sumaBoton.setBounds(10, 70, 50, 50);
        // Crear boton de resta
        JButton restaBoton = new JButton("-");
        // Le asigno posicion y tamaño al boton
        restaBoton.setBounds(70, 70, 50, 50);
        // Crear boton de resta
        JButton multBoton = new JButton("*");
        // Le asigno posicion y tamaño al boton
        multBoton.setBounds(130, 70, 50, 50);
        // Crear boton de resta
        JButton divBoton = new JButton("/");
        // Le asigno posicion y tamaño al boton
        divBoton.setBounds(190, 70, 50, 50);
        // Creamos una etiqueta para el numero 1
        JLabel resultadoLabel = new JLabel("Resultado:");
        // Le asigno posicion y tamaño a la etiqueta
        resultadoLabel.setBounds(10, 130, 100, 20);
        // Creamos una campo de texto para el numero 1
        JTextField resultadoText = new JTextField();
        // Le asigno posicion y tamaño a la campo de texto
        resultadoText.setBounds(120, 130, 130, 20);
        // Creamos una nueva ventana
        JFrame frame = new JFrame("Calculadora");
        // Le asignamos una tamaño
        frame.setSize(280, 200);
        // No permitimos que se pueda modificar su tamaño
        frame.setResizable(false);
        // Limpiar cualquier tema por defecto
        frame.setLayout(null);
        // Le asigno el metodo por defecto de salida
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Agregar componentes a la ventana
        frame.add(numero1Label);
        frame.add(numero1Text);
        frame.add(numero2Label);
        frame.add(numero2Text);
        frame.add(sumaBoton);
        frame.add(restaBoton);
        frame.add(multBoton);
        frame.add(divBoton);
        frame.add(resultadoLabel);
        frame.add(resultadoText);
        // Mostrar la ventana
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.crearInterfaz();
    }
}
