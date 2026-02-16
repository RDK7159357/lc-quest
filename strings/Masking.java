package strings;

public class Masking {
     public String maskPII(String s) {
      if(s.indexOf('@')!=-1){
        s = s.toLowerCase();
        int atInd = s.indexOf('@');
        String name = s.substring(0,atInd);
        String domain = s.substring(atInd);
        return name.charAt(0) +"*****" + name.charAt(name.length()-1) + domain;
      }
      String digits = s.replaceAll("[^0-9]","");
      int n = digits.length();
      String local = "***-***-" + digits.substring(n-4);
      if(n==10){
        return local;
      }
      String prefix = "+";
      for(int i=0;i<n-10;i++){
        prefix +="*";
      }
      return prefix + "-" + local;
    }
}
