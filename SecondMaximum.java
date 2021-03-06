/***********************************************************************************************************************
 Программа, возвращающая 2-й по величине элемент набора чисел.
 ***********************************************************************************************************************
 JRE: 1.8
 ***********************************************************************************************************************
 Проверяемый массив nums задан с коде программы.
 Пример вывода для текущего варианта nums:
 =======================================================================================================================
 Second maximum is 5688.0
 =======================================================================================================================
 **********************************************************************************************************************/
public class SecondMaximum {
    private static double[] nums = {0.0, 5.5, 5.89, 4.87, 11.12, 7200.11, 5688.00, 9, 8.1, -33.49};

    public static void main(String[] args) {
        double max1 = nums[0];
        double max21 = max1;
        for (int i = 0; i < nums.length; i++) {
            if(max1 < nums[i]){
                max21 = max1;
                max1 = nums[i];
            }
        }
        max1 = nums[nums.length - 1];
        double max22 = max1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(max1 < nums[i]){
                max22 = max1;
                max1 = nums[i];
            }
        }
        double max2 = max22 > max21 ? max22 : max21;
        System.out.println("Second maximum is " + max2);
    }
}
