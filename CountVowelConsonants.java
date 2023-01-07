public class CountVowelConsonants{   
    public static void main(String[] args) {    
            
        // variable to store the count of vowels and consonant    
        int v = 0, c = 0;    
            
        // string    
        String str = "V.S International college";    
            
        //Converting string to lower case   
        str = str.toLowerCase();    

        for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                //Increments the vowel counter    
                v++;    
            }    
            //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {  

                //Increments the consonant counter    
                c++;    
            }    
        }    
        System.out.println("Number of vowels: " + v);    
        System.out.println("Number of consonants: " + c);    
    }    
}   
