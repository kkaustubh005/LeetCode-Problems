class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(String email: emails) {
            int i=0;
            boolean check=true;
            StringBuilder sb = new StringBuilder();
            while(email.charAt(i)!='@'){
                if(email.charAt(i)=='.'){
                    ++i;
                    continue;
                }
                if(email.charAt(i)=='+')
                    check=false;
                if(check)
                    sb.append(email.charAt(i));
                ++i;
            }
            sb.append(email.charAt(i++));
            sb.append(email.substring(i,email.length()));
            set.add(sb.toString());
        }
        return set.size();
    }
}