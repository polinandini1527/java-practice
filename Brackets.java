 import java.util.*;

class Brackets{
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]"))
        {
            s=s.replace("()", "");
            s=s.replace("{}", "");
            s=s.replace("[]", "");
        }
        return s.isEmpty();
    }
	 public static void main(String[] args) {
        Brackets b = new Brackets ();      
        System.out.println(b.isValid("([])"));      
        System.out.println(b.isValid("()[]{}"));  
        System.out.println(b.isValid("(]"));      
        System.out.println(b.isValid("([])"));    
        System.out.println(b.isValid("([)]")); 
}
}