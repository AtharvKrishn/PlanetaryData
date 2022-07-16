import java.util.*;

public class Planets {
     private String planet;
     ArrayList<String> gasses;
     private int moons;
     private boolean rings;

    public Planets(String planet, int moons, boolean rings){
        this.planet=planet;
        this.gasses=new ArrayList<String>();
        this.moons=moons;
        this.rings=rings;
    }
    public static int countMoon(ArrayList<Planets> p){
        int count=0;
        for(Planets temp:p)
        {
            //System.out.println(temp.moons);
            if(temp.rings){
                count+=temp.moons;
            }
        }
        return count;
    }

    public static String domGas(ArrayList<Planets> p){
        ArrayList<String> gases = new ArrayList<>();
        for(Planets temp:p)
        {
            for(String s : temp.gasses)
            {
                gases.add(s);
            }
        }
        //System.out.println(gases);
        return freqGas(gases);
    }

    static String freqGas(ArrayList<String> s){
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < s.size(); i++)
        {
            if (hm.containsKey(s.get(i))) {
                hm.put(s.get(i), hm.get(s.get(i))+1);
            }
            else {
                hm.put(s.get(i), 1);
            }
        }
        Set<Map.Entry<String, Integer>> set = hm.entrySet();
        String key = "";
        int value = 0;

        for (Map.Entry<String, Integer> temp : set)
        {
            if (temp.getValue() > value) {
                value = temp.getValue();
                key = temp.getKey();
            }
        }
        return key;
    }
}
