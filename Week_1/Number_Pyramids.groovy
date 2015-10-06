/*
* 12 Number Pyramids
* outputs a number pyramid
*/

int row = 1
while (row < 8){
    for (int col = 0; col < row; col++){
        print row
    }
    println()
    row++
}
println"\\1dots"


13. Up to 1,000 primes(*)
/*
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