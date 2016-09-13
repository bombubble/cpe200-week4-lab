package cpe200;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    public String password;

    public User() {
    }

    public boolean setUserName(String name) {
        if(name.length()>=8 && name.matches("(^[a-zA-Z]+)([a-zA-Z0-9]*)")){
            this.userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name) {
        if(name.length()>=12 && name.matches("(.*)([A-Z]+)(.*)") && name.matches("(.*)([a-z]+)(.*)") && name.matches("(.*)([0-9]+)(.*)")){
            this.password = name;
            return true;
        }
        return false;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassword() {

        return password;
    }
}
