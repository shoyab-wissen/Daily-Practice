package Practice_05022025;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornDemo {
    public static void main(String[] args) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("javascript");
            engine.eval("print('Hello World')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
