/* **Count Primes Less Than N:
   - **Problem Statement**: Given an integer `n`, return the number of prime numbers less than `n`.
   - **Example**:
     - Input: `n = 10`
     - Output: `4` (The primes less than 10 are `2, 3, 5, 7`)
   - **Solution Approach**: Implemented using the Sieve of Eratosthenes for optimal prime counting.

*/

class Task6 {
    // Sieve of Eratosthenes method to count primes less than n
    public static int countPrimes(int n) {
        if(n <= 2)return 0;

        boolean[] isPrime=new boolean[n];
        for(int i=2;i<n;i++){
            isPrime[i]=true;    }
    // Sieve of Eratosthenes algorithm
        for(int p=2; p*p<n;p++){
            if(isPrime[p]){
                for(int multiple= p*p;multiple<n ;multiple +=p){
                    isPrime[multiple]=false;
                }}}
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }}
     return count;}
    public static void main(String[] args){
        int n1=10;
        System.out.println("Output: "+countPrimes(n1)); //Output:4

        int n2=0;
        System.out.println("Output: "+countPrimes(n2)); //Output:0

        int n3=1;
        System.out.println("Output: "+countPrimes(n3)); //Output:0
    }}
