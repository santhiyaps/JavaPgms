import java.util.*;

public class SubdomainVisitCount {

    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer>domainMap=new HashMap();
        String domainName="";
        String str="";
        int count=0;
        for(String domain:cpdomains){
            String subDomains[]=domain.split(" ");
            count=Integer.parseInt(subDomains[0]);
            domainName=subDomains[1];
            domainMap.put(domainName, domainMap.getOrDefault(domainName, 0) + count);
            str = domainName.substring(domainName.indexOf('.')+1, domainName.length());
            domainMap.put(str, domainMap.getOrDefault(str, 0) + count);
            if(str.contains(".")){
                str = str.substring(str.indexOf('.')+1, str.length());
                domainMap.put(str, domainMap.getOrDefault(str, 0) + count);
            }
        }
        List<String> visitCounts=new ArrayList();
        for(String domainKey:domainMap.keySet()){
            String visitCount=domainMap.get(domainKey)+" "+domainKey;
            visitCounts.add(visitCount);
        }
        return visitCounts;
    }
}
