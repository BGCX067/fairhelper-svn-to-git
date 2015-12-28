package fairhelper;

import fairhelper.panels.LoginPanel;



public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Settings.loadSettings();

        Frame frame = new Frame();
        frame.setVisible(true);

    }

}
