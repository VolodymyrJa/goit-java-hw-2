public class NameEncoderDecoder {

    public String encode(String name){
           return  "NOTFORYOU" + name
                     .replace("e", "1")
                     .replace("u", "2")
                     .replace("i", "3")
                     .replace("o", "4")
                     .replace("a", "5")  
                  + "YESNOTFORYOU";
    }

    public String decode(String name){
     String nameEn = name.substring(9, (name.length() - 12));
      
            return nameEn
                     .replace("1", "e")
                     .replace("2", "u")
                     .replace("3", "i")
                     .replace("4", "o")
                     .replace("5", "a");
   
    }

      //Test output
    public static void main(String[] args) {
        NameEncoderDecoder names = new NameEncoderDecoder();
   
      // output encode name
    System.out.println("encodeName - " + names.encode("Crab"));
   
      // output decode name
    System.out.println("decodeName - " + names.decode("NOTFORYOUCr5bYESNOTFORYOU"));
    System.out.println("decodeName - " + names.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
  
    }
}
