public class JavaBasics1 {

    public static void main(String[] args){

        // Присвоение значений
        int k = 12;
        int n = 5;

        //Математические операторы
        System.out.println("Сумма: "+(k+n));
        System.out.println("Разность: "+(k-n));
        System.out.println("Произведение: "+(k*n));
        System.out.println("Остаток от деления: "+(k%n));
        System.out.println("Частное (целочисленное): "+(k/n));
        System.out.println("k--= " +  (k--));
        System.out.println("++n= " +  (++n));
        System.out.println("++k= " +  (++k));

        //Операторы сравнения
        System.out.println("k == n ="+(k == n));
        System.out.println("k > n ="+(k > n));
        System.out.println("k < n ="+(k < n));
        System.out.println("k <= n ="+(k <= n));
        System.out.println("k != n ="+(k != n));

        //Логические операторы
        boolean t =true;
        boolean f =false;
        System.out.println("t && f="+(t && f));
        System.out.println("t || f = " + (t || f));
        System.out.println("!f = " + (!f));

        //Разные типы данных
        int a = 33;
        double b = 21.05;
        System.out.println("h + i = " + (a +  b));
        System.out.println("h - i = " + (a - b));

        //Переполнение
        int x =100;
        int y = (byte)(x+30);
        System.out.println("Результат переполнения: " + y);

    }
}