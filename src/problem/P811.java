package problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P811 {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        new P811().subdomainVisits(cpdomains);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for (String cpdomain: cpdomains) {
            int count = Integer.valueOf(cpdomain.split(" ")[0]);
            String url = cpdomain.split(" ")[1] + ".";
            do {
                if (map.containsKey(url)){
                    int count1 = map.get(url).intValue() + count;
                    map.put(url,count1);
                }else {
                    map.put(url,count);
                }
                url = url.split("\\.",2)[1];
            } while (url.contains("."));
        }

        for (String key : map.keySet()) {
            result.add(map.get(key) + " " + key.substring(0,key.length()-1));

        }
        return result;
    }
}
