package strings;

public class CapitalCount {
        public boolean detectCapitalUse(String word) {
        int n = word.length();
        int ucount=0;
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                ucount++;
            }
        }
        if(ucount == n) return true;
        if(ucount == 0) return true;
        if(ucount==1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
