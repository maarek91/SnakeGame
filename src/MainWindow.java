import javax.swing.*;

/**
 * Created by infuntis on 15/01/17.
 */
public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("������");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370,390);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
