package Assignment;

public class EncryptedPrinter extends PrintDecorator {

    String[][] letters = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"},
                          {"q","m","z","a","t","f","y","k","b","w","r","o","c","u","h","x","d","p","v","l","i","g","s","n","j","e"}};

    public EncryptedPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message){
        StringBuilder sb = new StringBuilder();
        for (int m = 0; m < message.length(); m++){
            boolean found = false;
            for(int i = 0; i < letters[0].length; i++){
                if(message.charAt(m) == letters[0][i].charAt(0)){
                    sb.append(letters[1][i]);
                    found = true;
                    break;
                }
            }
            if (!found){
                sb.append(message.charAt(m));
            }
        }
        super.print(sb.toString());
    }
}
