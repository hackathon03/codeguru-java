package com.hackathon03.codeguru.utils;

public class InpOpOutOfSync {
    void outOfSyncNoncompliant(String deploymentId) {
        String deploymentItem = null;
        try {
            // Noncompliant: the output value would not be updated if the producing method
            // throws an exception, resulting the input and output values becoming out of sync.
            deploymentItem = loadData(deploymentId);
        } catch (final Exception e) {
            System.out.println("Exception"+e);

        }
        doSomething(deploymentId, deploymentItem);
    }

    private void doSomething(String deploymentId, String deploymentItem) {
      System.out.println("do something");
    }

    private String loadData(String deploymentId) throws Exception {
        if(deploymentId.equals("d1")){
          return deploymentId;
        }else{

            throw new Exception("loadDeployment error");
        }

    }

}
