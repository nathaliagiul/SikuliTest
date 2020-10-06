package util;

import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public abstract class Shortcuts {

    public static void ctrlPlus(Screen screen, String key){
        screen.keyDown(Key.CTRL);
        screen.type(key);
        screen.keyUp();
    }
}
