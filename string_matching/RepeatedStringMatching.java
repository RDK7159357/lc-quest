package string_matching;

public class RepeatedStringMatching {
  public int repeatedStringMatch(String a, String b) {
        StringBuilder build = new StringBuilder(a);
        int count =1;
        while(build.length()<b.length()){
            build.append(a);
            count++;
        }
        if(build.indexOf(b)!=-1) return count;
        build.append(a);
        count++;
        if(build.indexOf(b)!=-1) return count;
        return -1;

    }
}
