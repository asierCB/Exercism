import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> mapa = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return mapa;
    }

    public void setDialingCode(Integer code, String country) {
        mapa.put(code, country);
    }

    public String getCountry(Integer code) {
        return mapa.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(mapa.containsKey(code) || mapa.containsValue(country)){
        }else{
            mapa.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Integer code : mapa.keySet()) {
            if (mapa.get(code).equals(country)) {
                return code;
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(mapa.containsKey(code) || mapa.containsValue(country)){
            mapa.replace(code, country);
        }else{
            
        }
    }
}
