/*
* 13. Up to 1,000 primes(*)
* prints primes up to 1000
*/

int i = 1
boolean isPrime
print i
while(i < 1000){
    isPrime = true
    i++
    for (int n = 2; n < i; n++){
        if((i % n) == 0){
            isPrime = false
        }
    }
    if (isPrime){
        print", " + i
    }
}