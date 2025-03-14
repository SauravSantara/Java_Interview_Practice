package Core;
public class RevString {
    
    public static void main(String[] args) throws Exception {
        String name = "CocaCola";
        System.out.println("original name = " + name);
        StringBuilder sb = new StringBuilder();
        char charName[] = name.toCharArray();
        
        for (int i = (charName.length - 1); i >= 0 ; i--)
        {
            sb.append(charName[i]);
        }

        String revName = sb.toString();
        System.out.println("reverse name = " + revName);
    }
}
