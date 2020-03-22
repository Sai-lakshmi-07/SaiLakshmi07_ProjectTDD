public class RemoveA {
    public String deleteA(String string)
    {
        if(string.length()==0)
            return "";
        if(string.length()==1 && string.charAt(0)=='A')
            return "";
        if(string.length()==1 && string.charAt(0)!='A')
            return string;
        if(string.charAt(1)=='A')
            string=string.charAt(0)+string.substring(2);
        if(string.charAt(0)=='A')
            string=string.substring(1);
        return string;
    }
}
