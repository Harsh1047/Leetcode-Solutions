class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arl = new ArrayList<>();
        helper(n,0,0,"", arl);
        return arl;
    }

    public void helper(int n, int l,int r, String s, List<String> arl){
        if(r==n) {
            arl.add(s);
            return;
        }
        if(l<n) helper(n,l+1,r,s+"(",arl);
        if(r<l) helper(n,l,r+1,s+")",arl);
    }

}