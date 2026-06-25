class Solution {
    public int maxNumberOfBalloons(String text) {
        int m=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
        if(!map.containsKey(c))
        map.put(c,1);
        else
        map.put(c,map.get(c)+1);
        }
        HashMap<Character, Integer> bmap=new HashMap<>();
        bmap.put('b',1);
        bmap.put('a',1);
        bmap.put('l',2);
        bmap.put('o',2);
        bmap.put('n',1);
        int min=Integer.MAX_VALUE;
        for(char c: bmap.keySet())
        {
            int a=map.getOrDefault(c,0);
            int r=bmap.get(c);
            min=Math.min(min,a/r);
        }
        return min;
    }
}