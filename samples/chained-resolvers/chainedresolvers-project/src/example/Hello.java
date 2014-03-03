package example;

import org.apache.commons.lang.WordUtils;

/**
 * Simple example world to show how easy it is to retreive libs with ivy !!! 
 */
public final class Hello {
    public static void main(String[] args) {
        String  message = "example world !";
        System.out.println("standard message :" + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
			   + " : " + WordUtils.capitalizeFully(message));
        System.out.println("upperCased by " + test.StringUtils.class.getName() 
			   + " : " + test.StringUtils.upperCase(message));
    }
    
    private Hello() {
    }
}
