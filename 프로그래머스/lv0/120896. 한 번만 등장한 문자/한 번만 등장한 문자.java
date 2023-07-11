import java.util.*;
class Solution {
    public String solution(String s) {
        String answer="";
        List<String> list=Arrays.asList(s.split(""));       
        HashSet<String> set=new HashSet<String>();          
        
        for(int i=0; i<s.length(); i++) {                                          
                if(Collections.frequency(list, String.valueOf(s.charAt(i)))==1) {  
                    set.add(String.valueOf(s.charAt(i)));   
                }
            }
        
        ArrayList<String> arr=new ArrayList<String>(set);   
        Collections.sort(arr);                              
        
        Iterator it=arr.iterator();
            while(it.hasNext()) {
                answer+=it.next();                          
            }
        return answer;
    }
}
