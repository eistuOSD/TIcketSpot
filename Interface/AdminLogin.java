package Interface;
import javax.swing.JButton;

/**
 * Interface representing user login functionality.
 */
public interface AdminLogin {
    void createLoginForm();

    /**
     * Customizes the appearance of a button.
     *
     * @param button the button to be customized
     */
    void customizeButton(JButton button);

    /**
     * Customizes the appearance of a JButton by setting its foreground and background colors,
     * font, and border.
     *
     * @param button the JButton to be customized
     */
}
