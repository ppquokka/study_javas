/*class 하나를 만들어서 실제로 얘한테 가져와보는 실습
 * 그 class가 최고상단인 object에서 가져오는지 확인하기
 */

import vehicles_0619.Bicycle;
import vehicles_0619.MountainBike;
import vehicles_0619.RoadCycle;

public class Inheritances_0619 {
    public static void main(String[] args) {
        try {
            // Object 확인
            // ObjectInheritances objectInheritances = new ObjectInheritances(); 
            // int price;
            // String color;
            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(price=5500, color="blue");
            // System.out.println(bicycle.toString());

            // 상속해 활용
            // MountainBike mountainBike = new MountainBike();
            /* MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
               System.out.println(); */
            RoadCycle roadCycle = new RoadCycle(5800, "yellow green", "speed");
            System.out.println();

            /* objectInheritance의 method가 몇개인지 알아보자~ 
            = 그 class의 기능을 받았다 = 상속을 받았다 안받았다 
            = method의 갯수로 그 수치를 알 수 있다
            */

            /* 최 상단에는 object가 있다
             * java.api를 찾아 올라가보면 언제나 최상단에 object가 있다
             * class는 무조건 object에 상속되어 있다
             */
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
