class TimeMap {

    class Data {
        int time;
        String value;

        Data(int time, String value) {
            this.time = time;
            this.value = value;
        }
    }

    Map<String, List<Data>> map = new HashMap<>();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Data(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Data> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;
        String res = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).time <= timestamp) {
                res = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}