import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;


public class TestClass {

    /**
     * 숫자를 문자로
     */
    @Test
    public void intToString() {
        long a = 12345;
        String str = Long.toString(a);
        System.out.println("str = " + str);
    }

    /**
     * 문자를 숫자로
     */
    @Test
    public void stringToInt() {
        String a = "12345";
        Long str = Long.parseLong(a);
        System.out.println("str = " + str);
    }

    /**
     * 문자를 리스트로
     */
    @Test
    public void stringToArray() {
        String str = "12345";
        List<String> arr = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println("arr = " + arr);
    }

    /**
     * 리스트를 거꾸로
     */
    @Test
    public void listReverse() {
        String str = "12345";
        List<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(arr);
        System.out.println("arr = " + arr);
    }

    /**
     * 문자열을 리스트로 바꾸고 원하는 문자 개수 세기
     */
    @Test
    public void countCharInList() {
        String str = "Pyyp";
//        long countp = str.chars().filter(c -> c == 'p' || c == 'P').count();
//        long county = str.chars().filter(c -> c == 'y' || c == 'Y').count();
        boolean answer = str.chars().filter(c -> c == 'p' || c == 'P').count() == str.chars().filter(c -> c == 'y' || c == 'Y').count();
        System.out.println("answer = " + answer);
    }

    /**
     * 문자열 리스트를 문자열로
     */
    @Test
    public void 문자열리스트문자열() {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");

        String str = "";
        for (String item : arr) {
            str += item;
        }
        System.out.println("str = " + str);

    }

    @Test
    public void hasyad() {
        int x = 12345;
        int sum = 0;
        int a = x;

        while (a >= 1) {
            sum += a % 10;
            a /= 10;
            System.out.println("sum = " + sum);
            System.out.println("a = " + a);
        }


    }

    @Test
    public void hashmap() {
        Map<String, String> productsByName = new HashMap<>();
        productsByName.put("a", "aclass");
        productsByName.put("b", "bclass");

        System.out.println("productsByName = " + productsByName);
    }

    @Test
    public void 문자열배열을숫자배열로() {
        String s = "-1 -2 -3 -4";
        List<String> list = new ArrayList<>(Arrays.asList(s.split(" ")));
        List<Integer> newlist = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("list = " + Collections.max(newlist) + " " + Collections.min(newlist));
    }

    @Test
    public void 평균구하기() {
        int[] arr = {1, 2, 3, 4, 5};
        OptionalDouble sum = Arrays.stream(arr).average();
        System.out.println("sum = " + Arrays.stream(arr).average().getAsDouble());
    }

    @Test
    public void 제곱근판별() {
        long a = 121;
        // 제곱근이면 +1의 2제곱
        System.out.println(Math.sqrt(a) % 1 == 0 ? (int) Math.pow(Math.sqrt(a) + 1, 2) : "-1");
//        System.out.println(Integer.parseInt(Long.toString((int)Math.sqrt(a))) == (int)Math.sqrt(a) ? (int)Math.pow(Math.sqrt(a)+1,2) : "-1");
    }

    @Test
    public void 정수내림차순() {
        long n = 118372;
        List<String> arr = new ArrayList<>(Arrays.asList(Long.toString(n).split("")));
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println("arr = " + arr);
        String str = "";
        for (String string : arr) {
            str += string;
        }
        System.out.println("str = " + str);

//        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
    }

    @Test
    public void x만큼간격이있는n개의숫자() {
        int x = 2;
        int n = 5;
        long[] answer = new long[n];
        Arrays.stream(answer).map(item -> {
            return item + x;
        });
        System.out.println("answer = " + answer.toString());


    }

    @Test
    public void 문자숫자판별() {
        String s = "1234";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '9')
                System.out.println("false");
        }
        System.out.println("true");

    }

    @Test
    public void 가운데글자가져오기() {
        String s = "abcde";
        List<String> arr = new ArrayList<>(Arrays.asList(s.split("")));
        if (arr.size() % 2 == 0) {
            System.out.println(arr.get(arr.size() / 2 - 1) + arr.get(arr.size() / 2));
        } else {
            System.out.println(arr.get(arr.size() / 2));
        }
    }

    @Test
    public long 부족한금액계산하기등차수열합(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }

    @Test
    public void 행렬의덧셈() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] += arr2[i][j];
            }
        }
    }

    @Test
    public void 최솟값만들기() {
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0;

        for (int i = 0; i < A.length; i++) {
            a = a + (A[i] * B[A.length - i - 1]);
        }

        System.out.println("a : " + a);
    }

    @Test
    public void 올바른괄호() {
        String s = "()()";
        String s2 = "(()(";

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) System.out.println("false");
        }
    }

    @Test
    public void 최대공약수와최소공배수() {
        int n = 3;
        int m = 12;
        int[] answer = new int[2];
        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd(big, small);
        answer[1] = big * small / answer[0];

        System.out.println("answer = " + answer);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }


}
