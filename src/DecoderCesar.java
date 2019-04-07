public class DecoderCesar {
    char[] upper =
            {'А','Б','В','Г','Д','Е','Ё','Ж','З','И','Й','К','Л','М', 'Н','О','П',
                    'Р','С','Т','У','Ф','Х','Ц','Ч','Ш','Щ','Ъ','Ы','Ь','Э','Ю','Я'};

    char[] lower= {'а','б','в','г','д','е','ё','ж','з','и','й','к','л','м', 'н','о','п',
            'р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю','я'};
    public String decoderMethod(String str, int sign, int shift) {
       String result="";
        if(sign==1||sign==2){
            for(int i = 0;i<str.length();i++){
                for(int j=0;j<upper.length;j++){
                    if(str.charAt(i)==upper[j]){
                        if(sign==2){
                            if (j+shift<33){
                                result+=upper[j+shift];
                                break;
                            }
                            else{
                                result+=upper[j-33+shift];
                                break;
                            }
                        }
                        if(sign==1){
                            if (j-shift>=0) {
                                result += upper[j - shift];
                                break;
                            }
                            else{
                                result+=upper[j+33-shift];
                                break;
                            }
                        }
                    }else if(str.charAt(i)==lower[j]){
                        if(sign==2){
                            if (j+shift<33) {
                                result += lower[j + shift];
                                break;
                            }
                            else{
                                result+=lower[j-33+shift];
                                break;
                            }
                        }
                        if(sign==1){
                            if (j-shift>=0) {
                                result += lower[j - shift];
                            }
                            else{
                                result+=lower[j+33-shift];
                                break;
                            }
                        }
                    }else if(j==upper.length-1)
                        result+=str.charAt(i);
                }
            }
        }
        else result="Вы ввели неверный символ";

        return result;
    }
}
