class MemberInnerClass{
    private int x;
    public static void main(String[] args){
        MemberInnerClass m = new MemberInnerClass();
        m.x = 10;
        Inner i = m.new Inner();
        i.print();
    }

    class Inner{
        public void print(){
            System.out.println(x);
        }
    }
    
}