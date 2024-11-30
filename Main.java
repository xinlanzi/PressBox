import view.level.LevelFrame;
import view.login.LoginFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginFrame loginFrame = new LoginFrame(600,400);
            loginFrame.setVisible(true);
            LevelFrame levelFrame = new LevelFrame(500,200);
            levelFrame.setVisible(false);//等到第一个页面关闭才显现
            loginFrame.setLevelFrame(levelFrame);//展示关卡
        });
    }
}
