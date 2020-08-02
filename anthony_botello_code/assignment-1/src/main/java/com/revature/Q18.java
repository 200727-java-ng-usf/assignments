package com.revature;

public abstract class Q18 {

    public static abstract class Superclass {

        public abstract boolean hasUpperCase(String str);

        public abstract String toUpperCase(String str);

        public abstract int parseInteger(String str);
    }

    public static class Subclass extends Superclass {

        @Override
        public boolean hasUpperCase(String str) {
            
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);

                if('A' <= ch && ch <= 'Z') return true;
            }
            return false;
        }

        @Override
        public String toUpperCase(String str) {
            
            char[] strChars = str.toCharArray();
            
            for(int i = 0; i < strChars.length; i++){

                char ch = strChars[i];

                if('a' <= ch && ch <= 'z'){
                    strChars[i] = (char) (ch - 'a' + 'A');
                }
            }

            return new String(strChars);
        }

        @Override
        public int parseInteger(String str) 
         throws NumberFormatException {
             
            try{
                return Integer.parseInt(str) + 10;
            }
            catch(NumberFormatException e){
                throw e;
            }
        }

    }
}