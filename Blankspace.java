class Blankspace {
    public static void main(String[] args)
    {
        String str = "               ";
        boolean flag = true;
        
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "").toLowerCase();
        str = str.replaceAll("[^a-z0-9\\s]", "");
        if(str.length()<=1){
           flag = true;
        }
        int j = str.length()-1;
        int i = 0;
       while(i<j)
       {
            if(str.charAt(i)!=str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
       }
       if(flag){
           System.out.println("true");
       }else {
           System.out.println("false");
       }
    }
}