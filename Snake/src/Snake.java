import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalTime;

public class Snake {

    public static void main(String[] args) {
        System.out.println("===");
        System.out.println(LocalTime.now());
        System.out.println("===");

        
        

    }
    

    

    /*
    public void snake() {
        System.out.println("Snake");

        // Creating the frame
        JFrame frame = new JFrame("New JJ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Creating the menu bar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        // creating the panel at bottom and adding components
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // JButton button1 = new JButton("But1");
        // JButton button2 = new JButton("But2");
        // frame.getContentPane().add(button1);
        // frame.getContentPane().add(button2);
        frame.setVisible(true);

        // print entire array
        System.out.println(Arrays.deepToString(b));
        // sum rows
        for(int[] row : b) {
            System.out.print(
                Arrays.stream(row).sum() + ", "
            );
        }
        System.out.println("-- sums.");


        int[][] b = new int[3][3];
        for(int i = 0; i < b.length; i++) {
            for(int j = 0; j < b.length; j++) {
                b[i][j] = j * (i + 1);
            }
        }
        // print entire array
        System.out.println(Arrays.deepToString(b));
        
        System.out.println("Summing cols");
        int i = 0;
        int j = 0;
        while(i < b.length) {
            while(j < b[i].length) {
                while(i < b.length && j < b[i].length) {

                    // System.out.print(b[i][j] + " ");
                    System.out.print(i + "r|c" + j + "; ");
                    i++;
                }
                System.out.println();
                i = 0;
                j++;
            }
            i++;
        }

        System.out.println("Summin right diagonals");
        int bb = 0;
        for(i = 0; i < b.length; i++) {
            bb += b[i][i];
        }
        System.out.println(bb);
        System.out.println("summin left diagonals");
        int len = b.length - 1;
        for(i = 0; i < b.length; i++) {
            System.out.println(b[i][len--]);
        }
    } */
 
    
}