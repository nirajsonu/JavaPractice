package javaversions.java8;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


// After java 14 JavaScript Norschop engine is removed.
public class JavaScriptEngine {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        for(ScriptEngineFactory scriptEngineFactory:manager.getEngineFactories()){
            System.out.println(scriptEngineFactory.getEngineName());
            System.out.println(scriptEngineFactory.getLanguageName());
        }
    }
}
