class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert the word to a char array and sort it
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            // Sorted string becomes the key
            String key = new String(chars);

            // Create a new list if the key doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // Add the original word to the list
            map.get(key).add(word);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}