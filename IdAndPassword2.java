package Log_in_2;

import java.util.HashMap;

public class IdAndPassword2  {
    HashMap<String, String> logininfo2 = new HashMap<String, String>();

    IdAndPassword2() {
        logininfo2.put("Denis", "denno");
        logininfo2.put("Peter", "pinchez");
        logininfo2.put("Samwel", "sammy");
        logininfo2.put("Kelvin", "vokeh");
    }

    protected HashMap getlogininfo2() {
        return logininfo2;
    }
}
