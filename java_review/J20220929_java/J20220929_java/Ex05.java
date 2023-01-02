public class Ex05 {
  public static void main(String[] args){

    // 16 진수  ->  2 진수
    char[] hex = {'C', 'A', 'F', 'E', '2'};

    String[] binary = { "0000", "0001", "0010", "0011",
                        "0100", "0101", "0110", "0111",
                        "1000", "1001", "1010", "1011",
                        "1100", "1101", "1110", "1111" };

    String result = "";

    for(int i = 0; i < hex.length; i++){
      if('0' <= hex[i] && hex[i] <= '9') {
        int idx = hex[i] - '0';
        result += binary[idx] + " ";
      }else{
        int idx = hex[i] - 'A' + 10;
        result += binary[idx] + " ";
      }
    }
    System.out.println("16진수값 : " + new String(hex));
    System.out.println("2진수값  : " + result);
  }
}
