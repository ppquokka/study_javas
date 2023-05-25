public class Arrays {
    public static void main(String[] args) {
        // 엑셀과 유사. 2행low   4열column
        String[][] numbers = {
                             {"10","20","30","40"},
                             {"50", "60", "70"}
                             };  
        for (int second=0; second < numbers.length; second = second+1) {
            for (int third=0; third < numbers[second].length; third = third+1){
                System.out.print(numbers[second][third] + ",");
            }
            System.out.println();  
        }
              
        // return 0;
    }
}


// 23.05.24.(목) array 수업 1
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
// // length가 변수여서 변수가나옴
// System.out.println(cars.length);
// // 변수들의 묶음을 유동적으로하기 위해 사용 
// for(int first=0; first < cars.length; first = first+1) {
// System.out.print(cars[first]+",");
// }  
// System.out.println();       
// // return 0;
// }


// 23.05.24.(수)
// public class Arrays {
//     public static void main(String[] args) {
//         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};        
//         System.out.println(cars[0]); 
//         System.out.println(cars[1]);
//         System.out.println(cars[2]);
//         System.out.println(cars[3]);          
//         // return 0;
//     }
// }