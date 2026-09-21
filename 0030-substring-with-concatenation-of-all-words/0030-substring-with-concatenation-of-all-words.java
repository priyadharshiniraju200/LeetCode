class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int wordLen = words[0].length();
        int wordCount = words.length;
        HashMap<String, Integer> required = new HashMap<>();
        for (String word : words) {
            required.put(word,
                required.getOrDefault(word, 0) + 1);
        }
        for (int start = 0; start < wordLen; start++) {
            int left = start;
            int right = start;
            int count = 0;
            HashMap<String, Integer> current = new HashMap<>();
            while (right + wordLen <= s.length()) {
                String word=s.substring(right, right + wordLen);
                right += wordLen;
                if (!required.containsKey(word)) {
                    current.clear();
                    count = 0;
                    left = right;
                    continue;
                }
                current.put(word,current.getOrDefault(word, 0) + 1);
                count++;
                while (current.get(word) > required.get(word)) {
                    String remove=s.substring(left, left + wordLen);
                    current.put(remove,current.get(remove) - 1);
                    left += wordLen;
                    count--;
                }
                if (count == wordCount) {
                    ans.add(left);
                }
            }
        }
        return ans;
    }
}