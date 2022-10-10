class LongestPallindromicSubstring{

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubString("babad"));
    }

    public String findLongestPallindromeSubString(String s) {
        
        String max = "";
        
        for(int i=0; i<s.length(); i++){
            
            String oddPositionString = findPalindromString(s,i,i); //even length
            String evenPositionString = findPalindromString(s,i,i+1); //odd length
            
            if(oddPositionString.length() > max.length()) max = oddPositionString;
            
            if(evenPositionString.length() > max.length()) max = evenPositionString;
        }
        
        return max;
    }
    
    private String findPalindromString(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}

