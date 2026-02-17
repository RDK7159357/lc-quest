package string_matching;

public class RepeatedSubstring {
      public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                String sub = s.substring(0,i);
                StringBuilder build = new StringBuilder();
                int repeat = n/i;
                for(int j=0;j<repeat;j++){
                    build.append(sub);
                }
                if(build.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
