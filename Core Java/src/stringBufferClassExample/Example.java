package stringBufferClassExample;

public class Example 
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("Rahul");
        System.out.println(sb + " : " + sb.hashCode());
        sb.append(" Trivedi");
        System.out.println(sb + " : " + sb.hashCode());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.insert(0, "Java ");
        System.out.println(sb);

        // String str = sb.toString();

    }    
}
