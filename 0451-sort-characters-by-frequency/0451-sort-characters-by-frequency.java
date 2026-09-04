class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i)))
            map.put(s.charAt(i),1);
            else
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        List<Integer> list= new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        for (Integer value : list) {
            Character foundKey = null;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(value)) {
                    foundKey = entry.getKey();
                    break; 
                }
            }

            if (foundKey != null) {
                // Append the character 'value' number of times
                for (int j = 0; j < value; j++) {
                    sb.append(foundKey);
                }
                map.remove(foundKey); 
            }
        }
        return sb.toString();
    }
}