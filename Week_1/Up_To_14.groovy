/*
* 14. Up to 1,000 primes
* prints the first 1000 primes
*/

int i = 1
boolean isPrime
print i
int count = 0
while(count < 1000){
    isPrime = true
    i++
    for (int n = 2; n < i; n++){
        if((i % n) == 0){
            isPrime = false
        }
    }
    if (isPrime){
        print", " + i
        count++
    }
}