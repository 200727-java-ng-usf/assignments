package com.revature;

public class Q13{

    public static String[] printTriangle(){

        String[] triangles = new String[4];

        int k = 0;
        for(int i = 0; i < 4; i++){
            
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < i + 1; j++){

                sb.append(k % 2);
                k++;
            }

            triangles[i] = sb.toString();
            System.out.println(triangles[i]);
        }

        return triangles;
    }
}