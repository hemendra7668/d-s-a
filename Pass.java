class Pass{
    public static void main(String[]args)
    {
        String s = "Sasfds1d";
        if(s.length()>=5)
        {
            if(s.contains('S') && s.contains('d') && s.contains('6'))
            {
System.out.println("the password is Strong");
            }
            else{
System.out.println("the password is Weak");
            }
        }
        else{
            System.out.println("short password");
        }
    }
}