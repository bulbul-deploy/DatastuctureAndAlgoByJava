package arrays;

public class PrintArrayAnyTypes {

    static void printArray(Object[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer intArray[]= {4,8,1,9};
        printArray(intArray);

        String strArray[]={"Printing","Arrays"};
        printArray(strArray);

        info infoArray[] = {new info("name1",1)};
        printArray(infoArray);

    }

    static class info{
        private String name;
        private int id;

        info(String name,int id){
            this.name=name;
            this.id=id;
        }
        public String toString(){
            return "("+id+" :"+name+")";
        }
    }
}
