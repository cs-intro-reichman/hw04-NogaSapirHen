public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest (String string) {
        String answer = "";
        for (int i = 0; i < string.length (); i ++) {
            //space
            if (string.charAt(i) == 32)
            answer += " ";
            else {
                // uppercase
                if ((string.charAt(i) > 64) && (string.charAt(i) < 91) ) 
                {
                    //(A,E,I,O,U)
                    if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U')
                    answer += string.charAt(i);
                    else
                    answer += ((char) (string.charAt(i) + 32));
                }
                //lowercase
                else {
                    if ((string.charAt(i) > 96) && (string.charAt(i) < 123) ) 
                    {
                        //(a,e,i,o,u)
                        if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
                        answer += ((char) (string.charAt(i) - 32));
                        else  
                        answer += (string.charAt(i));
                    }
                   }
                }
            }
        return answer;
    }

    public static String camelCase (String string) {
        String answer = "";
        boolean newWord = false;
        for (int i = 0; i < string.length(); i ++ )
        {
            //space
            if ( string.charAt(i) == 32 ) {
                if (answer != "")
                newWord = true;
            }
            else {
                if (newWord) 
                { 
                    //uppercase
                    if ((string.charAt(i) > 64) && (string.charAt(i) < 91))
                    answer += string.charAt(i);
                    else 
                    //lowercase
                    answer += (char) (string.charAt(i) - 32 );
                    newWord = false;
                 }
                 //not a new word
                else {
                    //uppercase
                 if ((string.charAt(i) > 64) && (string.charAt(i) < 91) ) 
                 answer += (char) (string.charAt(i) + 32);
                 //lowercase
                 else answer += string.charAt(i);
                }
        }
    }
        return answer;
    }

    public static int[] allIndexOf (String string, char chr) {
        int count = 0;
        //determines the array long
        for ( int i = 0; i < string.length(); i ++)
        {
            if (string.charAt(i) == chr)
            {
                count ++;
            }
        }
        //creats the array
        int [] arrAnswer = new int [count];
        int arrIndex = 0;
        for ( int i = 0; i < string.length(); i ++)
        { 
             if (string.charAt(i) == chr)
            { 
                arrAnswer [arrIndex] = i;
                arrIndex ++;
            }
        }

        return arrAnswer;
    }
}
