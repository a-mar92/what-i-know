public class Palindrom {
    public static void main(String[] args) {
        System.out.println(palindrom("ala","ala"));


    }

    static boolean palindrom (String s1, String s2){
        for (int i = 0; i < s1.length(); i++) {
            char s1S1 = s1.charAt(i);
            char s2S2 = s2.charAt(s2.length()-1-i);
            if (s1S1!=s2S2){
                return false;
            }
        }

        return true;
        }
    }














