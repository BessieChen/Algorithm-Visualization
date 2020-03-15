import javax.swing.*;

/**
 * @program: 02-My-JFrame
 * @description:
 * @author: Bessie
 * @create: 2020-03-15 15:34
 **/
public class AlgoFrame extends JFrame {
    private int canvasWidth;
    private int canvasHeight;

    public AlgoFrame(String title, int width, int height)
    {
        super(title);

        this.canvasWidth = width;
        this.canvasHeight =  height;

        setSize(width, height);//this.setSize(width, height);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public AlgoFrame(String title){
        this(title, 1024, 768); //全屏
    }

    public int getCanvasWidth()
    {
        return canvasWidth;
    }

    public int getCanvasHeight()
    {
        return canvasHeight;
    }

}
