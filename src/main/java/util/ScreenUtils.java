package util;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public abstract class ScreenUtils {

    public static Boolean isOnScreen(Screen screen, String imagePath, int timeout) {
        while (screen.exists(imagePath) == null && timeout > 0) {
            timeout--;
        }

        System.out.println(String.format("%s - %s", imagePath, timeout > 0 ? "OK" : "Timeout"));

        return timeout > 0;
    }

    public static void click(Screen screen, String imagePath, int timeout) throws FindFailed {
        if (!ScreenUtils.isOnScreen(screen, imagePath, timeout))
            throw new FindFailed( imagePath + " indisponível");

        screen.click(imagePath);
    }

    public static void typeKey(Screen screen, String imagePath, String key, int timeout) throws FindFailed {
        if (!ScreenUtils.isOnScreen(screen, imagePath, timeout))
            throw new FindFailed( imagePath + " indisponível");

        screen.type(key);
    }

    public static void pasteText(Screen screen, String imagePath, String text, int timeout) throws FindFailed {
        if (!ScreenUtils.isOnScreen(screen, imagePath, timeout))
            throw new FindFailed( imagePath + " indisponível");

        screen.paste(text);
    }
}
