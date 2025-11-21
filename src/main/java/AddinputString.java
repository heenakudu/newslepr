public class AddinputString {
    String str;
    String num;
    AddinputString(String str,String num){
        this.str=str;
        this.num=num;
    }
public void AddNumberString(String str,String num){
        String addedvar="";
        for(int i=0;i<4;i++){

               addedvar = addedvar + str.charAt(i);

        }

        addedvar=addedvar+num;
        if(str.length()>4){
           for(int i=4;i<str.length();i++) {
               addedvar = addedvar + str.charAt(i);
           }
        }
        System.out.println(addedvar);
}
}
