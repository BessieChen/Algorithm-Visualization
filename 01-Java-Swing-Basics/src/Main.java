import javax.swing.*;
import java.awt.*; //EventQueue

public class Main {

    public static void main(String[] args) {
        // write your code here
        EventQueue.invokeLater(() -> { //将窗口加入一个新的线程中

            JFrame frame = new JFrame("Welcome");
            frame.setSize(500, 500); //宽 * 高
            frame.setResizable(false); //不允许用户改变窗口大小。
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //对应了一个整型
            frame.setVisible(true); //窗口创建：关闭窗口后，如果没有设置setDefaultCloseOperation(), 则close仅是隐藏，程序没有终止。

        });

    }
}
