class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(
                nums[i],
                frequencyMap.getOrDefault(nums[i], 0) + 1
            );
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        int[] result = new int[k];
        int resultIndex = 0;

        for (int frequency = buckets.length - 1;
             frequency >= 0 && resultIndex < k;
             frequency--) {

            if (buckets[frequency] == null) {
                continue;
            }

            for (int num : buckets[frequency]) {
                result[resultIndex] = num;
                resultIndex++;

                if (resultIndex == k) {
                    break;
                }
            }
        }

        return result;
    }
}