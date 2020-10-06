package br.com.yank.treinamento.sikuli;

import util.ScreenUtils;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import java.io.IOException;

public class App {
	private static final int TIMEOUT = 3;
	private static final String PATH = "C:\\Users\\Natha\\eclipse-workspace\\sikuli\\src\\images\\";
	
    public static void main(String[] args) throws FindFailed, InterruptedException, IOException {
        Screen screen = new Screen(0);
        ScreenUtils.click(screen, PATH+"window.PNG", TIMEOUT);
        ScreenUtils.click(screen, PATH+"calc.PNG", TIMEOUT);
        ScreenUtils.click(screen, PATH+"7.PNG", TIMEOUT);
        ScreenUtils.click(screen, PATH+"+.PNG", TIMEOUT);
        ScreenUtils.click(screen, PATH+"7.PNG", TIMEOUT);
        ScreenUtils.click(screen, PATH+"=.PNG", TIMEOUT);
    }
}
