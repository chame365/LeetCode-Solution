package probleams;

import java.util.Base64;
import java.util.List;

public class P535 {
    public static void main(String[] args) {
//        new P535().encode("https://leetcode.com/problems/design-tinyurl");
        new P535().decode("http://tinyurl.com/aHR0cHM6Ly9sZWV0Y29kZS5jb20vcHJvYmxlbXMvZGVzaWduLXRpbnl1cmw=");
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = "http://tinyurl.com/" + Base64.getEncoder().encodeToString(longUrl.getBytes());
        return shortUrl;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String longUrl = new String(Base64.getDecoder().decode(shortUrl.split("http://tinyurl.com/")[1]));
        System.out.println(longUrl);
        return longUrl;
    }

}
