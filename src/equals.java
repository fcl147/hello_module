public class equals {
    public static void main(String[] args){
        String a ="cs";
        String b ="cs";
        String c =new String("cs");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

    }
}
/*a==b结果为true（真），而a==c,b==c结果都为false（假），
之前说过，a和b地址一样，可见对于比较字符串时，==比较的是地址。
而a.equals(b)和a.equals(c)结果都是true，所以比较字符串时，
equals比较的是字符串内容而不是地址。*/