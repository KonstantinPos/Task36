public class Main {
    public static void main(String[] args) {
        int count = 0;
        int arr[] = new int[15];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 9);
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов равно " + count);
    }
}
