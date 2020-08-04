package com.revature.Q18;

public class stringImplement {
    public stringImplement() {
        super();
    }

   public boolean checkIfUpperCase(String str) {
       boolean checker = false;
       StringBuilder upperStr = new StringBuilder();
       for (int i = 0; i < str.length(); i++) {
           char chr = str.charAt(i);
           if (Character.isUpperCase(chr)) return checker = true;
       }
       return checker;
   }

   public String uppercaseConverter(String str){
        return str.toUpperCase();
    }

    public void addTen(String num){
        Integer number = Integer.valueOf((String)num);
        int addTen = number+10;
        System.out.println(addTen);
    }

}
