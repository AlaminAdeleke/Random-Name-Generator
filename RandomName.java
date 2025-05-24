import java.util.Random;
/*************************************************************************
 * A class for the creation of random namess
 * 
 * @ Author - Alamin Adeleke
 * @ Date - 02/05/2025
 ************************************************************************/
public class RandomName
{
    public static Random rNG = new Random();

    //All sounds used in names(Repition of sounds to increase probability)
    //Starting and intermidiate consonant sounds
    public static final String[] consonants1 = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","x","y","z","bl","br","cl","cr","ch","dr","dw","fl","fh","fr","gl","gr","kh","kr","pl","pr","ph","qu","sl","sh","tr","th","vl","wr"};
    //Ending consonant sounds
    public static final String[] consonants2 = {"b","c","d","f","g","h","j","k","l","m","n","p","r","s","t","v","w","x","y","z","ch","ck","ph","que","sh","th"};
    //Starting and intermidiate vowel sounds
    public static final String[] vowels1 = {"a","a","a","a","e","e","e","e","i","i","o","o","u","ai","ia","oa", "ou", "ei", "au", "ue"};
    //Ending vowel sounds
    public static final String[] vowels2 = {"a","a","a","e","e","e","e","i","i","o","o","u","ia","ey","eo","oa","y","ay", "oo", "ie", "ei"};

    /*************************************************************************
     * A method that takes in the number of syllables for the name to have and
     * creates and returns a random name using select sounds
     *************************************************************************/
    public static String make(int syllables)
    {
        //Create a blank name
        String name = "";
        //Boolean variable for whether the name begins with a vowel(true) or consonant(false)
        boolean isVowel;
        int num;
             
        //Add first letter
        //25% chance
        if(rNG.nextInt(4) == 0)
        {//for if it begins with a vowel
            name += vowels1[rNG.nextInt(vowels1.length)];
            isVowel = true;
        }
        //75% chance
        else
        {//for if it begins with a consonant
            name+= consonants1[rNG.nextInt(consonants1.length)];
            isVowel = false;
        }

        //For however many syllables it should have,
        for(int i = 0 ; i < syllables ; i++)
        {
            //if first letter is vowel
            if(isVowel)
            {//add consonant
                name+= consonants1[rNG.nextInt(consonants1.length)];
            }
            //if its not,
            else
            {//add a vowel
                name += vowels1[rNG.nextInt(vowels1.length)];
            }
            
            //Store the last type of letter that as added
            isVowel = !isVowel;
        }
        
        //if last added is consonant,
        if(!isVowel)
        {
            //add an ending volew
            name += vowels2[rNG.nextInt(vowels2.length)];
        }
        //if last added is vowel,
        else
        {
            //add an ending consonant
            name += consonants2[rNG.nextInt(consonants2.length)];
        }
        
        //output the congregated string with the first letter capitalized
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }
    
    public static String make()
    {
        //Either one(25%), two(50%) or three(25%) syllables
        return maker(rNG.nextInt(2) + rNG.nextInt(2) + 1);
    }
    
    //Method to set the seed of the Random class used
    public static void setSeed(long seed)
    {
        rNG.setSeed(seed);
    }    
}
