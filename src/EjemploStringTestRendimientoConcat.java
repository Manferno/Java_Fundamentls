public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 10000; i++){
            c = c.concat(a).concat(b).concat("\n");  // 500-> 2ms, 1000-> 4 ms , 10000 -> 94 ms
           // c += a+b+"\n"; // 500-> ms, 1000-> 16 ms , 10000 -> 39 ms
          // sb.append(a).append(b).append("\n");  // 500-> 1 ms, 1000-> 1 ms , 10000 -> 4 ms


        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        

    }
}
