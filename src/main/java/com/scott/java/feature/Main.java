package com.scott.java.feature;

public class Main {

    public static final String TQL_INFRASTRUCTURE_BUISNESS = "SACM Node Push,SACM System Element Push,SACM CI Collection To System Element Push,SACM Service Component Push,SACM Service Push,SACM Relations Push,SACM System Element RS Push,SACM System Element RS Relation Push,SACM Failover Cluster Push,SACM Failover Cluster Relations Push,SACM Failover Cluster Resource Group Push,SACM Failover Cluster Resource Group Relations Push,SACM Load Balancer Cluster Push,SACM Load Balancer Cluster Relations Push,SACM Load Balancer Cluster Resource Group Push,SACM Load Balancer Cluster Resource Group Relations Push,SACM Oracle Load Balancer Push,SACM Oracle Load Balancer Relations Push,SACM Host Server And Running VM Push,SACM Host Server And Running VM Relations Push,SACM LPAR Server Push,SACM LPAR Server VM Relations Push,SACM Solaris Host Push,SACM Solaris Relations Push";

    public static void main(String[] args) {
        String s = setTQLs(TQL_INFRASTRUCTURE_BUISNESS, "100001");
        System.out.println(s);

	// write your code here
    }

    protected static String setTQLs(String originalTQLs, String prefix) {
        String[] tqlArray = originalTQLs.split(",");
        String updatedTQLs = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tqlArray.length; i ++) {
            String tql = prefix + tqlArray[i];
            if ( i < tqlArray.length - 1) {
                updatedTQLs += tql + ",";
                sb.append(tql + ",");
            } else {
                updatedTQLs += tql;
                sb.append(tql);
            }
        }
        return sb.toString();
    }
}
