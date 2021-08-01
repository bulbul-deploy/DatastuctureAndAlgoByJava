package arrays;

public class Generics {
    static <T> T repeated(T[] ar){
        for (int i=0;i<ar.length-1;i++){
            for (int j=i+1;j<ar.length;j++){
                if (ar[i].equals(ar[j]))
                    return ar[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer intArray[] = {4,8,1,8,4};
        Integer ri = repeated(intArray);
        System.out.println(ri);

        String strArray[] = {"demo","demo2","demo3","demo3"};
        String rs = repeated(strArray);
        System.out.println(rs);

    }
}
