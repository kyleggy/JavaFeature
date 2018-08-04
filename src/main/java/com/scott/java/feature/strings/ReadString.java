package com.scott.java.feature.strings;

/**
 * Created by lizhaok on 3/15/2018.
 */
public class ReadString {

    public static void main(String[] args) {
        String ucmdbVersion11 = "11.1";
        String ucmdbVersion10 = "10.00.11";
        System.out.println(getUcmdbVersionNumber(ucmdbVersion11));
        System.out.println(getUcmdbVersionNumber(ucmdbVersion10));

        Double d = Double.parseDouble("11.");
        System.out.println(d);

        String targetSet = "TargetSet.12345.12";
        System.out.println(getTargetSetWorkflowVersion(targetSet) + "h");
    }

    public static String getUcmdbVersionNumber(String fullVersion) {
        StringBuilder sbVersionNum = new StringBuilder();
        String[] nums = fullVersion.split("\\.");
        for (int i = 0; i < nums.length; i ++) {
            if (i != 1) {
                sbVersionNum.append(nums[i]);
                sbVersionNum.append(".");
            } else {
                sbVersionNum.append(nums[i]);
                break;
            }
        }
        return sbVersionNum.toString();
    }

    private static String getTargetSetWorkflowVersion(String parentTargetSetWorkflowVersion) {
        //TargetSet.12345.1
        int lastDotIndex = parentTargetSetWorkflowVersion.lastIndexOf(".");
        return parentTargetSetWorkflowVersion.substring(lastDotIndex + 1, parentTargetSetWorkflowVersion.length());
    }
}
