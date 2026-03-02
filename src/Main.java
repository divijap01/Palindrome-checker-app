@ -5,16 +5,16 @@ public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input text : ");
    String input = sc.nextLine();
    int i = 0 ;
    boolean status = true;
    int j = input.length() -1;
    for(int k = 0 ; k < input.length()/2 ; k++){
        if(input.charAt(i)!= input.charAt(j)){
            status = false;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0 ; i--){
            sb.append(input.charAt(i));
            StringBuilder sb = new StringBuilder();
            for(int i = input.length() - 1; i >= 0 ; i--){
                sb.append(input.charAt(i));
                char arr[] = input.toCharArray();
                int n = input.length();
                boolean status = true;
                for(int i = 0 ; i < n/2 ; i++){
                    if(arr[i] != arr[n - i - 1]){
                        status = false;
                    }
                }
                String reverse = sb.toString();

                @@ -23,11 +23,10 @@ public static void main(String[] args) {
                }else{
                    System.out.println("Is Palindrome ? false "  );
                }
                System.out.println("Is Palindrom: " + status);



                System.out.println("Is palindrome ? " + status);

            }
        }
    }
}