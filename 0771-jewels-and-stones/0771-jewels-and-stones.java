class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map= new HashMap<>();
        int n=0;
        for(char c:stones.toCharArray())
        {
            if(!map.containsKey(c))
            map.put(c,1);
            else
            map.put(c,map.get(c)+1);
        }
        for(char c:jewels.toCharArray())
        {
            if(map.containsKey(c))
            n+=map.get(c);
        }
        return n;
    }
}