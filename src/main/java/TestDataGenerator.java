public class TestDataGenerator {
    public static int[] arrayRandomAnlegen(int größe){
        int max = 100;
        int min = 1;
        int[]array = new int[größe];
        for (int i = 0; i < array.length; i++){
            array[i]= (int) (Math.random() * ( max - min ));
        }
//        for (int k = 0; k < array.length; k++) {
////            System.out.println(array[k]);
//        }
        return array;
    }
    public static int[] arrayVorsortiertAnlegen(int größe){
        int max = 100;
        int parts = 4;
        int[]array = new int[größe];
        for (int l = 1; l <= parts ; l++) {
            for (int i = 0; i < array.length/parts; i++) {
                array[i + (größe/parts * (l-1))] = Math.toIntExact(Math.round(Math.random() * (max / parts)) + (max / parts * (l - 1)));
            }
        }
//        for (int k = 0; k < array.length; k++) {
//            System.out.println(array[k]);
//        }
        return array;
    }
}
