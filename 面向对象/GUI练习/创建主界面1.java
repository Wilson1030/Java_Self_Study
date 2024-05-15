package GUI练习;

import javax.swing.*;

public class 创建主界面1 {
    public static void main(String[] args) {
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603, 680);
        gameJframe.setVisible(true);

        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488, 430);
        loginJframe.setVisible(true);

        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488, 500);
        registerJframe.setVisible(true);
    }
}
