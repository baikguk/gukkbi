public class Ex07 {
  public static void main(String[ ]args){

    // 문자열(alphabet) -> 모스부호
    String alphabet = "HELLOJAVA";

    String[] morse = {".-", "-...", "-.-.","-..", ".",
                      "..-.", "--.", "....","..",".---",
                      "-.-", ".-..", "--", "-.", "---",
                      ".--.", "--.-",".-.","...","-",
                      "..-", "...-", ".--", "-..-","-.--",
                      "--.."};
    String result = "";

    for(int i = 0; i < alphabet.length(); i++){
      int idx = alphabet.charAt(i) - 'A';
      result += morse[idx] + " ";
    }

    System.out.println("alphabet : " + alphabet);
    System.out.println("morse    : " + result);




  }
}
