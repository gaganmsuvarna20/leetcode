class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>=s.length()){
            return s;
        }
        int idx=0,d=1;
        List<Character>[] rows=new ArrayList[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new ArrayList<>();
        }

        for(char c:s.toCharArray()){
            rows[idx].add(c);
            if(idx==0){
                d=1;
            }else if(idx==numRows-1){
                d=-1;

            }
            idx+=d;
        }
        StringBuilder str=new StringBuilder();
        for(List<Character> l:rows){
            for(char c:l){
                str.append(c);

            }

        }
        return str.toString();

        



        
    }
}