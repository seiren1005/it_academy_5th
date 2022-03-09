public class Hello0307_01 {
    public static void main(String[] args) {

        // reference type (참조 타입)
        String s = new String("Hello World!");
        // create reference type variable : tyep variable_name = new type();
        // variable s에 "Hello World!" 값 자체가 아닌 메모리에 값이 저장되어 있는
        // 주소를 저장함.

        // call object method()
        // .(dot) operator 를 사용
        int size = s.length();
        System.out.println("s Size: " + size);


        // array copy
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        // Shallow copy (얕은 복사)
        int[] arr2 = arr;
        System.out.print("arr2: " + arr2);
        // arr이 가진 주소값을 arr2에 저장함.
        // arr 안의 Element (원소) 의 값이 바뀌면 arr2 안의 원소값도 바뀜.

        // deep copy (깊은 복사)
        int[] arr3 = new int[3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr[i];
            System.out.print(arr3[i] + " ");
        }
        // arr의 원소값을 arr3에 저장.
        // arr 안의 원소값을 바꿔도 arr3 안의 원소값은 바뀌지 않음.
        System.out.println();


        // for - each
        // for (type variable_name : array_name) { ... }
        int[] arr4 = new int[10];

        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = i;
            System.out.print(arr4[i] + " ");
        }
        System.out.println();

        for (int value : arr4) {
            System.out.print(value + " ");
        }
        System.out.println();
        // value는 배열 안에 들어있는 각각의 원소값.
        // for - each는 배열 전체에 대해서만 접근 가능.
        // 특정 인덱스 값에 대해서는 접근할 수 없음.
        // 따라서 배열 안에 값을 저장할 경우는 for문을 사용하거나 특정 인덱스
        // 위치를 지정해서 값을 저장해 주어야 함.


        // two dimensioanl array (2차원 배열)
        int[][] arr5 = new int[5][3];
        // 2차원 배열 type[][] array_name = new type[y][x];
        // y : array's rows
        // x : array's columns
        // arr[1]처럼 [x]를 생략할 경우 1행의 배열을 의미

        for (int y = 0; y < 5; y++) {

            for (int x = 0; x < arr5[y].length; x ++) {
                arr5[y][x] = (y * 10) + x;
                System.out.printf("%02d " , arr5[y][x]);
            }

            System.out.println();
        }


    }
    
}

