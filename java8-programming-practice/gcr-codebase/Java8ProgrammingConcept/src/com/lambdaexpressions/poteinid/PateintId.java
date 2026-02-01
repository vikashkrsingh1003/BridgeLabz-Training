package com.lambdaexpressions.poteinid;

import java.util.*;

public class PateintId {

    public static void main(String[] args) {

        // List of patient IDs
        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        // Printing patient IDs using method reference
        patientIds.forEach(System.out::println);
        
        //using lamda
        patientIds.forEach(id -> System.out.println(id));

    }
}
