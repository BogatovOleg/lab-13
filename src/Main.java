public class Main {
    public static void main(String[]args){
        DecoderCesar decoderCesar = new DecoderCesar();
        System.out.println(decoderCesar.decoderMethod("ЗТЕФТИ ЧЦФТ!",1,4));
        System.out.println(decoderCesar.decoderMethod("ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.",2,8));
        String str[]={"ЗЛКСВПЗЁ", "Н" ,"ЁЫНЫДТЫ" ,"А" ,"ЩЛБХШЙЛЁ", "ХЗИПДН", "ТПНЙЗ", "ЫЮРЮЙЗЁ", "СТРДЖТА.", "ПГПГ."};
        for (int i=1;i<17;i++){
            System.out.println("-:"+decoderCesar.decoderMethod("БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.",1,i));
            System.out.println("+:"+decoderCesar.decoderMethod("БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.",2,i));//+15
            System.out.println(i);
            System.out.println("");
        }
        System.out.println("Поиск по 4 строке:");
        for(int i=0;i<str.length;i++){
            System.out.println((i+1)+" слово");
            for(int j=1;j<18;j++){
                System.out.println("-:"+decoderCesar.decoderMethod(str[i],1,j));
                System.out.println("+:"+decoderCesar.decoderMethod(str[i],2,j));
                System.out.println(j);
                System.out.println("");
            }//КОНФЕТКИ+3 И ПЕЧЕНЬЕ+10 В ШКАФЧИКЕ-1 СДЕЛАЙ-4 УРОКИ+1 ВЕЧЕРОМ+7 ПРОВЕРЮ-2
        }
    }
}
//ДОБРОЕ УТРО!
//СУП И ПЮРЕ С КОТЛЕТКАМИ В ХОЛОДИЛЬНИКЕ.
//ПИРОЖКИ ВСЕ НЕ ЕШЬ ВЕЧЕРОМ ПРИДУТ ГОСТИ.
//КОНФЕТКИ И ПЕЧЕНЬЕ В ШКАФЧИКЕ СДЕЛАЙ УРОКИ ВЕЧЕРОМ ПРОВЕРЮ