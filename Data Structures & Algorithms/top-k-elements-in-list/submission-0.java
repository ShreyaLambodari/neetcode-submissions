class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] a1 = new List[nums.length + 1];
        for (int key : map.keySet()) {
            int index = map.get(key);
            // a1[index].add(key);
            if (a1[index] == null) {
                a1[index] = new ArrayList<>();
            }
            a1[index].add(key);
        }

        int[] result = new int[k];
        int j = 0;
        for (int i = a1.length - 1; i >= 0; i--) {
            if (a1[i] != null) {
                for (int num : a1[i]) {
                    result[j++] = num;
                    if (j == k) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
