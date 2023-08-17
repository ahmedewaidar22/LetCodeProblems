class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String,ArrayList<String>> map = new HashMap<>();

    for(String word : strs )
{
      char[] text= word.toCharArray();
      Arrays.sort(text);
      String te = new String(text);
      if(!map.containsKey(te)){
        map.put(te,new ArrayList<>());
      }
    map.get(te).add(word);
}
 
        return new ArrayList<>(map.values());
        
    }
}