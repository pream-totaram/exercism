import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
      return codes;
    }

    public void setDialingCode(Integer code, String country) {
      codes.put(code, country);
    }

    public String getCountry(Integer code) {
      return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
      System.out.println(codes.entrySet());
      if(!codes.keySet().contains(code) && !codes.values().contains(country)) {
        codes.put(code, country);
      }
    }

    public Integer findDialingCode(String country) {
      Integer code = null;
      for(Entry<Integer, String> entry : codes.entrySet()) {
        if(entry.getValue().equalsIgnoreCase(country)) {
          code = entry.getKey();
        }
      }
      return code;
    }

    public void updateCountryDialingCode(Integer code, String country) {
      codes.remove(findDialingCode(country));
      codes.put(code, country);
    }
}
