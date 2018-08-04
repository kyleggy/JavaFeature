package com.scott.java.feature.zip;

/**
 * Created by lizhaok on 5/19/2015.
 */
public class StringReplace {

    public static final String TQL_INFRASTRUCTURE = "SACM Node Push,SACM System Element Push,SACM CI Collection To System Element Push,SACM System Element RS Push,SACM System Element RS Relation Push,SACM Failover Cluster Push,SACM Failover Cluster Relations Push,SACM Failover Cluster Resource Group Push,SACM Failover Cluster Resource Group Relations Push,SACM Load Balancer Cluster Push,SACM Load Balancer Cluster Relations Push,SACM Load Balancer Cluster Resource Group Push,SACM Load Balancer Cluster Resource Group Relations Push,SACM Oracle Load Balancer Push,SACM Oracle Load Balancer Relations Push,SACM Host Server And Running VM Push,SACM Host Server And Running VM Relations Push,SACM LPAR Server Push,SACM LPAR Server VM Relations Push,SACM Solaris Host Push,SACM Solaris Relations Push";
    public static void main(String[] args) {

//        String[] tqls = TQL_INFRASTRUCTURE.split(",");
//        for ( String s: tqls ) {
//            String manualS = "new" + s;
//            TQL_INFRASTRUCTURE = TQL_INFRASTRUCTURE.replace(s, manualS);
//            //System.out.println (manualS);
//        }
//
//        System.out.println(TQL_INFRASTRUCTURE);

        String s = setManualTQL(TQL_INFRASTRUCTURE, "100000001_MANUAL_");
        System.out.println(s);



    }

    private static String setManualTQL(String originalTQLs, String prefix) {
        String[] tqlArray = originalTQLs.split(",");
        String updatedTQLs = "";
        for (int i = 0; i < tqlArray.length; i ++) {
            String tql = prefix + tqlArray[i];
            if ( i < tqlArray.length - 1) {
                updatedTQLs += tql + ",";
            } else {
                updatedTQLs += tql;
            }
        }
        return updatedTQLs;
    }

}
